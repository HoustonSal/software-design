package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by houstonsalgado on 17/09/15.
 */
public class testBowlingBall {

    @Test
    public  void testBowlingBall(){
        BowlingBall bowlingBall = new BowlingBall();
        assertEquals("I crashed!! I can't bounce", bowlingBall.performBounce());
        assertEquals("I can't deflate!", bowlingBall.performDeflate());
        assertEquals("I can't inflate!", bowlingBall.performInflate());
        assertEquals("Warning, I can Exploit", bowlingBall.performExpoit());
        assertEquals("Bowling ball is rolling!", bowlingBall.roll());
    }
}
