package EleccionesOctubre;

public class Dispositivo implements AccionesDispositivo{
    private int numeroSerie;
    private String fabricante;
    private String modelo;
    private boolean tieneCredito;
    private boolean estaPrendido;

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isTieneCredito() {
        return tieneCredito;
    }

    public void setTieneCredito(boolean tieneCredito) {
        this.tieneCredito = tieneCredito;
    }

    public boolean isEstaPrendido() {
        return estaPrendido;
    }

    public void setEstaPrendido(boolean estaPrendido) {
        this.estaPrendido = estaPrendido;
    }

    @Override
    public boolean prender() {
        estaPrendido=true;
        return estaPrendido;
    }

    @Override
    public boolean tieneCredito() {
        tieneCredito=true;
        return tieneCredito;
    }
}
