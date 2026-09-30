public class MyThread extends Thread {

    static int i = 1;
    String threadName;

    public MyThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        synchronized (this) {
            while (i < 100) {
                System.out.println(threadName + " == " + i++);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    public static void main(String[] args) {
        MyThread m1 = new MyThread("Thread 1..");
        m1.setPriority(MIN_PRIORITY);
        m1.start();
        MyThread m2 = new MyThread("Thread 2..");
        m2.setPriority(MAX_PRIORITY);
        m2.start();
    }
}
