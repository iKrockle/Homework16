public class Car extends Transport{

    Car(String inModelName, int inWheelsCount) {
        super(inModelName, inWheelsCount);
    }

    public void service() {
        super.service();
        System.out.println("Проверяем двигатель");
    }
}