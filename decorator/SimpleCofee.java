// SimpleCofee
public class SimpleCofee implements Coffee {

    private static final String DESCRIPTION = "SimpleCoffee";
    private static final int PRICE = 400;

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public int getPrice() {
        return PRICE;
    }
}
