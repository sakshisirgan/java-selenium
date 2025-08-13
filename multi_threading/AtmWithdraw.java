package multi_threading;

public class AtmWithdraw extends Thread {
 private BankAmountSystem account;
 private String userName;
 private int amountToWithdraw;

 public AtmWithdraw(BankAmountSystem account, String userName, int amount) {
     this.account = account;
     this.userName = userName;
     this.amountToWithdraw = amount;
 }

 public void run() {
     account.withdraw(userName, amountToWithdraw);
 }
}
