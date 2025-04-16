package Unidad1;

import java.time.DayOfWeek;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    // Constructor
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    // Constructor por defecto
    public Fecha() {
        this.dia = 7 ;
        this.mes = 3 ;
        this.año = 2008 ;
    }

    // Verifica fecha
    public boolean verficaFecha() {
        boolean aux = true;
        if (dia < 1 || dia > 31 ||  mes < 1 || mes > 12 || año > 2025) {
            System.out.println("Valores invalidos");
            aux = false;
        } else {
            System.out.println("Valores validados");
        }
        return aux;
    }

    // Dias del mes
    public int diaMes(int mes)
    {
        int dias = 0;
        switch (mes)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31 ;
                break ;
            case 4: case 6: case 9: case 11:
                dias = 30;
                break ;
            case 2:
                dias = 28;
                break ;
        }
        return dias ;
    }

    // Fecha corta
    public String fechaCorta ()
    {
        // %02d: número entero con 2 dígitos, completa con 0 si es necesario
        return String.format("%02d-%02d-%04d", dia, mes, año);
    }

    // Fecha larga
    public String fechaLarga ()
    {
        String auxi = +dia +" del " +mes +" del " +año ;
        return auxi ;
    }

    // Avanza un dia
    public int siguiente ()
    {
        return dia + 1 ;
    }

    // Retrocede un dia
    public int atras ()
    {
        return dia - 1 ;
    }

    // Compara fecha
    public boolean igualQue (Fecha fechaComparar)
    {
        boolean aux = true ;
        if ( fechaComparar.dia == dia && fechaComparar.mes == mes && fechaComparar.año == año)
        {
            System.out.println("Las fechas son iguales");
        }
        else
        {
            System.out.println("Las fechas no son iguales");
            aux = false ;
        }
        return aux ;
    }

    // Compara fecha
    public boolean mayorQue (Fecha fechaComparar)
    {
        boolean aux = true ;
        if (fechaComparar.año > año)
        {
            System.out.println("La fecha ingresada es mayor");
        }
        else
        {
            System.out.println("La fecha ingresada es menor");
            return false ;
        }
        return aux ;
    }

    // Main
    public static void main(String[] args)
    {
        Fecha f1 = new Fecha();
        Fecha f2 = new Fecha(31,12,2025) ;


        System.out.println("La fecha de f1 en formato corto es: " +f1.fechaCorta());
        System.out.println("La fecha de f1 en formato largo es: " +f1.fechaLarga());
        System.out.println("La fecha siguiente de f1 es: " +f1.siguiente() +"/" +f1.mes +"/" +f1.año);
        System.out.println("La fecha anterior de f1 es: " +f1.atras() +"/" +f1.mes +"/" +f1.año);
        System.out.println(f1.igualQue(f2));
        System.out.println(f1.mayorQue(f2));
        System.out.println("---------------------------------------");
        System.out.println("La fecha de f2 en formato corto es: " +f2.fechaCorta());
        System.out.println("La fecha de f2 en formato largo es: " +f2.fechaLarga());
        System.out.println("La fecha siguiente de f2 es: " +f2.siguiente() +"/" +f2.mes +"/" +f2.año);
        System.out.println("La fecha anterior de f2 es: " +f2.atras() +"/" +f2.mes +"/" +f2.año);
        System.out.println(f2.igualQue(f1));
        System.out.println(f2.mayorQue(f1));

    }
}

