package Laboratorio2025;

import java.util.Scanner;

public class ReemplazoVocal
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in) ;
        char aux ;
        String meme = "Ayer me compré muñecos de la marca ‘ToyCo’ por internet." ;
        System.out.println("Elige la letra de reemplazo" );
        aux = entrada.next().charAt(0) ;
        meme = meme.replace('e',aux) ;
        System.out.println(meme);
    }
}
