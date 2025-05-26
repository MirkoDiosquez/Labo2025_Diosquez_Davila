    package Unidad3.SistemaAlmuerzo;

    public class PersonaColegio
    {
        private String nombre;
        private String apellido;

        public PersonaColegio(String nombre, String apellido) {
            this.nombre = nombre;
            this.apellido = apellido;
        }

        public PersonaColegio() {
            this.nombre = "Majin";
            this.apellido = "Buu";
        }

        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }
    }
