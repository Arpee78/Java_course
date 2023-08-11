package controliteration.exit;

import java.util.Scanner;

public class Exit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in;
        do {
            in = scanner.nextLine();
            System.out.println("Az ügyfélszolgálat menüje jelenleg nem elérhető. Kilépés: x billentyű és Enter megnyomásával");
        } while (!in.equals("x"));
    }
}
