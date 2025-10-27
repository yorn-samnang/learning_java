public class Main {
    public static void main(String[] args) {
//        BankAccount bankAccount = new BankAccount(); // constructor

        BankAccount jameAcc = new BankAccount(
                1,
                10000,
                "Jame",
                "jame@gmail.com",
                "086589019"
        );

        BankAccount nangAcc = new BankAccount(
                2,
                100001,
                "Nang",
                "nang@gmail.com",
                "0865890190"
        );

//        System.out.println(jameAcc.getAccountNumber());


//        bankAccount.setAccountName("Jame");
//        bankAccount.setAccountNumber(1);
//        bankAccount.setBalance(100);


//        System.out.println(bankAccount.deposingFunds(1000));
//        System.out.println(bankAccount.deposingFunds(1000));
//        System.out.println(BankAccount.withdrawFunds(2000));
//        System.out.println(bankAccount.deposingFunds(1000));
//        // Print account info
//        System.out.println("Account Info:");
//        System.out.println("Number: " + jameAcc.getAccountNumber());
//        System.out.println("Name: " + jameAcc.getAccountName());
//        System.out.println("Balance: $" + jameAcc.getBalance());
//        System.out.println(jameAcc.deposingFunds(1000));
//
//        // Print account info
//        System.out.println("Account Info:");
//        System.out.println("Number: " + nangAcc.getAccountNumber());
//        System.out.println("Name: " + nangAcc.getAccountName());
//        System.out.println("Balance: $" + nangAcc.getBalance());
//        System.out.println(nangAcc.deposingFunds(1000));
        printAccount(jameAcc);

    }

    public static void printAccount(BankAccount account) {
        System.out.println(account.getAccountNumber());
        System.out.println("Account Info:");
        System.out.println("Number: " + account.getAccountNumber());
        System.out.println("Name: " + account.getAccountName());
        System.out.println("Balance: $" + account.getBalance());
        System.out.println(account.deposingFunds(1000));
    }
}
