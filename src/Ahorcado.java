import java.util.ArrayList;
import java.util.Random;

public class Ahorcado {
    private ArrayList<Adivinable> adivinables;
    private Adivinable adivinableElegido;
    private Agotable agotable;

    Ahorcado() {
        this.adivinables = new ArrayList<Adivinable>();
        this.agotable = new Vida();
    }

    public void agregarAdivinable(Adivinable adivinable) {
        this.adivinables.add(adivinable);
    }

    public void ingresarCasilla(Casilla casilla) {
        if(!this.adivinableElegido.adivinarCasilla(casilla)){
            this.agotable.agotar();
        }
    }

    public void elegirAdivinable() {
        Random random = new Random();
        int indice = random.nextInt(this.adivinables.size());
        this.adivinableElegido = this.adivinables.get(indice);
    }

    public boolean perdido() {
        return this.agotable.estaAgotado();
    }

    public boolean ganado() {
        return this.adivinableElegido.ganado();
    }


    /*
        METODOS PARA LOS TEST
     */
    public int obtenerVidasTest() {
        return this.agotable.obtenerOportunidadesTest();
    }



}
