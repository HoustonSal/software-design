package mx.iteso.factory.IceCreamTest;

import mx.iteso.factory.IceCream;
import mx.iteso.factory.iceCream.PineappleMilkIceCream;
import mx.iteso.factory.iceCream.StrawberryMilkIceCream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by houstonsalgado on 23/10/15.
 */
public class StrawberryMilkIceCreamTest {
    private IceCream iceCream;

    @Before
    public void setUp(){
        iceCream = mock(IceCream.class);
    }

    @Test
    public void testStrawberryTest() {
        IceCream iceCream = new StrawberryMilkIceCream();
        assertEquals(iceCream.getName(), "Strawberry Milk IceCream");
        assertEquals(iceCream.flavor, "Strawberry");
    }
}
