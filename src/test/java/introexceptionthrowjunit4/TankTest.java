package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class TankTest {

    @Test
    public void modifyAngle() {
        Tank tank = new Tank();
        tank.modifyAngle(60);
    }

    @Test(expected = IllegalArgumentException.class)
    public void modifyAngleFail1() {
        Tank tank = new Tank();
        tank.modifyAngle(90);
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test()
    public void modifyAngleFail2() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Angle must between -80 and +80!");
        Tank tank = new Tank();
        tank.modifyAngle(90);
    }

    @Test()
    public void modifyAngleFail3() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> new Tank().modifyAngle(90));
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Angle must between -80 and +80!");
        Tank tank = new Tank();
        tank.modifyAngle(90);
    }
}