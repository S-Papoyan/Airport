import model.Plane;
import service.PlaneService;

public class AirportTest {
    public static void main(String[] args) {

        PlaneService service = new PlaneService();
        Plane p1 = service.create();
        Plane p2 = service.create();
        Plane p3 = service.create();
        Plane[] planes = {p1, p2, p3};
        service.task1(p1);
        service.task2(p1);
        service.task3(p1, p2);
        service.task4(p1, p2);
        service.task5(p1, p2, p3);
        service.task6(planes);
        service.task7(planes);
        service.task8(planes);
        service.task9(planes);
        service.task10(planes);
    }
}
