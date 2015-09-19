package mx.iteso;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.lifesavers.ArmBands;
import mx.iteso.strategy.lifesavers.SwimRing;
import mx.iteso.strategy.lifesavers.SwimSeat;
import mx.iteso.strategy.lifesavers.Watertubes;
import mx.iteso.strategy.lifesavers.FoamFloats;
import mx.iteso.strategy.lifesavers.LifesaversCandies;
import  mx.iteso.strategy.lifesavers.LifeVests;
import mx.iteso.strategy.lifesavers.SwimBelts;

public class JamaiconSportsLifesaversMain{

    public static void main (String[] args) {

            Lifesaver swimRing = new SwimRing();
            Lifesaver swimSeat = new SwimSeat();
            Lifesaver armBands = new ArmBands();
            Lifesaver Watertubes = new Watertubes();
            Lifesaver FoamFloats = new FoamFloats();
            Lifesaver LifesaversCandies = new LifesaversCandies();
            Lifesaver LifeVests = new LifeVests();
            Lifesaver SwimBelts = new SwimBelts();


            System.out.println(swimRing.display());
            System.out.println(swimRing.inflating());
            System.out.println(swimRing.deflating());
            System.out.println(swimRing.floating());

            System.out.println();

            System.out.println(swimSeat.display());
            System.out.println(swimSeat.inflating());
            System.out.println(swimSeat.deflating());
            System.out.println(swimSeat.floating());

            System.out.println();

            System.out.println(armBands.display());
            System.out.println(armBands.inflating());
            System.out.println(armBands.deflating());
            System.out.println(armBands.floating());

            System.out.println();

            System.out.println(Watertubes.display());
            System.out.println(Watertubes.inflating());
            System.out.println(Watertubes.deflating());
            System.out.println(Watertubes.floating());

            System.out.println();

            System.out.println(FoamFloats.display());
            System.out.println(FoamFloats.inflating());
            System.out.println(FoamFloats.deflating());
            System.out.println(FoamFloats.floating());

            System.out.println();

            System.out.println(LifesaversCandies.display());
            System.out.println(LifesaversCandies.inflating());
            System.out.println(LifesaversCandies.deflating());
            System.out.println(LifesaversCandies.floating());

            System.out.println();

            System.out.println(LifeVests.display());
            System.out.println(LifeVests.inflating());
            System.out.println(LifeVests.deflating());
            System.out.println(LifeVests.floating());

            System.out.println();

            System.out.println(SwimBelts.display());
            System.out.println(SwimBelts.inflating());
            System.out.println(SwimBelts.deflating());
            System.out.println(SwimBelts.floating());
        }
}
