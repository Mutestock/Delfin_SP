/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trainer;

import FormandAdgang.Member;
import java.util.ArrayList;

public class Teams {

    private Teams juniorTeam = new Teams();
    private Teams seniorTeam = new Teams();
    private Teams compJuniorTeam = new Teams();
    private Teams compSeniorTeam = new Teams();

    
    
    public Teams() {
    }
    
    
    
    
    public void addMemberToTeam(Member member){
        //First if statement checks whether the member is a competetive
        //member of a team, and then adds member to the correct age grp.
        if (member.isCompetetive()) {
            if(member.isJunior()) {
                compJuniorTeam.addMemberToTeam(member);
                return;
            }
            if(member.isSenior()) {
                compSeniorTeam.addMemberToTeam(member);
                return;
            }
        } 
        
        //Now we know the member is not competetive, and we can simply
        //sort the member based on their age.
        if (member.isJunior()) {
            juniorTeam.addMemberToTeam(member);
        }
        //If neither of the states above is shown correct, the member can
        //only be a casual senior member.
        else {
            seniorTeam.addMemberToTeam(member);
        }       
    }

    
    
    public Teams getJuniorTeam() {
        return juniorTeam;
    }

    public Teams getSeniorTeam() {
        return seniorTeam;
    }

    public Teams getCompJuniorTeam() {
        return compJuniorTeam;
    }

    public Teams getCompSeniorTeam() {
        return compSeniorTeam;
    }

    
    
}
