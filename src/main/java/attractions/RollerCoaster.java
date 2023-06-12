package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, IReviewed {

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
}
