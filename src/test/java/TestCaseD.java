import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCaseD {
    @Test
    public void gcd_minus1_minus1_should_return_minus1() {
        // Arrange
        int expected = -1;

        // Act
        int actual = GreatestCommonDivisor.gcd(-1, -1);

        // Assert
        assertEquals(expected, actual);
    }
}
