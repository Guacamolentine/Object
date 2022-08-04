package ua.ithilel.java;

public abstract class CookerDevice extends AbstractDevice {

    public CookerDevice() {
    }

    public CookerDevice(String name, int id) {
        super(name, id);
    }

    abstract void cook();

    @Override
    void powerOn() {
        System.out.println("We plug the power plug into the socket, the oven turns on.");
    }

    @Override
    void powerOff() {
        System.out.println("We remove the power plug from the socket, the oven turns off.");
    }
}
