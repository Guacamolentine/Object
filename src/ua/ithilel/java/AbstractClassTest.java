package ua.ithilel.java;

public class AbstractClassTest {

    public static void main(String[] args) {

        Mobile mobilePhone = new Mobile();
        mobilePhone.setName("Xiaomi Note 8 pro");
        mobilePhone.setId(96334992);
        mobilePhone.setDisplay(4.4);
        mobilePhone.setSimCount(3);
        mobilePhone.call();

        System.out.println("----------");

        DialPhone simplePhone = new DialPhone();
        simplePhone.setName("Bosch");
        simplePhone.setId(13434325);
        simplePhone.call();
        simplePhone.AutoAnswer(true);

        System.out.println("--------");

        SmartPhone iPhone = new SmartPhone();
        iPhone.setName("iPhone 11 PRO MAX");
        iPhone.setId(384420984);
        iPhone.setDisplay(6.6);
        iPhone.setSimCount(2);
        iPhone.call();

        System.out.println("-----------");

        Multicooker device1 = new Multicooker();
        device1.setName("Gorenje");
        device1.setId(12233234);
        device1.switchProgram(4);
        device1.cook();

        System.out.println("------------");

        Oven device2 = new Oven();
        device2.setName("Gorenje Fridge");
        device2.setId(843323);
        device2.initTimer(200);
        device2.cook();

        System.out.println("--------------");

        getDevices(mobilePhone, simplePhone, iPhone, device1, device2);
    }

    public static void getDevices(AbstractDevice... values) {
        for (AbstractDevice value : values) {
            value.powerOff();
        }
    }
}