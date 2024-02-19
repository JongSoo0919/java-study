package oop.solve;

public class Account {
    //잔액
    private int balance;

    //입금 메서드
    //입금 시 잔액 증가
    public void deposit(int amount) {
        balance += amount;
    }

    //출금 메서드
    //출금 시 잔액 감소
    //만약 잔액이 부족하면 잔액 부족을 출력
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            return;
        }
        System.out.println("잔액이 부족 합니다.");
    }

    public String getBalance(){
        return "잔액 : "+balance;
    }

}
