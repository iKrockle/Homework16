public class Truck extends Car{
    Truck(String inModelName, int inWheelsCount) {
        super(inModelName, inWheelsCount);
    }

    public void service() {
        super.service();
        System.out.println("Проверяем прицеп");
    }
}