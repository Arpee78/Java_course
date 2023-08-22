package exam_sv2_part1_sup.firstnumber;

public class FirstNumber {

    public char getFirstNumber(String s){

        for (char c: s.toCharArray()) {
            if (Character.isDigit(c)){
                return c;
            }
        }
        return ' ';
    }
}
