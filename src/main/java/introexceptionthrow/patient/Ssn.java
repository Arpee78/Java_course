package introexceptionthrow.patient;

public class Ssn {

    public boolean isValidSsn(String ssn) {

        if (ssn.length() != 9) {
            return false;
        }

        char[] chars = ssn.toCharArray();
        for (char c : chars) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        int sum = 0;
        for (int i = 0; i < ssn.length() - 1; i++) {
            int n = Character.getNumericValue(chars[i]);
            if ((i + 1) % 2 == 0) {
                sum += n * 7;
            } else {
                sum += n * 3;
            }
        }
        return sum % 10 == Character.getNumericValue(chars[ssn.length() - 1]);

    }
}
