package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.CantExploit;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.Exploit;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;

public class AmericanFootballBall extends Ball {
    public AmericanFootballBall() {
        super( new IrregularBounce());
        deflateBehavior = new Deflatable();
        exploitBehavior = new CantExploit();
        type = "American Football ball";
    }
}
