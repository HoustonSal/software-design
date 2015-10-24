package mx.iteso.factory;

/**
 * Created by houstonsalgado on 23/10/15.
 */
public abstract class IceCream {
    public String name = "";
    public String flavor;

    public void serve(){
        System.out.println("Serving in Regular IceCream Cone...");
    }

    public void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Adding flavor... " + flavor);
    }

    public String getName(){
        return name;
    }

}
