package Alarmas;

import java.time.LocalDate;

public class SensorPresion extends Dispositivo {
    public SensorPresion(boolean estado, double medida, double umbralInicial, LocalDate añoAdquisicion) {
        super(estado, medida, umbralInicial, añoAdquisicion);
    }
    public String alarma(){
        if(super.getMedida()>super.getUmbralInicial()) return "Sensor de Presion Activado";
        else return null;
    }
}
