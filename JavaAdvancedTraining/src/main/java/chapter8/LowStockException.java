package chapter8;

/**
 * This class defines an exception to be thrown whenever a product is low in quantity
 */
public class LowStockException extends Exception {
   public LowStockException(String message){
       super(message);
   }
}
