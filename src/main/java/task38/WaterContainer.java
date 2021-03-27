package task38;

public class WaterContainer extends Thread {
    private final CoffeePortion coffeePortion;

    public WaterContainer(CoffeePortion coffeePortion) {
        this.coffeePortion = coffeePortion;
    }

    @Override
    public void run() {
        if (this.isEmpty()) {
            coffeePortion.fillWater();
        }


    }

    private boolean isEmpty() {
        return coffeePortion.getWaterAmount() <= 0;
    }
}

