package mx.iteso;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Houston Salgado on 05/11/2015.
 */
public class AudioPlayerTest {
    AudioPlayer audioPlayer;

    @Test
    public void testMp3(){
        audioPlayer = new AudioPlayer();
        assertEquals("Reproduciendo Mp3", audioPlayer.play());
    }

    @Test
    public void testAdapter(){
        MediaAdapter mediaAdapter = mock(MediaAdapter.class);
        when(mediaAdapter.play()).thenReturn("Reproducir Media adapter");
        audioPlayer = new AudioPlayer(mediaAdapter);
        assertEquals("Reproducir Media adapter", audioPlayer.play());
    }
}
