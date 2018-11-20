import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before() {
    calculator = new Calculator(4,5);
    }

    @Test
    public void add(){
        assertEquals(9,calculator.add());
    }

    @Test
    public void subtract(){
        assertEquals(-1,calculator.subtract());

    }

    @Test
    public void divide(){
        assertEquals(0,calculator.divide());

    }

    @Test
    public void times(){
        assertEquals(20, calculator.times());

    }

}
