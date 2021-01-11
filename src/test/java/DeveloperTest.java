import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer1;

    @Before
    public void before(){
        developer1 = new Developer("Helen", "JP132435", 30000);
    }


    @Test
    public void canGetName(){
        assertEquals("Helen", developer1.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("JP132435", developer1.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(30000, developer1.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer1.raiseSalary(500.00);
        assertEquals(30500.0, developer1.getSalary(), 0.001);
    }

    @Test
    public void canPayBonus(){
        assertEquals(300, developer1.payBonus(), 0.01);
    }
}

