package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by houstonsalgado on 19/10/15.
 */
public class Pozolillo extends Pozole{
    public Pozolillo(){
        name = "Pozolillo";
        broth = "Caldo Rojo";
    }
    @Override
    public void serve() {
        System.out.println("Serving Extra hot in special Pozolillo plate..." );
    }
}
