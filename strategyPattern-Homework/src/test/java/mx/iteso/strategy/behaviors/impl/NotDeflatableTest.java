package mx.iteso.strategy.behaviors.impl;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by houstonsalgado on 18/09/15.
 */
public class NotDeflatableTest {

    @Test
    public void NotDeflatableDefalteTest(){
        NotDeflatable notDeflatable = new NotDeflatable();
        assertEquals("I can't deflate!", notDeflatable.deflate());
    }

    @Test
    public void NotDeflatableInflateTest(){
        NotDeflatable notDeflatable = new NotDeflatable();
        assertEquals("I can't inflate!", notDeflatable.inflate());
    }
}
