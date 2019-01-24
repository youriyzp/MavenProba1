package net.ukr.kiyashko.lab2;

/**
 * Basic integral calculator, for simplify using math operators.
 *
 * @author Vladimir Bratchikov.
 */
public class IntegralCalculator
{
    /**
     * Sum two values.
     *
     * @param a first addend.
     * @param b second addend.
     * @return sum.
     */
    public int sum(int a, int b) {
        return a + b;
    }

    /**
     * Subtraction second value from first.
     *
     * @param a decreasing.
     * @param b subtrahend.
     * @return residual result.
     */
    public int sub(int a, int b) {
        return a - b;
    }

    /**
     * Multiply two values.
     *
     * @param a first multiplier.
     * @param b second multiplier.
     * @return result of multiply.
     */
    public int mul(int a, int b) {
        return a * b;
    }

    /**
     * Divide first value by second.
     *
     * @param a dividend.
     * @param b divider.
     * @return dividing result.
     */
    public int div(int a, int b) {
        return a / b;
    }
}
