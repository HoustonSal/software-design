package mx.iteso.observer.impl;

import mx.iteso.observer.Displayable;
import mx.iteso.observer.Observer;
import mx.iteso.observer.Score;
import mx.iteso.observer.Subject;

import java.util.ArrayList;

public class StoreMonitorDisplay implements Observer, Displayable {
    private String homeTeam;
    private String awayTeam;
    private int homeGoals;
    private int awayGoals;
    private ArrayList<Score> score;
    private Subject scoresData;

    public StoreMonitorDisplay(Subject scoresData){
        this.scoresData = scoresData;
        this.scoresData.registerObserver(this);
    }

    public void display() {
        System.out.println("StoreMonitorDisplay");
        System.out.println("Latest score is:");
        System.out.println(homeTeam + " (HOME) " + homeGoals + " - "
                + awayTeam + " (AWAY) " + awayGoals);
        for(int i=0; i<score.size(); i++) {
            System.out.println("NAME: " + score.get(i).getNamePlayer() + ". # " + score.get(i).getNumberPlayer() +
                    ". POSITION: " + score.get(i).getPositionPlayer() + ". TEAM: " + score.get(i).getTeamPlayer());
        }
        System.out.println();
        System.out.println();
    }

    public void update(String home, String away, int homeGoals, int awayGoals,ArrayList<Score> score) {
        this.homeTeam = home;
        this.awayTeam = away;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        this.score = score;
        display();
    }


}
