
import calculator.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;


public class caltest 
{
   

    @Test
    public void testAdd() {
        assertEquals(5, Calculator.add(2, 3));
        assertEquals(-1, Calculator.add(2, -3));
        assertEquals(0, Calculator.add(0, 0));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, Calculator.sub(3, 2));
        assertEquals(5, Calculator.sub(2, -3));
        assertEquals(0, Calculator.sub(0, 0));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, Calculator.mul(2, 3));
        assertEquals(-6, Calculator.mul(2, -3));
        assertEquals(0, Calculator.mul(0, 0));
    }

    @Test
    public void testDivide() {
        assertEquals(2, Calculator.div(6, 3));
        assertEquals(-2, Calculator.div(6, -3));
        assertEquals(0, Calculator.div(0, 5));
        
        
        try {
            Calculator.div(5, 0);
            fail("Expected an ArithmeticException to be thrown");
        } catch (ArithmeticException e) {
            
        }
    }

    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() 
    {
        
    }
    
    @After
    public void tearDown() {
    }

}
