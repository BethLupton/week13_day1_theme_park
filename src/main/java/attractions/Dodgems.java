package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements IReviewed, ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double priceFor(Visitor visitor) {
        return 0;
    }

    @Override
    public double defaultPrice() {
        return 0;
    }
}
