package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.CantExploit;
import mx.iteso.strategy.behaviors.impl.Exploit;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

public class BaseballBall extends Ball {
    public BaseballBall() {
        super (new IrregularBounce());
        deflateBehavior = new NotDeflatable();
        exploitBehavior = new CantExploit();
        type = "Baseball ball";
    }
}
