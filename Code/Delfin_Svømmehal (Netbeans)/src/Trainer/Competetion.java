/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trainer;

import FormandAdgang.Member;
import java.util.ArrayList;

/**
 *
 * @author Gamer
 */
public class Competetion {
    
    private ArrayList<Member> participants = new ArrayList();
    private Trainer trainer;

    public Competetion(ArrayList<Member> participants,Trainer trainer) {
        this.participants = participants;
        this.trainer = trainer;
    }
    
    
    
}
