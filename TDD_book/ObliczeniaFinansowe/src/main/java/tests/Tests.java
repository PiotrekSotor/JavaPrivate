package tests;

import com.mycompany.obliczeniafinansowe.Money;
import junit.framework.*;

public class Tests extends TestCase {
    
    public void testMultiplication(){
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
        Money six = Money.franc(6);
        assertEquals(Money.franc(12), six.times(2));
        assertEquals(Money.franc(18), six.times(3));
    }
    
    public void testEquals(){
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotSame(Money.dollar(5), Money.dollar(6));
        assertNotSame(Money.dollar(5), Money.franc(5));
    }
    public void testCurrency(){
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
    
    public void testSimpleAddition(){
        Money sum = Money.dollar(5).plus(Money.dollar(5));
        assertEquals(Money.dollar(10), sum);
    }
}
