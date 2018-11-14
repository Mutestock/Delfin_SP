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
public class Trainer {
    
    //public String TrainerName;
    //public int TrainerAge;
    public boolean trainer;
    private String name;
    
    
    public Trainer(String name, boolean isTrainer ){   

        this.name = name;
        this.trainer = isTrainer;
        
    }
    
    public boolean isTrainer(){
       return trainer;
    }

    @Override
    public String toString() {
        return name + " being a trainer is " + trainer + ". " +'}';
    }

    
    
    
}
