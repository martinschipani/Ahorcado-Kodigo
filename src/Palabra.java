import java.util.HashMap;

public class Palabra implements Adivinable {
    private String texto;
    private HashMap<String, Integer> caracterCantidad;
    Palabra(String texto){
        this.texto = texto.toLowerCase();
        this.caracterCantidad = new HashMap<>();
        this.mapearCaracteres();
    }

    private void mapearCaracteres() {
        for(int i = 0; i < this.texto.length(); i++){
            String caracter = String.valueOf(this.texto.charAt(i));
            if(this.caracterCantidad.containsKey(this.texto.charAt(i))){
                Integer cantidad = this.caracterCantidad.get(caracter) + 1;
                this.caracterCantidad.put(caracter, cantidad);
            }else{
                this.caracterCantidad.put(caracter, 0);
            }
        }
    }

    @Override
    public boolean adivinarCasilla(Casilla letra) {
        if(letra.estaDentro(this.texto)){
            this.caracterCantidad.remove(letra.obtenerValor());
            return true;
        }
        return false;
    }

    public boolean ganado(){
        return this.caracterCantidad.size() == 0;
    }

}
