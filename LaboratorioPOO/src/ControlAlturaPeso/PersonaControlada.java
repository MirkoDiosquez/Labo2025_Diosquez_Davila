package ControlAlturaPeso;

import Persona.Persona;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class PersonaControlada extends Persona {
    private HashMap<LocalDate, Registro>  registros = new HashMap<>();

    public PersonaControlada(String nombre, int edad, String direccion, HashMap<LocalDate, Registro> registros) {
        super(nombre, edad, direccion);
        this.registros = registros;
    }
    public Registro pesoAltura(LocalDate fecha){
        return registros.get(fecha);
    }
    public void promPesoAltura(int año){
        double altura=0;
        double peso=0;
        for (Map.Entry<LocalDate, Registro> historial : registros.entrySet()){
            Registro r= historial.getValue();
            if (r.getFechaMedicion().getYear()==año){
                altura += r.getAltura();
                peso += r.getPeso();
            }

        }
        altura = altura / registros.size();
        peso = peso / registros.size();
        System.out.println("La altura y peso del año " + año + " es "+ altura + peso);

    }
    public double porcentajeCrecimiento(LocalDate fInicio, LocalDate fFin){
        double alturaInicial= registros.get(fInicio).getAltura();
        double alturaFinal=registros.get(fFin).getAltura();
        return ((alturaFinal-alturaInicial))/(alturaInicial*100);

    }
}
