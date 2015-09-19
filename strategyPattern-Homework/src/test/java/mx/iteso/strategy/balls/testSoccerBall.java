package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by houstonsalgado on 17/09/15.
 */
public class testSoccerBall {

    @Test
    public void testSoccerBall(){
        SoccerBall soccerBall = new SoccerBall();
        assertEquals("I'm bouncing normally!", soccerBall.performBounce());
        assertEquals("I'm deflating!", soccerBall.performDeflate());
        assertEquals("I'm inflating!", soccerBall.performInflate());
        assertEquals("Warning, I can Exploit", soccerBall.performExpoit());
        assertEquals("Soccer ball is rolling!", soccerBall.roll());
    }
}
