package multi_threading;

public class MyRunnable implements Runnable{
	public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Value: " + i);
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
    	System.out.println("This is using implementing Runnable Interface");
        MyRunnable runnable = new MyRunnable();
        Thread t1 = new Thread(runnable, "Thread-1");
        Thread t2 = new Thread(runnable, "Thread-2");
//The Runnable interface does not have a start() method, so we require to create the object of the Thread class
        t1.start();
        t2.start();
    }

}
