package Alarmas;

import java.time.LocalDate;

public class DetectorHumo extends Dispositivo{
    public DetectorHumo(boolean estado, double medida, double umbralInicial, LocalDate añoAdquisicion) {
        super(estado, medida, umbralInicial, añoAdquisicion);
    }
    public String alarma(){
        if(super.getMedida()>super.getUmbralInicial()) return "Llamando a Bomberos..";
        else return null;
    }
}
