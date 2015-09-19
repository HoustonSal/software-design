package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.impl.*;

/**
 * Created by houstonsalgado on 17/09/15.
 */
public class TennisBall extends Ball{
    public TennisBall() {
        super (new NormalBounce());
        deflateBehavior = new NotDeflatable();
        exploitBehavior = new CantExploit();
        type = "Tennis ball";
    }
}
