package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class UserValidatorTestSuite {

    UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"ben", "ben123", "tom.hanks", "tom_hanks", "tom123-hanks", "uSeR3", ".user", "-user", "_-."})
    public void shouldReturnTrueIfUsernameIsValid(String username){
        assertTrue(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"al", "A1", "~", "", "tom^3", "tom123/hanks"})
    public void shouldReturnFalseIfUsernameIsInvalid(String username){
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "a@b.c", "a.b@c.d", "tom.hanks@mail.com", "tom_hanks12@wp.pl", "-tom123-Hanks@test.test.co", "uSeR3@test.co.uk", "3abc@some.domain.name.crypto"})
    public void shouldReturnTrueIfEmailIsValid(String email){
        assertTrue(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"@b.c", "a.b@c", "user4@.com", "a@b", "user", "user?@mail.com", "tom-hanks@mail.", "Username-123@domain.toolong"})
    public void shouldReturnFalseIfEmailIsInvalid(String email){
        assertFalse(validator.validateEmail(email));
    }
}