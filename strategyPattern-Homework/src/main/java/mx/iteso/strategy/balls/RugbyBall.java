package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.CantExploit;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;

/**
 * Created by houstonsalgado on 17/09/15.
 */
public class RugbyBall extends Ball {
    public RugbyBall() {
        super (new IrregularBounce());
        deflateBehavior=new Deflatable();
        exploitBehavior = new CantExploit();
        type="Rugby ball";
    }
}

