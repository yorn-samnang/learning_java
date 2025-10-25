public class BankAccount {
    public static void main(String[] args) {

    }
    // Innitialize the constructor
    public BankAccount(int accountNumber, double balance, String accountName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountName = accountName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    private Integer accountNumber;
    private static double balance;
    private String accountName;
    private String email;
    private String phoneNumber;

    // @ Create the Getter Method
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // @ Create the Setter Method

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int deposingFunds(double depositAmount) {
        if (depositAmount > 0) {
            balance += depositAmount;
            System.out.println("Deposit of " + depositAmount + "$ successful. New balance: " + balance + "$");

        } else System.out.println("Error: Deposit amount must be positive.");
        return 0;
    }

    public static int withdrawFunds(double withdrawAmount) {
        if (withdrawAmount < 0) {
            System.out.println("Error: Amount must be positive.");
        }
        else if (withdrawAmount > balance) {
            System.out.println("Insufficient funds. Your balance is " + balance + "$");
        } else {
            balance -= withdrawAmount;
            System.out.println("Withdraw of " + withdrawAmount + "$ successful. New balance: " + balance + "$");
        }
        return 0;
    }
}
