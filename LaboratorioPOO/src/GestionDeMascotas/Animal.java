package GestionDeMascotas;

public abstract class Animal {
    private String nombre;
    private String dueño;
    private int vidas;
    private int puntosAlegria;
    abstract String saludar();
    abstract String saludarAgresivo();
    abstract String alimentarse();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getPuntosAlegria() {
        return puntosAlegria;
    }

    public void setPuntosAlegria(int puntosAlegria) {
        this.puntosAlegria = puntosAlegria;
    }
}
