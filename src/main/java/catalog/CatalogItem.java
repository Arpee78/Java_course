package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogItem {

    private String registrationNumber;
    private int pieces;
    private List<LibraryItem> libraryItems;

    public CatalogItem(String registrationNumber, int pieces, LibraryItem... libraryItems) {
        validate(registrationNumber, pieces);
        this.registrationNumber = registrationNumber;
        this.pieces = pieces;
        this.libraryItems = Arrays.asList(libraryItems);
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getPieces() {
        return pieces;
    }

    public List<LibraryItem> getLibraryItems() {
        return new ArrayList<>(libraryItems);
    }

    private void validate(String registrationNumber, int pieces) {
        if (Validators.isBlank(registrationNumber)) {
            throw new IllegalArgumentException("Empty registration number");
        }
        if (pieces <= 0) {
            throw new IllegalArgumentException("Pieces must be at least 0");
        }
    }

    public boolean hasAudioFeature() {
        for (LibraryItem l : libraryItems) {
            if (l.isAudio()) {
                return true;
            }
        }
        return false;
    }
    // Az adott katalóguselem listájában található-e audio tulajdonságú könyvtári elem.

    public boolean hasPrintedFeature() {
        for (LibraryItem l : libraryItems) {
            if (l.isPrinted()) {
                return true;
            }
        }
        return false;
    }
    // Az adott katalóguselem listájában található-e nyomtatott tulajdonságú könyvtári elem.

    public int getNumberOfPagesAtOneItem() {
        int sum = 0;
        for (LibraryItem l : libraryItems) {
            if (l.isPrinted()) {
                sum += ((Book) l).getNumberOfPages();
            }
        }
        return sum;
    }
    // A katalóguselem listájában található összes nyomtatott könyvtári elem össz-oldalszáma.

    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        for (LibraryItem l : libraryItems) {
            for (String s : l.getContributors()) {
                if (!contributors.contains(s)) {
                    contributors.add(s);
                }
            }
        }
        return contributors;
    }
    // A katalóguselem listájában található összes könyvtári elem összes közreműködőjét (szerzők, lektorok, stb.) adja vissza egy közös listában.

    public List<String> getTitles() {
        List<String> titles = new ArrayList<>();
        for (LibraryItem l : libraryItems) {
            titles.add(l.getTitle());
        }
        return titles;
    }
    // A katalóguselem listájában található összes könyvtári elem címét adja vissza egy közös listában.
}
