package chapter9;

import chapter9.Account;

public class AccountRunner {
    public static void main(String[] args) {

        Account objCheque = new Account("1234567", 12000, "Tom");
        Account objSavings = new Account("7894562", 700, "Tom");

        objCheque.transfer(objSavings,500);

        System.out.println("==================CHEQUE=======================");
        objCheque.displayDetails();

        System.out.println("\n==================SAVINGS=======================");
        objSavings.displayDetails();



    }
}
