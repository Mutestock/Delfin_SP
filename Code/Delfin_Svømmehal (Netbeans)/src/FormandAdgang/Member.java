
package FormandAdgang;

public class Member {
    
    private String name;
    private int age;
    private boolean activity;
    boolean competetive;

    // kan sætte af sammen med den her
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
        return "NAME: " + name + ", AGE: " + age + ", ACTIVITY: " + activity + ", COMPETETIVE: " + competetive;
    }
    
    
}
