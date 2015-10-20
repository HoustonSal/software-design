package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.Pozolillo;

/**
 * Created by houstonsalgado on 19/10/15.
 */
public class PozolilloStore extends PozoleStore{
    @Override
    protected Pozole createPozole(String meat) {
        Pozole pozolillo = new Pozolillo();
        return pozolillo;
    }
}
