package task37;

import task36.ThreadPlaygroundRunnable;

import java.util.concurrent.Exchanger;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for(int i=0; i<10; i++){
            executorService.execute(new ThreadPlaygroundRunnable("A "+i));
        }

executorService.shutdown();
    }
}
