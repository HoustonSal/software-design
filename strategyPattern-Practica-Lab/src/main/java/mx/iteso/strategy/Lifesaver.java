package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FlotationBehavior;

public class Lifesaver {

    public DeflateBehavior deflateBehavior;
    public FlotationBehavior flotationBehavior;

    public String type;

    public String inflating() {
        return deflateBehavior.inflate();
    }
    public String deflating() {
        return deflateBehavior.deflate();
    }
    public String floating() {
        return flotationBehavior.Flotation();
    }
    public String display() {
        return "I'm a " + type;
    }
}
