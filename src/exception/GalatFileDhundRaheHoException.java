package exception;

public class GalatFileDhundRaheHoException extends RuntimeException {


    // step 1
    // -> extends Throwable, Exception -> checked
    // -> extends RuntimeException -> unchecked

    // step 2
    // override class constructor with a parameter String

    // step 3 -> use it

    public GalatFileDhundRaheHoException(String message) {
        super(message);
    }
}
