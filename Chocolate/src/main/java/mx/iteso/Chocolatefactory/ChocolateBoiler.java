package mx.iteso.Chocolatefactory;

/**
 * Created by houstonsalgado on 04/11/15.
 */
public class ChocolateBoiler {

    private volatile boolean empty;
    private volatile boolean boiled;
    private volatile static ChocolateBoiler chocolateInstance;
    public int fillChocolate;
    public int boilChocolate;
    public int drainChocolate;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
        fillChocolate = 0;
        boilChocolate = 0;
        drainChocolate = 0;
    }

    public static void cleanInstance(){
        chocolateInstance = null;
    }

    public static ChocolateBoiler getInstance(){
        if(chocolateInstance == null){
            synchronized (ChocolateBoiler.class){
                if(chocolateInstance == null){
                    chocolateInstance = new ChocolateBoiler();
                }
            }
        }
        return chocolateInstance;
    }

    public synchronized void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            fillChocolate++;
            // fill the boiler with a milk/chocolate mixture
        }
    }
    public synchronized void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
            drainChocolate++;
        }
    }
    public synchronized void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
            boilChocolate++;
        }
    }
    public boolean isEmpty() {
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }

}
