package exam_sv2_part1_supsup.arrayoperation;

public class ArrayOperation {

    public String getWordsBackwards(String[] words) {
        StringBuilder sb = new StringBuilder();

        boolean first = true;
        for (int i = words.length - 1; i >= 0; i--) {
            if (first) {
                first = false;
            } else {
                sb.append(", ");
            }
            sb.append(words[i]);
        }

        return sb.toString();
    }
}
