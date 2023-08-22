package introexceptiontrycatchtrace;

public class Jackpot {

    // A Jackpot osztály main() metódusában írd ki a konzolra, hogy ki a mai nyertes!
    //
    //Gondold végig, hogy ebben a kódban melyik utasítás végrehajtásánál keletkezhet kivétel,
    // és kezeld is le azt a Jackpot osztályban!

    public static void main(String[] args) {
        Winner winner = new Winner();
        winner.addName("John Smith");
        winner.addName(null);
        winner.addName("Jack Brown");
        winner.addName("Eva Miller");

        String winnerName="";
        try {
           winnerName = winner.getWinner();

        } catch (NullPointerException npe){
            System.out.println("Valami nem oké: " + npe.getMessage());
            npe.printStackTrace();
        }

        System.out.println(winnerName);
    }
}
