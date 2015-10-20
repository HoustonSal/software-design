package mx.iteso.factory.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleVerdeCabeza;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by houstonsalgado on 19/10/15.
 */
public class PozoleVerdeCabezaTest {
        private Pozole pozole;

        @Before
        public void setUp(){
            pozole = mock((Pozole.class));
        }

        @Test
        public void testPozole(){
            Pozole pozole = new PozoleVerdeCabeza();
            assertEquals(pozole.getName(),"Pozole Verde con Cabeza");
            assertEquals(pozole.broth, "Caldo Verde");
        }
}
