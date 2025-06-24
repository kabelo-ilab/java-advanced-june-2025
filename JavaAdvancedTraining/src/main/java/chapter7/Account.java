package chapter7;
/*Access Levels:
*          Public - class members can be accessible outside the
*          class
*           Private - class members are only accessible inside the
*           class
* Getters - methods used to return the current value of the instance
* variable
* Setters - methods used to change the value of the instance
* variable
* */
public class Account {
    private String accountNum;//EF-1234567
    private String accountType;
    private double balance;
    private String accountHolder;

    public Account(String accNum, String accType, double balance, String accHolder){
        /*You can use the set methods inside the constructor*/
        setAccountNum(accNum);
        setAccountHolder(accHolder);
        this.accountType = accType;
        this.balance = balance;
    }

    /**
     * Sets account number to a new account number
     * @param accNum The new account number
     */
    private void setAccountNum(String accNum){
        this.accountNum = "EF-" + accNum;
    }

    /**
     * Returns the current account number
     * @return account number
     */
    public String getAccountNum() {
        return this.accountNum;
    }
    public void setAccountType(String accType){
        this.accountType = accType;
    }
    public String getAccountType(){
        return this.accountType;
    }
    public void setBalance(double bal){
        this.balance = bal;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setAccountHolder(String owner){
        this.accountHolder = owner;
    }
    public String getAccountHolder(){
        return this.accountHolder;
    }


    /**
     * Increase the balance of the current account
     * @param amount The amount to be deposited into the account
     */
    public void deposit(double amount){
        this.balance = this.balance + amount;
    }

    /**
     * Decrease the balance of the current account
     * @param amount The amount to be withdrawn from the account
     */
    public void withdraw(double amount){
        this.balance = this.balance - amount;
    }

    /**
     * Transfers amount from current account to target account
     * @param targetAccount The account to receive the funds
     * @param amountToTransfer The amount to transfer
     */
    public void transfer(Account targetAccount, double amountToTransfer){
        //this.balance = this.balance - amountToTransfer;
        this.withdraw(amountToTransfer);
        //targetAccount.balance = targetAccount.balance + amountToTransfer;
        targetAccount.deposit(amountToTransfer);
    }

    public void displayDetails(){
        System.out.println("Account Holder: " + getAccountHolder() + " (" + getAccountNum() + ")");
        System.out.println("Account Type: " + getAccountType());
        System.out.println("Balance: " + getBalance());
    }

}
