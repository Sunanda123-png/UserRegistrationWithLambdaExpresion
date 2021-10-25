package com.bridgelabz;

/**
 * Author:-Sunanda Shil
 * Date:-23/10/21
 */

import java.util.regex.Pattern;
@FunctionalInterface
interface validation{
    void uservalidation(String input);
}
public class UserRegistrationLambda {
//First name validation
    public void fmacthing(String f) {
        validation firstname = (String fname) -> {
            Pattern pattern = Pattern.compile("[A-Z][a-z]{2,}");
            pattern.matcher(fname);
        };
        firstname.uservalidation(f);
    }
    //Last name validation
    public void lmacthing(String l) {
        validation lastname = (String lname) -> {
            Pattern pattern = Pattern.compile("[A-Z][a-z]{2,}");
            pattern.matcher(lname);
        };
        lastname.uservalidation(l);
    }
    //Email validation
    public void emailmacthing(String e) {
        validation email = (String em) -> {
            Pattern pattern = Pattern.compile("[a-zA-Z0-9]+[.][a-zA-Z0-9]*[@][b][l][.][c][o][.][in]*");
            pattern.matcher(em);
        };
        email.uservalidation(e);
    }
    //Mobile number validation
    public void mobilemacthing(String m) {
        validation mobileNo = (String mn) -> {
            Pattern pattern = Pattern.compile("[9][1] [1-9][0-9]{9}");
            pattern.matcher(mn);
        };
        mobileNo.uservalidation(m);
    }
    //Password Validation
    public void passwordmacthing(String p) {
        validation password = (String pa) -> {
            Pattern pattern = Pattern.compile("(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&]{1}).{8,}");
            pattern.matcher(pa);
        };
        password.uservalidation(p);
    }
}
