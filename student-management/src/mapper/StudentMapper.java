package mapper;

import entity.StudentEntity;

import java.util.List;

/**
 * 数据访问层接口：定义学生数据的CRUD操作规范
 * 职责：仅声明数据操作方法，不涉及业务逻辑和实现
 */
public interface StudentMapper {

    /**
     * 新增学生
     *
     * @param student 学生对象（包含学号等信息）
     * @return 新增成功返回true，失败返回false（如学号已存在时返回false）
     */
    boolean add(StudentEntity student);

    /**
     * 根据学号查询学生
     *
     * @param studentId 学号
     * @return 学生对象，如果不存在则返回null
     */
    StudentEntity getByStudentId(String studentId);

    /**
     * 根据班级查询学生列表
     *
     * @param className 班级名称
     * @return 该班级的所有学生列表
     */
    List<StudentEntity> getByClassName(String className);

    /**
     * 查询所有学生
     *
     * @return 所有学生列表
     */
    List<StudentEntity> getAllStudents();

    /**
     * 修改学生信息
     *
     * @param student 学生对象（包含学号等信息）
     * @return 修改成功返回true，失败返回false（如学生不存在时返回false）
     */
    boolean update(StudentEntity student);

    /**
     * 删除学生
     *
     * @param studentId 学号
     * @return 删除成功返回true，失败返回false（如学生不存在时返回false）
     */
    boolean delete(String studentId);
}


