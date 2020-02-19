package Test;

import calculator.Subtraction;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractionTest {
    @Test
    public void test_getDifference(){
        Subtraction sub = new Subtraction();

        int one = 10;
        int two = 5;
        int result = sub.getDifference(one, two);

        assertEquals("Test passed!", 5, result);
    }
}