package com.app.passwordvalidation.validator;

import com.app.passwordvalidation.response.Response;

public class PasswordValidator {

    public static Response validateNotNull(String password){
        if(password==null)
            return new Response(true, 1, "Password can not be null");
        else
            return new Response(false, 0, "Success");
    }


    public static Response validateLength(String password){
        if(password.length()<=8)
            return new Response(true, 2, "Password must be longer then 8 characters");
        else 
            return new Response(false, 0, "Success");
    }

    public static Response validateUpperCase(String password){
        if(!password.chars().anyMatch(Character::isUpperCase))
            return new Response(true, 3, "Password must contain at least one uppercase");
        else
            return new Response(false, 0, "Success");
    }

    public static Response validateLowerCase(String password){
        if(!password.chars().anyMatch(Character::isLowerCase))
            return new Response(true, 4, "Password must contain at least one lowercase");
        else
            return new Response(false, 0, "Success");
    }

    public static Response validateNumber(String password){
        if(!password.chars().anyMatch(Character::isDigit))
            return new Response(true, 5, "Password must contain at least one number");
        else
            return new Response(false, 0, "Success");
    }
    
}
