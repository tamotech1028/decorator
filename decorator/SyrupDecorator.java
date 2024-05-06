// シロップ追加用のDecorator
public class SyrupDecorator extends CoffeeDecorator {

    private static final String DESCRIPTION = "+Syrup";
    private static final int PRICE = 50;

    public SyrupDecorator(Coffee decoratedCoffee) {
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
