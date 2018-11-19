import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

// Create a Calculator class. This should have functions for Add, Subtract, Multiply and Divide, each taking in two ints, performing the appropriate calculations, and returning the result.

public class CalculatorTest{
//    ask about this line - clarify what it's doing and why we have it.
    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void addsTwoValues(){
        assertEquals(5, calculator.add(2,3), .003);
    }

    @Test
    public void subtractsTwoValues(){
        assertEquals(7, calculator.subtract(15,8), .003);
    }

    @Test
    public void multipliesTwoValues(){
        assertEquals(21, calculator.multiply(7,3), .003);
    }

    @Test
    public void dividesTwoValues(){
        assertEquals(3, calculator.divide(27,9),.003);
    }

    @Test
    public void dividesTwoValues_2(){
        assertEquals(2.6667, calculator.divide(8,3),.003);
    }
}

