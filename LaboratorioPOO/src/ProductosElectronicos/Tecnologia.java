package ProductosElectronicos;

public enum Tecnologia {
     ULTRAHD(1800),  CUATROK(1000), FULLHD(800);
     private int resolucion;

     Tecnologia(int resolucion) {
          this.resolucion = resolucion;
     }

     public int getResolucion() {
          return resolucion;
     }

     public void setResolucion(int resolucion) {
          this.resolucion = resolucion;
     }
}
