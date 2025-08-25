package SistemaAlarmaExp;

import Alarmas.Dispositivo;
import Alarmas.SensorPresion;
import Alarmas.SensorTemperatura;
import Alarmas.Sistema;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class MainAlarm {
    public Dispositivo elegirDispositivo(Sistema sis) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Elige un numero para la alarma");
        int indice = s.nextInt();
        Dispositivo alarma = sis.getDispositivos().get(indice);
        return alarma;
    }

    public static void main(String[] args) {
        MainAlarm Asis = new MainAlarm();
        Sistema sis = new Sistema();
        ArrayList<Dispositivo> alarmas = new ArrayList<>();
        LocalDate fechaActual = LocalDate.now();
        SensorTemperatura d1 = new SensorTemperatura(true, 2.5,3.5, fechaActual);
        SensorPresion d2 = new SensorPresion(true, 2.5,3.5, fechaActual);
        try {
            Asis.elegirDispositivo(sis);
        } catch (Exception err) {
            System.out.println("Ocurrio alguna excepcion");
        }

    }
}