package PrestamosVirtuales;

import java.util.HashSet;

public class Revista extends Publicacion {
    private String distribuidora;
    private static  int multa= 3500;
    public String toString() {
        return "Revista";
    }
    public int mostrarMulta(){
        return multa;
    }
}
