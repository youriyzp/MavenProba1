package net.ukr.kiyashko.lab3;

import static net.ukr.kiyashko.lab3.MathSequences.*;

public class Lab3Test {

    public static void main(String[] args) {
        // Part 1
        System.out.println("Sum of values: " + sum(3,3,5,10));
        System.out.println("Multiply of values: " +  mul(1,1,5,10));

        // Part 2
        System.out.print("Print with skipping: ");
        printWithSkip(1,1,5,10,1,2,1,5,1,8,8);
        System.out.println();
        System.out.print("Print with interrupt: ");
        printToValue(15,1,5,10,1,2,1,15,1,8,8);
        System.out.println();

        // Part 3
        System.out.println("circle has " + defineFigureTops("cIrcLE") + " tops");
        // TODO call for rectangle or other.

        // Part 4 (by variant)
        // TODO create calc one of math sequences.
        System.out.println("Factorial of value: " + factorial(3));
        System.out.println("Harmonic progression: " + harmonicProgression(2, 4, 2));
        System.out.println("Arithmetic progression: " + arithmeticProgression(2, 4, 3));


    }
}
