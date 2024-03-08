package access.capsulation;

public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    //public method : deposit
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            System.out.println("유효하지 않은 금액입니다..");
            return;
        }
        balance += amount;
    }

    //deposit validate method
    private boolean isAmountValid(int amount){
        //금액이 0원보다 커야함
        return amount <= 0;
    }

    //public method : withdraw
    public void withdraw(int amount) {
        if (isAmountValid(amount) || balance - amount < 0) {
            System.out.println("유효하지 않은 금액이거나, 잔액이 부족합니다.");
            return;
        }
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}
