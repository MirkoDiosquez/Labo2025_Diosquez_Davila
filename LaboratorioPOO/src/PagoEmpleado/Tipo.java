package PagoEmpleado;

public enum Tipo {
    UX(8), UI(7), IT(12);
    private double comision;

    Tipo(double comision) {
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
}
