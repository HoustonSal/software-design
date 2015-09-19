package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.FlotationCapacity;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by houstonsalgado on 18/09/15.
 */
public class SwimBelts extends Lifesaver {
    public SwimBelts(){
        type = "Swim Belts";
        deflateBehavior = new NotDeflatable();
        flotationBehavior = new FlotationCapacity();

    }
}
