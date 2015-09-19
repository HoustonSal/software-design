package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by houstonsalgado on 18/09/15.
 */
public class ArmBandsTest {
    @Test
    public void TestArmBands(){
        ArmBands armBands = new ArmBands();
        assertEquals("I'm a Arm bands", armBands.display());
        assertEquals("I'm inflating!", armBands.inflating());
        assertEquals("I'm deflating!", armBands.deflating());
        assertEquals("I can Float!", armBands.floating());
    }
}
