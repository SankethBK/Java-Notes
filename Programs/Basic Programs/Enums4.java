enum TrafficSignal {

    RED("STOP"), AMBER("GO SLOW"), GREEN("GO");

    private String action;

    public String getAction(){
        return this.action;
    }

    private TrafficSignal(String action){
        this.action = action;
    }
}
public class Enums4 {
    
    public static void main(String[] args){
        TrafficSignal signals[] = TrafficSignal.values();

        for (TrafficSignal signal : signals){
            System.out.println("name: " + signal.name() + " action: " + signal.getAction());
        }
    }
}