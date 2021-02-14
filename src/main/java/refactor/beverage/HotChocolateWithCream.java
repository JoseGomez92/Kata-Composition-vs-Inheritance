package refactor.beverage;

import refactor.Beverage;
import refactor.additions.Cream;

public class HotChocolateWithCream implements Beverage {

    private HotChocolate hotChocolate;
    private Cream cream;


    public HotChocolateWithCream(HotChocolate hotChocolate, Cream cream) {
        this.hotChocolate = hotChocolate;
        this.cream = cream;
    }

    @Override
    public double price() {
        return hotChocolate.price() + cream.price();
    }
}
