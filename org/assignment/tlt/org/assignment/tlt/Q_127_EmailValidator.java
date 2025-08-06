package org.assignment.tlt;

class InvalidEmailFormatException extends Exception {
    public InvalidEmailFormatException(String message) {
        super(message);
    }
}

public class Q_127_EmailValidator {
    public static void main(String[] args) {
        String[] emails = {
            "test@example.com",
            "user.name@domain.co.in",
            "invalidemail.com",
            "user@domain",
            "user@@domain.com",
            "user@domain..com",
            "user@domain.c",
            "user@domain.comm"
        };

        for (String email : emails) {
            try {
                validateEmail(email);
                System.out.println(email + " is valid.");
            } catch (InvalidEmailFormatException e) {
                System.out.println(email + " is invalid: " + e.getMessage());
            }
        }
    }

    public static void validateEmail(String email) throws InvalidEmailFormatException {
        if (email == null || email.isEmpty()) {
            throw new InvalidEmailFormatException("Email cannot be null or empty.");
        }

        int atIndex = email.indexOf('@');
        int lastAtIndex = email.lastIndexOf('@');

        if (atIndex == -1 || atIndex != lastAtIndex) {
            throw new InvalidEmailFormatException("Email must contain exactly one '@' character.");
        }

        int dotIndex = email.lastIndexOf('.');
        if (dotIndex == -1 || dotIndex < atIndex) {
            throw new InvalidEmailFormatException("Email must contain '.' after '@'.");
        }

        String domainSuffix = email.substring(dotIndex + 1);
        if (!(domainSuffix.length() == 2 || domainSuffix.length() == 3)) {
            throw new InvalidEmailFormatException("Domain suffix after '.' must be 2 or 3 characters.");
        }

        if (email.contains("..")) {
            throw new InvalidEmailFormatException("Email should not contain consecutive dots.");
        }
    }
}
