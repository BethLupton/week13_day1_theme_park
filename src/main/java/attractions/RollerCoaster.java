package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, IReviewed, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        boolean isOfAge = visitor.getAge() >= 12;
        boolean isOfHeight = visitor.getHeight() >= 1.4;
        if (isOfAge && isOfHeight){
            return true;
        }
        return false;
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
