
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
        Member juncomp = new Member("test", 7, true, true,"5555");
        Member sencomp = new Member("test", 25, false, true,"5555");
        Member juncas = new Member("test", 7, true, false,"5555");
        Member sencas = new Member("test", 35, false, false,"5555");

        Team team = new Team();
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
