package MasterChef;

import DireccionClase.Direccion;
import Recetas.Entrada;
import Recetas.Plato;
import Recetas.Principal;

import java.util.HashSet;

public class Expertos extends Participante implements  cocinarPrincipal, cocinarEntrada{
    private static  int tiempo = 80;
    private int tiempoActual;

    public Expertos() {
        super();
        this.tiempoActual = tiempo;
    }

    public static int getTiempo() {
        return tiempo;
    }

    public static void setTiempo(int tiempo) {
        Expertos.tiempo = tiempo;
    }

    public int getTiempoActual() {
        return tiempoActual;
    }

    public void setTiempoActual(int tiempoActual) {
        this.tiempoActual = tiempoActual;
    }

    public String mostrarMensaje(){
        return "Perdi 5 minutos preparando la mesa por lo que mi tiempo restante es:  "+ (tiempoActual-5);
    }
    public void cocinarPrincipal(Principal p) throws SinTiempoException{
        if (p.getTiempo()>tiempoActual) throw new SinTiempoException("No queda tiempo para cocinar el plato principal"+ p);
        else System.out.println("experto cocina plato principal");
    }
    public void cocE(Entrada e) throws IngredienteProhibidoException {
        if (e.getTiempo()>tiempoActual) {
            throw new SinTiempoException("No queda tiempo para cocinar el plato de entrada "+ e);
        }else System.out.println("experto cocina plato Entrada");
    }

}
