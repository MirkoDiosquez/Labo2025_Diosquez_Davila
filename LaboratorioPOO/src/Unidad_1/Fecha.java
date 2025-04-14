package Unidad_1;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    public Fecha(int anio, int mes, int dia) {
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;

    }

    public int getAnio() {
        return anio;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    public void valida(){
        if (dia < 1){
            dia=1;
        }
        if (dia > 31) {
            switch (mes) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    dia = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    dia = 30;
                    break;
                case 2:
                    dia = 28;
                    break;
                default:
                    dia = 1;
                    break;
            }
        }

        if (mes > 12) {
            mes=12;
        }
        else if (mes<1){
            mes=1;
        }
        if (anio<0){
            anio=0;
        }
        
    }
    public int diasMes(int mes){
        switch (mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return 28;
            default:
                return 0;
        }
    }
    public void fechaCorta(){
        System.out.println("La fecha en formato corto es "+ dia + "--" + mes + "--" +anio);
    }
    public void fechaLarga(){
        System.out.println("La fecha en formato largo es "+ "dia de la semana " + dia + " de mes " + mes + " de " + anio);
    }
    public void siguiente(){
        dia++;

    }
    public void anterior(){
        dia--;
    }
    public void igualQue(Fecha otraFecha){
        if (this.dia==otraFecha.dia && this.mes==otraFecha.mes && this.anio==otraFecha.anio){
            System.out.println("Las fechas son iguales");
        }
        else{
            System.out.println("No son iguales");
        }
    }
    public boolean menorQue(Fecha otraFecha) {
        if (this.anio < otraFecha.anio) return true;
        if (this.anio == otraFecha.anio && this.mes < otraFecha.mes) return true;
        if (this.anio == otraFecha.anio && this.mes == otraFecha.mes && this.dia < otraFecha.dia) return true;
        return false;
    }
    public boolean mayorQue(Fecha otraFecha) {
        if (this.anio > otraFecha.anio) return true;
        if (this.anio == otraFecha.anio && this.mes > otraFecha.mes) return true;
        if (this.anio == otraFecha.anio && this.mes == otraFecha.mes && this.dia > otraFecha.dia) return true;
        return false;
    }
}
