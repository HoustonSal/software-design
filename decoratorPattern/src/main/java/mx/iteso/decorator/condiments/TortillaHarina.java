package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class TortillaHarina extends CondimentsDecorator {
    Taco taco;

    public TortillaHarina(Taco taco){
        this.taco = taco;
        this.size=taco.size;
    }

    @Override
    public String getDescription() {
        if(taco.getDescription().contains("ERROR, orden no valida"))
            return "ERROR, orden no valida";
        return taco.getDescription() + " en tortilla de harina";
    }

    @Override
    public double cost(){
        if (taco.getDescription().contains("ERROR, orden no valida"))
            return 0;
        return 4 + taco.cost();
    }
}
