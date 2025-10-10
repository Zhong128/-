package mapper;

import entity.StudentEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 数据访问层实现类：用HashMap模拟数据库，实现StudentMapper接口的方法
 * 职责：仅处理数据存储和读取，不做任何业务校验（校验交给Service层）
 */
public class StudentMapperImpl implements StudentMapper {

    // 用HashMap存储学生数据：key=学号（唯一），value=学生对象
    private final Map<String, StudentEntity> studentMap = new HashMap<>();

    @Override
    public boolean add(StudentEntity student) {
        // 若学号已存在，新增失败（返回false）；否则存入map（返回true）
        String studentId = student.getStudentId();
        if (studentMap.containsKey(studentId)) {
            return false;
        }else
        studentMap.put(studentId, student);
        return true;
    }

    @Override
    public StudentEntity getByStudentId(String studentId) {
        // 根据学号查询学生
        return studentMap.get(studentId);
    }

    @Override
    public List<StudentEntity> getByClassName(String className) {
        // 根据班级查询学生，遍历map，筛选相同班级的学生
        List<StudentEntity> result = new ArrayList<>();
        for (StudentEntity student : studentMap.values()) {
            if (className.equals(student.getClassName())) {
                result.add(student);
            }
        }
        return result;
    }

    @Override
    public List<StudentEntity> getAllStudents() {
        // 查询所有学生，返回map.values()转换的列表
        return new ArrayList<>(studentMap.values());
    }

    @Override
    public boolean update(StudentEntity student) {
        // 修改学生信息，先检查是否存在，再输出
        String studentId = student.getStudentId();
        if (!studentMap.containsKey(studentId)) {
            return false;
        }else
        studentMap.put(studentId, student);
        return true;
    }

    @Override
    public boolean delete(String studentId) {
        // 删除学生
        if (!studentMap.containsKey(studentId)) {
            return false;
        }else
        studentMap.remove(studentId);
        return true;
    }
}
