package object;

public class Student {
    String name;
    String gender;
    double ChineseGrade;
    double MathGrade;

    public void printAllScore(){
        System.out.println(name+"总成绩是"+(ChineseGrade+MathGrade));

    }
    public void printAverageScore(){
        System.out.println(name+"平均成绩是"+(ChineseGrade+MathGrade)/2);
    }
}
