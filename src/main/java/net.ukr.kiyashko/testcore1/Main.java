package net.ukr.kiyashko.testcore1;

import java.math.BigInteger;
import java.util.concurrent.ThreadLocalRandom;

import static java.math.BigInteger.*;


public class Main {


    public static void main(String[] args) {
        int n = 0;
        n = ThreadLocalRandom.current().nextInt(10, 50);
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            result = result.multiply(valueOf(i));
        }
        System.out.println("Факториал числа " + n + "! = " + result);
    }
}
