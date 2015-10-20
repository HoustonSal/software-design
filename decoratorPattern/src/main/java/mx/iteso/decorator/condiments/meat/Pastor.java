package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Pastor extends CondimentsDecorator {
    Taco taco;

    public Pastor (Taco taco){
        this.taco = taco;
        this.size=taco.size;
    }

    @Override
    public String getDescription() {
        if(taco.getDescription().contains("ERROR, orden no valida"))
            return "ERROR, orden no valida";
        return taco.getDescription() + " de pastor";
    }

    @Override
    public double cost() {
        if (taco.getDescription().contains("ERROR, orden no valida"))
            return 0;
        if (taco.getDescription().contains(MINI))
            return taco.cost() + 0.0;
        if (taco.getDescription().contains(REGULAR))
            return taco.cost() + 3.0;
        return taco.cost() + 5.0;
    }
}
