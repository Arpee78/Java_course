package conventions;

public class CarMain {

    public static void main(String[] args) {

        Car car = new Car("Opel","diesel",4,5);

        System.out.println(car.getCarType());

        car.addModelName("Corsa");

        System.out.println(car.getCarType());
    }
}
