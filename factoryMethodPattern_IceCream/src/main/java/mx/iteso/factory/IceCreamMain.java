package mx.iteso.factory;

import mx.iteso.factory.stores.MilkIceCreamStore;
import mx.iteso.factory.stores.WaterIceCreamStore;
import sun.applet.Main;

/**
 * Created by houstonsalgado on 23/10/15.
 */
public class IceCreamMain {
    public static void main(String[] args){
        IceCreamStore waterStore = new WaterIceCreamStore();
        IceCreamStore milkStore= new MilkIceCreamStore();

        IceCream iceCream = milkStore.orderIceCream("Strawberry");
        System.out.println("First IceCream is: " + iceCream.getName());
        System.out.println();

        IceCream iceCream1 = milkStore.orderIceCream("Mango");
        System.out.println("First IceCream is: " + iceCream1.getName());
        System.out.println();

        IceCream iceCream2 = milkStore.orderIceCream("Pineapple");
        System.out.println("First IceCream is: " + iceCream2.getName());
        System.out.println();

        IceCream iceCream3 = milkStore.orderIceCream("Guava");
        System.out.println("First IceCream is: " + iceCream3.getName());
        System.out.println();

        IceCream iceCream4 = waterStore.orderIceCream("Strawberry");
        System.out.println("Second IceCream is: " + iceCream4.getName());
        System.out.println();

        IceCream iceCream5 = waterStore.orderIceCream("Mango");
        System.out.println("Second IceCream is: " + iceCream5.getName());
        System.out.println();

        IceCream iceCream6 = waterStore.orderIceCream("Pineapple");
        System.out.println("Second IceCream is: " + iceCream6.getName());
        System.out.println();

        IceCream iceCream7 = waterStore.orderIceCream("Guava");
        System.out.println("Second IceCream is: " + iceCream7.getName());
        System.out.println();

    }
}
