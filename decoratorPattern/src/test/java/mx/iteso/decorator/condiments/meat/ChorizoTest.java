package mx.iteso.decorator.condiments.meat;

import com.sun.corba.se.impl.orb.ParserTable;
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
public class ChorizoTest extends TestCase{
    private Taco taco;

    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testGetDescription()throws Exception{
        Taco chorizo = new Chorizo(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = chorizo.getDescription();
        assertEquals("Taco Normal de chorizo", desc);
    }


    @Test
    public void testGetDescriptionWhenError(){
        Taco chorizo = new Chorizo(taco);
        when(taco.getDescription()).thenReturn("ERROR, orden no valida");
        String desc = chorizo.getDescription();
        assertEquals("ERROR, orden no valida", desc);
    }

    @Test
    public void testCost()throws Exception{
        Taco chorizo = new Chorizo(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        when(taco.cost()).thenReturn(8.0);
        double cost = chorizo.cost();
        assertEquals(13.0, cost,0);
    }

    @Test
    public void testCostWhenError(){
        Taco chorizo = new Chorizo(taco);
        when(taco.getDescription()).thenReturn("ERROR, orden no valida");
        when(taco.cost()).thenReturn(8.0);
        double cost = chorizo.cost();
        assertEquals(0.0, cost,0);
    }
}
