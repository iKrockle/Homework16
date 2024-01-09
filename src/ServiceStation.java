public class ServiceStation {
    public void check(TransportService transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        transport.service();
    }
}