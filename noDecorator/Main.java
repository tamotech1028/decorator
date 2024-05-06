package noDecorator;

public class Main {
    public static void main(String[] args) {

        SimpleCoffee simpleCoffee  = new SimpleCoffee();
        showCoffe(simpleCoffee.getDescription(), simpleCoffee.getPrice());

        SimpleCoffeeWithSyrup simpleCoffeeWithSyrup = new SimpleCoffeeWithSyrup(new SimpleCoffee());
        showCoffe(simpleCoffeeWithSyrup.getDescription(), simpleCoffeeWithSyrup.getPrice());

        SimpleCoffeeWithMilk simpleCoffeeWithMilk = new SimpleCoffeeWithMilk(new SimpleCoffee());
        showCoffe(simpleCoffeeWithMilk.getDescription(), simpleCoffeeWithMilk.getPrice());

        SimpleCoffeeWithSyrupAndMilk simpleCoffeeWithSyrupAndMilk = new SimpleCoffeeWithSyrupAndMilk(new SimpleCoffee());
        showCoffe(simpleCoffeeWithSyrupAndMilk.getDescription(), simpleCoffeeWithSyrupAndMilk.getPrice());

        AmericanCoffee americanCoffee = new AmericanCoffee();
        showCoffe(americanCoffee.getDescription(), americanCoffee.getPrice());

        AmericaCoffeeWithSyrup americaCoffeeWithSyrup = new AmericaCoffeeWithSyrup(new AmericanCoffee());
        showCoffe(americaCoffeeWithSyrup.getDescription(), americaCoffeeWithSyrup.getPrice());

        AmericanCoffeeWithMilk americanCoffeeWithMilk = new AmericanCoffeeWithMilk(new AmericanCoffee());
        showCoffe(americanCoffeeWithMilk.getDescription(), americanCoffeeWithMilk.getPrice());
        
        AmericanCoffeeWithSyrupAndMilk americanCoffeeWithSyrupAndMilk = new AmericanCoffeeWithSyrupAndMilk(new AmericanCoffee());
        showCoffe(americanCoffeeWithSyrupAndMilk.getDescription(), americanCoffeeWithSyrupAndMilk.getPrice());
    }
    
    // コーヒーの詳細を表示するだけの静的メソッド
    public static void showCoffe(String description, int price) {
        System.out.println("コーヒの種類: " + description + ", 価格: " + price);
    }
}
