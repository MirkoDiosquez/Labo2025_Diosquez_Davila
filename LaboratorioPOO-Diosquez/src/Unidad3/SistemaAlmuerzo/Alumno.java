package Unidad3.SistemaAlmuerzo;

public class Alumno extends PersonaColegio
{
    private String division ;

    public Alumno (String nombre, String apellido, String division) {
        super(nombre, apellido);
        this.division = division ;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public static void main(String[] args)
    {
        Alumno a1 =  new Alumno("Federico","Petro","2°CST C") ;
    }

}
