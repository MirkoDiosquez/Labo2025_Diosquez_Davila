package Unidad3.Computadoras;

public class DispositivoSalida extends Componente
{
    private String puerto ;
    private boolean metodoImpresion ;
    private String tipoSalida ;

    public DispositivoSalida(String fabricante, int stock, double precio, String modelo, String puerto) {
        super(fabricante, stock, precio, modelo);
        this.puerto = puerto;
    }

    // ----------------
    public String getPuerto() {
        return puerto;
    }
    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }
    // ----------------
    public String getTipoSalida() {
        return tipoSalida;
    }
    public void setTipoSalida(String tipoSalida) {
        this.tipoSalida = tipoSalida;
    }
    // ----------------
    public boolean isMetodoImpresion() {
        return metodoImpresion;
    }
    public void setMetodoImpresion(boolean metodoImpresion) {
        this.metodoImpresion = metodoImpresion;
    }
}
