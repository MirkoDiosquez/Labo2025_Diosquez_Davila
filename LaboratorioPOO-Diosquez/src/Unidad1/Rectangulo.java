package Unidad1;

import Unidad3.Figura;

public class Rectangulo extends Figura
{
    private double base ;
    private double altura ;

    public Rectangulo()
    {
        this.base = 2 ;
        this.altura = 3 ;
    }
    public Rectangulo (double base, double altura)
    {
        this.base = base ;
        this.altura = altura ;
    }
    public double getBase ()
    {
        return this.base ;
    }
    public double getAltura ()
    {
        return this.altura ;
    }

    public double area ()
    {
        double valor = base * altura ;
        return valor ;
    }
    public double perimetro ()
    {
        double valor = (2 * base) + (2 * altura) ;
        return valor ;
    }

    public static void main(String[] args)
    {
        Rectangulo r1 = new Rectangulo() ;
        Rectangulo r2 = new Rectangulo(5,6) ;
        System.out.println("El área del retangulo 1 es: " + r1.area()) ;
        System.out.println("El perimetro del retangulo 1 es: " + r1.perimetro()) ;
        System.out.println("El área del retangulo 2 es: " + r2.perimetro()) ;
        System.out.println("El área del retangulo 2 es: " + r2.area()) ;
    }
}
