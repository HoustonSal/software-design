package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by houstonsalgado on 18/09/15.
 */
public class SwimseatTest {
    @Test
    public void TestSwimseat(){
        SwimSeat swimSeat = new SwimSeat();
        assertEquals("I'm a Swim seat", swimSeat.display());
        assertEquals("I'm inflating!", swimSeat.inflating());
        assertEquals("I'm deflating!", swimSeat.deflating());
        assertEquals("I can Float!", swimSeat.floating());
    }
}
