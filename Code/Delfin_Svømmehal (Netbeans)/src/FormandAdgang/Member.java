
package FormandAdgang;

public class Member {
    


    // kan sætte af sammen med den her
    //The fields/values of a member.
    private String name;
    private int age;
    private boolean activity;
    private boolean competetive;
    //--Need to add more at a certain point (We need "stamoplysninger")!--//
    
    //MemberAF fields has been merged to Member class.
    private boolean ageBonus;
    private boolean senior;
    private boolean junior;
    
    //Kontingent fields has been merged to 
    private int subCatalogueYear;
    private int subFee;
    

<<<<<<< HEAD
    public Member(String name, int age, boolean activityForm, boolean competetive) {
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
    public Member(String name, int age, boolean activityForm, boolean competetive) {
=======
    public Member() {

    }
>>>>>>> c9a3f948eb2f1beb0973ad9c789b76cd8256e452

    public Member(String name, int age, boolean activityForm, boolean competetive, String subCatalogueYear) {
>>>>>>> fbd7945e520c0618004954346537f0abb3a196d7
>>>>>>> 101d1917f923aa23cc1adb1e5d271717ef74c39e
        this.name = name;
        this.age = age;
        this.activity = activityForm;
        this.competetive = competetive;
        
        //Sets the value of a member to either Junior or Senior
        //and also checks if the member is old enough for an age bonus.
        if (getAge() < 18) {
            junior = true;
            senior = false;
        } else {
            senior = true;
            junior = false;
        }
        if (getAge() > 60) {
            ageBonus = true;
        }
    }

    
    //A lot of get-methods.
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return activity;
    }

    public boolean isCompetetive() {
        return competetive;
    }
    
    public boolean isAgeBonus() {
        return ageBonus;
    }

    public boolean isSenior() {
        return senior;
    }

    public boolean isJunior() {
        return junior;
    }

    public int getSubCatalogueYear() {
        return subCatalogueYear;
    }

    public int getSubFee() {
        return subFee;
    }

    
    
    //Logic method used to calculate a certain members fee (based on their age)
    public int calcFee() {
        if (isActive() == true) {
            if (getAge() >= 60) {
                return 1200;
            } else if (getAge() >= 18) {
                return 1600;
            } else {
                return 1000;
            }
        }
        return 500;
    }

    
    //toString will have to get simplified and easier to read.
    @Override
    public String toString() {
        return "Member{" + "name=" + name + ", age=" + age + ", activity=" + activity + ", competetive=" + competetive + ", ageBonus=" + ageBonus + ", senior=" + senior + ", junior=" + junior + ", subCatalogueYear=" + subCatalogueYear + ", subFee=" + subFee + '}';
    }
    
    
   
    
    
    
}
