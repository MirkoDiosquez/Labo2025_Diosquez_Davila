package Vehiculos;

import java.time.LocalDate;
import java.util.ArrayList;

public class VehiculoMotorizado extends  Vehiculo{
    private String patente;
    private ArrayList<Auto> autos = new ArrayList<>();
    private  ArrayList<Camioneta> camionetas = new ArrayList<>();
    public VehiculoMotorizado(String marca, String modelo, String color, int cantRuedas, LocalDate fechaFabricacion, String patente) {
        super(marca, modelo, color, cantRuedas, fechaFabricacion);
        this.patente = patente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public ArrayList<Auto> getAutos() {
        return autos;
    }

    public void setAutos(ArrayList<Auto> autos) {
        this.autos = autos;
    }

    public ArrayList<Camioneta> getCamionetas() {
        return camionetas;
    }

    public void setCamionetas(ArrayList<Camioneta> camionetas) {
        this.camionetas = camionetas;
    }
    public int cantidadAutos(){
        int cantAutos= autos.size();
        return cantAutos;
    }
    public int cantCamionetas(){
        int cantCam= camionetas.size();
        return  cantCam;
    }
    public double devolverPorcentajeDescapotable(){
        double porcentaje=0;
        int contador=0;
            for (Auto a: autos){
                if (a.isDescapotable())contador ++;

        }
        porcentaje= (contador*autos.size())*100;
        return porcentaje;
    }
}
