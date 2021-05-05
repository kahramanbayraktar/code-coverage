public class GreatestCommonDivisor {
    public static int gcd(int a, int b) {
        if (a < 0) {
            return -1;
        } else {
            if (b < 0) {
                return -1;
            } else {
                while (a != b) {
                    if (a > b) {
                        a = a - b;
                    } else {
                        b = b - a;
                    }
                }
                return a;
            }
        }
    }
}
