package cmdarguments.operation;

public class Operation {

    public static void main(String[] args) {

        for (String s: args) {

            if (s.equals("/List")){
                System.out.println("Listázás");
            }

            if (s.equals("/Add")){
                System.out.println("Hozzáadás");
            }

            if (s.equals("/Delete")){
                System.out.println("Törlés");
            }

            if (!s.equals("/List") && !s.equals("/Add") && !s.equals("/Delete")){
                System.out.println("Ismeretlen művelet");
            }

        }
    }
}
