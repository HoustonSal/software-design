package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by houstonsalgado on 18/09/15.
 */
public class LifessaverCandiesTest {
    @Test
    public void TestLifessaverCandies(){
        LifesaversCandies lifesaversCandies = new LifesaversCandies();
        assertEquals("I'm a Lifessaver Candies", lifesaversCandies.display());
        assertEquals("I can't inflate!", lifesaversCandies.inflating());
        assertEquals("I can't deflate!", lifesaversCandies.deflating());
        assertEquals("I can't Floating!", lifesaversCandies.floating());
    }
}
