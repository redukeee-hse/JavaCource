package interface_practice.individuals;

import interface_practice.interfaces.Driver;
import interface_practice.interfaces.Worker;

public class Chief extends Individual implements Worker, Driver {
    @Override
    public void work() {
        System.out.println("Chief is working");
    }
    @Override
    public void drive() {
        System.out.println("Chief is driving");
    }
}
