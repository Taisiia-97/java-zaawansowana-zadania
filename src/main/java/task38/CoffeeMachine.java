package task38;

import java.util.Scanner;

public class CoffeeMachine extends Thread {
   private CoffeePortion coffeePortion;

    public CoffeeMachine(CoffeePortion coffeePortion){
        this.coffeePortion=coffeePortion;
    }

    @Override
    public void run() {
       coffeePortion.makeCoffee();
    }
}
