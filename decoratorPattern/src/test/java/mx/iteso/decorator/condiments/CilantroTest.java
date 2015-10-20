package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by houstonsalgado on 17/10/15.
 */
public class CilantroTest {
    private Taco taco;

    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco cilantro = new Cilantro(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getDescription()).thenReturn("Taco Normal");
        double cost = cilantro.cost();
        assertEquals(8.0, cost,0);
    }

    @Test
    public void testGetDescription(){
        Taco cilantro = new Cilantro(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = cilantro.getDescription();
        assertEquals("Taco Normal con cilantro", desc);
    }

    @Test
    public void testCostError(){
        Taco cilantro = new Cilantro(taco);
        when(taco.getDescription()).thenReturn("ERROR, orden no valida");
        double cosr = cilantro.cost();
        assertEquals(0.0, cosr, 0);
    }

    @Test
    public void testGetDescriptionError(){
        Taco cilantro = new Cilantro(taco);
        when(taco.getDescription()).thenReturn("ERROR, orden no valida");
        String desc = cilantro.getDescription();
        assertEquals("ERROR, orden no valida", desc);
    }

}
