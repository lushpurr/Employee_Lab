import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Susan", "JY36789", 40000,"Management", 200000);
    }

    @Test
    public void canGetName(){
        assertEquals("Susan", director.getName());
    }

    @Test
    public void canGetnINumber(){
        assertEquals("JY36789", director.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(40000, director.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Management", director.getDeptName());
    }

    @Test
    public void canGetBudget(){
        assertEquals(200000, director.getBudget(), 0.01);
    }

    @Test
    public void canIncreasePayBonusTo2(){
        assertEquals(800, director.payBonus(), 0.01);
    }


}
