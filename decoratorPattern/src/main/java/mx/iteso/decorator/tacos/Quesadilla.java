package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class Quesadilla extends Taco{
    public Quesadilla(String size){
        description = "Quesadilla " + size;
        this.size = size;
    }

    @Override
    public double cost() {
        if(getSize().equals(MINI))
            return 0;
        if(getSize().equals(REGULAR))
            return 10.00;
         return 15.00;
    }
}
