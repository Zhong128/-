package object;

public class Test {
    public static void main(String[] args) {
        Star s1 = new Star();
        s1.name = "王伟伟";
        s1.age = 18;
        s1.height = 178.3;
        s1.weight = 80.5;
        s1.gender = "男";
        System.out.println(s1.name+":"+s1.age+" "+s1.height+" "+s1.weight+" "+s1.gender);
        System.out.println("------------------");

        Student s2 = new Student();
        s2.name = "小王";
        s2.gender = "男";
        s2.ChineseGrade = 59;
        s2.MathGrade = 100;


        System.out.println(s2.name+"语文成绩是"+s2.ChineseGrade+"\t"+"数学成绩是"+s2.MathGrade);
        s2.printAllScore();
        s2.printAverageScore();
        System.out.println("------------------");

        Student s3 = new Student();
        s3.name = "小红";
        s3.gender = "女";
        s3.ChineseGrade = 100;
        s3.MathGrade = 100;
        System.out.println(s3.name+"语文成绩是"+s3.ChineseGrade+"数学成绩是"+s3.MathGrade);
        s3.printAllScore();
        s3.printAverageScore();

    }
}
