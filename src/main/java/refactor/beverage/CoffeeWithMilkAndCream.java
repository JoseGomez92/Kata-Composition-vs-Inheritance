package refactor.beverage;

import refactor.Beverage;
import refactor.additions.Cream;
import refactor.additions.Milk;

public class CoffeeWithMilkAndCream implements Beverage {

    private Coffee coffee;
    private Milk milk;
    private Cream cream;


    public CoffeeWithMilkAndCream(Coffee coffee, Milk milk, Cream cream) {
        this.coffee = coffee;
        this.milk = milk;
        this.cream = cream;
    }


    @Override
    public double price() {
        return coffee.price() + milk.price() + cream.price();
    }

}
