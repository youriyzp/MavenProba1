package net.ukr.kiyashko.labor9.reader;

import net.ukr.kiyashko.labor9.api.Reader;

public class Book implements Reader {
    String data1 = "First book";


    @Override
    public void read (String data1){
        System.out.println(this.data1+" "+ data1);

    }



}
