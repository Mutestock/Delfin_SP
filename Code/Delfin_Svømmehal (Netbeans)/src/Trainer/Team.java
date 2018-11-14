/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trainer;

import FormandAdgang.MemberAF;
import java.util.ArrayList;

public class Team {

    private Team juniorTeam = new Team();
    private Team seniorTeam = new Team();
    private Team compJuniorTeam = new Team();
    private Team compSeniorTeam = new Team();
    
    //Hold.getMembers();
    

    public void addMember(MemberAF member){
        //First if statement checks whether the member is a competetive
        //member of a team, and then adds member to the correct age grp.
        if (member.getMember().isCompetetive()) {
            if(member.isJunior()) {
                compJuniorTeam.addMember(member);
                return;
            }
            if(member.isSenior()) {
                compSeniorTeam.addMember(member);
                return;
            }
        } 
        
        //Now we know the member is not competetive, and we can simply
        //sort the member based on their age.
        if (member.isJunior()) {
            juniorTeam.addMember(member);
        }
        //If neither of the states above is shown correct, the member can
        //only be a casual senior member.
        else {
            seniorTeam.addMember(member);
        }       
    }

    
    
}
