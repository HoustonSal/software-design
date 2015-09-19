package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by houstonsalgado on 18/09/15.
 */
public class FoamFloatsTest {
    @Test
    public void TestFoamFloats(){
        FoamFloats foamFloats = new FoamFloats();
        assertEquals("I'm a Foam Floats", foamFloats.display());
        assertEquals("I can't inflate!", foamFloats.inflating());
        assertEquals("I can't deflate!", foamFloats.deflating());
        assertEquals("I can Float!", foamFloats.floating());
    }
}
