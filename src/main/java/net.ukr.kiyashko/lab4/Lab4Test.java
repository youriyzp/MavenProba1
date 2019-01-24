package net.ukr.kiyashko.lab4;

//import com.sun.source.util.SourcePositions;

import javax.sql.rowset.spi.TransactionalWriter;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Lab4Test {

    public static void main(String[] args) {

        // PART 1
        // 1.1)
        //float[] firstArray;
        float[] firstArray = new float[4];
        firstArray[0] = 2.15f;

        //  init it's array by new with size 4.

        //  insert some value to start of array and to end of array.
        float[] secondArray = {3.15f, 2.20f, 3.25f, 4.45f};
        int[] intArray = new int[]{1, 3, 3, 4, 2}; //  init and fill it's array with any values. Use {} syntax.
        //int [] intArray=new intArray {1,2,3,4,5};
        // 1.2)
        int[] intArrayCopy = Arrays.copyOf(intArray, 6);

        //  copy "intArray". Use copyOf...

        // 1.3)
        //  sort "intArrayCopy", use Arrays sort.
        Arrays.sort(intArrayCopy);

        // 1.4)
        //  print "intArrayCopy", use Arrays toString.
        System.out.println( intArrayCopy.toString());
        // 1.5)
        //  compare "intArray"  and "intArrayCopy", use Arrays equals. Print "Arrays equals" or "Arrays not equals".
        //private static void equals(int[] intArray, int[] intArrayCopy) {
        //}
        if (Arrays.equals(intArray, intArrayCopy)) {
            System.out.println("Arrays equals");
        } else {
            System.out.println("Arrays not equals");
        }
        // PART 2
        int[] testArray = {1, 3, 5, 7, 8, 6, 4, 2, 0};

        // Print array values in cycle.
        for (int value : testArray) {
            System.out.print(value + " ");
        }
        System.out.println("");

        // 2.1)
        // TODO calc sum of all array elements and print result.
        int sum1 = 0;
        for (int value : testArray) {
            sum1 += value;
        }
        System.out.println(sum1);
        // 2.2)
        // TODO calc sum of all numbers with odd indexes and print result.
        int sum2 = 0;
        for (int value : testArray) {
            if (value%2!=0){
                sum2 += value;
            }
        }
        System.out.println(sum2);
        // 2.3)
        // TODO find max value in array.
        int max = 0;
        for (int value : testArray) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println(max);

        // PART 3

        //3.1
        // TODO create two-dimensional array with size [3][4]
        int[][] TwoArr = new int[3][4];
        //3.2
        // TODO fill array with any numbers in cycles.
        int [][] threeArr = {{3,2,3},{31,41,4},{12,3,4}};
        for ( int i=0;i<3; i++) {
            for (int j = 0; j < 3; j++){
                System.out.print(threeArr[i][j] +"\t");
        }
            System.out.println();
        }

        //3.3
        // TODO calc sum of all array elements and print result.


        // PART 4*

        long[][] matrix = new long[9][9];

        int ratio = 0;
        for (long[] row : matrix) {
            Arrays.fill(row, ++ratio);
        }

        int sum = 0;
        // TODO* calc sum only max and min values of matrix by expression: 2 < i <= 5 and only every third j value.
        System.out.println(sum);
    }


}
