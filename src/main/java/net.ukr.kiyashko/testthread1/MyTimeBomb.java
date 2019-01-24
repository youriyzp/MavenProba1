package net.ukr.kiyashko.testthread1;

public class MyTimeBomb extends Thread{
    private int seconds;
    public MyTimeBomb(int seconds) {
        this.seconds = seconds;
    }

    public void run() {
        try {
            for (int i = 0; i < this.seconds; i++) {
                Thread.sleep(1000);
                System.out.println( seconds-i);
            }
            System.out.println("Boom!");
        } catch (InterruptedException e) {
            System.out.println("У нас проблемы с потоком");
        }

    }

    public static void main(String[] args) throws InterruptedException {
        MyTimeBomb bomb1 = new MyTimeBomb(10);
        bomb1.start();
bomb1.join();
        System.out.println("Asta la vista, baby!");
    }

}
