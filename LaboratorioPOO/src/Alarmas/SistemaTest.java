/*package Alarmas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SistemaTest {

    private DetectorHumo detector;
    private SensorTemperatura temperatura;
    private SensorPresion presion;
    private SensorCompuesto sensorCompuesto;
    private Sistema sistema;

    @BeforeEach
    void setUp() {
        DetectorHumo detector = new DetectorHumo(false, 10.0, 5.0, (2022, ));
        SensorTemperatura temperatura = new SensorTemperatura(false, 20.0, 15.0, 2021);
        SensorPresion presion = new SensorPresion(false, 50.0, 30.0, 2022);
        SensorCompuesto sensorCompuesto1 = new SensorCompuesto()
        sistema = new Sistema();
        sistema.addDispositivo(detector);
        sistema.addDispositivo(temperatura);
        sistema.addDispositivo(presion);
    }

}
*/