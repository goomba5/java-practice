package Test;

import calculator.Multiplication;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationTest {
    @Test
    public void test_getProduct(){
        Multiplication mult = new Multiplication();

        double numOne = 5.0;
        double numTwo = 5.0;
        double result = mult.getProduct(numOne,numTwo);

        assertEquals(25, result, 0);
    }
}