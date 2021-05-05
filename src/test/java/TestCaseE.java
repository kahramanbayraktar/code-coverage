import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCaseE {
    @Test
    public void gcd_0_minus1_should_return_minus1() {
        // Arrange
        int expected = -1;

        // Act
        int actual = GreatestCommonDivisor.gcd(0, -1);

        // Assert
        assertEquals(expected, actual);
    }
}
