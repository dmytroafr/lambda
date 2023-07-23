// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Creating new Switcher");
        Switcher switcher = new Switcher();
        System.out.println("Creation new Lamp");
        Lamp lamp = new Lamp();
        System.out.println("Creation new Radio");
        Radio radio = new Radio();
        System.out.println("Creation new Radio2");
        Radio radio2 = new Radio();

        System.out.println("add lamp to switcher collection consumers");
        switcher.addElectricityConsumer(lamp);
        System.out.println("add radio to switcher collection consumers");
        switcher.addElectricityConsumer(radio);

        switcher.addElectricityConsumer( () -> System.out.println("Fire Fire Fire"));
        switcher.addElectricityConsumer(radio2::electricityOn);




        System.out.println("We turning on the Switcher from Main class");
        switcher.switchOn();




    }
}