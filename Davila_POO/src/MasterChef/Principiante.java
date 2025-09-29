package MasterChef;

import DireccionClase.Direccion;
import Recetas.Entrada;
import Recetas.Plato;

import java.util.HashSet;

public class Principiante extends Participante implements  cocinarEntrada{
    HashSet<Ingrediente> prohibidos;

    public Principiante(String nombre, int edad, Direccion direccion, String localidad, HashSet<Ingrediente> prohibidos) {
        super();
        this.prohibidos = prohibidos;
    }

    public HashSet<Ingrediente> getProhibidos() {
        return prohibidos;
    }

    public void setProhibidos(HashSet<Ingrediente> prohibidos) {
        this.prohibidos = prohibidos;
    }

    public String mostrarMensaje(){
        return "Ya guarde todos los elementos prohibidos y no voy a usar "+ prohibidos;
    }
    public void cocE(Entrada e) throws IngredienteProhibidoException {
        for (Ingrediente pr: prohibidos){
            if (!e.getIngredientes().contains(pr)) System.out.println("cocinando.." + e.toString());
            else throw  new IngredienteProhibidoException("Tiene ingredientes prohibidos");
        }
    }
}
