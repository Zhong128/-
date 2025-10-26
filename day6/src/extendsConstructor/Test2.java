package extendsConstructor;

public class Test2 {
    public static void main(String[] args) {
        teacher t = new teacher("小明","JAVA","男");
        /*可行的赋值方法
        t.setName();
        t.setSex();
        t.setSkills();
         */
        System.out.println(t.getName());
        System.out.println(t.getSex());
        System.out.println(t.getSkills());
    }
}
