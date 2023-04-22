package org.example.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPasswordValidate {
    // digit + lowercase char + uppercase char + punctuation
    private static final String PASSWORD_PATTERN =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$%^_+=<>]).{8,20}$";

    private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
    public static boolean isValid(String password) {
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}