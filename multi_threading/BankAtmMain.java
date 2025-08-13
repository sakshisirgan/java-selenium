package multi_threading;

public class BankAtmMain {
 public static void main(String[] args) {
     BankAmountSystem sharedAccount = new BankAmountSystem();

     AtmWithdraw user1 = new AtmWithdraw(sharedAccount, "User1", 1000);
     AtmWithdraw user2 = new AtmWithdraw(sharedAccount, "User2", 800);

     user1.start();
     user2.start();

     try {
         user1.join();
         user2.join();
     } catch (InterruptedException e) {
         e.printStackTrace();
     }

     System.out.println("Total Balance : " + sharedAccount.getBalance());
 }
}
