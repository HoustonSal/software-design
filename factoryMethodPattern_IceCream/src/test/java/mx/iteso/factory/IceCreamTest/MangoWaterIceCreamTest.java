package mx.iteso.factory.IceCreamTest;

import mx.iteso.factory.IceCream;
import mx.iteso.factory.iceCream.MangoMilkIceCream;
import mx.iteso.factory.iceCream.MangoWaterIceCream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by houstonsalgado on 23/10/15.
 */
public class MangoWaterIceCreamTest {
    private IceCream iceCream;

    @Before
    public void setUp(){
        iceCream = mock(IceCream.class);
    }

    @Test
    public void testMangoWater() {
        IceCream iceCream = new MangoWaterIceCream();
        assertEquals(iceCream.getName(), "Mango Water IceCream");
        assertEquals(iceCream.flavor, "Mango");
    }
}
