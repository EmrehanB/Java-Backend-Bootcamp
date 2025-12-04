public class BankAccount {
    private int accountNumber;
    private double balance=0;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {}

    public BankAccount(int accountNumber, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double money){
        this.balance=this.balance+money;
        System.out.println(money+" $ was deposited.Current balance: "+this.balance);
    }

    public void withdraw(double money){
        if(this.balance>=money){
            this.balance -= money;
            System.out.println("new balance: "+this.balance );
        }
        else {
            System.out.println("Insufficient Balance! Withdrawal Request:" +money+" , Available: "  +this.balance);
        }
    }




}
