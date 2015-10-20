package mx.iteso.factory.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleBlancoCachete;
import mx.iteso.factory.pozoles.PozoleBlancoOreja;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by houstonsalgado on 19/10/15.
 */
public class PozoleBlancoOrejaTest {
    private Pozole pozole;

    @Before
    public void setUp(){
        pozole = mock((Pozole.class));
    }

    @Test
    public void testPozole(){
        Pozole pozole = new PozoleBlancoOreja();
        assertEquals(pozole.getName(),"Pozole Blanco de Oreja");
        assertEquals(pozole.broth, "Caldo Blanco");
    }
}
