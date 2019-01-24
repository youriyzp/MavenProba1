package net.ukr.kiyashko.rally;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Race {
    public static void main(String[] args){
        List<RaceCarRunnable> cars= new ArrayList<RaceCarRunnable>();
        cars.add(new RaceCarRunnable("Renaut", 180,20));
        cars.add(new RaceCarRunnable("Pegaut",170,20));
        cars.add(new RaceCarRunnable("Porshe",300,20));
        List<Thread> threads = new ArrayList<>();
        Thread thread=new Thread();



    }
}
