package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.Volcanes;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by houstonsalgado on 18/10/15.
 */
public class VolcanesTest {
    @Test
    public void testDescription(){
        Taco taco = new Volcanes();
        assertEquals("Volcan Regular", taco.description);
    }

    @Test
    public void testCost() {
        Taco taco = new Volcanes();
        assertEquals(12.0, taco.cost(),0);
    }
}
