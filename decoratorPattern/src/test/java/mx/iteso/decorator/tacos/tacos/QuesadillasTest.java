package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.Quesadilla;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by houstonsalgado on 18/10/15.
 */
public class QuesadillasTest {
    @Test
    public void testGetDescription(){
        Taco taco = new Quesadilla(Taco.MINI);
        assertEquals("ERROR, orden no valida", taco.getDescription());
        Taco taco1 = new Quesadilla(Taco.REGULAR);
        assertEquals("Quesadilla Regular", taco1.getDescription());
        Taco taco2 = new Quesadilla(Taco.MEGA);
        assertEquals("Quesadilla Mega", taco2.getDescription());
    }

    @Test
    public void testCost(){
        Taco taco = new Quesadilla(Taco.MINI);
        assertEquals(0,taco.cost(),0);
        Taco taco1 = new Quesadilla(Taco.REGULAR);
        assertEquals(10.0, taco1.cost(),0);
        Taco taco2 = new Quesadilla(Taco.MEGA);
        assertEquals(15.0, taco2.cost(),0);

    }

}
