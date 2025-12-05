public class SavingAccount extends BankAccount{
    private double interestRate;
    public SavingAccount(int accountNumber, String customerName, String email, String phoneNumber,double interestRate){
        super(accountNumber,customerName,email,phoneNumber);
        this.interestRate=interestRate;
    }
    public double calculateInterest(double balance){
        return getBalance()*interestRate;
    }
}
