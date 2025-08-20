package GestionDeMascotas;

public class Gato extends Animal{
    public String saludar(){
        return "miau";
    }
    public String saludarAgresivo(){
        return "MIAU!";
    }
    public  String alimentarse(){
        return "el gato esta Alimentandose";
    }

    public Gato() {
    }
}
