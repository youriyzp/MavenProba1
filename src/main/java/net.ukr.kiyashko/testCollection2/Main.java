package net.ukr.kiyashko.testCollection2;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String argv[]) {
        List<String> list =new LinkedList<String>();
        //Random rnd = new Random(System.currentTimeMillis());
        for ( int i=0; i<10;i++){
            Random random = new Random();
            int num = random.nextInt(10);

            list.add("number_"+(num)+'\n');
        }
        System.out.println(list);
    }
}
