package exceptions;

public class PhoneException extends Exception {

    public PhoneException(PhoneExceptionErrorCodes errorCode){
        super(errorCode.toString());
    }
}
