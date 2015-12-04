package mx.iteso;

/**
 * Created by Houston Salgado on 05/11/2015.
 */
public class MediaAdapter implements MediaPlayer {
    private AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(AdvanceMediaPlayer advanceMediaPlayer){
        this.advanceMediaPlayer = advanceMediaPlayer;
    }

    public String play() {
        if(advanceMediaPlayer instanceof Mp4Player)
            return advanceMediaPlayer.playMp4();
        else if(advanceMediaPlayer instanceof VlcPlayer)
            return advanceMediaPlayer.playVlc();
        return null;
    }
}
