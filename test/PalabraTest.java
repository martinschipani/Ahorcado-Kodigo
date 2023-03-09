import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalabraTest {
    @Test
    public void test01IngresarUnaLetraCompruebaQueEstaEsteEnLaPalabra(){
        Adivinable palabra = new Palabra("Kodigo");
        Casilla letra = new Letra("K");
        assertTrue(palabra.adivinarCasilla(letra));
    }

    @Test
    public void test02IngresarUnaLetraCompruebaQueEstaNoEsteEnLaPalabra(){
        Adivinable palabra = new Palabra("Kodigo");
        Casilla letra = new Letra("A");
        assertTrue(!palabra.adivinarCasilla(letra));
    }
}
