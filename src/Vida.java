public class Vida implements Agotable {
    private int vidas;

    Vida(){
        this.vidas = 6;
    }

    public void agotar() {
        this.vidas--;
    }

    public boolean estaAgotado(){
        return this.vidas == 0;
    }

    /*
        METODOS TEST
     */
    public int obtenerOportunidadesTest(){
        return this.vidas;
    }
}
