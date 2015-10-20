package mx.iteso.decorator.condiments.seaFood;

import junit.framework.TestCase;
import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by houstonsalgado on 18/10/15.
 */
public class FishTest extends TestCase{
    private Taco taco;

    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testGetDescription()throws Exception{
        Taco fish = new Fish(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = fish.getDescription();
        assertEquals("Taco Normal de pescado", desc);
    }


    @Test
    public void testGetDescriptionWhenError(){
        Taco fish = new Fish(taco);
        when(taco.getDescription()).thenReturn("ERROR, orden no valida");
        String desc = fish.getDescription();
        assertEquals("ERROR, orden no valida", desc);
    }

    @Test
    public void testCost()throws Exception{
        Taco fish = new Fish(taco);
        when(taco.getDescription()).thenReturn("Taco Normal de pescado");
        when(taco.cost()).thenReturn(8.0);
        double cost = fish.cost();
        assertEquals(16.0, cost,0);
    }

    @Test
    public void testCostWhenError(){
        Taco fish = new Fish(taco);
        when(taco.getDescription()).thenReturn("ERROR, orden no valida");
        when(taco.cost()).thenReturn(8.0);
        double cost = fish.cost();
        assertEquals(0.0, cost,0);
    }
}
