import java.util.Scanner;

public class DiaLaboral {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Dime un dia");
        String dia = e.nextLine();
        switch (dia){
            case "Lunes":
                System.out.println("Es un dia laboral");
                break;
            case "Martes":
                System.out.println("Es un dia laboral");
                break;
            case "Miercoles":
                System.out.println("Es un dia laboral");
                break;
            case "Jueves":
                System.out.println("Es un dia laboral");
                break;
            case "Viernes":
                System.out.println("Es un dia laboral");
                break;
            case "Sabado":
                System.out.println("No es un dia laboral");
                break;
            case "Domingo":
                System.out.println("Es un dia laboral");
                break;
            default:
                break;

        }

    }
}
