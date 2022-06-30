package drinks;

public class Coffee {

    private double milkMeasurement;
    private double coffeeMeasurement;
    private double sugarMeasurement;

    public Coffee(double milkMeasurement, double coffeeMeasurement, double sugarMeasurement) {
        this.milkMeasurement = milkMeasurement;
        this.coffeeMeasurement = coffeeMeasurement;
        this.sugarMeasurement = sugarMeasurement;
    }

    @Override
    public String toString() {
        return "Coffee, with " + coffeeMeasurement + "kg of coffee beans" +
                " and " + milkMeasurement + "kg of milk " +
                "and " + sugarMeasurement + "kg sugar " +
                "and extra dark!";
    }
}
