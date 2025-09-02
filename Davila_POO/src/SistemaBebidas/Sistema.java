package SistemaBebidas;

import java.util.ArrayList;
import java.util.HashMap;

public class Sistema {
    private HashMap<Integer, Consumidor> consumidores;
    private HashMap<String, Bebida> bebidas;

    public Sistema(HashMap<Integer, Consumidor> consumidores, HashMap<String, Bebida> bebidas) {
        this.consumidores = consumidores;
        this.bebidas = bebidas;
    }

    public HashMap<Integer, Consumidor> getConsumidores() {
        return consumidores;
    }

    public void setConsumidores(HashMap<Integer, Consumidor> consumidores) {
        this.consumidores = consumidores;
    }

    public HashMap<String, Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(HashMap<String, Bebida> bebidas) {
        this.bebidas = bebidas;
    }
    public void agregarConsumidor(Consumidor c) throws DniDuplicadoException {
        if (consumidores.containsKey(c.getDNI())) {
            throw new DniDuplicadoException("el consumidor con DNI " + c.getDNI() + " ya está registrado");
        }
        consumidores.put(c.getDNI(), c);
    }
    public void comprobarConsumidor()throws SinConsumidoresException{
        if (consumidores.isEmpty()) throw new  SinConsumidoresException("no hay consumidores en el sistema");
    }

}
