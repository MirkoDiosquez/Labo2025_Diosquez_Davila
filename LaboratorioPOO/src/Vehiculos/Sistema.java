package Vehiculos;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public Sistema(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    public void mayorCantidad(){
    for (Vehiculo ve:vehiculos ){
        for (VehiculoMotorizado v: ve.getVehiculoMotorizados())
        if (v.cantidadAutos()>v.cantBici() &&v.cantidadAutos()>v.cantCamionetas()) System.out.println("El tipo de vehiculo de mayor cantidad son los autos");
        else if(v.cantCamionetas()>v.cantidadAutos()&& v.cantCamionetas()>v.cantBici()) System.out.println("El tipo de vehiculo de mayor cantidad son las camionetas");
        else if (v.cantBici()>v.cantidadAutos()&&v.cantBici()> v.cantCamionetas()) System.out.println("El tipo de vehiculo de mayor cantidad son las bicis");
    }
    }

    public static void main(String[] args) {

    }
}
