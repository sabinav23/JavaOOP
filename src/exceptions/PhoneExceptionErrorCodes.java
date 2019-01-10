package exceptions;

public enum PhoneExceptionErrorCodes {

    TOO_MANY_CHARS("Too many characters!"),
    PHONE_DEAD("Your phone has no battery!");

    private final String errorText;

    PhoneExceptionErrorCodes(final String text) {
        this.errorText = text;
    }

    @Override
    public String toString() {
        return this.errorText;
    }
}
