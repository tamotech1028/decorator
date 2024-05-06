package noDecorator;

// AmericanCoffee+Syrup
public class AmericaCoffeeWithSyrup {

    protected AmericanCoffee americanCoffee;

    private static final String DESCRIPTION = "+Syrup";
    private static final int PRICE = 50;

    public AmericaCoffeeWithSyrup(AmericanCoffee americanCoffee) {
        this.americanCoffee = americanCoffee;
    }

    public String getDescription() {
        return americanCoffee.getDescription() + DESCRIPTION;
    }

    public int getPrice() {
        return americanCoffee.getPrice() + PRICE;
    }
}
