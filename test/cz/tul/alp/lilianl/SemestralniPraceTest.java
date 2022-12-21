package cz.tul.alp.lilianl;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Lilian
 */
public class SemestralniPraceTest {

    public static double getVzdalenost(double x, double y, double z) {
        return Math.sqrt(
                Math.pow(x, 2)
                + Math.pow(y, 2)
                + Math.pow(z, 2)
        );
    }

    @Test
    public void testTrideni1() {
        double[][] body = {
            {5, 5, 5, getVzdalenost(5, 5, 5)},
            {3, 3, 3, getVzdalenost(3, 3, 3)},
            {4, 4, 4, getVzdalenost(4, 4, 4)},
            {2, 2, 2, getVzdalenost(2, 2, 2)},
            {1, 1, 1, getVzdalenost(1, 1, 1)}
        };
        double[][] ocekavanyVysledek = {
            {1.0, 1.0, 1.0, getVzdalenost(1, 1, 1)},
            {2.0, 2.0, 2.0, getVzdalenost(2, 2, 2)},
            {3.0, 3.0, 3.0, getVzdalenost(3, 3, 3)},
            {4.0, 4.0, 4.0, getVzdalenost(4, 4, 4)},
            {5.0, 5.0, 5.0, getVzdalenost(5, 5, 5)}
        };
        SemestralniPrace.trideni(body);
        Assert.assertArrayEquals(ocekavanyVysledek, body);
    }

    @Test
    public void testTrideni2() {
        double[][] body = {
            {10.32, 0, 5.7, getVzdalenost(10.32, 0, 5.7)},
            {-3, -8, 2, getVzdalenost(-3, -8, 2)},
            {15, 20, -13, getVzdalenost(15, 20, -13)},
            {1, 0, 1, getVzdalenost(1, 0, 1)}
        };
        double[][] ocekavanyVysledek = {
            {1.0, 0.0, 1.0, getVzdalenost(1, 0, 1)},
            {-3.0, -8.0, 2.0, getVzdalenost(-3, -8, 2)},
            {10.32, 0.0, 5.7, getVzdalenost(10.32, 0, 5.7)},
            {15.0, 20.0, -13.0, getVzdalenost(15, 20, -13)}
        };
        SemestralniPrace.trideni(body);
        Assert.assertArrayEquals(ocekavanyVysledek, body);
    }

    @Test
    public void testTrideni3() {
        double[][] body = {
            {1, 5, 9.99999, getVzdalenost(1, 5, 9.99999)}
        };
        double[][] ocekavanyVysledek = {
            {1.0, 5.0, 9.99999, getVzdalenost(1, 5, 9.99999)}
        };
        SemestralniPrace.trideni(body);
        Assert.assertArrayEquals(ocekavanyVysledek, body);
    }
}
