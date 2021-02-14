package refactor.beverage;

import refactor.Beverage;
import refactor.additions.Milk;

public class CoffeeWithMilk implements Beverage {

    private Coffee coffee;
    private Milk milk;


    public CoffeeWithMilk(Coffee coffee, Milk milk) {
        this.coffee = coffee;
        this.milk = milk;
    }


    @Override
    public double price() {
        return coffee.price() + milk.price();
    }

}
