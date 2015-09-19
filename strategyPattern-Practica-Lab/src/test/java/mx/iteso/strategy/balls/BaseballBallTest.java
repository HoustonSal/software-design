package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BaseballBallTest {
    @Test
    public void testBaseballBallTest() {
        BaseballBall baseballBall = new BaseballBall();
        assertEquals("I'm bouncing normally!", baseballBall.performBounce());
        assertEquals("I can't deflate!", baseballBall.performDeflate());
        assertEquals("I can't inflate!", baseballBall.performInflate());
        assertEquals("Baseball ball is rolling!", baseballBall.roll());
    }
}
