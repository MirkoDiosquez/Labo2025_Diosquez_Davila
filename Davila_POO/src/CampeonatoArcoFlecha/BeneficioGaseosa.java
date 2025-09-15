package CampeonatoArcoFlecha;

import SistemaBebidas.Bebida;

import java.util.HashSet;

public class BeneficioGaseosa extends Beneficio implements AccionAcumulable {
    private HashSet<Bebida>gaseosas;

    public BeneficioGaseosa(String nombre, Cliente user, HashSet<Bebida> gaseosas) {
        super(nombre, user);
        this.gaseosas = gaseosas;
    }

    public HashSet<Bebida> getGaseosas() {
        return gaseosas;
    }

    public void setGaseosas(HashSet<Bebida> gaseosas) {
        this.gaseosas = gaseosas;
    }

    @Override
    public int descuentoExtra() {
        return 1000;
    }
}
