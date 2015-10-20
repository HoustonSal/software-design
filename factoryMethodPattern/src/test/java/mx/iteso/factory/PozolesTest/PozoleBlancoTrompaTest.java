package mx.iteso.factory.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleBlancoPollo;
import mx.iteso.factory.pozoles.PozoleBlancoTrompa;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by houstonsalgado on 19/10/15.
 */
public class PozoleBlancoTrompaTest {
    private Pozole pozole;

    @Before
    public void setUp(){
        pozole = mock((Pozole.class));
    }

    @Test
    public void testPozole(){
        Pozole pozole = new PozoleBlancoTrompa();
        assertEquals(pozole.getName(),"Pozole Blanco de Trompa");
        assertEquals(pozole.broth, "Caldo Blanco");
    }
}
