/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trainer;

/**
 *
 * @author ahmed
 */
public class Trainer {
    
    //public String TrainerName;
    //public int TrainerAge;
    private String name;
    
    
    public Trainer(String name){   

        this.name = name;
        
    }

    @Override
    public String toString() {
        return "Trainer{" + "name=" + name + '}';
    }
 
    
}
