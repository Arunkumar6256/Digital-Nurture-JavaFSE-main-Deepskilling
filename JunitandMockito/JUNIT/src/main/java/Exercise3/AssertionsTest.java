package Exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsTest {
    @Test
    public void testAssertions(){
        Assertions.assertEquals(5,2+3);

        Assertions.assertTrue(10>5);

        Assertions.assertFalse(5>10);

        Assertions.assertNull(null);

        Assertions.assertNotNull(new Object());
    }
}
