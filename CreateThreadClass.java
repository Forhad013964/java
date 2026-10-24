class MyThread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println("Thread -> " + i);
    }
}

public class CreateThreadClass {
    public static void main(String[] args) {
        MyThread2 t = new MyThread2();
        t.start();
    }
}