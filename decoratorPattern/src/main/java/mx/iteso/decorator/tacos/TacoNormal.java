package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class TacoNormal extends Taco {
    public TacoNormal(String size){
        description = "Taco normal " + size;
        this.size = size;
    }

    @Override
    public double cost() {
        if(getSize().equals(MINI))
        return 7.00;
        else if(getSize().equals(REGULAR)) return 8.00;
        else return 12.00;
    }
}
