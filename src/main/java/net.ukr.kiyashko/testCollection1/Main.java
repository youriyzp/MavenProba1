package net.ukr.kiyashko.testCollection1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String argv[]) {
        List<String> list = new ArrayList<String>();
        int a=0;
        while ( a<10){

            list.add("number_"+(a++)+'\n');
        }
        System.out.println(list);
    }
}
