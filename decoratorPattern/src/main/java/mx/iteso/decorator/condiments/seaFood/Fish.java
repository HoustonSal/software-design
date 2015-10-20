package mx.iteso.decorator.condiments.seaFood;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

/**
 * Created by houstonsalgado on 16/10/15.
 */
public class Fish extends CondimentsDecorator{
    Taco taco;


    public Fish(Taco taco){
        this.taco = taco;
        this.size = taco.size;
    }

    @Override
    public String getDescription() {
        if(taco.getDescription().contains("Mini")||taco.getDescription().contains("Quesadilla")||taco.getDescription().contains("Volcanes"))
            return "ERROR, orden no valida";
        if(taco.getDescription().contains("ERROR, orden no valida"))
            return "ERROR, orden no valida";
        else
            return taco.getDescription() + " de pescado";
    }

    @Override
    public double cost()  {
        if(taco.getDescription().contains("ERROR, orden no valida") || taco.getDescription().contains("Mini")|| taco.getDescription().contains("Quesadilla")||taco.getDescription().contains("Volcanes"))
            return 0;
        if(taco.getDescription().contains(REGULAR))
            return 5.0 + taco.cost();
        return 8.0 + taco.cost();
    }
}
