package net.ukr.kiyashko.lab2;

/**
 * Boolean calculator, for simplify using boolean logic operators.
 *
 * @author Vladimir Bratchikov.
 */
public class BooleanCalculator
{
    /**
     * Expression of signed right shift.
     *
     * @param value shifted value.
     * @param shift shift point.
     *
     * @return shifted value result.
     */
    public int shiftRight(int value, int shift) {
        return value >> shift;
    }

    /**
     * Expression of signed left shift.
     *
     * @param value shifted value.
     * @param shift shift point.
     *
     * @return shifted value result.
     */
    public int shiftLeft(int value, int shift) {
        return value << shift;
    }

    /**
     * Expression of unsigned right shift.
     *
     * @param value shifted value.
     * @param shift shift point.
     *
     * @return shifted value result.
     */
    public int unsignedShift(int value, int shift) {
        return value >>> shift;
    }

    /**
     * Expression of bitwise exclusive OR.
     *
     * @param value1 first operand.
     * @param value2 second operand.
     *
     * @return xor value result.
     */
    public int xor(int value1, int value2) {
        return value1 ^ value2;
    }

    /**
     * Expression of unary bitwise complement.
     *
     * @param value unary operand.
     *
     * @return inversed value.
     */
    public int inverse(int value) {
        return ~value;
    }


    //TODO write JavaDoc
    public int  and () {

        //TODO implement this method.
        return 0;
    }

    //TODO write JavaDoc
    public int or() {
        //TODO implement this method.
        return 0;
    }
}
