package stringscanner;

import java.util.Scanner;

public class IntScanner {

    public String convertInts(String ints) {
        Scanner scanner = new Scanner(ints).useDelimiter(";");
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number > 100) {
                if (!sb.isEmpty()){
                    sb.append(",");
                }
                sb.append(number);
            }
        }
        return sb.toString();
    }
}
