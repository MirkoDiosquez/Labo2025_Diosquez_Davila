package Unidad_1;

import Figuras.Circulo;
import Figuras.Rectangulo;

public class Main {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        Rectangulo rectangulo1 = new Rectangulo(2,5);
        Coche coche1= new Coche("Fiesta", "Wolvskvagen", "Negro", 75);
        Persona persona1= new Persona("Pato", 43, "Piran 2334");
        Fecha fecha= new Fecha(-1, 13,42);
        Fecha otraFecha= new Fecha(2002,5,2);

        //cuadrado
        System.out.println("El area del cuadrado es "+ circulo1.obtenerArea());
        System.out.println("El Perimetro del cuadrado es "+ circulo1.obtenerPerimetro());
        //rectangulo
        System.out.println("El area del rectangulo es "+ rectangulo1.obtenerArea());
        System.out.println("El Perimetro del rectangulo es "+ rectangulo1.obtenerPerimetro());
        //auto
        System.out.println("El modelo es " +coche1.getModelo());
        System.out.println("La marca es "+ coche1.getMarca());
        System.out.println("El color es "+ coche1.getColor());
        System.out.println("El coche va a "+coche1.mostrarVelocidadACT());

        //persona
        persona1.mostrarInfo();
        //fecha
        fecha.valida();
        fecha.anterior();
        fecha.siguiente();
        fecha.fechaCorta();
        fecha.fechaLarga();
        fecha.igualQue(otraFecha);
        fecha.mayorQue(otraFecha);
        fecha.menorQue(otraFecha);
        if (fecha.mayorQue(otraFecha)){
            System.out.println("La primera fecha es mayor");
        }
        if (fecha.menorQue(otraFecha)){
            System.out.println("La primera fecha es menor");
        }
        /*
                Libro libro1 = new Libro(
                        "Cien años de soledad",
                        new Persona("Gabriel", "García Márquez"),
                        "978-0307474728",
                        417,
                        "Editorial Sudamericana",
                        new Fecha(5, 6, 1967)
                );

                Libro libro2 = new Libro(
                        "1984",
                        new Persona("George", "Orwell"),
                        "978-0451524935",
                        328,
                        "Secker & Warburg",
                        new Fecha(8, 6, 1949)
                );

                Libro libro3 = new Libro(
                        "El Principito",
                        new Persona("Antoine", 11),
                        "978-0156013987",
                        96,
                        "Reynal & Hitchcock",
                        new Fecha(6, 4, 1943)
                );
            }
            Cafetera cafetera = new Cafetera(
                    10,
                    850,
                    0

            );
*/
}}
