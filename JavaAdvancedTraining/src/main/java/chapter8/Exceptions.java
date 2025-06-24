package chapter8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numerator, denominator;
        double quotient = 0;
        String name = "";

        try{
            System.out.print("Enter your name: ");
            name = input.nextLine();
            System.out.print("Enter the numerator: ");
            numerator = input.nextInt();//g
            System.out.print("Enter denominator: ");
            denominator = input.nextInt();
            quotient = numerator / denominator;

            System.out.println("Your name: " + name);//Kabelo
            System.out.println("The last letter of your name is: " + name.substring(7));
            System.out.println("Quotient = " + quotient);

        }catch(ArithmeticException ex){
            System.err.println("Cannot divide by zero.");

        }catch(InputMismatchException ex){
            System.err.println("Please, only use integers");

        }catch (StringIndexOutOfBoundsException ex){
            System.err.println("Error: The last letter should be at position:  "
                    +  name.indexOf(name.substring(name.length() - 1)));
        }


    }
}
