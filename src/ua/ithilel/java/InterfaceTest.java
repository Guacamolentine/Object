package ua.ithilel.java;

public class InterfaceTest {
    public static void main(String[] args) {

        DialPhone simplePhone1 = new DialPhone();
        simplePhone1.setName("Gorenje");
        simplePhone1.setId(134335832);
        simplePhone1.call("Ann: +38044325...");
        simplePhone1.AutoAnswer(true);


        SmartPhone iPhone = new SmartPhone();
        iPhone.setName("Iphone 12 pro max");
        iPhone.setId(7851982);
        iPhone.setDisplay(6.0);
        iPhone.setSimCount(1);
        iPhone.call("Mike: +38034340...");
        iPhone.createMail("Hello...");
        iPhone.editMail("qwe@gmail.com");

        System.out.println("-------------");

        Post object1 = new Post();
        object1.createMail("Hello. What are you doing?");

        System.out.println("--------------");

        msgSender(iPhone, object1);


    }

    public static void msgSender(MailSender... values) {
        for (MailSender value : values) {
            value.sendMail("yoda24@gmail.com");
        }
    }
}