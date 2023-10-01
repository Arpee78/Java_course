package catalog;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Catalog {

    private List<CatalogItem> catalogItems = new ArrayList<>();

    public List<CatalogItem> getCatalogItems() {
        return new ArrayList<>(catalogItems);
    }

    public void addItem(CatalogItem catalogItem) {
        if (catalogItem == null) {
            throw new IllegalArgumentException("Catalog item is empty");
        }
        catalogItems.add(catalogItem);
    }

    public void deleteItemByRegistrationNumber(String registrationNumber) {
        if (Validators.isBlank(registrationNumber)) {
            throw new IllegalArgumentException("Empty registration number");
        }
        CatalogItem itemToRemove = null;
        for (CatalogItem c : catalogItems) {
            if (c.getRegistrationNumber().equals(registrationNumber)) {
                itemToRemove = c;
            }
        }
        if (itemToRemove != null) {
            catalogItems.remove(itemToRemove);
        }
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem c : catalogItems) {
            if (c.hasAudioFeature()) {
                result.add(c);
            }
        }
        return result;
    }
    // Az audio típusú könyvtári elemet (is) tartalmazó katalóguselemeket lehet lekérdezni.

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem c : catalogItems) {
            if (c.hasPrintedFeature()) {
                result.add(c);
            }
        }
        return result;
    }
    // A nyomtatott könyvtári elemet (is) tartalmazó katalóguselemeket lehet lekérdezni.

    public int getAllPageNumber() {
        int sum = 0;
        for (CatalogItem c : catalogItems) {
            if (c.hasPrintedFeature()) {
                sum += c.getNumberOfPagesAtOneItem();
            }
        }
        return sum;
    }
    // Visszaadja a nyomtatott könyvtári elemek összoldalszámát.

    public double getAveragePageNumberMoreThan(int pageNumber) {
        if (pageNumber < 1) {
            throw new IllegalArgumentException("Page number must be positive");
        }
        int sum = 0;
        int count = 0;
        for (CatalogItem c : catalogItems) {
            if (c.hasPrintedFeature() && c.getNumberOfPagesAtOneItem() > pageNumber) {
                sum += c.getNumberOfPagesAtOneItem();
                count++;
            }
        }
        if (count == 0) {
            throw new IllegalArgumentException("No such book");
        }
        return 1.0 * sum / count;
    }
    // Visszaadja az átlag oldalszámot egy paraméterként átadott oldalszám felett.

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
        if (searchCriteria == null) {
            throw new IllegalArgumentException("Empty criteria");
        }
        List<CatalogItem> result = new ArrayList<>();
        for (CatalogItem c : catalogItems) {
            boolean found = false;
            if (searchCriteria.hasTitle()
                    && c.getTitles().contains(searchCriteria.getTitle())) {
                found = true;
            }
            if (searchCriteria.hasContributor()
                    && c.getContributors().contains(searchCriteria.getContributor())) {
                found = true;
            }
            if (found) {
                result.add(c);
            }
        }
        return result;
    }
    // Keresni lehet egy SearchCriteria alapján (lásd lejjebb).

    public void readBooksFromFile(Path path) {
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                processLine(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read from file", ioe);
        } catch (IllegalArgumentException | IndexOutOfBoundsException ex) {
            throw new WrongFormatException("Line format in file is wrong", ex);
        }
    }

    private void processLine(String line){
        String newRegNumber = "R-" + (catalogItems.size() + 1);
        String[] parts = line.split(";");
        int pieces = Integer.parseInt(parts[0]);
        String title = parts[1];
        int numberOfPages = Integer.parseInt(parts[2]);
        List<String> authors = List.of(Arrays.copyOfRange(parts, 3, parts.length));
        LibraryItem libraryItem = new Book(title, numberOfPages, authors);
        catalogItems.add(new CatalogItem(newRegNumber, pieces, libraryItem));
    }
    // Amennyiben a katalóguselem csak egy könyvet tartalmaz, azt fájlból is be lehet olvasni.


}
