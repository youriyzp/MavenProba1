package net.ukr.kiyashko.testthread1;

public class MyTimeBomb2 implements Runnable{
    private int seconds;
    public MyTimeBomb2(int seconds) {
        this.seconds = seconds;
    }

    public void run() {
        try {
            for (int i = 0; i < this.seconds; i++) {
                Thread.sleep(1000);
                System.out.println( seconds-i);
            }
            System.out.println("Boom!");
        } catch (Exception e) {
            System.out.println("У нас проблемы с потоком");
        }

    }

    public static void main(String[] args) {
        MyTimeBomb2 bomb1 = new MyTimeBomb2(10);
        Thread thread=new Thread(bomb1);
       thread.start();
//thread.interrupt();
        System.out.println("Asta la vista, baby!");
    }

}

