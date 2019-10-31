package tutorial.exceptions;

public class MyOwnRunTimeException extends RuntimeException {
    public MyOwnRunTimeException(String message) {
        super(message);
    }
}
