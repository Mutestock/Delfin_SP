/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormandAdgang;

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
public class MemberTest {
    
    @Test
    public void testGetTeamMembers() {
        // Positive test
        MemberAF Member;

        ArrayList<MemberAF> teamMembers = Registration.getTeamMembers(1);
        assertNotNull(teamMembers);
        assertFalse(teamMembers.isEmpty());
        assertEquals(teamMembers.size(), 3);

        Member = teamMembers.get(0);
        assertEquals(Member.getId(), 2);
        assertEquals(Member.getName(), "Mickey Mouse");
        assertEquals(Member.getPassword(), "5678");
        assertEquals(Member.isAdmin(), true);

        Member = teamMembers.get(1);
        assertEquals(Member.getId(), 3);
        assertEquals(Member.getUsername(), "Fedtmule");
        assertEquals(Member.getPassword(), "1234");
        assertEquals(Member.isAdmin(), false);

        Member = teamMembers.get(2);
        assertEquals(Member.getId(), 7);
        assertEquals(Member.getUsername(), "Pluto");
        assertEquals(Member.getPassword(), "1234");
        assertEquals(Member.isAdmin(), false);
    }
    
}
