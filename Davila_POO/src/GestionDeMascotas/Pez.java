package GestionDeMascotas;

public class Pez extends Animal{
    private static int vidas =10;
    public String saludar(){
        vidas--;
        return "la cantidad de vidas son" + vidas;
    }
    public  String saludarAgresivo(){
        vidas=0;
        return "el pez murio";
    }
    public  String alimentarse(){
        vidas++;
        return "el perro esta Alimentandose";
    }


}
