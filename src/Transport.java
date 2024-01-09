public abstract class Transport implements TransportService {
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
}
