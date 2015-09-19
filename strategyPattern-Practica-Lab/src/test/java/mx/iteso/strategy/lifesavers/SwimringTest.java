package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by houstonsalgado on 18/09/15.
 */
public class SwimringTest {
    @Test
    public void TestSwimring(){
        SwimRing swimRing = new SwimRing();
        assertEquals("I'm a Swim ring", swimRing.display());
        assertEquals("I'm inflating!", swimRing.inflating());
        assertEquals("I'm deflating!", swimRing.deflating());
        assertEquals("I can Float!", swimRing.floating());
    }
}
