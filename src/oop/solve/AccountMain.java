package oop.solve;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        //계좌에 10,000 입금
        account.deposit(10000);
        //계좌에서 9,000 출금
        account.withdraw(9000);
        //계좌에서 2,000 출금 -> 잔액 부족
        account.withdraw(2000);
        //잔고 출력
        System.out.println(account.getBalance());
    }
}
