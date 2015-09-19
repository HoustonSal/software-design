package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by houstonsalgado on 18/09/15.
 */
public class WatertubesTest {
    @Test
    public void TestWatertubes(){
        Watertubes watertubes = new Watertubes();
        assertEquals("I'm a Water tubes", watertubes.display());
        assertEquals("I can't inflate!", watertubes.inflating());
        assertEquals("I can't deflate!", watertubes.deflating());
        assertEquals("I can Float!", watertubes.floating());
    }
}
