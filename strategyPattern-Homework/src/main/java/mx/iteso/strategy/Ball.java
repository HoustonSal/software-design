package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.BounceBehavior;
import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.ExploitBehavior;

public abstract class Ball {

    private BounceBehavior bounceBehavior;
    public DeflateBehavior deflateBehavior;
    public ExploitBehavior exploitBehavior;
    public String type;

    public Ball(BounceBehavior bounceBehavior) {

        this.bounceBehavior = bounceBehavior;
    }

    public String roll() {
        return type + " is rolling!";
    }

    public String performBounce() {
        return bounceBehavior.bounce();
    }

    public String performDeflate() {
        return deflateBehavior.deflate();
    }

    public String performInflate() {
        return deflateBehavior.inflate();
    }

    public String performExpoit() {return exploitBehavior.exploit();}
}
