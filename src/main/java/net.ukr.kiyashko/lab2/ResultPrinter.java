package net.ukr.kiyashko.lab2;

/**
 * Simple calculator printer.
 * Based on static methods.
 * Prints the calculated expression and its result to the console.
 *
 * @author Vladimir Bratchikov.
 */
public final class ResultPrinter
{
    /**
     * Displays the result of a Boolean operation on two numbers to the console.
     *
     * @param value1   first value of expression.
     * @param operator operator as string.
     * @param value2   second value of expression.
     * @param result   previously calculated result
     */
    public static void printBinary(int value1, String operator, int value2, int result) {
        String convertedValue1 = Integer.toBinaryString(value1);
        String convertedValue2 = Integer.toBinaryString(value2);
        print(convertedValue1, operator, convertedValue2, Integer.toBinaryString(result)+"("+result+")");
    }

    /**
     * Displays the result of a Boolean operation on unary value to the console.
     *
     * @param value    value of expression.
     * @param operator operator as string.
     * @param result   previously calculated result
     */
    public static void printBinary(int value, String operator, int result) {
        String convertedValue = Integer.toBinaryString(value);
        print(convertedValue, operator, Integer.toBinaryString(result)+"("+result+")");
    }

    /**
     * Displays the result of math expression to the console.
     *
     * @param value1   first value of expression.
     * @param operator operator as string.
     * @param value2   second value of expression.
     * @param result   previously calculated result
     */
    public static void print(int value1, String operator, int value2, int result) {
        print(String.valueOf(value1), operator, String.valueOf(value2), String.valueOf(result));
    }
    /**
     * Displays the result of math expression to the console.
     *
     * @param value1   first value of expression.
     * @param operator operator as string.
     * @param value2   second value of expression.
     * @param result   previously calculated result
     */
    public static void print(Double value1, String operator, Double value2, Double result) {
        print(String.valueOf(value1), operator, String.valueOf(value2), String.valueOf(result));
    }

    /**
     * Displays the result of math expression on unary value to the console.
     *
     * @param value    value of expression.
     * @param operator operator as string.
     * @param result   previously calculated result
     */
    public static void print(int value, String operator, int result) {
        print(String.valueOf(value), operator, String.valueOf(result));
    }

    /**
     * Displays the result of math expression to the console.
     *
     * @param value1   first value of expression.
     * @param operator operator as string.
     * @param value2   second value of expression.
     * @param result   previously calculated result
     */
    public static void print(String value1, String operator, String value2, String result) {
        System.out.println(value1 + " " + operator + " " + value2 + " = " + result);
        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println("result = " + result);
    }

    /**
     * Displays the result of math expression on unary value to the console.
     *
     * @param value    value of expression.
     * @param operator operator as string.
     * @param result   previously calculated result
     */
    public static void print(String value, String operator, String result) {
        System.out.println(value + " " + operator + " " + value + " = " + result);
        System.out.println(" value = " + value);
        System.out.println("result = " + result);
    }


    private ResultPrinter() {
        // private constructor for avoid creating instance of this class.
    }
}
