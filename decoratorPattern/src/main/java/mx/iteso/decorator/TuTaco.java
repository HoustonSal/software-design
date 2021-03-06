package mx.iteso.decorator;

import mx.iteso.decorator.condiments.Cebolla;
import mx.iteso.decorator.condiments.Cilantro;
import mx.iteso.decorator.condiments.TortillaHarina;
import mx.iteso.decorator.condiments.TortillaMaiz;
import mx.iteso.decorator.condiments.meat.Bistec;
import mx.iteso.decorator.condiments.meat.Chorizo;
import mx.iteso.decorator.condiments.meat.Lengua;
import mx.iteso.decorator.condiments.meat.Pastor;
import mx.iteso.decorator.condiments.seaFood.Fish;
import mx.iteso.decorator.condiments.seaFood.Shrimp;
import mx.iteso.decorator.tacos.Quesadilla;
import mx.iteso.decorator.tacos.TacoNormal;
import mx.iteso.decorator.tacos.Volcanes;

public class TuTaco {
    public static void main(String[] args) {
        Taco taco = new TacoNormal(Taco.REGULAR);

        System.out.println(taco.getDescription());
        System.out.println("$" + taco.cost() + " MXN");

        taco = new TortillaMaiz(taco);
        taco = new Chorizo(taco);
        taco = new Cebolla(taco);
        taco = new Cilantro(taco);
        taco = new Fish(taco);
        taco = new Shrimp(taco);

        System.out.println();
        System.out.println();
        System.out.println(taco.getDescription());
        System.out.println("$" + taco.cost() + " MXN");

        Taco taco2 = new Volcanes();

        taco2 = new TortillaHarina(taco2);
        taco2 = new Lengua(taco2);
        taco2 = new Cilantro(taco2);
//        taco2 = new Fish(taco2);

        System.out.println();
        System.out.println();
        System.out.println(taco2.getDescription());
        System.out.println("$" + taco2.cost() + " MXN");


        Taco taco3 = new Quesadilla(Taco.MINI);

        taco3 = new TortillaHarina(taco3);
        taco3 = new Pastor(taco3);
        taco3 = new Cebolla(taco3);
//        taco3 = new Fish(taco3);

        System.out.println();
        System.out.println();
        System.out.println(taco3.getDescription());
        System.out.println("$" + taco3.cost() + " MXN");

    }
}
