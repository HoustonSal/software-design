package mx.iteso.factory.StoresTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.*;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.stores.PozoleVerdeStore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by houstonsalgado on 19/10/15.
 */
public class PozoleVerdeStoreTest {
    Pozole pozole;
    Pozole pozole1;
    PozoleStore pozoleStore;


    @Before
    public void setUp(){
        pozoleStore = new PozoleVerdeStore();
    }

    @Test
    public void testWithCachete(){
        pozole = new PozoleVerdeCachete();
        pozole1 = pozoleStore.orderPozole("cachete");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithCabeza(){
        pozole = new PozoleVerdeCabeza();
        pozole1 = pozoleStore.orderPozole("cabeza");
        assertEquals(pozole.getName(), pozole1.getName());
    }
    @Test
    public void testWithPierna(){
        pozole = new PozoleVerdePierna();
        pozole1 = pozoleStore.orderPozole("pierna");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithOreja(){
        pozole = new PozoleVerdeOreja();
        pozole1 = pozoleStore.orderPozole("oreja");
        assertEquals(pozole.getName(), pozole1.getName());
    }
    @Test
    public void testWithPollo(){
        pozole = new PozoleVerdePollo();
        pozole1 = pozoleStore.orderPozole("pollo");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithTrompa(){
        pozole = new PozoleVerdeTrompa();
        pozole1 = pozoleStore.orderPozole("trompa");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test(expected = NullPointerException.class)
    public void testWithException(){
        pozole = new PozoleVerdeTrompa();
        pozole1 = pozoleStore.orderPozole("");
        assertEquals(pozole.getName(), pozole1.getName());
    }
}
