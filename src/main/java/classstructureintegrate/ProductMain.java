package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a termék nevét:");
        String productName = scanner.nextLine();

        System.out.println("Add meg a termék árát:");
        int productPrice = scanner.nextInt();

        Product product = new Product(productName, productPrice);
        System.out.println("Terméknév: " + product.getName() + "   Ára: " + product.getPrice());

        product.increasePrice(100);
        System.out.println("Terméknév: " + product.getName() + "   Ára: " + product.getPrice());

        product.increasePrice(500);
        System.out.println("Terméknév: " + product.getName() + "   Ára: " + product.getPrice());


    }
}
