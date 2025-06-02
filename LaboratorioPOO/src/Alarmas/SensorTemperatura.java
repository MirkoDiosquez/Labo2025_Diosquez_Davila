package Alarmas;

import java.time.LocalDate;

public class SensorTemperatura extends Dispositivo{
    public SensorTemperatura(boolean estado, double medida, double umbralInicial, LocalDate añoAdquisicion) {
        super(estado, medida, umbralInicial, añoAdquisicion);
    }
    public String alarma(){
        if(super.getMedida()>super.getUmbralInicial()) return "¡Cuidado! La temperatura sube";
        else return null;
    }
}
