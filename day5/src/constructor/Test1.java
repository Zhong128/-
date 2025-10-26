package constructor;

public class Test1 {
    public static void main(String[] args) {
        Student1 s1 = new Student1("小王",18 , "男");
        Student1 s2 = new Student1("小李",20 , "男");
        System.out.println(s1.name+" "+s1.age+" "+s1.sex);
        System.out.println(s2.name+" "+s2.age+" "+s2.sex);
    }
}
