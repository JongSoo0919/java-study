package access.capsulation;

public class BankAmountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);
        bankAccount.withdraw(3000);
        bankAccount.deposit(-1000);
        bankAccount.withdraw(110000);
        System.out.println(bankAccount.getBalance());
    }
}
