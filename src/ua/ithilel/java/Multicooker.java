package ua.ithilel.java;

public class Multicooker extends CookerDevice {

    public Multicooker() {
    }

    public Multicooker(String name, int id) {
        super(name, id);
    }

    void switchProgram(int num) {
        System.out.println("Select the cooking program under the number: " + num);
    }

    @Override
    void cook() {
        System.out.println("We place the products in the cooking container. We press start. Cooking in progress");
    }
}
