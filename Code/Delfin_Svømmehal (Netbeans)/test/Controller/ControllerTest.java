/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

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
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createMember method, of class Controller.
     */
    @org.junit.Test
    public void testCreateMember() {
        System.out.println("createMember");
        String name = "";
        int age = 0;
        String phone = "";
        boolean activityForm = false;
        boolean competetive = false;
        Controller instance = new Controller();
        instance.createMember(name, age, phone, activityForm, competetive);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateMember method, of class Controller.
     */
    @org.junit.Test
    public void testUpdateMember() {
        System.out.println("updateMember");
        Controller instance = new Controller();
        instance.updateMember();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllMembers method, of class Controller.
     */
    @org.junit.Test
    public void testGetAllMembers() {
        System.out.println("getAllMembers");
        Controller instance = new Controller();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getAllMembers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteMember method, of class Controller.
     */
    @org.junit.Test
    public void testDeleteMember() {
        System.out.println("deleteMember");
        String phone = "";
        Controller instance = new Controller();
        instance.deleteMember(phone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
