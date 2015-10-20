package mx.iteso.factory.StoresTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.*;
import mx.iteso.factory.stores.PozoleBlancoStore;
import mx.iteso.factory.stores.PozoleRojoStore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by houstonsalgado on 19/10/15.
 */
public class PozoleBlancoStoreTest {
    Pozole pozole;
    Pozole pozole1;
    PozoleStore pozoleStore;


    @Before
    public void setUp(){
        pozoleStore = new PozoleBlancoStore();
    }

    @Test
    public void testWithCachete(){
        pozole = new PozoleBlancoCachete();
        pozole1 = pozoleStore.orderPozole("cachete");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithCabeza(){
        pozole = new PozoleBlancoCabeza();
        pozole1 = pozoleStore.orderPozole("cabeza");
        assertEquals(pozole.getName(), pozole1.getName());
    }
    @Test
    public void testWithPierna(){
        pozole = new PozoleBlancoPierna();
        pozole1 = pozoleStore.orderPozole("pierna");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithOreja(){
        pozole = new PozoleBlancoOreja();
        pozole1 = pozoleStore.orderPozole("oreja");
        assertEquals(pozole.getName(), pozole1.getName());
    }
    @Test
    public void testWithPollo(){
        pozole = new PozoleBlancoPollo();
        pozole1 = pozoleStore.orderPozole("pollo");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithTrompa(){
        pozole = new PozoleBlancoTrompa();
        pozole1 = pozoleStore.orderPozole("trompa");
        assertEquals(pozole.getName(), pozole1.getName());
    }
}
