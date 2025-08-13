package multi_threading;

public class BankAmountSystem {
 private int balance = 1000;

 public synchronized void withdraw(String user, int amount) {
	 if (amount <= 0) {
	        System.out.println(user + " tried to withdraw an invalid amount: " + amount);
	        return;
	 }else if (balance >= amount) {
         System.out.println(user + " is trying to withdraw " + amount);
         try {
             Thread.sleep(500); 
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         balance = balance - amount;
         System.out.println(user + " completed withdrawal. Remaining balance: " + balance);
     } else {
         System.out.println(user + " tried to withdraw " + amount + " but insufficient balance: " + balance);
     }
 }

 public int getBalance() {
     return balance;
 }

}
