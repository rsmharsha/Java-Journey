public class BankAccount {
    // fields or attributes
    private final long accountNumber;
    private double balance;

    // Constructors
    public BankAccount(){
        this.accountNumber = (long)(Math.random()*9_000_000_000_000L) + 1_000_000_000_000L;
        this.balance = 0.0;
    }
    public BankAccount(double initialDeposit){
        this();
        deposit(initialDeposit);
    }

    // Methods
    // Double can introduce tiny rounding issues with money.
    // For learning projects → totally fine.
    // In real banking code → use BigDecimal or store money in cents as a long.
    public void deposit(double money){
        if(money <= 0) throw new IllegalArgumentException("Money cannot be 0 or Negative");
        balance = balance + money;
    }

    public void withdraw(double money){
        if(money <= 0) throw new IllegalArgumentException("Money cannot be 0 or Negative");
        if(money > balance) throw new IllegalArgumentException("Money more than balance cannot be withdrawn");
        balance = balance - money;
    }

    // Getters
    // Usually getters should return not print, but here we'll just ignore it.
    public void getAccountNumber(){
        System.out.println(accountNumber);
    }
    public void getBalance(){
        System.out.println(balance);
    }

    // Overrides
    @Override
    public String toString(){
        return "Account #" + accountNumber + " | Balance: " + balance;
    }


}
