import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Switcher {

    private List<ElectricityConsumer> consumersList = new ArrayList<>();
    public void addElectricityConsumer (ElectricityConsumer consumer){
        consumersList.add(consumer);
    }
    public void removeElectricityConsumer (ElectricityConsumer consumer){
        consumersList.remove(consumer);
    }


    public void switchOn(){
        System.out.println("Switcher is On (Switcher class)");

        for (ElectricityConsumer c : consumersList){
            System.out.println("We are sending electro-stream to next consumer (Switcher class)");
            c.electricityOn();

        }

        /*   if (consumer==null){
            System.out.println("None consumers detected");
        }
        else {
            consumer.electricityOn();
            System.out.println("We are sending electro-stream to some consumer");
        }*/
    }
}
