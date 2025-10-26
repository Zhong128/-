package conpuslationandjavabean;

public class StudentOperator {
    private Student2 s ;
    public StudentOperator(Student2 s){
        this.s = s;
    }
    public void printTotalScore(){
        System.out.println(s.name+" "+s.gender+" "+"总成绩是"+(s.getChineseGrade()+s.getMathGrade()));

    }
    public void printAverageScore(){
        System.out.println("平均成绩是"+(s.getChineseGrade()+s.getMathGrade())/2);

    }
}
