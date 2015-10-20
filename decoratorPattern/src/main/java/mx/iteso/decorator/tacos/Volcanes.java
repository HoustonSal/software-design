package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

/**
 * Created by houstonsalgado on 01/10/15.
 */
public class Volcanes extends Taco{
    public  Volcanes(){description = "Volcan " + size;}

    @Override
    public double cost(){
        return 12.00;
    }
}
