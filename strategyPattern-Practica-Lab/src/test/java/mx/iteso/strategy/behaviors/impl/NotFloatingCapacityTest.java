package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by houstonsalgado on 18/09/15.
 */
public class NotFloatingCapacityTest {
    @Test
    public void TestNotFloating(){
        NotFloatingCapacity notFloatingCapacity = new NotFloatingCapacity();
        assertEquals("I can't Floating!", notFloatingCapacity.Flotation());
    }
}
