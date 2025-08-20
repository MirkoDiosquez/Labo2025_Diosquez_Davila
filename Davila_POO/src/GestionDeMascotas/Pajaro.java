package GestionDeMascotas;

public class Pajaro extends Animal{
    private boolean cantor;
    public String saludar(){
        if (cantor)return "pipi";
        return  "pio";
    }
    public String saludarAgresivo(){
        return "";
    }
    public Pajaro(boolean cantor) {
        this.cantor = cantor;
    }
    public  String alimentarse(){
        return "el pajaro esta Alimentandose";
    }

}
