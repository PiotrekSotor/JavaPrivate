package javaapplication1;

import KalkulatorOdsetek.Kalkulator;
import java.util.Date;
import junit.framework.*;

/**
 *
 * @author Piotrek
 */
public class TestDayCounter extends TestCase {
    Kalkulator calc = new Kalkulator();
    public void testCommon(){
        Date startDate = new Date();
        Date endDate_1 = new Date(startDate.getTime() + 1000*60*60*24*30); // startDate + 30 days 
        Date endDate_2 = new Date(startDate.getTime() + 1000*60*60*6); // startDate + 0 day, 6 hours
        Date endDate_3 = new Date(startDate.getTime() + 1000*60*60*24); // startDate + 1 days
        assertEquals(calc.dayCounter(startDate, endDate_1),30);
        assertEquals(calc.dayCounter(startDate, endDate_2),0);
        assertEquals(calc.dayCounter(startDate, endDate_3),1);
    }
    
    public void testWrongOrder(){
        Date startDate = new Date();
        Date endDate_1 = new Date(startDate.getTime() + 1000*60*60*24*30); // startDate + 30 days 
        Date endDate_2 = new Date(startDate.getTime() + 1000*60*60*6); // startDate + 0 day, 6 hours
        Date endDate_3 = new Date(startDate.getTime() + 1000*60*60*24); // startDate + 1 days
        assertEquals(calc.dayCounter(endDate_1, startDate),30);
        assertEquals(calc.dayCounter(endDate_2, startDate),0);
        assertEquals(calc.dayCounter(endDate_3, startDate),1);
    }
    
    public void testEquals(){
        Date startDate = new Date();
        assertEquals(calc.dayCounter(startDate, startDate), 0);
    }    
}
