import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin1;

    @Before
    public void before(){
        databaseAdmin1 = new DatabaseAdmin("Ed", "JL987654", 22000);
    }


    @Test
    public void canGetName(){
        assertEquals("Ed", databaseAdmin1.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("JL987654", databaseAdmin1.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(22000, databaseAdmin1.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin1.raiseSalary(500.00);
        assertEquals(22500.0, databaseAdmin1.getSalary(), 0.001);
    }

    @Test
    public void canPayBonus(){
        assertEquals(220, databaseAdmin1.payBonus(), 0.01);
    }


}