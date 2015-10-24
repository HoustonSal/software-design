package mx.iteso.factory.stores;

import mx.iteso.factory.IceCream;
import mx.iteso.factory.IceCreamStore;
import mx.iteso.factory.iceCream.*;

/**
 * Created by houstonsalgado on 23/10/15.
 */
public class WaterIceCreamStore extends IceCreamStore{

    @Override
    public IceCream createIceCream(String flavor) {
        if(flavor.equals("Strawberry"))
            return new StrawberryWaterIceCream();
        else if(flavor.equals("Pineapple"))
            return new PineappleWaterIceCream();
        else if(flavor.equals("Mango"))
            return new MangoWaterIceCream();
        else if(flavor.equals("Guava"))
            return new GuavaWaterIceCream();
        return null;
    }
}
