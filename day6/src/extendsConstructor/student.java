package extendsConstructor;

public class student {
    private String name;
    private String sex;
    private int age;
    private String schoolName;

    public student(){

    }
    public student(String name, String sex, int age) {
        //用this调用兄弟构造器的应用场景（有一些数据都是相同的避免重复）
        this(name,sex,age,"清华大学");
    }

    public student(String name, String sex, int age, String schoolName) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
