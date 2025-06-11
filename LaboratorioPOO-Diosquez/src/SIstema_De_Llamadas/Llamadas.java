package SIstema_De_Llamadas;

public class Llamadas {
    private Empleado empleado1;
    private Empleado empleado2;
    private boolean exterior;
    private int duracion;
    private Fecha fecha;

    public Llamadas(Empleado empleado1, Empleado empleado2, boolean exterior, int duracion, Fecha fecha){
        this.empleado1= empleado1;
        this.empleado2= empleado2;
        if(empleado1.getPais() != empleado2.getPais()){
            this.exterior= true;
        }
        else{
            this.exterior= false;
        }
        this.duracion= duracion;
        this.fecha=fecha;
    }

    public Empleado getEmpleado1() {
        return empleado1;
    }

    public Empleado getEmpleado2() {
        return empleado2;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public boolean getExterior() {
        return exterior;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setEmpleado1(Empleado empleado1) {
        this.empleado1 = empleado1;
    }

    public void setEmpleado2(Empleado empleado2) {
        this.empleado2 = empleado2;
    }

    public void setExterior(boolean exterior) {
        this.exterior = exterior;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
}
