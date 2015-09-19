package mx.iteso.strategy.balls;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by houstonsalgado on 17/09/15.
 */
public class testRugbyBall {

    @Test
    public void testRugbyBall(){
        RugbyBall rugbyBall = new RugbyBall();
        assertEquals("I'm bouncing irregularly!", rugbyBall.performBounce());
        assertEquals("I'm deflating!", rugbyBall.performDeflate());
        assertEquals("I'm inflating!", rugbyBall.performInflate());
        assertEquals("Don't worry, I can't Exploit", rugbyBall.performExpoit());
        assertEquals("Rugby ball is rolling!", rugbyBall.roll());
    }
}
