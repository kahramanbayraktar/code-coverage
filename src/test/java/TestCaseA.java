import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCaseA {
    @Test
    public void gcd_2_2_should_return_2() {
        // Arrange
        int expected = 2;

        // Act
        int actual = GreatestCommonDivisor.gcd(2, 2);

        // Assert
        assertEquals(expected, actual);
    }
}
