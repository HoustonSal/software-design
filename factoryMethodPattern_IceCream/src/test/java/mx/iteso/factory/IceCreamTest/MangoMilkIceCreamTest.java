package mx.iteso.factory.IceCreamTest;

import mx.iteso.factory.IceCream;
import mx.iteso.factory.iceCream.GuavaWaterIceCream;
import mx.iteso.factory.iceCream.MangoMilkIceCream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by houstonsalgado on 23/10/15.
 */
public class MangoMilkIceCreamTest {
    private IceCream iceCream;

    @Before
    public void setUp(){
        iceCream = mock(IceCream.class);
    }

    @Test
    public void testMangoMilk() {
        IceCream iceCream = new MangoMilkIceCream();
        assertEquals(iceCream.getName(), "Mango Milk IceCream");
        assertEquals(iceCream.flavor, "Mango");
    }
}
