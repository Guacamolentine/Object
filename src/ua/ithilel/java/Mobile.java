package ua.ithilel.java;

public class Mobile extends Phone {

    private int simCount;
    private double display;

    public Mobile() {
    }

    public Mobile(String name, int id, int simCount, double display) {
        super(name, id);
        this.simCount = simCount;
        this.display = display;
    }

    @Override
    void powerOn() {
        System.out.println("We press the power button. Mobile phone starts");
    }

    @Override
    void powerOff() {
        System.out.println("We press the power button. Mobile phone turns off");
    }

    @Override
    void call() {
        System.out.println("Select a contact from the contact list, call");
    }

    public int getSimCount() {
        return simCount;
    }

    public void setSimCount(int simCount) {
        this.simCount = simCount;
    }

    public double getDisplay() {
        return display;
    }

    public void setDisplay(double display) {
        this.display = display;
    }
}
