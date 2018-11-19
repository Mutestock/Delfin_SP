/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import FormandAdgang.Member;
import FormandAdgang.Registration;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author emils
 */
public class ControllerTest {
    
    public ControllerTest() {
    }
    
    @Test
    public static void testcreateMember() {
        
        Member instance1 = new Member("test",7,"12345679",true,true);
        Member instance2 = new Member("test",23,"12345679",true,true);
        Member instance3 = new Member("test",72,"12345679",true,true);
        Registration r = new Registration();
        r.registerMember(instance1);
        r.registerMember(instance2);
        r.registerMember(instance3);
        assertNull(r);
        
    }
    @Test
    public static void testupdateMember() {
        
    }
    
}
