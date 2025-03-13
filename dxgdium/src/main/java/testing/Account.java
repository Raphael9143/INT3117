package testing;

import java.util.ArrayList;

import static testing.Transaction.DEPOSIT;
import static testing.Transaction.WITHDRAW;

public class Account {
    private double balance;
    private ArrayList<Transaction> transactionList = new ArrayList<>();

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void addTransaction(double amount, String operation) {
        Transaction newTransaction = new Transaction(operation, amount);
        transactionList.add(newTransaction);
    }

    public void printTransaction() {
        if (transactionList.isEmpty()) {
            System.out.println("You don't have any transactions!");
        }
        for (int i = 0; i < transactionList.size(); i++) {
            Transaction cur = transactionList.get(i);
            if (cur.getOperation().equals(DEPOSIT)) {
                deposit(cur.getAmount());
                System.out.println("Transaction " + (i + 1) + ": Deposit " + cur.getAmount() + ". Account balance: " + balance);
            } else if (cur.getOperation().equals(WITHDRAW)) {
                withdraw(cur.getAmount());
                System.out.println("Transaction " + (i + 1) + ": Withdraw " + cur.getAmount() + ". Account balance: " + balance);
            } else {
                System.out.println("Error transaction: Invalid action. Please check your input, only \"DEPOSIT\" or \"WITHDRAW\" is valid. Your current operation input is: " + cur.getOperation());
            }
        }
    }
}
