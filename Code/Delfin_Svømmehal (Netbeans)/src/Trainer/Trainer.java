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
    
    private String name;
    
    //The trainer should not be considered a member. Therefore, the trainer class isn't extended from the member class.
    //Furthermore, it is unnecessary for the trainer to have more information than the name, given the current structure of the program
    
    //Additional implications could be:
    //The teams in which he is the trainer.
    
    public Trainer(String name){   
        this.name = name;
    }

    @Override
    public String toString() {
        return "Trainer{" + "name=" + name + '}';
    }
 
    
}
