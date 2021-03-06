package test01;

public class AgeOutOfBoundsException extends RuntimeException {
    public AgeOutOfBoundsException() {
    }

    public AgeOutOfBoundsException(String message) {
        super(message);
    }

    public AgeOutOfBoundsException(String message, Throwable cause) {
        super(message, cause);
    }

    public AgeOutOfBoundsException(Throwable cause) {
        super(cause);
    }

    public AgeOutOfBoundsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
