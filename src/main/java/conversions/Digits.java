package conversions;

import java.util.ArrayList;
import java.util.List;

public class Digits {

    private List<Integer> numbers = new ArrayList<>();

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void addDigitsToList(String text){
        char[] charArray = text.toCharArray();
        for (char c: charArray) {
            if (Character.isDigit(c)){
                numbers.add(Character.getNumericValue(c));
            }
        }
    }

    public static void main(String[] args) {
        Digits digits = new Digits();
        digits.addDigitsToList("43fg6 69");
        System.out.println(digits.getNumbers());
    }

}
