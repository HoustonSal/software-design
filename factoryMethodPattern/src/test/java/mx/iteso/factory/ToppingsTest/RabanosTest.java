package mx.iteso.factory.ToppingsTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.Toppings.Cebolla;
import mx.iteso.factory.pozoles.Toppings.Rabanos;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by houstonsalgado on 19/10/15.
 */
public class RabanosTest {
    private Pozole pozole;

    @Before
    public void SetUp() { pozole = mock((Pozole.class)); }

    @Test
    public void testDescription(){
        Pozole cebolla = new Rabanos(pozole);
        when(pozole.getName()).thenReturn("Pozole");
        String desc = cebolla.getName();
        assertEquals("Pozole con Rabanos", desc);
    }
}
