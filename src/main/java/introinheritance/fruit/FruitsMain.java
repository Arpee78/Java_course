package introinheritance.fruit;

public class FruitsMain {

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Grape grape = new Grape();
        Apple apple = new Apple();
        GoldenDelicious goldenDelicious = new GoldenDelicious();
        Starking starking = new Starking();

        fruit.setName("Banán");
        fruit.setWeight(500);
        System.out.println(fruit.getName() + " " + fruit.getWeight());

        grape.setName("Izabella");
        grape.setWeight(600);
        grape.setType("csemege");
        System.out.println(grape.getName() + " " + grape.getWeight() + " " + grape.getType());

        apple.setName("Steve");
        apple.setWeight(400);
        apple.setPieces(10);
        System.out.println(apple.getName() + " " + apple.getWeight() + " " + apple.getPieces());

        goldenDelicious.setName("Steve");
        goldenDelicious.setWeight(400);
        goldenDelicious.setPieces(10);
        System.out.println(goldenDelicious.getName() +
                " " + goldenDelicious.getWeight() +
                " " + goldenDelicious.getPieces() +
                " " + goldenDelicious.getColour()
        );

        starking.setName("Jobs");
        starking.setWeight(350);
        starking.setPieces(12);
        System.out.println(starking.getName() +
                " " + starking.getWeight() +
                " " + starking.getPieces() +
                " " + starking.getColour()
        );
    }
}
