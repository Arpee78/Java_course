package exam_sv2_part2_sup.filemanipulation;

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

    public void readProductsFromFile(Path path) {
        try {
            processLines(Files.readAllLines(path));
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!", e);
        }
    }

    private void processLines(List<String> lines) {
        for (String s : lines) {
            String[] parts = s.split(";");
            products.add(new Product(parts[0], parts[1], Integer.parseInt(parts[2])));
        }
    }

    public void writePriceOverToFile(Path path, int price) {
        try {
            Files.write(path, createStringListOverPrice(price));
        } catch (IOException e) {
            throw new IllegalStateException("Cannot write file!", e);
        }
    }

    private List<String> createStringListOverPrice(int price) {
        List<String> result = new ArrayList<>();
        for (Product p : products) {
            if (p.getPrice() > price) {
                result.add(p.getId() + ";" + p.getName() + ";" + p.getPrice());
            }
        }
        return result;
    }


}
