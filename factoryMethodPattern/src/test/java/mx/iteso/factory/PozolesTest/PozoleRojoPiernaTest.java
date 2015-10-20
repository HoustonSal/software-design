package mx.iteso.factory.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleRojoCabeza;
import mx.iteso.factory.pozoles.PozoleRojoPierna;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by houstonsalgado on 19/10/15.
 */
public class PozoleRojoPiernaTest {
        private Pozole pozole;

        @Before
        public void setUp(){
            pozole = mock((Pozole.class));
        }

        @Test
        public void testPozole() {
            Pozole pozole = new PozoleRojoPierna();
            assertEquals(pozole.getName(), "Pozole Rojo con Pierna");
            assertEquals(pozole.broth, "Caldo Rojo");
        }
}
