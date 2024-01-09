public class Transport implements TransportService {
    private final String modelName;
    private final int wheelsCount;

    Transport(String inModelName,int inWheelsCount){
        modelName = inModelName;
        wheelsCount = inWheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void service(){
        for (int i = 0; i < this.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
    }
}
