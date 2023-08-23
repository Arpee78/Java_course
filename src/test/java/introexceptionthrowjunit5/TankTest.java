package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TankTest {

    Tank tank = new Tank();

    @Test
    void modifyAngle() {
        tank.modifyAngle(30);
        assertEquals(30, tank.getAngle());
        tank.modifyAngle(-60);
        assertEquals(-30, tank.getAngle());
    }

    @Test
    void modifyAngleFail() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> tank.modifyAngle(90));
        assertEquals("Angle must between -80 and +80!", iae.getMessage());
    }
}