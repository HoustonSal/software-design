package mx.iteso;

/**
 * Created by Houston Salgado on 05/11/2015.
 */
public class AdapterPatternDemo {
    public static void main(String args[]){
        Mp4Player mp4Player = new Mp4Player();
        VlcPlayer vlcPlayer = new VlcPlayer();

        MediaAdapter mp4Adapter = new MediaAdapter(mp4Player);
        AudioPlayer audioPlayer = new AudioPlayer(mp4Adapter);

        System.out.println(audioPlayer.play());

        mp4Adapter = new MediaAdapter(vlcPlayer);
        audioPlayer = new AudioPlayer(mp4Adapter);

        System.out.println(audioPlayer.play());

    }
}
