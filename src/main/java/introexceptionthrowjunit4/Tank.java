package introexceptionthrowjunit4;

public class Tank {

    private int angle;

    public int getAngle() {
        return angle;
    }

    public void modifyAngle(int angleNumber) {
        int newAngle = angle + angleNumber;
        if (newAngle > 80 || newAngle < -80) {
            throw new IllegalArgumentException("Angle must between -80 and +80!");
        }
        angle = newAngle;
    }

}
