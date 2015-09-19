package mx.iteso.strategy.behaviors.impl;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by houstonsalgado on 18/09/15.
 */
public class NormalBounceTest {

    @Test
    public void NormalBounceTest(){
        NormalBounce normalBounce = new NormalBounce();
        assertEquals("I'm bouncing normally!", normalBounce.bounce());
    }
}
