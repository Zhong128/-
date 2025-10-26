package conpuslationandjavabean;

public class Student2 {
    String name;
    String gender;
    private int age;
    private double ChineseGrade;
    private double MathGrade;

    public Student2() {
    }

    public Student2(String name, String gender, int age, double chineseGrade, double mathGrade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        ChineseGrade = chineseGrade;
        MathGrade = mathGrade;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getChineseGrade() {
        return ChineseGrade;
    }

    public void setChineseGrade(double chineseGrade) {
        ChineseGrade = chineseGrade;
    }

    public double getMathGrade() {
        return MathGrade;
    }

    public void setMathGrade(double mathGrade) {
        MathGrade = mathGrade;
    }
}
