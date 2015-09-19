package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Exploit;
import mx.iteso.strategy.behaviors.impl.NormalBounce;

/**
 * Created by houstonsalgado on 17/09/15.
 */
public class VolleyballBall extends Ball {
    public VolleyballBall() {
        super (new NormalBounce());
        deflateBehavior = new Deflatable();
        exploitBehavior = new Exploit();
        type = "VolleyBall ball";
    }
}
