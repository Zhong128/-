package service;


import entity.StudentEntity;
import mapper.StudentMapper;
import java.util.List;

/**
 * 业务逻辑层实现类：实现具体业务逻辑，依赖Mapper层进行数据操作
 * 职责：处理数据校验、业务规则，调用Mapper层方法完成数据操作
 */
public class StudentServiceImpl implements StudentService {

    // 依赖Mapper层（通过构造方法注入，解耦且便于测试）
    private final StudentMapper studentMapper;

    public StudentServiceImpl(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public String addStudent(StudentEntity student) {
        // 1. 校验必填字段
        if (student.getStudentId() == null || student.getStudentId().trim().isEmpty()) {
            return "新增失败：学号不能为空！";
        }
        if (student.getName() == null || student.getName().trim().isEmpty()) {
            return "新增失败：姓名不能为空！";
        }

        // 2. 校验性别合法性
        if (!"男".equals(student.getGender()) && !"女".equals(student.getGender())) {
            return "新增失败：性别必须为'男'或'女'！";
        }

        // 3. 校验年龄范围
        if (student.getAge() < 18 || student.getAge() > 25) {
            return "新增失败：年龄必须在18-25岁之间！";
        }

        // 4. 调用Mapper层新增，返回结果
        boolean isSuccess = studentMapper.add(student);
        return isSuccess ? "新增成功！" : "新增失败：学号已存在！";
    }

    @Override
    public String getStudentByStudentId(String studentId) {
        // 1. 校验学号是否为空
        if (studentId == null || studentId.trim().isEmpty()) {
            return "查询失败：学号不能为空！";
        }

        // 2. 调用Mapper层查询
        StudentEntity student = studentMapper.getByStudentId(studentId);

        // 3. 返回结果
        if (student == null) {
            return "学生不存在";
        } else {
            return formatStudentInfo(student);
        }
    }

    @Override
    public String getStudentsByClassName(String className) {
        // 1. 校验班级名称是否为空
        if (className == null || className.trim().isEmpty()) {
            return "查询失败：班级名称不能为空！";
        }

        // 2. 调用Mapper层查询班级学生列表
        List<StudentEntity> students = studentMapper.getByClassName(className);

        // 3. 返回结果
        if (students == null || students.isEmpty()) {
            return "该班级暂无学生";
        } else {
            StringBuilder result = new StringBuilder("系统中共找到" + students.size() + "名学生：\n");
            for (StudentEntity student : students) {
                result.append(formatStudentInfo(student)).append("\n");
            }
            return result.toString().trim();
        }
    }

    @Override
    public String getAllStudents() {
        // 1. 调用Mapper层查询所有学生
        List<StudentEntity> students = studentMapper.getAllStudents();

        // 2. 返回结果
        if (students == null || students.isEmpty()) {
            return "暂无学生数据";
        } else {
            StringBuilder result = new StringBuilder("系统中共找到" + students.size() + "名学生：\n");
            for (StudentEntity student : students) {
                result.append(formatStudentInfo(student)).append("\n");
            }
            return result.toString().trim();
        }
    }

    @Override
    public String updateStudent(StudentEntity student) {
        // 1. 校验学号是否存在
        if (student.getStudentId() == null || student.getStudentId().trim().isEmpty()) {
            return "修改失败：学号不能为空！";
        }

        // 检查学生是否存在
        StudentEntity existingStudent = studentMapper.getByStudentId(student.getStudentId());
        if (existingStudent == null) {
            return "修改失败：学生不存在！";
        }

        // 2. 校验要修改的字段（性别、年龄等规则同新增）
        if (student.getGender() != null && !"男".equals(student.getGender()) && !"女".equals(student.getGender())) {
            return "修改失败：性别必须为'男'或'女'！";
        }

       //先假设年龄不为0
        if (student.getAge() != 0 && (student.getAge() < 18 || student.getAge() > 25)) {
            return "修改失败：年龄必须在18-25岁之间！";
        }

        // 3. 只更新非空字段（空字段表示不修改）
        if (student.getName() != null && !student.getName().trim().isEmpty()) {
            existingStudent.setName(student.getName());
        }
        if (student.getGender() != null && !student.getGender().trim().isEmpty()) {
            existingStudent.setGender(student.getGender());
        }
        // 对于年龄，如果传入的是0，则认为没有设置，不更新
        if (student.getAge() != 0) {
            existingStudent.setAge(student.getAge());
        }
        if (student.getClassName() != null && !student.getClassName().trim().isEmpty()) {
            existingStudent.setClassName(student.getClassName());
        }

        // 进一步检验，给用户判断出具体错误
        if (student.getName() != null && student.getName().trim().isEmpty()) {
            return "修改失败：姓名不能为空！";
        }
        if (student.getClassName() != null && student.getClassName().trim().isEmpty()) {
            return "修改失败：班级名称不能为空！";
        }

        //更新并输出结果
        boolean isSuccess = studentMapper.update(existingStudent);
        if (!isSuccess) {
            return "修改失败：学生信息更新失败，请检查数据格式！";
        }
        return "修改成功！";
    }

    @Override
    public String deleteStudent(String studentId) {
        // 1. 校验学号是否为空
        if (studentId == null || studentId.trim().isEmpty()) {
            return "删除失败：学号不能为空！";
        }

        // 2. 检查学生是否存在
        StudentEntity student = studentMapper.getByStudentId(studentId);
        if (student == null) {
            return "删除失败：学生不存在！";
        }

        // 3. 调用Mapper层删除
        boolean isSuccess = studentMapper.delete(studentId);

        // 4. 返回结果
        return isSuccess ? "删除成功！" : "删除失败：未知错误！";
    }

    /**
     * 格式化学生信息为字符串
     * @param student 学生对象
     * @return 格式化后的学生信息字符串
     */
    private String formatStudentInfo(StudentEntity student) {
        return "学号：" + student.getStudentId() +
                "，姓名：" + student.getName() +
                "，性别：" + student.getGender() +
                "，年龄：" + student.getAge() +
                "，班级：" + student.getClassName();
    }
}
