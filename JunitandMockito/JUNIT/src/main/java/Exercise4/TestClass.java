package Exercise4;
import Exercise2.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestClass {
    Calculator calc;
    @BeforeEach
    public void setup(){
        calc = new Calculator();
        System.out.println("setup done");
    }

    @Test
    public void testAddition() {
        //Arrange
        int a = 2;
        int b = 3;
        //Act
        int result = calc.add(a, b);

        //Assert
        Assertions.assertEquals(5, result);
    }
    @AfterEach
    public void tearDown() {
        calc = null;
        System.out.println("Cleanup done");

    }
}
