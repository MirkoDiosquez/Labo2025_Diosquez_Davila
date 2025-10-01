package PrestamosVirtuales;

import Persona.Persona;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Usuario extends Persona {
    private int creditoGanado;
    private String mail;
    private HashSet<Publicacion> publicacions;
    private HashMap<Publicacion, Integer> publicacionIntegerHashMap;
    private int cantPrestamos;

    public void devolverPrestamo(Prestamo p) throws PrestamoFechaException{
        if (p.getFechaPrestamo().isAfter(LocalDate.now())&& LocalDate.now().isBefore(p.getFechaDevolucion())){
            this.cantPrestamos++;
            if (publicacionIntegerHashMap.containsKey(p.getP())) publicacionIntegerHashMap.put(p.getP(), +1);
        }else {
            throw new PrestamoFechaException("Prestamo devuelto fuera de fecha");
            creditoGanado= creditoGanado -
        }

    }
}
