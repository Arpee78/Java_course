package enumtype.position;

public class PositionMain {

    public static void main(String[] args) {

        for (Position p : Position.values()) {
            System.out.println(p + " Fizetés: " + p.getSalary() + "  Egyéb: " + p.getBenefit());
        }

    }
}
