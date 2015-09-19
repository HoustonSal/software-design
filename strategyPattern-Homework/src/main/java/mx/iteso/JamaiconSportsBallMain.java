package mx.iteso;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.balls.*;

public class JamaiconSportsBallMain {
    public static void main (String[] args) {
        Ball soccer = new SoccerBall();
        Ball base = new BaseballBall();
        Ball american = new AmericanFootballBall();
        Ball billar = new BillarBall();
        Ball volley = new VolleyballBall();
        Ball rugby = new RugbyBall();
        Ball bowling = new BowlingBall();
        Ball tennis = new TennisBall();


        System.out.println(soccer.roll());
        System.out.println(soccer.performBounce());
        System.out.println(soccer.performDeflate());
        System.out.println(soccer.performInflate());
        System.out.println(soccer.performExpoit());

        System.out.println();

        System.out.println(american.roll());
        System.out.println(american.performBounce());
        System.out.println(american.performDeflate());
        System.out.println(american.performInflate());
        System.out.println(american.performExpoit());

        System.out.println();

        System.out.println(base.roll());
        System.out.println(base.performBounce());
        System.out.println(base.performDeflate());
        System.out.println(base.performInflate());
        System.out.println(base.performExpoit());

        System.out.println();

        System.out.println(billar.roll());
        System.out.println(billar.performBounce());
        System.out.println(billar.performDeflate());
        System.out.println(billar.performInflate());
        System.out.println(billar.performExpoit());

        System.out.println();

        System.out.println(volley.roll());
        System.out.println(volley.performBounce());
        System.out.println(volley.performDeflate());
        System.out.println(volley.performInflate());
        System.out.println(volley.performExpoit());

        System.out.println();

        System.out.println(bowling.roll());
        System.out.println(bowling.performBounce());
        System.out.println(bowling.performDeflate());
        System.out.println(bowling.performInflate());
        System.out.println(bowling.performExpoit());

        System.out.println();

        System.out.println(tennis.roll());
        System.out.println(tennis.performBounce());
        System.out.println(tennis.performDeflate());
        System.out.println(tennis.performInflate());
        System.out.println(bowling.performExpoit());

        System.out.println();

        System.out.println(rugby.roll());
        System.out.println(rugby.performBounce());
        System.out.println(rugby.performDeflate());
        System.out.println(rugby.performInflate());
        System.out.println(rugby.performExpoit());

        System.out.println();

    }
}
