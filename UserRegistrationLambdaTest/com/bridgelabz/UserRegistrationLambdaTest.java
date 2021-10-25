package com.bridgelabz;

import org.junit.jupiter.api.Test;

public class UserRegistrationLambdaTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistrationLambda validator = new UserRegistrationLambda();
        validator.fmacthing("Sunanda");
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistrationLambda validator = new UserRegistrationLambda();
        validator.lmacthing("Shil");
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistrationLambda validator = new UserRegistrationLambda();
        validator.emailmacthing("sunanda.shil@bl.co.in");
    }
    @Test
    public void givenMobileNo_WhenProper_ShouldReturnTrue() {
        UserRegistrationLambda validator = new UserRegistrationLambda();
        validator.mobilemacthing("7578061886");
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        UserRegistrationLambda validator = new UserRegistrationLambda();
        validator.passwordmacthing("Abcdefgh1@");
    }
}
