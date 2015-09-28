package mx.iteso.observer;

import mx.iteso.observer.impl.ScoresData;
import mx.iteso.observer.impl.StoreMonitorDisplay;
import mx.iteso.observer.impl.mobileAppDisplay;

import java.util.ArrayList;

public class NewsStation {
    public static void main( String[] args ){
        ScoresData scoresData;
        scoresData = new ScoresData();
        ArrayList<Score> score = new ArrayList<Score>();

        StoreMonitorDisplay storeMonitorDisplay = new StoreMonitorDisplay(scoresData);
        mobileAppDisplay mobileAppDisplay = new mobileAppDisplay(scoresData);

        score.add(new Score("Omar Bravo", 9, "Delantero", "Chivas"));
        score.add(new Score("Aldo de Nigris", 9, "Delantero", "Queretaro"));
        score.add(new Score("Oribe peralta", 11, "Delantero", "La Ganga"));
        score.add(new Score("Chicharito", 7, "Delantero", "Tacit Knowledge"));
        score.add(new Score("Messi", 10, "Delantero", "Tacit Knowledge"));
        score.add(new Score("Carlos Fierro", 11, "Delantero", "Muebles America"));


        scoresData.setScore("Tacit Knowledge", "Intel", 3, 1, score);
        scoresData.setScore("Chivas", "Queretaro", 2, 1,score);
        scoresData.setScore("La Ganga", "Muebles America", 0, 0, score);
    }
}
