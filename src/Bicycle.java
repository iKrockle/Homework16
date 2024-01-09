public class Bicycle extends Transport{
    Bicycle(String inModelName, int inWheelsCount) {
        super(inModelName, inWheelsCount);
    }

    public void service() {
        for (int i = 0; i < this.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
    }
}
