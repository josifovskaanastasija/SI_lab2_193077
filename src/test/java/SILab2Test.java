import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SILab2Test extends TestCase {
    Time time = new Time(24, 59, 59);
    Time time1 = new Time(24, 0, 0);
    Time time2 = new Time(-1, 10, 10);
    Time time3 = new Time(27, 10, 25);
    Time time4 = new Time(20, 69, 15);
    Time time5 = new Time(10, 30, 72);
    Time time6 = new Time(10, 22, 31);

    private final SILab2 siLab2 = new SILab2();

    private List<Time> createList(Time... elements){
        return new ArrayList<>(Arrays.asList(elements));
    }

    private List<Integer> createlist(int... elements){
        return new ArrayList<Integer>();
    }

    @Test
    public void testEveryStatement(){
        RuntimeException ex = null;

        try{
            siLab2.function(createList(time2));
        }
        catch(RuntimeException e){
            ex = e;
        }

        assertNotNull(ex);
        assertTrue(ex.getMessage().contains("The hours are smaller than the minimum"));

        try{
            siLab2.function(createList(time3));
        }
        catch(RuntimeException e){
            ex = e;
        }

        assertNotNull(ex);
        assertTrue(ex.getMessage().contains("The hours are grater than the maximum"));

        try{
            siLab2.function(createList(time4));
        }
        catch(RuntimeException e){
            ex = e;
        }

        assertNotNull(ex);
        assertTrue(ex.getMessage().contains("The minutes are not valid!"));

        try{
            siLab2.function(createList(time5));
        }
        catch(RuntimeException e){
            ex = e;
        }

        assertNotNull(ex);
        assertTrue(ex.getMessage().contains("The seconds are not valid"));

        try{
            siLab2.function(createList(time));
        }
        catch(RuntimeException e){
            ex = e;
        }

        assertNotNull(ex);
        assertTrue(ex.getMessage().contains("The time is greater than the maximum"));

        assertEquals(createlist(145220), siLab2.function(createList(time1)));
        assertEquals(createlist(86400), siLab2.function(createList(time6)));
    }

}