package chapter9;
/**
 * @author Kabelo Tlhape
 * This class defines an exception to be thrown when an account balance
 * is less than the requested withdrawal amount
 */
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }

}
