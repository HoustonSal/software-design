package mx.iteso;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Houston Salgado on 07/11/2015.
 */
public class MediaAdapterTest {
    MediaAdapter mediaAdapter;
    Mp4Player mp4Player;
    VlcPlayer vlcPlayer;

    @Before
    public void SetUp() {
        mp4Player = new Mp4Player();
        vlcPlayer = new VlcPlayer();
    }

    @Test
    public void testPlayMp4() {
        mediaAdapter = new MediaAdapter(mp4Player);
        assertEquals("Reproduciendo MP4", mediaAdapter.play());
    }

    @Test
    public void testPlayVlc() {
        mediaAdapter = new MediaAdapter(vlcPlayer);
        assertEquals("Reproduciendo VLC", mediaAdapter.play());
    }

    @Test
    public void testNull(){
        mediaAdapter = new MediaAdapter(null);
        assertEquals(null, mediaAdapter.play());
    }

    @Test
    public void testVlcPlay(){
        assertEquals("Reproduciendo VLC", mp4Player.playVlc());
        assertEquals("Reproduciendo VLC", vlcPlayer.playVlc());
    }

    @Test
    public void testMp4Play(){
        assertEquals("Reproduciendo MP4", mp4Player.playMp4());
        assertEquals("Reproduciendo MP4", vlcPlayer.playMp4());
    }

}
