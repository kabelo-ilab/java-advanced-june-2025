package chapter8;

import java.util.InputMismatchException;
import java.util.Scanner;
/*finally block: Code inside the finally block will always execute*/
public class ProductRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price;
        String code, desc;
        int qtyToSell;

        try{
            System.out.print("Enter product code: ");
            code = sc.next();
            System.out.print("Enter product description: ");
            desc = sc.next();
            System.out.print("Please enter the price: ");
            price = sc.nextDouble();
            //create a product object
           Product objPr = new Product(code, desc, price,10);

            System.out.print("How many units of " + objPr.getDescription() + " would you like to sell? ");
            qtyToSell = sc.nextInt();
            objPr.sell(qtyToSell);

            System.out.println(objPr.toString());
        }catch (IllegalArgumentException ex){
            System.err.println("Error: " + ex.getMessage());

        }catch (InputMismatchException ex){
            System.err.println(ex.getMessage());

        }catch(LowStockException ex){
            System.err.println(ex.getMessage());

        } finally {
            //code to be executed regardless
            System.out.println("Done... Thank you for using our application");
        }

    }
}
