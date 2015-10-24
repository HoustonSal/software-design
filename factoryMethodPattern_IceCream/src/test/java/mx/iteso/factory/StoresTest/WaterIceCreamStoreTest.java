package mx.iteso.factory.StoresTest;

import mx.iteso.factory.IceCream;
import mx.iteso.factory.IceCreamStore;
import mx.iteso.factory.iceCream.*;
import mx.iteso.factory.stores.WaterIceCreamStore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by houstonsalgado on 23/10/15.
 */
public class WaterIceCreamStoreTest {
    IceCream iceCream;
    IceCream iceCream1;
    IceCreamStore iceCreamStore;

    @Before
    public void setUp(){
        iceCreamStore = new WaterIceCreamStore();
    }

    @Test
    public void testStrawberry(){
        iceCream = new StrawberryWaterIceCream();
        iceCream1 = iceCreamStore.orderIceCream("Strawberry");
        assertEquals(iceCream.getName(), iceCream1.getName());
    }

    @Test
    public void testMango(){
        iceCream = new MangoWaterIceCream();
        iceCream1 = iceCreamStore.orderIceCream("Mango");
        assertEquals(iceCream.getName(),iceCream1.getName());
    }

    @Test
    public void testPineapple(){
        iceCream = new PineappleWaterIceCream();
        iceCream1 = iceCreamStore.orderIceCream("Pineapple");
        assertEquals(iceCream.getName(), iceCream1.getName());
    }

    @Test
    public void testGuava(){
        iceCream = new GuavaWaterIceCream();
        iceCream1 = iceCreamStore.orderIceCream("Guava");
        assertEquals(iceCream.getName(), iceCream1.getName());
    }

    @Test (expected = NullPointerException.class)
    public void testException(){
        iceCream = new StrawberryWaterIceCream();
        iceCream1 = iceCreamStore.orderIceCream("");
        assertEquals(iceCream.getName(), iceCream1.getName());
    }
}
