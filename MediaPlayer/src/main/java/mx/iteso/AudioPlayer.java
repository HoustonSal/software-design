package mx.iteso;

/**
 * Created by Houston Salgado on 05/11/2015.
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    public AudioPlayer(MediaAdapter mediaAdapter){
        this.mediaAdapter = mediaAdapter;
    }

    public AudioPlayer(){

    }

    public String play() {
        if(mediaAdapter == null)
            return "Reproduciendo Mp3";
        else
            return mediaAdapter.play();
    }
}
