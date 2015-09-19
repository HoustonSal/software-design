package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.FlotationCapacity;

public class SwimSeat extends Lifesaver {
    public SwimSeat() {
        type = "Swim seat";
        deflateBehavior = new Deflatable();
        flotationBehavior = new FlotationCapacity();

    }
}
