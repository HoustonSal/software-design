package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by houstonsalgado on 18/10/15.
 */
public class PastorTest {
    private Taco taco;

    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testGetDescription()throws Exception{
        Taco pastor = new Pastor(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = pastor.getDescription();
        assertEquals("Taco Normal de pastor", desc);
    }


    @Test
    public void testGetDescriptionWhenError(){
        Taco pastor = new Pastor(taco);
        when(taco.getDescription()).thenReturn("ERROR, orden no valida");
        String desc = pastor.getDescription();
        assertEquals("ERROR, orden no valida", desc);
    }

    @Test
    public void testCost()throws Exception{
        Taco pastor = new Pastor(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        when(taco.cost()).thenReturn(8.0);
        double cost = pastor.cost();
        assertEquals(13.0, cost,0);
    }

    @Test
    public void testCostWhenError(){
        Taco pastor = new Pastor(taco);
        when(taco.getDescription()).thenReturn("ERROR, orden no valida");
        when(taco.cost()).thenReturn(8.0);
        double cost = pastor.cost();
        assertEquals(0.0, cost,0);
    }
}
