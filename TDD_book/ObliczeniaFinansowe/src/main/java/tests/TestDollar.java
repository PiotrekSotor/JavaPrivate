package tests;

import com.mycompany.obliczeniafinansowe.Dollar;
import junit.framework.*;

public class TestDollar extends TestCase {
    
    public void testMultiplication(){
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }
    
    public void testEquals(){
        Dollar five_1 = new Dollar(5);
        Dollar five_2 = new Dollar(5);
        Dollar six = new Dollar(6);
        assertEquals(five_1, five_2);
        assertNotSame(five_1, six);
    }
    
}
