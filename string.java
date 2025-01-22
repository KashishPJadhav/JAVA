public class StringValidator {
    private String s;

    // Method to set string and validate its length
    public void setString(String s) throws ExceptionLineTooLong {
        if (s.length() > 80) {
            throw new ExceptionLineTooLong(s);
        }
        this.s = s;
    }

    // Getter for the string
    public String getString() {
        return s;
    }
}
