package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CebollaTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco cebolla = new Cebolla(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getDescription()).thenReturn("Taco Normal");
        double cost = cebolla.cost();
        assertEquals(8.0, cost,0);
    }

    @Test
    public void testDescription(){
        Taco cebolla = new Cebolla(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = cebolla.getDescription();
        assertEquals("Taco Normal con cebolla", desc);
    }

    @Test
    public void testGetDescriptionWhenError(){
        Taco cebolla = new Cebolla(taco);
        when(taco.getDescription()).thenReturn("ERROR, orden no valida");
        String desc = cebolla.getDescription();
        assertEquals("ERROR, orden no valida", desc);
    }

    @Test
    public void testCostWhenError(){
        Taco cebolla = new Cebolla(taco);
        when(taco.getDescription()).thenReturn("ERROR, orden no valida");
        double cost = cebolla.cost();
        assertEquals(0.0, cost,0);
    }

}
