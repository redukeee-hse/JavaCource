package interface_practice.individuals;

import interface_practice.interfaces.Driver;
import interface_practice.interfaces.Worker;

public class Developer extends Individual implements Worker, Driver {
    @Override
    public void work() {
        System.out.println("Developer is working");
    }
    @Override
    public void drive() {
        System.out.println("Developer is driving");
    }
}
