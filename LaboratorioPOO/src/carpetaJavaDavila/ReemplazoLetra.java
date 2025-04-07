import java.util.Scanner;

public class ReemplazoLetra {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Dime una letra");
        char letra = e.next().charAt(0);
        String palabra = "Ayer me compré muñecos de la marca ‘ToyCo’ por internet.";
        System.out.println("La palabra modificada es"+ palabra.replace('e', letra));
}
}
