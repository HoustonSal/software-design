package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Crash;
import mx.iteso.strategy.behaviors.impl.Exploit;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by houstonsalgado on 17/09/15.
 */
public class BowlingBall extends Ball{
    public BowlingBall() {
        super(new Crash());
        deflateBehavior = new NotDeflatable();
        exploitBehavior = new Exploit();
        type = "Bowling ball";
    }
}