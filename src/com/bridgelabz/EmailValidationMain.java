package com.bridgelabz;
import java.util.regex.Pattern;

import static com.bridgelabz.EmailValidator.isValidEmail;

public class EmailValidationMain {
    public static void main(String[] args) {
        String[] emails = {
                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc.100@yahoo.com",
                "abc111@abc.com",
                "abc-100@abc.net",
                "abc.100@abc.com.au",
                "abc@1.com",
                "abc@gmail.com.com",
                "abc+100@gmail.com",
                "abc", // Invalid: must contain "@"
                "abc@.com.my", // Invalid: TLD cannot start with a dot "."
                "abc123@gmail.a", // Invalid: last TLD must contain at least two characters
                "abc123@.com", // Invalid: TLD cannot start with a dot "."
                "abc123@.com.com", // Invalid: TLD cannot start with a dot "."
                ".abc@abc.com", // Invalid: email's first character cannot start with a dot "."
                "abc()*@gmail.com", // Invalid: email is only allowed to contain characters, digits, underscores, and dashes
                "abc@%*.com", // Invalid: email's TLD is only allowed to contain characters and digits
                "abc..2002@gmail.com", // Invalid: double dots ".." are not allowed
                "abc.@gmail.com", // Invalid: email's last character cannot end with a dot "."
                "abc@abc@gmail.com", // Invalid: double "@" is not allowed
                "abc@gmail.com.1a", // Invalid: email's TLD, which has two characters, cannot contain digits
                "abc@gmail.com.aa.au" // Invalid: cannot have multiple email TLDs
        };
        for (String email : emails) {
            // Iterate through each email in the 'emails' array
            if (isValidEmail(email)) {
                // Check if the email is valid by calling the 'isValidEmail' method
                System.out.println(email + " is a valid email.");
                // Print a message indicating that the email is valid
            } else {
                System.out.println(email + " is an invalid email.");
                // Print a message indicating that the email is invalid
            }
        }
    }
}
