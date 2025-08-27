package Sistema_de_Viviendas;

public enum Gasto
{
    GASTO_CASA(100), GASTO_DEPARTAMENTO(50);

    private int precio ;

    Gasto(int precio) {
        this.precio = precio;
    }
}
