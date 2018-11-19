
package Trainer;

import FormandAdgang.Member;
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
public class TeamTest {
    
    @Test
    public void testAddMemberToTeam() {
<<<<<<< HEAD
        Member juncomp = new Member("test", 7, false, true);
        Member sencomp = new Member("test", 25, false, true);
        Member juncas = new Member("test", 7, true, false);
        Member sencas = new Member("test", 35, true, false);
=======
        Member juncomp = new Member("test", 7,"12345679", true, true);
        Member sencomp = new Member("test", 25,"12345679", false, true);
        Member juncas = new Member("test", 7,"12345679", true, false);
        Member sencas = new Member("test", 35,"12345679", false, false);
>>>>>>> c17a7732bbfed2d9e8bc974b9f7729a2d60d77dc

        Teams team = new Teams();
        team.addMemberToTeam(juncomp);
        team.addMemberToTeam(sencomp);
        team.addMemberToTeam(juncas);
        team.addMemberToTeam(sencas);
        assertNotNull(team.getCompJuniorTeam());
        assertNotNull(team.getJuniorTeam());
        assertNotNull(team.getCompSeniorTeam()); 
        assertNotNull(team.getSeniorTeam());
    }    
}
