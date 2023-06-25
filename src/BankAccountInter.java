public interface BankAccountInter {
    public String fetchBalance(String password);

    double addMoney(double amount);

    String windrawMoney(String password, double amount);

    String changeChange(String newPassword, String oldPassword);

    double clculateInterest(int year);
}
