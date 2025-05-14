package Unidad1;

import Unidad3.Figura;

public class Circulo extends Figura
{
    private int radio ;

    // contructor por defecto.
    public Circulo()
    {
        this.radio = 2 ;
    }

    // constructor.
    public Circulo(int radio)
    {
        this.radio = radio ;
    }

    public double area(int radio)
    {
        double valor = (radio*radio) * 3.14 ;
        return valor ;
    }

    public double perimetro(int radio)
    {
        double valor = 3.14 * 2 * radio ;
        return valor ;
    }

    public static void main(String[] args)
    {
        Circulo c1 = new Circulo(2) ;
        System.out.println("El area del ciruclo es: " +c1.area(5));
        System.out.println("El perimetro del circulo es: " +c1.perimetro(5));
    }

}

