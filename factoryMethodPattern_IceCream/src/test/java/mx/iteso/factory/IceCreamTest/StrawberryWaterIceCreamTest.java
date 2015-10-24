package mx.iteso.factory.IceCreamTest;

import mx.iteso.factory.IceCream;
import mx.iteso.factory.iceCream.StrawberryMilkIceCream;
import mx.iteso.factory.iceCream.StrawberryWaterIceCream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by houstonsalgado on 23/10/15.
 */
public class StrawberryWaterIceCreamTest {
    private IceCream iceCream;

    @Before
    public void setUp(){
        iceCream = mock(IceCream.class);
    }

    @Test
    public void testStrawberryTest() {
        IceCream iceCream = new StrawberryWaterIceCream();
        assertEquals(iceCream.getName(), "Strawberry Water IceCream");
        assertEquals(iceCream.flavor, "Strawberry");
    }
}
