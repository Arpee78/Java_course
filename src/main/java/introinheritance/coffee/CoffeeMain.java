package introinheritance.coffee;

public class CoffeeMain {

    public static void main(String[] args) {

        Coffee coffee = new Coffee();
        coffee.setName("Espresso");
        coffee.setPrice(150);
        System.out.println(coffee.getName());
        System.out.println(coffee.getPrice());

        System.out.println();

        Cappuccino cappuccino = new Cappuccino();
        cappuccino.setName("Kapucsínó");
        cappuccino.setPrice(250);
        System.out.println(cappuccino.getName());
        System.out.println(cappuccino.getPrice());


    }
}
