package carpetaJavaDavila;

import java.util.Scanner;

public class PalabrasIguales {
    public static void main(String[] args) {
        Scanner e= new Scanner(System.in);
        System.out.println("dime una palabra");
        String palabra1 = e.nextLine();
        System.out.println("dime otra palabra");
        String palabra2 = e.nextLine();
        if (palabra1.equals(palabra2)){
            System.out.println("son iguales");
        }else if(palabra1 != palabra2) {
            System.out.println("no son iguales");
        }
    }

}
