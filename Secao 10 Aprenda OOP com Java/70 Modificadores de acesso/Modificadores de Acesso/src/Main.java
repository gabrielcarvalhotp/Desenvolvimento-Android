import classes.Account;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(100.00);
        account.deposit(50.00);
        System.out.println(account.getBalance());

        account.withdrawal(50.00);
        System.out.println(account.getBalance());
    }
}