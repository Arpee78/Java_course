package typeconversion;

public class Conversion {

    public double convertDoubleToDouble(double doubleNumber) {
        return (int) doubleNumber;
    }

    public byte[] convertIntArrayToByteArray(int[] intArray) {

        byte[] byteArray = new byte[intArray.length];

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < 0 || intArray[i] > 127) {
                byteArray[i] = -1;
            } else {
                byteArray[i] = (byte) intArray[i];
            }
        }
        return byteArray;
    }

    public int getFirstDecimal(double doubleNumber) {
        int intNumber = (int) doubleNumber;
        return (int) ((doubleNumber - intNumber) * 10);
    }

}
