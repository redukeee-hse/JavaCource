package interface_practice.test;

import interface_practice.individuals.Director;
import interface_practice.interfaces.Worker;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.force(new Worker() {
            @Override
            public void work() {
                System.out.println("is Working...");
            }
        });
    }
}
