package testing;

public class Week4Test {
    public static void main(String[] args) {
        //Test 1, input amount = 1, operation = "psac", test addTransaction function
        Account test1 = new Account(0);
        test1.addTransaction(1, "psac");
        System.out.print("Test 1: ");
        test1.printTransaction(); //print de kiem tra transaction, khong lien quan toi test

        //Test 2, input transactionList = []
        Account test2 = new Account(0);
        System.out.print("Test 2: ");
        test2.printTransaction();

        //Test 3, input transactionList = [(1, "DEPOSIT")]
        Account test3 = new Account(0);
        test3.addTransaction(1, "DEPOSIT");
        System.out.print("Test 3: ");
        test3.printTransaction();

        //Test 4, input transactionList = [(1, "WITHDRAW")]
        Account test4 = new Account(0);
        test4.addTransaction(1, "WITHDRAW");
        System.out.print("Test 4: ");
        test4.printTransaction();

        //Test 5, input transactionList = [(1, "iksda")]
        Account test5 = new Account(0);
        test5.addTransaction(1, "iksda");
        System.out.print("Test 5: ");
        test5.printTransaction();
    }
}