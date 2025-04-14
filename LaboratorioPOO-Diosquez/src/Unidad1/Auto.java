package Unidad1;

public class Auto
{
    private String marca ;
    private String modelo ;
    private String color ;
    private int velocidad ;

    // Constructor por defecto
    public Auto ()
    {
        this.marca = "Porsche" ;
        this.modelo = "911 Carrera" ;
        this.color = "Rojo" ;
        this.velocidad =  200 ;
    }

    // Constructor por parametro
    public Auto (String marca , String modelo ,  String color, int velocidad )
    {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad ;
    }

    // Getters
    public String getMarca ()
    {
        return this.marca ;
    }
    public String getModelo ()
    {
        return this.modelo;
    }
    public String getColor ()
    {
        return this.color;
    }
    public int getVelocidad ()
    {
        return this.velocidad ;
    }

    // Metodos

    public int acelerar ()
    {
        int valor = velocidad + 40 ;
        return valor ;
    }
    public int frenar ()
    {
        int valor = velocidad - 20 ;
        return valor ;
    }
    public int mostrarVelocidadActual ()
    {
        return this.velocidad ;
    }

    // Main
    public static void main(String[] args)
    {
        Auto a1 = new Auto() ;
        Auto a2 = new Auto("Bugatti" , "Chiron" , "Cebele", 300) ;
        System.out.println("El " +a1.getMarca() +" aceleró, su velocidad actual es: " +a1.acelerar() +" Km/h");
        System.out.println("El " +a1.getMarca() +" frenó, su velocidad actual es: " +a1.frenar() +" Km/h");
        System.out.println("La velocidad actual del " +a1.marca +" es: " +a1.mostrarVelocidadActual() +" Km/h");
        System.out.println("El " +a2.getMarca() +" aceleró, su velocidad actual es: " +a2.acelerar() +" Km/h");
        System.out.println("El " +a2.getMarca() +" frenó, su velocidad actual es: " +a2.frenar() +" Km/h");
        System.out.println("La velocidad actual del " +a2.marca +" es: " +a2.mostrarVelocidadActual() +" Km/h");
    }

}
