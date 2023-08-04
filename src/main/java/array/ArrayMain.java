package array;

public class ArrayMain {

    public static void main(String[] args) {

        String[] week = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};
        System.out.println("week[1]: " + week[1]);
        System.out.println("week.length: " + week.length);

        int[] fiveElement = new int[5];
        fiveElement[0] = 1;
        for (int i = 1; i < fiveElement.length; i++) {
            fiveElement[i] = fiveElement[i - 1] * 2;
        }
        for (int i : fiveElement) {
            System.out.print(i + " ");
        }

        System.out.println();

        boolean[] trueOrFalse = new boolean[6];
        for (int i = 1; i < trueOrFalse.length; i++) {
            trueOrFalse[i] = !trueOrFalse[i - 1];
        }
        for (boolean i : trueOrFalse) {
            System.out.print(i + " ");
        }

    }
}
