package FragmentoCodigo;

public class MainThrow {
    public static void Main(String[] args) {
        String nombre = null;
        System.out.println("El largo del nombre es:" + nombre.length());
        try {
            if (nombre==null)throw new NullPointerException("Tenes una variable null!");

        }catch (NullPointerException e){
            System.err.println(e);
        }finally {
            System.out.println("Tiago Davila");
        }
    }
}
