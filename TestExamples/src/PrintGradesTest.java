import org.junit.Test;

import static org.junit.Assert.*;

public class PrintGradesTest {
    // create the method first
    @Test
    public void test(){
        // creates an object so its print() method can be used
        PrintGrades pg = new PrintGrades();

        // the result will be checked against the expected value in assertEquals
        String result = pg.print(95);

        assertEquals("You got an A!", result);
    }
}