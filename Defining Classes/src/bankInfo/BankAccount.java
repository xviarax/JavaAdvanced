package bankInfo;

public class BankAccount { // идеално за личен проект
    private int id;
    private double balance;
    private static double intRate = 0.02;
    private static int counterAccounts = 0;

    public BankAccount() {
        counterAccounts++;
        this.id = counterAccounts;
        this.balance = 0;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getIntRate() {
        return intRate;
    }

    public static void setIntRate(double intRate) {
        BankAccount.intRate = intRate;
    }
    public void deposit(double money){
        this.balance += money;
    }
    public double getInterest(int years){
        return years * intRate * this.balance;
    }

}
