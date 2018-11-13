
package FormandAdgang;

public class Member {
    
    String name;
    int age;
    
    boolean activity;
    boolean competetive;

    
    public Member(String name, int age, boolean activityForm, boolean competetive) {
        this.name = name;
        this.age = age;
        this.activity = activityForm;
        this.competetive = competetive;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isActivity() {
        return activity;
    }

    public boolean isCompetetive() {
        return competetive;
    }

    
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Activity: " + activity + ", Competetive: " + competetive;
    }
    
    
}
