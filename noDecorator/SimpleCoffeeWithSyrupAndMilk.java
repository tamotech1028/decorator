package noDecorator;

// SimpleCoffee+Syrup+Milk
public class SimpleCoffeeWithSyrupAndMilk {

    protected SimpleCoffee simpleCoffee;

    private static final String DESCRIPTION = "+Syrup+Milk";
    private static final int PRICE = 130;

    public SimpleCoffeeWithSyrupAndMilk(SimpleCoffee simpleCoffee) {
        this.simpleCoffee = simpleCoffee;
    }

    public String getDescription() {
        return simpleCoffee.getDescription() + DESCRIPTION;
    }

    public int getPrice() {
        return simpleCoffee.getPrice() + PRICE;
    }
}
