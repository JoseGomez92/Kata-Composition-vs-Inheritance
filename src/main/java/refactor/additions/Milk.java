package refactor.additions;

import refactor.Beverage;

public class Milk implements Beverage {

    @Override
    public double price() {
        return 0.10;
    }

}
