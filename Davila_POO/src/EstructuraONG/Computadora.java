package EstructuraONG;

public class Computadora {
    private int codigoAlfaNumerico;
    private String nombreUsuario;
    private int contrasenia;

    public Computadora(int codigoAlfaNumerico, String nombreUsuario, int contrasenia) {
        this.codigoAlfaNumerico = codigoAlfaNumerico;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
    }

    public int getCodigoAlfaNumerico() {
        return codigoAlfaNumerico;
    }

    public void setCodigoAlfaNumerico(int codigoAlfaNumerico) {
        this.codigoAlfaNumerico = codigoAlfaNumerico;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(int contrasenia) {
        this.contrasenia = contrasenia;
    }
}
