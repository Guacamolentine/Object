package ua.ithilel.java;

public class SmartPhone extends Mobile implements Caller, EmailSender {

    private String os;

    public SmartPhone() {
    }

    public SmartPhone(String name, int id, int simCount, double display, String os) {
        super(name, id, simCount, display);
        this.os = os;
    }

    void runApp() {
        System.out.println("Select the required application, click on the application icon. Application starts");
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public void call(String contact) {
        System.out.println("A contact is being called: " + contact);
    }

    @Override
    public String editMail(String eMail) {
        System.out.println("Entered email: " + eMail);
        return eMail;
    }

    @Override
    public String createMail(String msg) {
        System.out.println("Message text: " + msg);
        return msg;
    }

    @Override
    public void sendMail(String address) {
        System.out.println("Message sent to address: " + address);
    }

}