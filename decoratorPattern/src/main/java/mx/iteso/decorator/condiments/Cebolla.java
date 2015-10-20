package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Cebolla extends CondimentsDecorator{
    Taco taco;

    public Cebolla (Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        if(taco.getDescription().contains("ERROR, orden no valida"))
            return "ERROR, orden no valida";
        else
            return taco.getDescription() + " con cebolla";
    }

    @Override
    public double cost() {
        if(taco.getDescription().contains("ERROR, orden no valida"))
            return 0;
        else
            return 0 + taco.cost();
    }
}

