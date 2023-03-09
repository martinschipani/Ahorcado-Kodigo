public class Letra implements Casilla {
    private String caracter;

    public Letra(String caracter) {
        this.caracter = caracter.toLowerCase();
    }

    @Override
    public boolean estaDentro(String texto) {
        return texto.contains(this.caracter);
    }

    public String obtenerValor(){
        return this.caracter;
    }

}
