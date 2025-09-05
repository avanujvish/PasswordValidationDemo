package com.app.passwordvalidation.response;

import java.util.ArrayList;
import java.util.List;

public class Response {

    public boolean isError;
    public int errorCode;
    public String errorMessage;
    public String message;
    public List<String> errorMessages = new ArrayList<String>();

    public Response(boolean isError, int errorCode, String errorMessage) {
        this.isError = isError;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public boolean isError() {
        return isError;
    }

    public void setError(boolean error) {
        isError = error;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public List getErrorMessages() {
        return errorMessages;
    }

    public void setErrorMessages(List errorMessages) {
        this.errorMessages = errorMessages;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Response{" +
                "isError=" + isError +
                ", message='" + message + '\'' +
                ", errorMessages=" + errorMessages +
                '}';
    }
}
