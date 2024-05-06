package noDecorator;

// SimpleCoffee+Syrup
public class SimpleCoffeeWithSyrup {

    protected SimpleCoffee simpleCoffee;

    private static final String DESCRIPTION = "+Syrup";
    private static final int PRICE = 50;

    public SimpleCoffeeWithSyrup(SimpleCoffee simpleCoffee) {
        this.simpleCoffee = simpleCoffee;
    }

    public String getDescription() {
        return simpleCoffee.getDescription() + DESCRIPTION;
    }

    public int getPrice() {
        return simpleCoffee.getPrice() + PRICE;
    }
}
