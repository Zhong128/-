package conpuslationandjavabean;

public class Test2 {
    public static void main(String[] args) {
    Student2 s1 = new Student2();//调用无参构造器
    s1.name = "小红";
    s1.gender = "女";
    s1.setChineseGrade(70);
    s1.setMathGrade(90);

    Student2 s2 = new Student2("小王", "男", 18, 59, 100);//调用有参构造器

    StudentOperator operator = new StudentOperator(s1);//调用操作模块
    operator.printTotalScore();
    operator.printAverageScore();



    }
}
