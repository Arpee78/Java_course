package recursion;

public class Vowels {

    public int getNumberOfVowels(String word) {

        String vowels = "AÁEÉIÍOÓÖŐUÚÜŰaáeéiíoóöőuúüű";
        int length = word.length();
        int sum = 0;

        if (length == 0) {
            return sum;
        }

        if (vowels.contains(word.substring(0, 1))) {
            sum++;
        }

        return sum + getNumberOfVowels(word.substring(1));

    }
}
