package ua.ithilel.java;

public abstract class Phone extends AbstractDevice {

    public Phone() {
    }

    public Phone(String name, int id) {
        super(name, id);
    }

    abstract void call();

}