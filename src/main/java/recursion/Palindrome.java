package recursion;

public class Palindrome {

    public boolean isPalindrome(String word) {

        int length = word.length();

        if (length < 2) {
            return true;
        }

        if (word.charAt(0) == word.charAt(length - 1)) {
            return isPalindrome(word.substring(1, length - 1));
        }

        return false;
    }
}
