import org.junit.Test;
import static org.junit.Assert.*;

public class TestMutant {
    @Test
    public void testCalSameMonthEnd(){
        Mutant mutant = new Mutant();
        assertEquals(30, mutant.cal(1,1,1,31,2022));
    }

    @Test
    public void testCalNonLeapYearMultipleOf100(){
        Mutant mutant = new Mutant();
        assertEquals(180, mutant.cal(1,1,6,30,2100));
    }

    @Test
    public void testCalLeapYear(){
        Mutant mutant = new Mutant();
        assertEquals(29, mutant.cal(2,15,3,15,2000));
    }
}
