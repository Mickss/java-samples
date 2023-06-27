package exceptions;

public class ExceptionFileNotExist extends RuntimeException {

    public ExceptionFileNotExist(String message) {
        super(message);
    }
}
