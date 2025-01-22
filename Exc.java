public class ExceptionLineTooLong extends Exception {
    private String invalidValue;

    // Constructor to initialize the invalid value
    public ExceptionLineTooLong(String invalidValue) {
        super("The string is too long.");
        this.invalidValue = invalidValue;
    }

    // Getter for invalid value
    public String getInvalidValue() {
        return invalidValue;
    }

    // Overridden getMessage() to include custom message
    @Override
    public String getMessage() {
        return String.format("String too long: %s", invalidValue);
    }
}
