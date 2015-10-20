package mx.iteso.factory.StoresTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.Menudo;
import mx.iteso.factory.stores.MenudoStore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Created by houstonsalgado on 19/10/15.
 */
public class MenudoStoreTest {
    Pozole pozole;
    PozoleStore pozoleStore;

    @Test
    public void testMenudoStore(){
        pozoleStore = new MenudoStore();
        pozole = pozoleStore.orderPozole("");
        assertEquals("Menudo", pozole.getName());
    }
}
