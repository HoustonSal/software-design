package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by houstonsalgado on 18/09/15.
 */
public class SwimBeltsTest {
    @Test
    public void TestSwimBelts(){
        SwimBelts swimBelts = new SwimBelts();
        assertEquals("I'm a Swim Belts", swimBelts.display());
        assertEquals("I can't inflate!", swimBelts.inflating());
        assertEquals("I can't deflate!", swimBelts.deflating());
        assertEquals("I can Float!", swimBelts.floating());

    }
}
