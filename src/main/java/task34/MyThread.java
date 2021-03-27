package task34;

public class MyThread extends Thread{

    public MyThread() {
    }

    public MyThread(Runnable target) {
        super(target);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
