package Unidad3.SistemaAlmuerzo;

public class Profesor extends PersonaColegio
{
    private int descuento ;

    public Profesor (String nombre , String apellido, int descuento)
    {
        super (nombre, apellido);
        this.descuento = descuento ;
    }

    public Profesor ()
    {
        this.descuento = 25 ;
    }

    public int getDescuento()
    {
        return descuento;
    }

    public void setDescuento(int descuento)
    {
        this.descuento = descuento;
    }


    public static void main(String[] args)
    {
        Profesor p1 = new Profesor("Matias","Colque",30) ;
    }

}
