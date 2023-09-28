package exceptionmulticatch.converter;

import java.sql.Array;
import java.util.Arrays;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String string) {
        if (string == null) {
            throw new NullPointerException("Binary string is null.");
        }

        boolean[] result = new boolean[string.length()];
        String[] chars = string.split("");
        for (int i = 0; i < string.length(); i++) {
            validateCharValue(chars[i]);
            result[i] = chars[i].equals("1") ? true : false;
        }
        return result;
    }

    private void validateCharValue(String c) {
        if (!(c.equals("0") || c.equals("1"))) {
            throw new IllegalArgumentException("Binary string is not valid.");
        }
    }

    public String booleanArrayToBinaryString(boolean[] array) {
        if (array == null) {
            throw new NullPointerException("Boolean array is empty.");
        }
        StringBuilder sb = new StringBuilder(array.length);
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i] ? "1" : "0");
        }
        return sb.toString();
    }
}
