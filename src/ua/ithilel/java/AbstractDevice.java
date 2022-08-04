package ua.ithilel.java;

public abstract class AbstractDevice {
    private String name;
    private int id;

    public AbstractDevice() {
        powerOn();
    }

    public AbstractDevice(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void powerOn();

    abstract void powerOff();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}