package SIstema_De_Llamadas;

import java.util.Scanner;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha( int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Fecha(){
        this.dia= 12;
        this.mes= 10;
        this.anio= 2007;
    }

    public int getDia() {
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAnio(){
        return anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes){
        this.mes= mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void valida(){
        Scanner e = new Scanner(System.in);
        System.out.println("Ingrese un dia a verificar");
        int auxd= e.nextInt();
        System.out.println("Ingrese un mes a verificar");
        int auxm= e.nextInt();
        System.out.println("Ingrese un anio a verificar");
        int auxa= e.nextInt();
        if(dia != auxd && mes != auxm && auxa != anio){
            this.dia= auxd;
            this.mes= auxm;
            this.anio= auxa;
        }
    }
    public void diaMes(int mes) {
        int enero = 1;
        int febrero = 2;
        int marzo = 3;
        int abril = 4;
        int mayo = 5;
        int junio = 6;
        int julio = 7;
        int agosto = 8;
        int septiembre = 9;
        int octubre = 10;
        int noviembre = 11;
        int diciembre = 12;
        Scanner e = new Scanner(System.in);
        System.out.println("Ingrese un mes del anio ");
        int mesesito = e.nextInt();
        System.out.println("Ingrese el anio ");
        int anioto= e.nextInt();
        switch (mes) {
            case 1:
                System.out.println("31");
                break;
            case 2:
                if (anioto % 4 == 0 && anioto % 400 == 0) {
                    System.out.println("29");
                }
                else {
                    System.out.println("28");
                }
                break;
            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("31");
                break;
            default:
                System.out.println("Número de mes no válido.");
                break;
        }
    }

    public static void main(String[] args) {
        Fecha f1 = new Fecha(16, 4, 2025);
        Fecha f2 = new Fecha();

        System.out.println(f1.getDia());
        System.out.println(f1.getMes());
        System.out.println(f1.getAnio());
        f1.diaMes(4);
        System.out.println(f2.getDia());
        System.out.println(f2.getMes());
        System.out.println(f2.getAnio());
        f2.diaMes(10);
    }
}
