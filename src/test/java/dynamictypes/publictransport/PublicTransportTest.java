package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {

    @Test
    void testCreate() {
        PublicVehicle publicVehicle = new PublicVehicle(5, 10);
        PublicVehicle bus = new Bus(5, 10, "Mercedes");
        PublicVehicle tram = new Tram(5, 10, 4);
        PublicVehicle metro = new Metro(5, 10, 3);

        PublicTransport publicTransport = new PublicTransport();

        publicTransport.addVehicle(publicVehicle);
        publicTransport.addVehicle(bus);
        publicTransport.addVehicle(tram);
        publicTransport.addVehicle(metro);

        assertEquals(4, publicTransport.getPublicVehicleList().size());
    }
}