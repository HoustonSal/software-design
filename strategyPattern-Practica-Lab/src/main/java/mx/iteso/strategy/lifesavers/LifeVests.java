package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.FlotationCapacity;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by houstonsalgado on 18/09/15.
 */
public class LifeVests extends Lifesaver{
    public LifeVests(){
        type = "LifeVests";
        deflateBehavior = new NotDeflatable();
        flotationBehavior = new FlotationCapacity();

    }
}
