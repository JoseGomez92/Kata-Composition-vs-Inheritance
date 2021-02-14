package refactor.beverage;

import refactor.Beverage;
import refactor.additions.Milk;

public class TeaWithMilk implements Beverage {

    private Tea tea;
    private Milk milk;


    public TeaWithMilk(Tea tea, Milk milk) {
        this.tea = tea;
        this.milk = milk;
    }


    @Override
    public double price() {
        return tea.price() + milk.price();
    }

}
