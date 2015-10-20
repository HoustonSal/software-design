package mx.iteso.decorator;

public abstract class Taco {
    public String description = "Any Taco";

    public final static String MINI = "Mini";
    public final static String REGULAR = "Regular";
    public final static String MEGA = "Mega";

    public String size = REGULAR;

    public String getDescription(){
        if(description.contains("ERROR, orden no valida")||description.contains("Quesadilla Mini"))
            return "ERROR, orden no valida";
        return description;
    }

    public String getSize(){
        return size;
    }


    public abstract double cost()throws RuntimeException;

}
