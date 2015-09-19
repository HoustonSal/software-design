package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

public class BaseballBall extends Ball {
    public BaseballBall() {
        bounceBehavior = new NormalBounce();
        deflateBehavior = new NotDeflatable();
        type = "Baseball ball";
    }
}
