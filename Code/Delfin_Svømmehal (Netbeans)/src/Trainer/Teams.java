/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trainer;

import FormandAdgang.Member;
import java.util.ArrayList;

public class Teams {
    
    private ArrayList<Member> juniorTeam = new ArrayList();
    private ArrayList<Member> seniorTeam = new ArrayList();
    private ArrayList<Member> compJuniorTeam = new ArrayList();
    private ArrayList<Member> compSeniorTeam = new ArrayList();
    
    
    public Teams() {
    }
    
    
    
    
    public void addMemberToTeam(Member member){
        //First if statement checks whether the member is a competetive
        //member of a team, and then adds member to the correct age grp.
        if (member.isCompetetive()) {
            if(member.isJunior()) {
                compJuniorTeam.add(member);
                return;
            }
            if(member.isSenior()) {
                compSeniorTeam.add(member);
                return;
            }
        } 
        
        //Now we know the member is not competetive, and we can simply
        //sort the member based on their age.
        if (member.isJunior()) {
            juniorTeam.add(member);
        }
        //If neither of the states above is shown correct, the member can
        //only be a casual senior member.
        else {
            seniorTeam.add(member);
        }       
    }

    
    
    public ArrayList<Member> getJuniorTeam() {
        return juniorTeam;
    }

    public ArrayList<Member> getSeniorTeam() {
        return seniorTeam;
    }

    public ArrayList<Member> getCompJuniorTeam() {
        return compJuniorTeam;
    }

    public ArrayList<Member> getCompSeniorTeam() {
        return compSeniorTeam;
    }

    
    
}
