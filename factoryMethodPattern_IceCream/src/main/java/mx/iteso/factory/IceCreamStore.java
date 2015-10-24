package mx.iteso.factory;

/**
 * Created by houstonsalgado on 23/10/15.
 */
public abstract class IceCreamStore {

    public IceCream orderIceCream(String flavor){
        IceCream iceCream;
        iceCream = createIceCream(flavor);
        iceCream.prepare();
        iceCream.serve();

        return iceCream;
    }

    public abstract IceCream createIceCream(String flavor);
}
