package noDecorator;

// AmericanCoffee+Syrup+Milk
public class AmericanCoffeeWithSyrupAndMilk {

    protected AmericanCoffee americanCoffee;

    private static final String DESCRIPTION = "+Syrup+Milk";
    private static final int PRICE = 130;

    public AmericanCoffeeWithSyrupAndMilk(AmericanCoffee americanCoffee) {
        this.americanCoffee = americanCoffee;
    }

    public String getDescription() {
        return americanCoffee.getDescription() + DESCRIPTION;
    }

    public int getPrice() {
        return americanCoffee.getPrice() + PRICE;
    }
}
