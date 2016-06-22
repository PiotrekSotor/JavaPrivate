
package tests;
import junit.framework.*;
import javaapplication1.Largest;

public class TestLargest extends TestCase {
   public TestLargest(String name)
   {
       super(name);
   }
   
   public static Test suite(){
       TestSuite suite = new TestSuite();
       suite.addTest(new TestLargest("testOrder"));
       suite.addTest(new TestLargest("testNull"));
       suite.addTest(new TestLargest("testEmpty"));
       return suite;
   }
   
   public void testOrder(){
       assertEquals(3, Largest.largest(new int[] {1,2,3}));
       assertEquals(3, Largest.largest(new int[] {1,3,2}));
       assertEquals(3, Largest.largest(new int[] {3,1,2}));
   }
   
   public void testOne(){
       assertEquals(1, Largest.largest(new int[] {1}));
       assertEquals(-1, Largest.largest(new int[] {-1}));
   }
   
   public void testMIN_MAX(){
       assertEquals(Integer.MAX_VALUE, Largest.largest(new int[] {1,2,Integer.MAX_VALUE}));
       assertEquals(2, Largest.largest(new int[] {1,Integer.MIN_VALUE, 2}));
   }
   public void testMulti(){
       assertEquals(3, Largest.largest(new int[] {3,2,3}));
   }
   
   public void testNull(){
       try{
           Largest.largest(null);
           fail();
       }
       catch (RuntimeException e)
       {
           assertEquals("Null list", e.getMessage());
       }
   }
   
   public void testEmpty(){
       try{
           Largest.largest(new int []{});
           fail();
       }
       catch (RuntimeException e)
       {
           assertEquals("Empty list", e.getMessage());
       }    
   }
}
