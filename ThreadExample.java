
class MyThread3 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": " + i);

            if (i == 2) {
                Thread.yield();
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(getName() + " stopped.");
                return;
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args)
            throws InterruptedException {

        MyThread3 t1 = new MyThread3();
        MyThread3 t2 = new MyThread3();
        
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        
        t1.start();
        t2.start();
        
        Thread.sleep(1200);
        t2.interrupt();
    }
}
