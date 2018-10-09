package ru.job;
/**
 * Calculator.
 *
 * @author Ugay Stas(ugay8010@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Factorial {
    /**
     * method callc
     * @param n
     */
    public int calc(int n) {
        if (n == 0) {
            return 0;
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
