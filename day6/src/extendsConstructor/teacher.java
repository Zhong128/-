package extendsConstructor;
//子类

public class teacher extends people {
    private String skills;

    public teacher() {
    }

    public teacher(String name, String skills, String sex) {
        //用子类调用调用父类的构造器的应用场景
        super(name, sex);
        this.skills = skills;

    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
