package mx.iteso.factory.IceCreamTest;

import mx.iteso.factory.IceCream;
import mx.iteso.factory.iceCream.GuavaMilkIceCream;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertEquals;
/**
 * Created by houstonsalgado on 23/10/15.
 */
public class GuavaIceCreamMilkTest {
    private IceCream iceCream;

    @Before
    public void setUp(){
        iceCream = mock(IceCream.class);
    }

    @Test
    public void testGuavaMilk(){
        IceCream iceCream = new GuavaMilkIceCream();
        assertEquals(iceCream.getName(),"Guava Milk IceCream");
        assertEquals(iceCream.flavor,"Guava");
    }
}
