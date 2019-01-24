package net.ukr.kiyashko.lab2;

/**
 * Base class for test busyness logic of app.
 */
public class Main {

    public static void main(String[] args) {

        int a = 4;
        int b = 4;

        System.out.println("Create instance of IntegralCalculator");
        IntegralCalculator calculator = new IntegralCalculator();

        System.out.println("Create instance of BooleanCalculator");
        BooleanCalculator booleanCalculator = new BooleanCalculator();

        System.out.println("Create instance of DoubleCalculator");
        DoubleCalculator doubleCalculator = new DoubleCalculator();


        System.out.println("\nTry calc int sum:");
        int sum = calculator.sum(a, b);
        ResultPrinter.print(a, "+", b, sum);
        System.out.println('\n');

        System.out.println("\nTry calc int sub:");
        int sub = calculator.sub(a, b);
        ResultPrinter.print(a, "-", b, sub);
        System.out.println('\n');


        System.out.println("Try calc int multiply:");
        int multiply = calculator.mul(a, b);
        ResultPrinter.print(a, "*", b, multiply);
        System.out.println('\n');


        System.out.println("\nTry calc int div:");
        if (b == 0) {
            // ResultPrinter.print(and);
            // System.out.println('\n');
            System.out.println("Error ");
            System.out.println('\n');
        }
        int div = calculator.div(a, b);
        ResultPrinter.print(a, "/", b, div);
        System.out.println('\n');

        a = 32;
        b = 2;
        System.out.println("Try calc boolean <<:");
        ResultPrinter.printBinary(a, "<<", b, booleanCalculator.shiftLeft(a, b));
        booleanCalculator.shiftRight(2, 4);
        System.out.println('\n');


        b = 8;
        System.out.println("Try calc boolean >>:");
        ResultPrinter.printBinary(a, ">>", b, booleanCalculator.shiftRight(a, b));
        System.out.println('\n');

        b = 8;
        System.out.println("Try calc boolean XOR:");
        ResultPrinter.printBinary(a, "^", b, booleanCalculator.xor(a, b));
        System.out.println('\n');

        b = 8;
        System.out.println("Try calc boolean inverse:");
        ResultPrinter.printBinary(a, "inverse", b, booleanCalculator.inverse(a));
        System.out.println('\n');

        b = 8;
        System.out.println("Try calc boolean unsignedShift:");
        ResultPrinter.printBinary(a, "unsignedShift", b, booleanCalculator.unsignedShift(a, b));
        System.out.println('\n');


        Double c = 4.0;
        Double d = 4.0;

        DoubleCalculator doubleCalculator1 = new DoubleCalculator();

        System.out.println("\nTry calc double sum:");
        Double sum1 = doubleCalculator1.sum(c, d);
        ResultPrinter.print(c, "+", d, sum1);
        System.out.println('\n');

        System.out.println("\nTry calc double sub:");
        Double sub1 = doubleCalculator.sub(c, d);
        ResultPrinter.print(c, "-", d, sub1);
        System.out.println('\n');


        System.out.println("Try calc double multiply:");
        Double multiply1 = doubleCalculator.mul(c, d);
        ResultPrinter.print(c, "*", d, multiply1);
        System.out.println('\n');


        System.out.println("\nTry calc double div:");

        Double div1 = doubleCalculator.div(c, d);
        if (d == 0) {
            // ResultPrinter.print(and);
            // System.out.println('\n');
            System.out.println("Error ");
            ResultPrinter.print(c, "/", d, div1);
            System.out.println('\n');
        }
    }
}