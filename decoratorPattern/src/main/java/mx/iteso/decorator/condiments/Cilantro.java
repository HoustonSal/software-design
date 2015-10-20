package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Cilantro extends CondimentsDecorator {
    Taco taco;

    public Cilantro (Taco taco){
        this.taco = taco;
        this.size=taco.size;
    }

    @Override
    public String getDescription() {
        if(taco.getDescription().contains("ERROR, orden no valida"))
            return "ERROR, orden no valida";
        return taco.getDescription() + " con cilantro";
    }

    @Override
    public double cost() {
        if (taco.getDescription().contains("ERROR, orden no valida"))
            return 0;
        return 0 + taco.cost();
    }
}
