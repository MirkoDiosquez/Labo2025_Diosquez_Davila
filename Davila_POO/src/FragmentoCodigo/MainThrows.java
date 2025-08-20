package FragmentoCodigo;

public class MainThrows {
    public static int largoNombre(String nombre)throws NullPointerException{
        return nombre.length();
    }
    public static void main(String[] args) {
        try {
            String n = null;
            largoNombre(n);
        }catch (Exception e){
            System.out.println(" Tienes una variable null ! ");

        }finally {
            System.out.println("Tiago Davila");
        }
    }


}
