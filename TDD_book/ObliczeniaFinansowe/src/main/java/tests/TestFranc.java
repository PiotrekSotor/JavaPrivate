package tests;
import com.mycompany.obliczeniafinansowe.Franc;
import junit.framework.*;

public class TestFranc extends TestCase{
    
    public void testMultiplication(){
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }
    
}
