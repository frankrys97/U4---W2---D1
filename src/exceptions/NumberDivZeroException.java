package exceptions;

public class NumberDivZeroException extends Exception {
    public NumberDivZeroException() {
        super("Non sono consentite divisioni per 0");
    }
}
