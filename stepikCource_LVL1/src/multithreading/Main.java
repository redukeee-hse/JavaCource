package multithreading;

import java.util.Random;

public class Main {
    static boolean isFound = false;

    public static void main(String[] args) {
        int myNumber = 18701;
        Random random = new Random();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int num = -1;
                int leftBoundary = 0, rightBoundary = 1000000000;
                while (true) {
                    num = random.nextInt(leftBoundary, rightBoundary);
                    if (num == myNumber) {
                        System.out.println(String.format("Your number is %d!", num));
                        isFound = true;
                        break;
                    }
                }
            }
        });

        thread.start();
        
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int seconds = 0;
                while (isFound == false) {
                    seconds++;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println(String.format("Seconds needed: %d", seconds));
            }
        });
        thread2.start();
    }
}
