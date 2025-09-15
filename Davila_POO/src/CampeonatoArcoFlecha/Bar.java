package CampeonatoArcoFlecha;

import java.util.HashSet;

public class Bar {
    private HashSet<Diana> dianas;
    private HashSet<Cliente> clientes;
    private HashSet<Beneficio> beneficios;
    private HashSet<AccionAcumulable> beneficiosAcumulable;
    private int dineroRecaudado;

    public Bar(HashSet<Diana> dianas, HashSet<Cliente> clientes, HashSet<Beneficio> beneficios, HashSet<AccionAcumulable> beneficiosAcumulable, int dineroRecaudado) {
        this.dianas = dianas;
        this.clientes = clientes;
        this.beneficios = beneficios;
        this.beneficiosAcumulable = beneficiosAcumulable;
        this.dineroRecaudado = dineroRecaudado;
    }
    public Bar(HashSet<Diana> dianas, HashSet<Beneficio> beneficios, int dineroRecaudado) {
        this.dianas = dianas;
        this.beneficios = beneficios;
        this.dineroRecaudado = dineroRecaudado;
    }

    public HashSet<Diana> getDianas() {
        return dianas;
    }

    public void setDianas(HashSet<Diana> dianas) {
        this.dianas = dianas;
    }

    public HashSet<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(HashSet<Cliente> clientes) {
        this.clientes = clientes;
    }

    public int getDineroRecaudado() {
        return dineroRecaudado;
    }

    public void setDineroRecaudado(int dineroRecaudado) {
        this.dineroRecaudado = dineroRecaudado;
    }

    public HashSet<Beneficio> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(HashSet<Beneficio> beneficios) {
        this.beneficios = beneficios;
    }

    public HashSet<AccionAcumulable> getBeneficiosAcumulable() {
        return beneficiosAcumulable;
    }

    public void setBeneficiosAcumulable(HashSet<AccionAcumulable> beneficiosAcumulable) {
        this.beneficiosAcumulable = beneficiosAcumulable;
    }
    public int cantBeneficiosTrago(){
        return  this.getBeneficios().size()-this.getBeneficiosAcumulable().size();

    }
}
