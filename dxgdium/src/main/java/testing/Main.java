package testing;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(0);
        account.addTransaction(100, "DEPOSIT");
        account.printTransaction();
    }
}