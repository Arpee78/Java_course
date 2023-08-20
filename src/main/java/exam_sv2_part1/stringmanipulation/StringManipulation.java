package exam_sv2_part1.stringmanipulation;

public class StringManipulation {

    String everyEvenCharacter(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

}
