package weeks.week14;

public class TestVehicle {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(true, 5, 1500, "Black", "35 BHLL 3535", "Ferrari");
        System.out.println(car1);
        System.out.println("--------------------------");
        System.out.println(car2);
        car2.goes();
    }
}
