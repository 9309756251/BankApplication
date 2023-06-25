import java.util.UUID;

public class HDFCAccount implements BankAccountInter{

    private String name;
    private String accountNo;    // random and unique  --> UUID

    private double balance;
    private String password;

    final double rateOfInt= 6.1;

    public HDFCAccount() {
    }

    public HDFCAccount(String name, double balance, String password) {
        this.name = name;
        this.accountNo = String.valueOf(UUID.randomUUID());
        this.balance = balance;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String fetchBalance(String password) {
        if(this.password.equals(password)) return "Your balance is " + this.balance;
        return " Incorrect password";
    }

    @Override
    public double addMoney(double amount) {
        this.balance+=amount;
        return balance;
    }

    @Override
    public String windrawMoney(String password, double amount) {
        if(this.password.equals(password))
        {
            if(amount<this.balance)
            {
                this.balance-=amount;
                return "Widraw Scucessfull";
            }
            return " Insufficient Balance";
        }
        return"Incorrect Password";
    }

    @Override
    public String changeChange(String newPassword, String oldPassword) {
        if(this.password.equals(oldPassword))
        {
            this.password=newPassword;
            return "Password Updated";
        }
        return "Incorrect Password";
    }

    @Override
    public double clculateInterest(int year) {
        return (this.balance*rateOfInt*year)/100;
    }
}
