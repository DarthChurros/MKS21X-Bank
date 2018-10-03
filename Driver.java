public class Driver {
  public static void main(String[] args) {
    BankAccount acct = new BankAccount(1000.0, 1234567890, "seven");
    //constructor that takes balance, account number, and setPassword

    System.out.println("Account " + acct.getAccountID() + " has a balance of " + acct.getBalance());
    //should print Account 1234567890 has a balance of 1000.0

    System.out.println(acct.deposit(499.99));
    System.out.println(acct);
    //should print 1234567890 1499.99

    System.out.println(acct.deposit(-10.0));
    System.out.println(acct);
    //output should be unchanged

    acct.setPassword("fortnite");

    System.out.println(acct.withdraw(1255.94));
    System.out.println(acct);
    //should print 1234567890 244.05

    System.out.println(acct.withdraw(-0.01));
    System.out.println(acct);
    //should print 1234567890 244.05

    System.out.println(acct.withdraw(255.94));
    System.out.println(acct);
    //should print 1234567890 244.05

  }
}
