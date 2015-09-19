package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by houstonsalgado on 17/09/15.
 */
public class testTennisBall {

    @Test
    public void testTennisBall(){
        TennisBall tennisBall= new TennisBall();
        assertEquals("I'm bouncing normally!", tennisBall.performBounce());
        assertEquals("I can't deflate!", tennisBall.performDeflate());
        assertEquals("I can't inflate!", tennisBall.performInflate());
        assertEquals("Don't worry, I can't Exploit", tennisBall.performExpoit());
        assertEquals("Tennis ball is rolling!", tennisBall.roll());
    }
}
