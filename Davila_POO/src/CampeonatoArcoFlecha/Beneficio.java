package CampeonatoArcoFlecha;

public abstract class Beneficio {
    private String nombre;
    private Cliente user;

    public Beneficio(String nombre, Cliente user) {
        this.nombre = nombre;
        this.user = user;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente getUser() {
        return user;
    }

    public void setUser(Cliente user) {
        this.user = user;
    }
}
