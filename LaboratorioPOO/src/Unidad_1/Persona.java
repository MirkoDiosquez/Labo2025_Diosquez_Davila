package Unidad_1;

public abstract class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    public Persona(String nombre, int edad, String direccion){
        this.nombre=nombre;
        this.edad=edad;
        this.direccion=direccion;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarInfo(){
        System.out.println("El nombre es "+ getNombre());
        System.out.println("La edad es "+ getEdad());
        System.out.println("La direccion es "+ getDireccion());
    }
}

