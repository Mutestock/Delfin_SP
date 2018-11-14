/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Træner;

import FormandAdgang.Member;
import FormandAdgang.MemberAF;
import java.util.ArrayList;

/**
 *
 * @author Emil PC
 */

    

public class Hold {
    
    
    ArrayList <MemberAF> juniorTeam = new ArrayList();
    ArrayList <MemberAF> seniorTeam = new ArrayList();
    ArrayList <MemberAF> compJuniorTeam = new ArrayList();
    ArrayList <MemberAF> compSeniorTeam = new ArrayList();

    public void addMembers(MemberAF members){
       if(members.isSenior()&&members.getMember().isCompetetive()){
        compSeniorTeam.add(members);
        }
        if(members.isSenior()){
        seniorTeam.add(members);
        }
        if(members.isJunior()&&members.getMember().isCompetetive()){
        compJuniorTeam.add(members);
        }
        if(members.isJunior()){
        juniorTeam.add(members);
        }
    
    }
    public void showMembers(){
     
    
       
    }
    
    
    
    
    
    
    
}
