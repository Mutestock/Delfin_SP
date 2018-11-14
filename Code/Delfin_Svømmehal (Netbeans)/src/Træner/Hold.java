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

    ArrayList<MemberAF> SwimTeam = new ArrayList();

    public void addMember(MemberAF members) {
        SwimTeam.add(members);
    }

    public void showMembers(int numb) {

        //switch() 
    }

    public ArrayList<MemberAF> getMembers() {
        return SwimTeam;
    }

}
