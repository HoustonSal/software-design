package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class TortillaMaiz extends CondimentsDecorator {
    Taco taco;

    public TortillaMaiz (Taco taco){
        this.taco = taco;
        this.size=taco.size;
    }

    @Override
    public String getDescription() {
        if(taco.getDescription().contains("ERROR, orden no valida"))
            return "ERROR, orden no valida";
        return taco.getDescription() + " en tortilla de maíz";
    }

    @Override
    public double cost() {
        if (taco.getDescription().contains("ERROR, orden no valida"))
            return 0;
        return 0 + taco.cost();
    }
}
