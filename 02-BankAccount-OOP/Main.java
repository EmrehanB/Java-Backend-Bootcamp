public class Main {
    public static void main(String[] args) {
        BankAccount emrehanAccount = new BankAccount(1, "Emrehan", "asd@gmail.com", "12345678901");
        emrehanAccount.deposit(150);
        System.out.println(emrehanAccount.getBalance());
        emrehanAccount.withdraw(155);
        emrehanAccount.withdraw(77.25);
        System.out.println("Current balance: " + emrehanAccount.getBalance());
    }
}
