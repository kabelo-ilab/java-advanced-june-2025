package chapter9;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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

        //Actual
        objAccount.withdraw(amountToWithdraw);
        double actual = objAccount.getBalance();

        //Assert
        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Transfer from current account to target account")
    void transfer() {
        //Arrange
        Account objTargetAccount = new Account("2467895", 1000, "Tom");
        double amountToTransfer = 200;

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

    }
}