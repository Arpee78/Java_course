package stringbuilder;

public class PalindromeValidator {

    public boolean isPalindrome(String word) {
        word = word.trim().toLowerCase();
        String reverse = new StringBuilder(word).reverse().toString();
        return word.equals(reverse);
    }
}
