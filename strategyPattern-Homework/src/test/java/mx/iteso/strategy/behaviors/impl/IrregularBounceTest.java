package mx.iteso.strategy.behaviors.impl;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by houstonsalgado on 18/09/15.
 */
public class IrregularBounceTest {

    @Test
    public void IrregularBounceTest(){
        IrregularBounce irregularBounce = new IrregularBounce();
        assertEquals("I'm bouncing irregularly!", irregularBounce.bounce());
    }
}
