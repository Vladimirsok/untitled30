package skypro;

public class Main {

    public static void main(String[] args) {
	Car car = new Car("car1");
    Car car2 = new Car("car2");

    Bicycle bicycle = new Bicycle("bicycle1");
    Bicycle bicycle2 = new Bicycle("bicycle2");

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Transport2[] vehicles = {car, car2, truck, truck2, bicycle, bicycle2};

        ServiceStation station = new ServiceStation();
        for (Transport2 vehicle: vehicles){
            station.check(vehicle);
        }




    }
}
