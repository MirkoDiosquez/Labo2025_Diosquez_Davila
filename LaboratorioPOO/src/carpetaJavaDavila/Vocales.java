import java.util.Scanner;

public class Vocales {
    public static void main(String[] args) {
        String palabra = "Ayer me compré muñecos de la marca ‘ToyCo’ por internet.";
        int contador=0;
        for (int i = 0; i < palabra.length(); i++) {
                if(palabra[i] =="a" || palabra[i] =="e" || palabra[i] =="i" || palabra[i] =="o" || palabra[i] =="u" || palabra[i] =="A" ||palabra[i] =="E" ||palabra[i] =="I" ||palabra[i] =="O" || palabra[i] =="U" ){
                    contador++;
                }

        }
        System.out.println(contador);
    }
}
