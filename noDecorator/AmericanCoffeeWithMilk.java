package noDecorator;

// AmericanCoffee+Milk
public class AmericanCoffeeWithMilk {

    protected AmericanCoffee americanCoffee;

    private static final String DESCRIPTION = "+Milk";
    private static final int PRICE = 80;

    public AmericanCoffeeWithMilk(AmericanCoffee americanCoffee) {
        this.americanCoffee = americanCoffee;
    }

    public String getDescription() {
        return americanCoffee.getDescription() + DESCRIPTION;
    }

    public int getPrice() {
        return americanCoffee.getPrice() + PRICE;
    }
}
