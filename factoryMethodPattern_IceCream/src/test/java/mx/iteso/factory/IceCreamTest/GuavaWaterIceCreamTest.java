package mx.iteso.factory.IceCreamTest;

import mx.iteso.factory.IceCream;
import mx.iteso.factory.iceCream.GuavaWaterIceCream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by houstonsalgado on 23/10/15.
 */
public class GuavaWaterIceCreamTest {
    private IceCream iceCream;

    @Before
    public void setUp() {
        iceCream = mock(IceCream.class);
    }

    @Test
    public void testGuavaWater() {
        IceCream iceCream = new GuavaWaterIceCream();
        assertEquals(iceCream.getName(), "Guava Water IceCream");
        assertEquals(iceCream.flavor, "Guava");
    }
}
