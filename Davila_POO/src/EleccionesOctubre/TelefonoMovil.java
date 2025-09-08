package EleccionesOctubre;

public class TelefonoMovil extends Dispositivo implements Campania{
    private Compañia compañia;
    private int numeroCelular;
    private int credito;


    @Override
    public String  hacerCampania() {
        if (super.isEstaPrendido() && credito>0)return "Conectando con la antena mas cercana";
        else return  "No esta prendido o no tiene credito";
    }
}
