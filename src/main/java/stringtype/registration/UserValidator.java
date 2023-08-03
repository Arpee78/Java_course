package stringtype.registration;

public class UserValidator {

    public boolean isValidUserName(String username) {
        return username.length() > 0;
    }

    public boolean isValidPassword(String password1, String password2) {
        return password1.length() >= 8 && password1.equals(password2);
    }

    public boolean isValidEmail(String email) {
        int atPos = email.indexOf("@");
        boolean containDot = email.indexOf(".", atPos + 2) > -1;
        boolean atNotFirst = atPos > 0;
        boolean dotNotLast = email.indexOf(".") != email.length() - 1;

        return containDot && atNotFirst && dotNotLast;
    }
}
