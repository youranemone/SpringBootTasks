import java.util.Date;

public class Learner {
    protected String name;
    protected int age;
    protected int group;

    public Learner(String name, int age, int group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public void learn() {
        Date date = new Date();
        System.out.println("Date: " + date.toString());
    }

}
