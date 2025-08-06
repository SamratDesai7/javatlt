package org.assignment.tlt;

class InvalidPasswordException extends RuntimeException {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

class PasswordChecker {
    public static void validate(String password) {
        if (password.length() < 8) {
            throw new InvalidPasswordException("Password must be at least 8 characters long.");
        }

        if (!password.matches(".*[A-Z].*")) {
            throw new InvalidPasswordException("Password must contain at least one capital letter.");
        }

        if (!password.matches(".*\\d.*")) {
            throw new InvalidPasswordException("Password must contain at least one digit.");
        }

        if (!password.matches(".*[!@#$%^&*()_+=|<>?{}\\[\\]~-].*")) {
            throw new InvalidPasswordException("Password must contain at least one special symbol.");
        }

        System.out.println("Password is valid.");
    }
}

public class Q_129_LoginApp {
    public static void main(String[] args) {
        String[] passwords = {
            "pass123",         
            "Password1",       
            "password1@",      
            "Password@"        
        };

        for (String pwd : passwords) {
            try {
                System.out.println("Checking: " + pwd);
                PasswordChecker.validate(pwd);
            } catch (InvalidPasswordException e) {
                System.out.println("Invalid password: " + e.getMessage());
            }
            System.out.println();
        }

      
        try {
            PasswordChecker.validate("Secure1@3");
        } catch (InvalidPasswordException e) {
            System.out.println("Invalid password: " + e.getMessage());
        }
    }
}
