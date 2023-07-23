public class Radio implements ElectricityConsumer{

    public void playMusic(){

        System.out.println("Radio just start to playing (Radio class)");
    }

    @Override
    public void electricityOn() {
        System.out.println("Electricity are coming from interface (Radio class)");
        playMusic();
        System.out.println("Interface call playMusic method in Radio object (Radio class)");
    }
}
