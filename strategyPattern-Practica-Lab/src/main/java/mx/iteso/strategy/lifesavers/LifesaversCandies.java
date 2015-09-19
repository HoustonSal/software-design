package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.NotFloatingCapacity;

/**
 * Created by houstonsalgado on 18/09/15.
 */
public class LifesaversCandies extends Lifesaver{

    public LifesaversCandies(){
        type = "Lifessaver Candies";
        deflateBehavior = new NotDeflatable();
        flotationBehavior = new NotFloatingCapacity();
    }
}
