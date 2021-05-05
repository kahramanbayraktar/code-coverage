import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCaseB {
    @Test
    public void gcd_6_18_should_return_6() {
        // Arrange
        int expected = 6;

        // Act
        int actual = GreatestCommonDivisor.gcd(6, 18);

        // Assert
        assertEquals(expected, actual);
    }
}
