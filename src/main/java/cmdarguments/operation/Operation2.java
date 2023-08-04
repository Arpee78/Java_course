package cmdarguments.operation;

public class Operation2 {

    public static void main(String[] args) {

        for (String s: args) {

            if (s.equals("/List")){
                System.out.println("Listázás");
            } else if (s.equals("/Add")){
                System.out.println("Hozzáadás");
            } else if (s.equals("/Delete")) {
                System.out.println("Törlés");
            } else {
                System.out.println("Ismeretlen művelet");
            }

        }
    }
}
