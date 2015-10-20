package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.Quesadilla;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TacoNormalTest {
    @Test
    public void testGetDescription(){
        Taco taco = new TacoNormal(Taco.MINI);
        assertEquals("Taco normal Mini", taco.getDescription());
        Taco taco1 = new TacoNormal(Taco.REGULAR);
        assertEquals("Taco normal Regular", taco1.getDescription());
        Taco taco2 = new TacoNormal(Taco.MEGA);
        assertEquals("Taco normal Mega", taco2.getDescription());
    }

    @Test
    public void testCost() {
        Taco taco = new TacoNormal("Mini");
        assertEquals(7.0, taco.cost(),0);
        Taco taco1 = new TacoNormal("Regular");
        assertEquals(8.0, taco1.cost(),0);
        Taco taco2 = new TacoNormal("Mega");
        assertEquals(12.0, taco2.cost(),0);
    }
}
