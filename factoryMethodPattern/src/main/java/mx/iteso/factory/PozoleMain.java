package mx.iteso.factory;

import mx.iteso.factory.pozoles.Toppings.Cebolla;
import mx.iteso.factory.pozoles.Toppings.Lechuga;
import mx.iteso.factory.pozoles.Toppings.Oregano;
import mx.iteso.factory.pozoles.Toppings.Rabanos;
import mx.iteso.factory.stores.AllPozoleStore;
import mx.iteso.factory.stores.MenudoStore;
import mx.iteso.factory.stores.PozoleRojoStore;
import mx.iteso.factory.stores.PozoleVerdeStore;

public class PozoleMain {
    public static void main (String[] args) {
        PozoleStore verdeStore = new PozoleVerdeStore();
        PozoleStore rojoStore = new PozoleRojoStore();
        PozoleStore menuderia = new MenudoStore();
        AllPozoleStore allPozoleStore = new AllPozoleStore();

        Pozole pozole0 = allPozoleStore.createPozole("pollo", "blanco");
        pozole0 = new Rabanos(pozole0);
        System.out.println("First order is: "+ pozole0.getName());
        System.out.println();

        Pozole pozole = verdeStore.orderPozole("pollo");
        pozole = new Cebolla(pozole);
        pozole = new Oregano(pozole);
        pozole = new Rabanos(pozole);
        System.out.println("First order is: "+ pozole.getName());
        System.out.println();

        Pozole pozole1 = rojoStore.orderPozole("pollo");
        pozole1 = new Cebolla(pozole1);
        pozole1 = new Oregano(pozole1);
        pozole1 = new Rabanos(pozole1);
        System.out.println("Second order is: "+ pozole1.getName());
        System.out.println();

        Pozole pozole2 = menuderia.orderPozole("pollo");
        pozole2 = new Cebolla(pozole2);
        pozole2 = new Oregano(pozole2);
        pozole2 = new Lechuga(pozole2);
        System.out.println("Third order is: "+ pozole2.getName());
    }
}