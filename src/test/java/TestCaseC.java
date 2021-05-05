import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCaseC {
    @Test
    public void gcd_12_18_should_return_6() {
        // Arrange
        int expected = 6;

        // Act
        int actual = GreatestCommonDivisor.gcd(12, 18);

        // Assert
        assertEquals(expected, actual);
    }
}
