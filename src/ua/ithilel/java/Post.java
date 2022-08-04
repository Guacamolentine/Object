package ua.ithilel.java;

public class Post implements MailSender {
    @Override
    public String createMail(String msg) {
        System.out.println("Текст сообщения: " + msg);
        return msg;
    }

    @Override
    public void sendMail(String address) {
        System.out.println("Message sent to: " + address);
    }
}