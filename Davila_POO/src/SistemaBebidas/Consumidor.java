package SistemaBebidas;

import DireccionClase.Direccion;
import Persona.Persona;

import java.util.ArrayList;

public class Consumidor extends Persona {
    private int DNI;
    ArrayList<Consumo> consumos;

    public Consumidor(String nombre, int edad, Direccion direccion, int DNI, ArrayList<Consumo> consumos) {
        super(nombre, edad, direccion);
        this.DNI = DNI;
        this.consumos = consumos;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int calcularHidratacion(){
        int hidratacion = 0;
        for(Consumo con : consumos){
            hidratacion+=con.getCant()*con.getBebida().getPositividad();
            hidratacion-=con.getCant()*con.getBebida().getNegatividad();
        }
        return hidratacion;
    }
    public void consumir(Consumo consumo, int cantidad) throws Exception {
        if (consumo == null) {
            throw new Exception("la bebida para el consumo no existe");
        }
        if (consumo.getCant() < cantidad) {
            throw new Exception("no hay stock");
        }
        consumos.add(new Consumo());
        consumo.setCant(consumo.getCant() - cantidad);
    }

}
