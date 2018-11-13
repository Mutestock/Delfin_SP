/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Træner;

import FormandAdgang.Member;
import java.util.ArrayList;

/**
 *
 * @author Emil PC
 */

    

public class Hold {
    
    
    
    ArrayList <Member> juniorTeam = new ArrayList();
    ArrayList <Member> seniorTeam = new ArrayList();
    ArrayList <Member> compJuiorTeam = new ArrayList();
    ArrayList <Member> compSeniorteam = new ArrayList();

    public void addMembers(Member members){
       /if(Member.getAge >= 18 && Member.isCompetetive == true){
        compSeniorteam.add(members);
        }
        if(Member.getAge >= 18 && Member.isCompetetive == false){
        seniorTeam.add(members);
        }
        if(Member.getAge < 18 && Member.isCompetetive == true){
        CompjuniorTeam.add(members);
        }
        if(Member.getAge < 18 && Member.isCompetetive == false){
        juniorTeam.add(members);
        }
    
    }
    
    
    
    
    
    
    
}
