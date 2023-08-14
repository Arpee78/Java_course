package stringscanner;

import java.util.Scanner;

public class StringScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Írj meg egy mondatot.");

        String src = scanner.nextLine();

        Scanner sentenceByWords = new Scanner(src);

        while (sentenceByWords.hasNext()){
            System.out.println(sentenceByWords.next());
        }


        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Írj még egy mondatot.");

        String src2 = scanner2.nextLine();

        Scanner sentenceByWords2 = new Scanner(src2);
        sentenceByWords2.useDelimiter(",");

        while (sentenceByWords2.hasNext()){
            System.out.println(sentenceByWords2.next());
        }


    }
}
