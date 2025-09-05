package com.app.passwordvalidation.main;

import com.app.passwordvalidation.response.Response;
import com.app.passwordvalidation.validator.PasswordValidator;

import java.util.ArrayList;
import java.util.List;

public class PasswordValidationMain {

    public static void main(String[] args) {
        String password= "NNu";
        Response res = PasswordValidationMain.validatePassword(password);
        System.out.println(res);
    }




    public static Response validatePassword(String password) {
        Response response = null;
        response = PasswordValidator.validateNotNull(password);

        List<String> errorMessages = new ArrayList<String>();
        if(response.isError()) {
            errorMessages.add(response.getErrorMessage());
            response.setErrorMessages(errorMessages);
            response.setError(true);
            response.setMessage("ERROR");
            return response;
        }

            response = PasswordValidator.validateLength(password);
            extracted(response, errorMessages);
           response = PasswordValidator.validateUpperCase(password);
            extracted(response, errorMessages);
            response = PasswordValidator.validateLowerCase(password);
            extracted(response, errorMessages);
        //System.out.println(response);
            response = PasswordValidator.validateNumber(password);
            extracted(response, errorMessages);
       // System.out.println(errorMessages);

        if(  errorMessages.size()>2){
            response.setError(true);
            response.setErrorMessages(errorMessages);
            response.setMessage("ERROR");
        }else{
            if(errorMessages.stream().anyMatch(s->s.contains("4") )){
                response.setError(true);
                response.setErrorMessages(errorMessages);
                response.setMessage("ERROR");
            }else{

                response.setError(false);
                response.setErrorMessages(errorMessages);
                response.setMessage("OK");
            }
        }

        return response;
    }

    private static void extracted(Response response, List<String> errorMessages) {
        if(response.isError()) {
            errorMessages.add(response.getErrorCode()+" : "+response.getErrorMessage());
            response.setErrorMessages(errorMessages);
        }
    }


}
