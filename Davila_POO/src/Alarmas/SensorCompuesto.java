package Alarmas;

import java.time.LocalDate;
import java.util.ArrayList;

public class SensorCompuesto extends Dispositivo{
    private ArrayList<Dispositivo> sensores = new ArrayList<>();
    private double umbral;

    public SensorCompuesto(boolean estado, double medida, double umbralInicial, LocalDate añoAdquisicion, ArrayList<Dispositivo> sensores, double umbral) {
        super(estado, medida, umbralInicial, añoAdquisicion);
        this.sensores = sensores;
        this.umbral = umbral;
    }



    public ArrayList<Dispositivo> getSensores() {
        return sensores;
    }

    public void setSensores(ArrayList<Dispositivo> sensores) {
        this.sensores = sensores;
    }

    public double getUmbral() {
        return umbral;
    }

    public void setUmbral(double umbral) {
        this.umbral = umbral;
    }

    public String alarma(){
        double sumador=0;

        for (Dispositivo s:sensores){
            sumador+=s.getMedida();
            }
        if ((sumador/3)>umbral)return ("Se dispara la alarma");
    return null;
    }
}
