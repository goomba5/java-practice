package Test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        SubtractionTest.class,
        SumTest.class,
        MultiplicationTest.class
})

public class CalculatorTestSuite {
    public CalculatorTestSuite(){
    }

    @BeforeClass
    public static void setUpClass(){}

    @AfterClass
    public static void tearDownClass(){}
}
