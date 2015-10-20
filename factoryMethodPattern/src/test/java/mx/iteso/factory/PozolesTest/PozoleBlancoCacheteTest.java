package mx.iteso.factory.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleBlancoCabeza;
import mx.iteso.factory.pozoles.PozoleBlancoCachete;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by houstonsalgado on 19/10/15.
 */
public class PozoleBlancoCacheteTest {
    private Pozole pozole;

    @Before
    public void setUp(){
        pozole = mock((Pozole.class));
    }

    @Test
    public void testPozole(){
        Pozole pozole = new PozoleBlancoCachete();
        assertEquals(pozole.getName(),"Pozole Blanco de Cachete");
        assertEquals(pozole.broth, "Caldo Blanco");
    }
}
