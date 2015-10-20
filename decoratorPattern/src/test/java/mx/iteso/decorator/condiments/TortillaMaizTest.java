package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by houstonsalgado on 18/10/15.
 */
public class TortillaMaizTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco tortilla = new TortillaMaiz(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getDescription()).thenReturn("Taco Normal");
        double cost = tortilla.cost();
        assertEquals(8.0, cost,0);
    }

    @Test
    public void testDescription(){
        Taco tortilla = new TortillaMaiz(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = tortilla.getDescription();
        assertEquals("Taco Normal en tortilla de maíz", desc);
    }

    @Test
    public void testGetDescriptionWhenError(){
        Taco tortilla = new TortillaMaiz(taco);
        when(taco.getDescription()).thenReturn("ERROR, orden no valida");
        String desc = tortilla.getDescription();
        assertEquals("ERROR, orden no valida", desc);
    }

    @Test
    public void testCostWhenError(){
        Taco tortilla= new TortillaMaiz(taco);
        when(taco.getDescription()).thenReturn("ERROR, orden no valida");
        double cost = tortilla.cost();
        assertEquals(0.0, cost,0);
    }
}
