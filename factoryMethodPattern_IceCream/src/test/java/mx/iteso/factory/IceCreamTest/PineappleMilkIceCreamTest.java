package mx.iteso.factory.IceCreamTest;

import mx.iteso.factory.IceCream;
import mx.iteso.factory.iceCream.MangoWaterIceCream;
import mx.iteso.factory.iceCream.PineappleMilkIceCream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by houstonsalgado on 23/10/15.
 */
public class PineappleMilkIceCreamTest {
    private IceCream iceCream;

    @Before
    public void setUp(){
        iceCream = mock(IceCream.class);
    }

    @Test
    public void testPineappleTest() {
        IceCream iceCream = new PineappleMilkIceCream();
        assertEquals(iceCream.getName(), "Pineapple Milk IceCream");
        assertEquals(iceCream.flavor, "Pineapple");
    }
}
