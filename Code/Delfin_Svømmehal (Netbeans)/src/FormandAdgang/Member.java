
package FormandAdgang;

public class Member {
    

    //The fields/values of a member.
    private String name;
    private int age;
    private String phone;
    private boolean activity;
    private boolean competetive;
    
    //MemberAF fields has been merged to Member class.
    private boolean ageBonus;
    private boolean senior;
    private boolean junior;
    
    //Kontingent fields has been merged to 
    private int subCatalogueYear;
    private int subFee;
    

    public Member(String name, int age, String phone, boolean activityForm, boolean competetive) {

        this.name = name;
        this.age = age;
        this.activity = activityForm;
        this.competetive = competetive;
        this.phone = phone;
        //Sets the value of a member to either Junior or Senior
        //and also checks if the member is old enough for an age bonus.
        if (getAge() < 18) {
            this.junior = true;
            this.senior = false;
        } else {
            this.senior = true;
            this.junior = false;
        }
        if (getAge() > 60) {
            this.ageBonus = true;
        }
    }


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

    public void setSubCatalogueYear(int subCatalogueYear) {
        this.subCatalogueYear = subCatalogueYear;
    }

    public void setSubFee(int subFee) {
        this.subFee = subFee;
    }

    
    
    //Logic method used to calculate a certain members fee (based on their age)
    //It's functionality has been implemented in the constructor.
    //Kept since it might become useful later.
    
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
        return name + "," + age + "," + phone + "," + activity + "," + competetive + "," + ageBonus + "," + senior + "," + junior + "," + subCatalogueYear + "," + subFee + ".";
    }
    
    
    
   
    
    
    
}
