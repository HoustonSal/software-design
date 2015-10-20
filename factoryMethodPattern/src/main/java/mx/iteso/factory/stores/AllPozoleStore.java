package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.*;

/**
 * Created by houstonsalgado on 19/10/15.
 */
public class AllPozoleStore {
    Pozole pozole;
    public Pozole createPozole(String meat, String brout) {

        if(brout.equals("verde")){
            PozoleStore verdeStore = new PozoleVerdeStore();
            pozole = verdeStore.orderPozole(meat);
        }
        else if(brout.equals("rojo")){
            PozoleStore rojoStore = new PozoleRojoStore();
            pozole = rojoStore.orderPozole(meat);
        }
        else if(brout.equals("blanco")){
            PozoleStore blancoStore = new PozoleBlancoStore();
            pozole = blancoStore.orderPozole(meat);
        }
        else if(brout.equals("menudo")){
            PozoleStore menudoStore = new MenudoStore();
            pozole = menudoStore.orderPozole(meat);
        }
        else if(brout.equals("pozolillo")){
            PozoleStore pozolilloStore = new PozolilloStore();
            pozole = pozolilloStore.orderPozole(meat);
        }

        return pozole;
    }
}
