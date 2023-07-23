public class Lamp implements ElectricityConsumer{
    public void lightOn(){
        System.out.println("The Lamp is On (Lamp class)");
    }

    @Override
    public void electricityOn() {
        System.out.println("Electricity are coming from interface (Lamp class)");
        lightOn();
        System.out.println("Interface call lightOn method in Lamp object (Lamp class)");
    }
}
