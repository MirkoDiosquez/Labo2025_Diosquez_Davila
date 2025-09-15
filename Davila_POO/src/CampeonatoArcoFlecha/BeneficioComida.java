package CampeonatoArcoFlecha;

import java.util.HashSet;

public class BeneficioComida extends Beneficio implements AccionAcumulable {
    private HashSet<String> comidas;

    public BeneficioComida(String nombre, Cliente user, HashSet<String> comidas) {
        super(nombre, user);
        this.comidas = comidas;
    }

    public HashSet<String> getComidas() {
        return comidas;
    }

    public void setComidas(HashSet<String> comidas) {
        this.comidas = comidas;
    }

    @Override
    public int descuentoExtra() {
        return 4500;
    }
}
