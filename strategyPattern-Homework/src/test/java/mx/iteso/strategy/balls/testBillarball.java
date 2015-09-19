package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by houstonsalgado on 17/09/15.
 */
public class testBillarball {

    @Test
    public void testBillarball(){
        BillarBall billarball = new BillarBall();
        assertEquals("I crashed!! I can't bounce", billarball.performBounce());
        assertEquals("I can't deflate!", billarball.performDeflate());
        assertEquals("I can't inflate!", billarball.performInflate());
        assertEquals("Warning, I can Exploit", billarball.performExpoit());
        assertEquals("Billar ball is rolling!", billarball.roll());

    }

}
