package interface_practice.individuals;

import interface_practice.interfaces.Worker;

public class Director extends Individual {
    public void force(Worker worker) {
        worker.work();
    }
}
