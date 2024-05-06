// AmericanCoffee
public class AmericanCoffee implements Coffee {

    private static final String DESCRIPTION = "AmericanCoffee";
    private static final int PRICE = 350;

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public int getPrice() {
        return PRICE;
    }
}
