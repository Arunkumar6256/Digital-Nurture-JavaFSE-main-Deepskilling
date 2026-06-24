package Exercise2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void testAddition(){
        Assertions.assertEquals(10,calc.add(8,2));
    }

    @Test
    void testSubtraction(){
        Assertions.assertEquals(1,calc.subtract(10,9));
    }
}
