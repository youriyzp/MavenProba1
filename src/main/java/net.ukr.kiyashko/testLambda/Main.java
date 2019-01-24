package net.ukr.kiyashko.testLambda;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {

        Integer[] arrays = new Integer[8];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = Double.valueOf(Math.random()*100).intValue();
            System.out.println(arrays[i]);
        }
        Arrays.sort(arrays, (o1, o2) -> o2.compareTo(o1));
        System.out.println(Arrays.toString(arrays));
        String [] strings= {"vas","is","das","yo"};
        System.out.println(Arrays.toString(strings));
        Stream<String> streamFromStrigs = Arrays.stream(strings);
        streamFromStrigs.sorted();
        Arrays.stream(strings).sorted();
        System.out.println(Arrays.toString(strings));
        Arrays.sort(strings, Comparator.reverseOrder());
        System.out.println(Arrays.toString(strings));
       //Collection.stream().sorted().collect(Collectors.toList())


    }

}
