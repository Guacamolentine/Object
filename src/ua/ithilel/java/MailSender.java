package ua.ithilel.java;

public interface MailSender {

    String createMail(String msg);

    void sendMail(String address);
}
