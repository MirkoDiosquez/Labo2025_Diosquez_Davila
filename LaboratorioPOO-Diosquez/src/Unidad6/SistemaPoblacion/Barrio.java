package Unidad6.SistemaPoblacion;

public class Barrio extends Lugar
{
    private int poblacion;

    public Barrio(String nombre, int id, int poblacion) {
        super(nombre, id);
        this.poblacion = poblacion;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public int contador ()
    {
        return poblacion ;
    }

}
