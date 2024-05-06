package noDecorator;

// SimpleCoffee+Milk
public class SimpleCoffeeWithMilk {

    protected SimpleCoffee simpleCoffee;

    private static final String DESCRIPTION = "+Milk";
    private static final int PRICE = 80;

    public SimpleCoffeeWithMilk(SimpleCoffee simpleCoffee) {
        this.simpleCoffee = simpleCoffee;
    }

    public String getDescription() {
        return simpleCoffee.getDescription() + DESCRIPTION;
    }

    public int getPrice() {
        return simpleCoffee.getPrice() + PRICE;
    }
}
