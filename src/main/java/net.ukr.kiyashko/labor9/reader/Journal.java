package net.ukr.kiyashko.labor9.reader;

import net.ukr.kiyashko.labor9.api.Reader;

public class Journal implements Reader {
    String data1 = "New journal";

    @Override
    public void read(String data1) {
        System.out.println(data1);
    }
}