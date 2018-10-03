public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(double balance, int accountID, String password) {
    //initialize here
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return accountID;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean deposit(double amt) {
    if (amt < 0) {
      balance += amt;
      return true;
    }
    return false;
  }
}
