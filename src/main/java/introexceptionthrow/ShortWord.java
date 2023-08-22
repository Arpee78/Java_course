package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérlek, adj meg legfeljebb 5 betűs szót, csak betű(A-Z, a-z) legyen benn. ");
        String word = scanner.nextLine();

        if (word.length()>5){
            throw new IllegalArgumentException("A szó hosszabb 5 betűnél: " + word);
        }

        char[] wordArray = word.toCharArray();
        for (char c: wordArray) {
            if (!Character.isLetter(c)){
                throw new IllegalArgumentException("A szó nem csak betűt tartalmaz: " + word);
            }
        }

        System.out.println(word);

    }


}
