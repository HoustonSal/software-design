package mx.iteso.factory.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleVerdeCabeza;
import mx.iteso.factory.pozoles.PozoleVerdeCachete;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by houstonsalgado on 19/10/15.
 */
public class PozoleVerdeCacheteTest {
    private Pozole pozole;

    @Before
    public void setUp(){
        pozole = mock((Pozole.class));
    }

    @Test
    public void testPozole(){
        Pozole pozole = new PozoleVerdeCachete();
        assertEquals(pozole.getName(),"Pozole Verde con Cachete");
        assertEquals(pozole.broth, "Caldo Verde");
    }
}
