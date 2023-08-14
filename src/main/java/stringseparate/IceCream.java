package stringseparate;

import java.util.Arrays;
import java.util.List;

public class IceCream {

    public static void main(String[] args) {
        List<String> iceCreams = Arrays.asList("csoki", "vanília", "eper", "citrom", "puncs");
        String init = "Ma kapható: ";
        StringBuilder sb = new StringBuilder(init);

        boolean first = true;
        for (String actual : iceCreams) {
            if (first) {
                first = false;
            } else {
                sb.append(", ");
            }
            sb.append(actual);
        }

        sb.append(". Gyerekeknek féláron!");

        System.out.println(sb);
    }
}
