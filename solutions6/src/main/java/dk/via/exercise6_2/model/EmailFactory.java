package dk.via.exercise6_2.model;

import dk.via.exercise6_2.model.validation.EmailValidator;

public class EmailFactory {
    public static Email createEmail(String email) {
        EmailValidator.validateEmail(email);
        String[] parts = email.split("@");
        return new Email(parts[0], parts[1]);
    }
}
