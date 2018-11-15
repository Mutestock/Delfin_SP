/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormandAdgangTest;

import FormandAdgang.Member;
import FormandAdgang.MemberAF;
import FormandAdgang.Registration;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author emils
 */

         
public class MemberTest {
        
    
    
    
    
    @Test
    public void testMemberMethods() {
        // Positive test
        Member memberTest = new Member("Skovbo",1,true,true);
        Registration r = new Registration();

        assertNotNull(memberTest);
        assertEquals("Skovbo",memberTest.getName());
        assertEquals(1,memberTest.getAge());
    }
    

}
