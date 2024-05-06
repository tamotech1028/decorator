// ミルク追加用のDecorator
public class MilkDecorator extends CoffeeDecorator {

    private static final String DESCRIPTION = "+Milk";
    private static final int PRICE = 80;

    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + DESCRIPTION;
    }

    @Override
    public int getPrice() {
        return super.getPrice() + PRICE;
    }
}
