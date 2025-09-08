package EleccionesOctubre;

public class TelefonoMovil extends Dispositivo implements Campania{
    private Compañia compañia;
    private int numeroCelular;


    @Override
    public String  hacerCampania() {
        if (super.isEstaPrendido() && super.isTieneCredito())return "Conectando con la antena mas cercana";
        else return  "No esta prendido o no tiene credito";
    }
}
