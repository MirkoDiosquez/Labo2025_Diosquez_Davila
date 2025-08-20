package FragmentoCodigo;

public class MainClasePersonalizada {
        public static void Main(String[] args) {
            try {
                String nombre = null;
                if (nombre == null) throw new MsgNullPointerException("Tienes una variable null");
                System.out.println("El largo del nombre es:" + nombre.length());
            } catch (MsgNullPointerException e) {
                e.getMessage();
            }
        }
}
