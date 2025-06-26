package chapter9;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    static Account objAccount;

    @BeforeEach
     void setup(){
        objAccount = new Account("7894562",1500,"Jessica");
    }

    @Test
    @DisplayName("Determine an account type")
    void getAccountType() {
        //Arrange
        String expected = "Cheque";
        //Actual
        String actual = objAccount.getAccountType();
        //Assert
        assertEquals(expected, actual);
    }

    /*Create a parameterized test method (testAccountTypes) that will have the following
    string values:
    * Debit,  Savings,  Cheque, Credit */

    @Test
    @DisplayName("Deposit into current account")
    void deposit() {
        //Arrange
        double amountToDeposit = 500;
        double expected = 2000;

        //Actual
        objAccount.deposit(amountToDeposit);
        double actual = objAccount.getBalance();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Withdraw from current account")
    void withdraw() {
        //Arrange
        double amountToWithdraw = 300;//1500 - 300
        double expected = 1200;
        try{
            //Actual
            objAccount.withdraw(amountToWithdraw);
            double actual = objAccount.getBalance();

            //Assert
            assertEquals(expected, actual);
        }catch (InsufficientFundsException ex){
            System.err.println(ex.getMessage());
        }

    }

    @Test
    void withdrawalInsufficientFunds(){
        //Arrange
        double amountToWithdraw = 2000;
        //Assert
        assertThrows(InsufficientFundsException.class, () -> objAccount.withdraw(amountToWithdraw));
    }

    @Test
    void transferInsufficientFunds(){
        //Arrange
        Account objTargetAccount = new Account("2467895", 1000, "Tom");
        double amountToTransfer = 2000;
        //Assert
        assertThrows(InsufficientFundsException.class, () -> objAccount.transfer(objTargetAccount, amountToTransfer));
    }

    @Test
    @DisplayName("Transfer from current account to target account")
    void transfer()  {
        //Arrange
        Account objTargetAccount = new Account("2467895", 1000, "Tom");
        double amountToTransfer = 200;

        try{
            //Actual
            objAccount.transfer(objTargetAccount, amountToTransfer);
            double currentAccountBalance = objAccount.getBalance();
            double targetAccountBalance = objTargetAccount.getBalance();

            //Assert
            // assertEquals((currentAccountBalance == 1300), (targetAccountBalance == 1200));

            assertAll(
                    () -> assertEquals(1300, currentAccountBalance),
                    () -> assertEquals(1200, targetAccountBalance)
            );
        }catch (InsufficientFundsException e){
            System.err.println(e.getMessage());
        }


    }
}