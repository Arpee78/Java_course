package inheritancemethods.plane;

public class Plane {

    public static void main(String[] args) {

        Passenger passenger = new Passenger("John passenger",45_000);
        PriorityPassenger priorityPassenger = new PriorityPassenger("Jim priority passenger", 45_000,30);
        FirstClassPassenger firstClassPassenger = new FirstClassPassenger("Jane first class passenger", 45_000,30);

        System.out.println(passenger.getPriceOfPlaneTicket());
        System.out.println(priorityPassenger.getPriceOfPlaneTicket());
        System.out.println(firstClassPassenger.getPriceOfPlaneTicket());
    }
}
