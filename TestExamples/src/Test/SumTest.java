package Test;

// import org.juint.Assert.* so you can use the @Test annotation
import calculator.Sum;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {
    // create the test method
    @Test
    public void test_getSum(){
        Sum summation = new Sum();

        int one = 2;
        int two = 3;
        int result = summation.getSum(one, two);

        // write a test that will pass
        assertEquals("Sum is correct", 5, result);

        int three = 4;
        int four = 5;
        int result1 = summation.getSum(three, four);
        // write a test that will fail
        assertEquals("Test failed", 10, result1);
    }
}