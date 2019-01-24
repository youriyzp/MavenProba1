package net.ukr.kiyashko.labor9.reader;

import net.ukr.kiyashko.labor9.api.Reader;

public class Site implements Reader {
    String data1="new URL";

    @Override
    public void read(String data1) {
        System.out.println(data1);

    }
}
