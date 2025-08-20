package FragmentoCodigo;

public class MainTryCatch {
        public static void main(String[] args) {
            try {
                String nombre = null;
                System.out.println("El largo del nombre es:" + nombre.length());
            }catch (NullPointerException exp){
                System.out.println("Variable Null!");
            }
            finally {
                System.out.println("Tiago Davila");
            }
        }


}
