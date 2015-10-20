package mx.iteso.factory.pozoles.Toppings;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.ToppingsDecorator;

/**
 * Created by houstonsalgado on 19/10/15.
 */
public class Rabanos extends ToppingsDecorator{
    Pozole pozole;
    public Rabanos(Pozole pozole){
        this.pozole = pozole;
    }

    @Override
    public String getName() {
        return pozole.getName() + " con Rabanos";
    }
}
