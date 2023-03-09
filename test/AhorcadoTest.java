import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AhorcadoTest {

    @Test
    public void test01IngresarUnaLetraQueNoEsteEnLaPalabraRestaUnaVida(){
        Ahorcado ahorcado = new Ahorcado();
        Adivinable palabra = new Palabra("Kodigo");
        ahorcado.agregarAdivinable(palabra);
        ahorcado.elegirAdivinable();
        Casilla letra = new Letra("A");
        ahorcado.ingresarCasilla(letra);
        assertEquals(5, ahorcado.obtenerVidasTest());
    }

    @Test
    public void test02IngresarUnaLetraQueEsteEnLaPalabraNoRestaVida(){
        Ahorcado ahorcado = new Ahorcado();
        Adivinable palabra = new Palabra("Kodigo");
        ahorcado.agregarAdivinable(palabra);
        ahorcado.elegirAdivinable();
        Casilla letra = new Letra("k");
        ahorcado.ingresarCasilla(letra);
        assertEquals(6, ahorcado.obtenerVidasTest());
    }

    @Test
    public void test03IngresarLetrasErroneasHastaAgotarVidasYPerderJuego(){
        Ahorcado ahorcado = new Ahorcado();
        Adivinable palabra = new Palabra("Kodigo");
        ahorcado.agregarAdivinable(palabra);
        ahorcado.elegirAdivinable();
        ahorcado.ingresarCasilla(new Letra("A"));
        ahorcado.ingresarCasilla(new Letra("z"));
        ahorcado.ingresarCasilla(new Letra("q"));
        ahorcado.ingresarCasilla(new Letra("h"));
        ahorcado.ingresarCasilla(new Letra("ñ"));
        ahorcado.ingresarCasilla(new Letra("p"));
        assertTrue(ahorcado.perdido());
    }

    @Test
    public void test04IngresarTodasLasLetrasCorrectasHastaGanarJuego(){
        Ahorcado ahorcado = new Ahorcado();
        Adivinable palabra = new Palabra("Kodigo");
        ahorcado.agregarAdivinable(palabra);
        ahorcado.elegirAdivinable();
        ahorcado.ingresarCasilla(new Letra("k"));
        ahorcado.ingresarCasilla(new Letra("o"));
        ahorcado.ingresarCasilla(new Letra("d"));
        ahorcado.ingresarCasilla(new Letra("i"));
        ahorcado.ingresarCasilla(new Letra("g"));
        assertTrue(ahorcado.ganado());
    }
}
