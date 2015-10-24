package mx.iteso.factory.StoresTest;

import mx.iteso.factory.IceCream;
import mx.iteso.factory.IceCreamStore;
import mx.iteso.factory.iceCream.GuavaMilkIceCream;
import mx.iteso.factory.iceCream.MangoMilkIceCream;
import mx.iteso.factory.iceCream.PineappleMilkIceCream;
import mx.iteso.factory.iceCream.StrawberryMilkIceCream;
import mx.iteso.factory.stores.MilkIceCreamStore;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by houstonsalgado on 23/10/15.
 */
public class MilkIceCreamStoreTest {
    IceCream iceCream;
    IceCream iceCream1;
    IceCreamStore iceCreamStore;

    @Before
    public void setUp(){
        iceCreamStore = new MilkIceCreamStore();
    }

    @Test
    public void testStrawberry(){
        iceCream = new StrawberryMilkIceCream();
        iceCream1 = iceCreamStore.orderIceCream("Strawberry");
        assertEquals(iceCream.getName(), iceCream1.getName());
    }

    @Test
    public void testMango(){
        iceCream = new MangoMilkIceCream();
        iceCream1 = iceCreamStore.orderIceCream("Mango");
        assertEquals(iceCream.getName(),iceCream1.getName());
    }

    @Test
    public void testPineapple(){
        iceCream = new PineappleMilkIceCream();
        iceCream1 = iceCreamStore.orderIceCream("Pineapple");
        assertEquals(iceCream.getName(), iceCream1.getName());
    }

    @Test
    public void testGuava(){
        iceCream = new GuavaMilkIceCream();
        iceCream1 = iceCreamStore.orderIceCream("Guava");
        assertEquals(iceCream.getName(), iceCream1.getName());
    }

    @Test (expected = NullPointerException.class)
    public void testException(){
        iceCream = new StrawberryMilkIceCream();
        iceCream1 = iceCreamStore.orderIceCream("");
        assertEquals(iceCream.getName(), iceCream1.getName());
    }

}
