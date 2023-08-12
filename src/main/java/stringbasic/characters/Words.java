package stringbasic.characters;

import java.util.Scanner;

public class Words {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Add meg a szót: ");
        String wordToSpell = scanner.nextLine();

        System.out.println("A lebetűzendő szó:  --> " + wordToSpell + " <--  Kilépni a - billentyűvel tudsz.");

        String currentChar = "";
        String wordFromChild = "";

        while (!currentChar.equals("-")) {
            wordFromChild = wordFromChild + currentChar;
            currentChar = scanner.nextLine();
        }

        System.out.println(wordFromChild);
        System.out.println(wordFromChild.equals(wordToSpell) ? "Remek, a megoldásod helyes!" : "Ezt sajnos még gyakorolni kell.");

    }
}
