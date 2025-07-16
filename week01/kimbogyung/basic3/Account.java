public class Account {
    int balance = 0;

    int deposit (int amount) {
        balance += amount;
        return balance;
    }

    int withdraw (int amount) {
        balance -= amount;
        //출금액이 잔액보다 크고, 잔액이 0원 이상이면
        if (amount > balance && balance >= 0) {
            System.out.println("잔액 부족");
            System.out.println("잔고: " +  balance);
        }
        return balance;
    }
}
