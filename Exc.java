/*Define a new exception, called ExceptionLineTooLong, that prints out the error message "The
strings is too long". Write a program that reads a String from user and calculates its length and throws
an exception of type ExceptionLineTooLong in the case where a string of length is more than 80
characters. */
public class Exc extends Exception{
    String s;
    public ExceptionLineTooLong(string s)
    {
        this.s=s;
    }
    public int getInvalidValue() {
		return s;
	}
	public void setInvalidValue(int invalidValue) {
		this.s = s;
    }
    public String getMessage() {
		return String.format("String too long %s",s); 
	}
}