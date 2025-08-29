public class Main {
    public static void main(String[] args) {
        var acc1 = new BankAccount();
        acc1.getAccountNumber();
        acc1.deposit(10000);
        acc1.getBalance();
        acc1.withdraw(5000.768);
        acc1.getBalance();

        var acc2 = new BankAccount(12000);
        acc2.getAccountNumber();
        acc2.getBalance();
        acc2.deposit(1);
        acc2.getBalance();

        System.out.println(acc1);
        System.out.println(acc2);
    }
}
