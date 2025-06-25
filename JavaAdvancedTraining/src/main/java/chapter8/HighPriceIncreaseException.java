package chapter8;

/**
 * This class defines an exception to be thrown when there is a
 * high price increase on a product
 */
public class HighPriceIncreaseException extends Exception {
    public HighPriceIncreaseException(String message) {
        super(message);
    }
}
