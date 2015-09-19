package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by houstonsalgado on 18/09/15.
 */
public class FlotationCapacityTest {
    @Test
    public void TestFlotation(){
        FlotationCapacity flotationCapacity = new FlotationCapacity();
        assertEquals("I can Float!", flotationCapacity.Flotation());
    }

}
