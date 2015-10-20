package mx.iteso.decorator.condiments.seaFood;

import junit.framework.TestCase;
import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by houstonsalgado on 18/10/15.
 */
public class ShrimpTest extends TestCase{
    private Taco taco;

    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testGetDescription()throws Exception{
        Taco camaron = new Shrimp(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = camaron.getDescription();
        assertEquals("Taco Normal de Camarón", desc);
    }


    @Test
    public void testGetDescriptionWhenError(){
        Taco camaron = new Shrimp(taco);
        when(taco.getDescription()).thenReturn("ERROR, orden no valida");
        String desc = camaron.getDescription();
        assertEquals("ERROR, orden no valida", desc);
    }

    @Test
    public void testCost()throws Exception{
        Taco camaron = new Shrimp(taco);
        when(taco.getDescription()).thenReturn("Taco Normal de Camarón");
        when(taco.cost()).thenReturn(8.0);
        double cost = camaron.cost();
        assertEquals(18.0, cost,0);
    }

    @Test
    public void testCostWhenError(){
        Taco camaron = new Shrimp(taco);
        when(taco.getDescription()).thenReturn("ERROR, orden no valida");
        when(taco.cost()).thenReturn(8.0);
        double cost = camaron.cost();
        assertEquals(0.0, cost,0);
    }
}
