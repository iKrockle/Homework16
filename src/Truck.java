public class Truck extends Transport{
    Truck(String inModelName, int inWheelsCount) {
        super(inModelName, inWheelsCount);
    }

    public void service() {
        super.service();
        System.out.println("Проверяем двигатель");
        System.out.println("Проверяем прицеп");
    }
}