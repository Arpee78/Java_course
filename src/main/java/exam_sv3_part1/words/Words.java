package exam_sv3_part1.words;

public class Words {

    public String deleteEvenCharacters(String word) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < word.length(); i += 2) {
            sb.append(word.charAt(i));
        }

        return sb.toString();
    }
}
