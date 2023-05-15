package com.bridgelabz;

import java.util.regex.Pattern;

public class EmailValidator {
    public static boolean isValidEmail(String email) {
        // Regular expression pattern for email validation
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        // Use Pattern.matches() to check if the email matches the regex pattern
        return Pattern.matches(emailRegex, email);
    }
}
