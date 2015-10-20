package mx.iteso.decorator.condiments;

import junit.framework.TestCase;
import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;
import sun.security.pkcs11.P11Util;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by houstonsalgado on 17/10/15.
 */
public class QuesoTest extends TestCase {
    private Taco taco;

    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }


    @Test
    public void testGetDescription() throws Exception{
        Taco queso = new Queso(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = queso.getDescription();
        assertEquals("Taco Normal con queso", desc);
    }

    @Test
    public void testCost() throws Exception {
        Taco queso = new Queso(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getDescription()).thenReturn("Taco Normal");
        double cost =  queso.cost();
        assertEquals(14.0, cost,0);
    }


    @Test
    public void testCostError(){
        Taco queso = new Queso(taco);
        when(taco.getDescription()).thenReturn("ERROR, orden no valida");
        double cost = queso.cost();
        assertEquals(0.0, cost, 0);
    }

    @Test
    public void testGetDescriptionError(){
        Taco queso = new Queso(taco);
        when(taco.getDescription()).thenReturn("ERROR, orden no valida");
        String desc = queso.getDescription();
        assertEquals("ERROR, orden no valida", desc);
    }
}
