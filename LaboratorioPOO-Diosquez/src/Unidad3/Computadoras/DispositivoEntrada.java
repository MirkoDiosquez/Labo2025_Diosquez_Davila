package Unidad3.Computadoras;

public class DispositivoEntrada extends Componente
{
    private String tipoConector ;
    private String puerto ;

    public DispositivoEntrada(String fabricante, int stock, double precio, String modelo, String tipoConector, String puerto) {
        super(fabricante, stock, precio, modelo);
        this.tipoConector = tipoConector;
        this.puerto = puerto;
    }

    // ----------------
    public String getTipoConector() {
        return tipoConector;
    }
    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }
    // ----------------
    public String getPuerto() {
        return puerto;
    }
    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }
}
