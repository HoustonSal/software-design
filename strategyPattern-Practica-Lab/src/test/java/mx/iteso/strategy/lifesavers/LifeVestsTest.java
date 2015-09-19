package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by houstonsalgado on 18/09/15.
 */
public class LifeVestsTest {
    @Test
    public void TestLifeVests(){
        LifeVests lifeVests = new LifeVests();
        assertEquals("I'm a LifeVests", lifeVests.display());
        assertEquals("I can't inflate!", lifeVests.inflating());
        assertEquals("I can't deflate!", lifeVests.deflating());
        assertEquals("I can Float!", lifeVests.floating());
    }
}
