package core.basesyntax;

public class PasswordValidator {
    void validate (String password, String repeatPassword)
            throws PasswordValidationException {
        int maxLength = 10;
        if (password.length() < maxLength || !password.equals(repeatPassword)) {
            throw new IllegalArgumentException("Wrong passwords");
        }
    }
}
