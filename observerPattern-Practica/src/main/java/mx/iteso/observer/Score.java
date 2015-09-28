package mx.iteso.observer;

/**
 * Created by houstonsalgado on 24/09/15.
 */
public class Score {

    private String namePlayer;
    private int numberPlayer;
    private String positionPlayer;
    private String teamPlayer;

    public Score(String namePlayer, int numberPlayer, String positionPlayer, String teamPlayer){
        this.namePlayer = namePlayer;
        this.numberPlayer = numberPlayer;
        this.positionPlayer = positionPlayer;
        this.teamPlayer = teamPlayer;
    }

    public void setScore(String namePlayer, int numberPlayer, String positionPlayer, String teamPlayer){
        this.namePlayer = namePlayer;
        this.numberPlayer = numberPlayer;
        this.positionPlayer = positionPlayer;
        this.teamPlayer = teamPlayer;
    }

    public String getNamePlayer(){
        return  namePlayer;
    }

    public int getNumberPlayer(){
        return numberPlayer;
    }

    public String getPositionPlayer(){
        return positionPlayer;
    }

    public String getTeamPlayer(){
        return teamPlayer;
    }
}
