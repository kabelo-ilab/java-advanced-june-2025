package chapter7;

import java.util.Scanner;

public class AccountRunner {
    public static void main(String[] args) {

        Account objCheque = new Account("1234567", "Cheque", 2000, "Tom");
        Account objSavings = new Account("7894562", "Savings", 1500, "Tom");

        objCheque.transfer(objSavings,500);

        System.out.println("==================CHEQUE=======================");
        objCheque.displayDetails();

        System.out.println("\n==================SAVINGS=======================");
        objSavings.displayDetails();

    }
}
