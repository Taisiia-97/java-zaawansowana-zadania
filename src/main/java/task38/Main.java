package task38;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(new CoffeePortion(true,2.5,0,true,CoffeeType.CAPPUCCINO));
        WaterContainer waterContainer = new WaterContainer(new CoffeePortion(true,2.5,0,true,CoffeeType.CAPPUCCINO));
        coffeeMachine.start();
        waterContainer.start();
    }
}
