import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;
    @Before
    public void before(){
        manager = new Manager("John", "JM234567", 35000,"Management");
    }

    @Test
    public void canGetName(){
        assertEquals("John", manager.getName());
    }

    @Test
    public void canChangeName(){
        manager.setName("Jen");
        assertEquals("Jen", manager.getName());
    }

    @Test
    public void cantChangeNameWhenNull(){
        manager.setNameIfNotNull(null);
        assertEquals("John", manager.getName());
    }

    @Test
    public void canChangeNameIfNotNull(){
        manager.setNameIfNotNull("Jen");
        assertEquals("Jen", manager.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("JM234567", manager.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(35000, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Management", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(500.00);
        assertEquals(35500.0, manager.getSalary(), 0.001);
    }

    @Test
    public void cantProvideNegativeRaiseAmount(){
        manager.raiseSalary(-500.00);
        assertEquals(35000.0, manager.getSalary(), 0.001);

    }

    @Test
    public void canPayBonus(){
        assertEquals(350, manager.payBonus(), 0.01);
    }
}

