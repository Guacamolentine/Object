package ua.ithilel.java;

public class Oven extends CookerDevice {

    public Oven() {
    }

    public Oven(String name, int id) {
        super(name, id);
    }

    void initTimer(int time) {
        System.out.println("Set the timer to" + time + " minute.");
    }

    @Override
    void cook() {
        System.out.println("We place the products in the cooking container. Cooking in progress");
    }
}