public class Main {
    public static void main(String[] args) {

        Coffee simpleCofee = new SimpleCofee();
        showCoffe(simpleCofee);

        Coffee simpleCoffeeWithSyrup = new SyrupDecorator(new SimpleCofee());
        showCoffe(simpleCoffeeWithSyrup);

        Coffee simpleCoffeeWithMilk = new MilkDecorator(new SimpleCofee());
        showCoffe(simpleCoffeeWithMilk);

        Coffee simpleCoffeeWithSyrupAndMilk = new MilkDecorator(new SyrupDecorator(new SimpleCofee()));
        showCoffe(simpleCoffeeWithSyrupAndMilk);

        Coffee americanCofee = new AmericanCoffee();
        showCoffe(americanCofee);

        Coffee americanCoffeeWithSyrup = new SyrupDecorator(new AmericanCoffee());
        showCoffe(americanCoffeeWithSyrup);

        Coffee americanCoffeeWithMilk = new MilkDecorator(new AmericanCoffee());
        showCoffe(americanCoffeeWithMilk);

        Coffee americanCoffeeWithSyrupAndMilk = new MilkDecorator(new SyrupDecorator(new AmericanCoffee()));
        showCoffe(americanCoffeeWithSyrupAndMilk);
    }

    // コーヒーの詳細を表示するだけの静的メソッド
    public static void showCoffe(Coffee coffee) {
        System.out.println("コーヒの種類: " + coffee.getDescription() + ", 価格: " + coffee.getPrice());
    }
}