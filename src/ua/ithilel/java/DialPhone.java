package ua.ithilel.java;

public class DialPhone extends Phone implements Caller {

    private boolean hasAnswerphone;

    public DialPhone() {
    }

    public DialPhone(String name, int id, boolean hasAnswerphone) {
        super(name, id);
        this.hasAnswerphone = hasAnswerphone;
    }

    @Override
    void powerOn() {
        System.out.println("Connecting a landline phone to the network.");
    }

    @Override
    void powerOff() {
        System.out.println("Disconnecting the landline phone from the network.");
    }

    @Override
    void call() {
        System.out.println("Pick up the phone, dial a number, call.");
    }

    void AutoAnswer(boolean hasAnswerphone) {
        if (hasAnswerphone) {
            System.out.println("Press the answering machine button, listen to the messages of missed calls.");
        } else {
            System.out.println("This device does not support answering machine");
        }
    }

    public boolean isHasAnswerphone() {
        return hasAnswerphone;
    }

    public void setHasAnswerphone(boolean hasAnswerphone) {
        this.hasAnswerphone = hasAnswerphone;
    }

    @Override
    public void call(String contact) {

    }
}
