package exam_sv3_part2_supsup.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ProductFileManager {

    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public void readFromFile(Path path) {
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                products.add(makeProduct(line));
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot read file!", e);
        }
    }

    private Product makeProduct(String line) {
        String[] parts = line.split(";");
        try {
            String id = parts[0];
            int price = Integer.parseInt(parts[1]);
            if (parts.length > 2) {
                int soldCount = Integer.parseInt(parts[2]);
                return new Product(id, price, soldCount);
            } else {
                return new Product(id, price);
            }

        } catch (NumberFormatException e) {
            throw new IllegalStateException(e);
        }
    }

    public Product findProductWithMaxProfit() {
        if (products.isEmpty()){
            throw new IllegalStateException();
        }
        Product max = products.get(0);
        for (Product p : products) {
            if (max.getProfit() < p.getProfit()) {
                max = p;
            }
        }
        return max;
    }
}
