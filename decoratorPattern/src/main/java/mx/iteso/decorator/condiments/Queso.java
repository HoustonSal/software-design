package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Queso extends CondimentsDecorator {
    Taco taco;

    public Queso(Taco taco){
        this.taco = taco;
        this.size=taco.size;
    }

    @Override
    public String getDescription() {
        if(taco.getDescription().contains("ERROR, orden no valida"))
            return "ERROR, orden no valida";
        return taco.getDescription() + " con queso";
    }

    @Override
    public double cost() {
        if (taco.getDescription().contains("ERROR, orden no valida"))
            return 0;
            if (taco.getDescription().contains(MINI))
                return taco.cost() + 2.0;
            if (taco.getDescription().contains(REGULAR))
                return taco.cost() + 4.0;
            return taco.cost() + 6.0;

    }
}
