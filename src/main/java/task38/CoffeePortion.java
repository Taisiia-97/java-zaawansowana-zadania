package task38;

import java.util.Scanner;

public class CoffeePortion {
    private boolean isCoffeeBeans;
    private double sugarAmount;
  private double waterAmount;
    private boolean isMilk;
    private CoffeeType coffeeType;

    public CoffeePortion(boolean isCoffeeBeans, double sugarAmount, double waterAmount, boolean isMilk, CoffeeType coffeeType) {
        this.isCoffeeBeans = isCoffeeBeans;
        this.sugarAmount = sugarAmount;
        this.waterAmount = waterAmount;
        this.isMilk = isMilk;
        this.coffeeType = coffeeType;
    }

    public double getWaterAmount() {
        return waterAmount;
    }

    synchronized void makeCoffee() {
        try{
         while (this.waterAmount <= 0) {
            System.out.println("Zbiornik na wodę jest pusty!!! Dolej wody do zbiornika!");

                wait();
            } }catch (InterruptedException e) {
                e.printStackTrace();
            }


        System.out.println("Zaczynam przygotowanie kawy " + coffeeType);
        System.out.println("Wybrana przez ciebie kawa została przygotowana");


    }
   synchronized void fillWater(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile wody chcesz dodać do zbiornika: ");
        this.waterAmount+=scanner.nextDouble();
         System.out.println("Aktualny stan wody "+waterAmount);
       notifyAll();
    }

}
