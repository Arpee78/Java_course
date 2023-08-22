package exam_sv2_part1_sup.reversedorder;

public class ReversedOrder {

    public String getWordsInReversedOrder(String[] words) {
        StringBuilder sb = new StringBuilder();

        int lastIndex = words.length - 1;

        for (int i = lastIndex; i >= 0; i--) {
            if (i < lastIndex) {
                sb.append(", ");
            }
            sb.append(words[i]);
        }

        return sb.toString();
    }
}
