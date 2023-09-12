package interfacedefaultmethods.seats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatTest {

    @Test
    void testFamilyCar(){
        FamilyCar familyCar = new FamilyCar();
        int seats = familyCar.getNumberOfSeats();
        assertEquals(5 ,seats);
    }

    @Test
    void testSportsCar(){
        SportsCar sportsCar = new SportsCar();
        int seats = sportsCar.getNumberOfSeats();
        assertEquals(2 ,seats);
    }

    @Test
    void testCar(){
        Car car = new Car("Fiat", 4);
        int seats = car.getNumberOfSeats();
        assertEquals(4 ,seats);
    }

}