package introexceptionthrow;

public class Validation {

    public void validateName(String name) {
        if (name==null && name.isBlank()) {
            throw new IllegalArgumentException("  HIBA: Nem érvényes név: " + name);
        }
    }

    public void validateAge(String age) {
        if (age.isBlank()) {
            throw new IllegalArgumentException("  HIBA: Nem érvényes életkor: " + age + " (üres adat)");
        }

        char[] ageArray = age.toCharArray();
        for (char c : ageArray) {
            if (!Character.isDigit(c) && c!='-') {
                throw new IllegalArgumentException("  HIBA: Nem érvényes életkor: " + age + " (nem szám)");
            }
        }

        int ageNumber = Integer.parseInt(age);

        if (ageNumber < 0 || ageNumber > 120) {
            throw new IllegalArgumentException("  HIBA: Nem érvényes életkor: " + age + " (Kisebb mint 0, nagyobb mint 120)");
        }

    }
}
