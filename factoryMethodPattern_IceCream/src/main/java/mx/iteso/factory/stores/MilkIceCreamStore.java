package mx.iteso.factory.stores;

import mx.iteso.factory.IceCream;
import mx.iteso.factory.IceCreamStore;
import mx.iteso.factory.iceCream.GuavaMilkIceCream;
import mx.iteso.factory.iceCream.MangoMilkIceCream;
import mx.iteso.factory.iceCream.PineappleMilkIceCream;
import mx.iteso.factory.iceCream.StrawberryMilkIceCream;

/**
 * Created by houstonsalgado on 23/10/15.
 */
public class MilkIceCreamStore extends IceCreamStore{

    @Override
    public IceCream createIceCream(String flavor) {
        if(flavor.equals("Strawberry"))
            return new StrawberryMilkIceCream();
        else if(flavor.equals("Pineapple"))
            return new PineappleMilkIceCream();
        else if(flavor.equals("Mango"))
            return new MangoMilkIceCream();
        else if(flavor.equals("Guava"))
            return new GuavaMilkIceCream();
        return null;
    }
}
