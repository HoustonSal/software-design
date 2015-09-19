package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by houstonsalgado on 17/09/15.
 */
public class testVolleyballBall {

    @Test
    public void testVolleyballBall(){
        VolleyballBall volleyballBall = new VolleyballBall();
        assertEquals("I'm bouncing normally!", volleyballBall.performBounce());
        assertEquals("I'm deflating!", volleyballBall.performDeflate());
        assertEquals("I'm inflating!", volleyballBall.performInflate());
        assertEquals("Warning, I can Exploit", volleyballBall.performExpoit());
        assertEquals("VolleyBall ball is rolling!", volleyballBall.roll());

    }
}
