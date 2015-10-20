package mx.iteso.factory.StoresTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.stores.MenudoStore;
import mx.iteso.factory.stores.PozolilloStore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by houstonsalgado on 19/10/15.
 */
public class PozolilloStoreTest {
    Pozole pozole;
    PozoleStore pozoleStore;

    @Test
    public void testMenudoStore(){
        pozoleStore = new PozolilloStore();
        pozole = pozoleStore.orderPozole("");
        assertEquals("Pozolillo", pozole.getName());
    }
}
