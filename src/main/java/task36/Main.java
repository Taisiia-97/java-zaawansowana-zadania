package task36;

public class Main {
  private   static Thread thread;
  private   static Thread thread1;

    public static void main(String[] args) {
        thread = new Thread(new ThreadPlaygroundRunnable("Watek 1"));
        thread1 = new Thread(new ThreadPlaygroundRunnable("Wątek2"));
        thread.start();
        thread1.start();
    }

}
