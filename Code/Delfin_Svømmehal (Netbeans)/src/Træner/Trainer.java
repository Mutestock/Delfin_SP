/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Træner;

/**
 *
 * @author ahmed
 */
public class Trainer extends FormandAdgang.Member{
    
    //public String TrainerName;
    //public int TrainerAge;
    public boolean trainer;
    
    
    public Trainer( boolean isTrainer, String name, int age, boolean activityForm, boolean competetive ){   
        super( name, age, activityForm, competetive);
        this.trainer = isTrainer;
        
    }
    
    public boolean isTrainer(){
       return trainer;
    }

    @Override
    public String toString() {
        return "Trainer{" + "trainer=" + trainer + '}';
    }
    
    
    
}
