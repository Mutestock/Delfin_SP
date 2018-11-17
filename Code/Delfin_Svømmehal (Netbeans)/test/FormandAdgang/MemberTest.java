/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormandAdgang;

import Trainer.Team;
import Trainer.Trainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gamer
 */
public class MemberTest {

    /**
     * Test of calcFee method, of class Member.
     */
    @org.junit.Test
    public void testCalcFee() {
        System.out.println("calcFee");
        Member instance1 = new Member("test",7,"12345679",true,true);
        Member instance2 = new Member("test",23,"12345679",true,true);
        Member instance3 = new Member("test",72,"12345679",true,true);
        int expResult1 = 1000;
        int expResult2 = 1600;
        int expResult3 = 1200;
        int result1 = instance1.getSubFee();
        int result2 = instance2.getSubFee();
        int result3 = instance3.getSubFee();
        
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
    }
}
