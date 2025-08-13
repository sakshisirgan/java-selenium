package multi_threading;

class BankTransaction {
    public static void main(String[] args) {
        BankAmount bankAccount = new BankAmount();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i < 5; i++) {
                bankAccount.deposit_amt(1000);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i < 5; i++) {
                bankAccount.withdraw_amt(3000);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println("Balance Left: " + bankAccount.getBalance());
    }
}

