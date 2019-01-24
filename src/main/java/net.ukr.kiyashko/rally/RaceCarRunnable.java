package net.ukr.kiyashko.rally;

import java.util.concurrent.ThreadLocalRandom;

public class RaceCarRunnable extends Car implements Runnable {
    int passed;
    int distance;
    boolean isFinish;

    public RaceCarRunnable(String name, int maxSpeed, int distance) {
        super(name, maxSpeed);
        this.distance = distance;
    }

    int getRandomSpeed() {
        // min: maxSpeed/2, max: maxSpeed
        int min = getMaxSpeed() / 2;
        int max = getMaxSpeed();
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        return randomNum;
    }


    @Override
    public void run() {
        try {
            while (!isFinish) {
                Thread.sleep(1000);

            }
            int currentSpeed = getRandomSpeed();
            passed = currentSpeed * 1000 / (60 * 60);

            System.out.println("carName => speed: " + currentSpeed + "; progress: " + passed + "/" + distance);
            if (passed >= distance) {
                isFinish = true;


            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}



