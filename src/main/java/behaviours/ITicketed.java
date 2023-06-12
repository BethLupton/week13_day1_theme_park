package behaviours;

import people.Visitor;

public interface ITicketed {

    public double priceFor(Visitor visitor);
    public double defaultPrice();
}
