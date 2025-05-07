package parcial;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParcialTest {

    @Test
    public void testPotenciaValida() throws Exception {
        Parcial p = new Parcial();
        assertEquals(8, p.potenciaEntera(2, 3));       // 2^3 = 8
        assertEquals(1, p.potenciaEntera(5, 0));       // 5^0 = 1
        assertEquals(0, p.potenciaEntera(0, 5));       // 0^5 = 0
        assertEquals(1, p.potenciaEntera(1, 1000));    // 1^1000 = 1
    }

    @Test
    public void testExponenteNegativo() {
        Parcial p = new Parcial();
        assertThrows(Excepciones.ExponenteNegativoException.class, () -> {
            p.potenciaEntera(2, -1);
        });
    }

    @Test
    public void testIndeterminacion00() {
        Parcial p = new Parcial();
        assertThrows(Excepciones.IndeterminacionException.class, () -> {
            p.potenciaEntera(0, 0);
        });
    }

    @Test
    public void testOverflow() {
        Parcial p = new Parcial();
        assertThrows(Excepciones.OverflowException.class, () -> {
            p.potenciaEntera(2, 31); // 2^31 = 2,147,483,648 > Integer.MAX_VALUE
        });
    }
}

