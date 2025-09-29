package MasterChef;

import Recetas.Entrada;
import Recetas.Plato;
import Recetas.Principal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Intermedios extends Participante implements  cocinarPrincipal{
    HashMap<Ingrediente, Integer> stockIngrediente;

    public Intermedios(HashMap<Ingrediente, Integer> stockIngrediente) {
        this.stockIngrediente = stockIngrediente;
    }

    public HashMap<Ingrediente, Integer> getStockIngrediente() {
        return stockIngrediente;
    }

    public void setStockIngrediente(HashMap<Ingrediente, Integer> stockIngrediente) {
        this.stockIngrediente = stockIngrediente;
    }

    public String mostrarMensaje(){
        for (Map.Entry<Ingrediente, Integer> valores: stockIngrediente.entrySet()){
            if (valores.getValue()>1)return  "Mi stock a utilizar es de " +valores.getKey().getNombre();
        }
        return "";
    }
    public void cocinarPrincipal(Principal p) throws SinStockException{
        for (Ingrediente i: p.getIngredientes()){
            if (stockIngrediente.containsKey(i)){
                if (stockIngrediente.get(i) < 0) throw new SinStockException("Este ingrediente " +i+" no tiene stock");
            }
        }
    }

}
