package SIstema_De_Llamadas;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class Sistema {
    private ArrayList<Llamadas> llamadas;
    private ArrayList<Empleado> empleados;

    public Sistema(ArrayList<Llamadas> llamadas){
        this.llamadas.equals(llamadas);
    }

    public ArrayList<Llamadas> getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(ArrayList<Llamadas> llamadas) {
        this.llamadas = llamadas;
    }

    public void ranking(){
        ArrayList<Empleado> rankingemp= empleados;
        ArrayList<Llamadas> llamadasExterior= new ArrayList<>();
        for(int i = 0; i<llamadas.size(); i++){
            if (llamadas.get(i).getExterior()){
                llamadasExterior.add(llamadas.get(i));
            }
        }
        ArrayList<Integer> duraciones= new ArrayList<>();
        int aux= 0;
        for(int f= 0; f<rankingemp.size(); f++){
            aux= 0;
            for(int y = 0; y<llamadasExterior.size(); y++){
                if(rankingemp.get(f)== llamadasExterior.get(y).getEmpleado1()){
                    aux= aux + llamadasExterior.get(y).getDuracion();

                }
            }
            duraciones.add(aux);
        }
        int auxeeee= 0;
        Empleado empaux= new Empleado();
        for(int s= 0; s<duraciones.size(); s++){
            for(int l= s + 1; l<duraciones.size(); l++){
                if (duraciones.get(l)>= duraciones.get(s)){
                    auxeeee= duraciones.get(l);
                    empaux= rankingemp.get(l);
                    duraciones.set(l, auxeeee);
                    rankingemp.set(l, empaux);
                }
            }
        }
        System.out.println("El ranking de las llamadas queda asi: ");
        System.out.println(rankingemp);
        System.out.println(duraciones);
    }

    public void llamadasempl(Empleado emp){
        ArrayList<Llamadas> aux = new ArrayList<>();
        System.out.println("El empleado " + emp + " hizo estas llamadas: ");
        for(int i = 0; i<llamadas.size(); i++){
            if(llamadas.get(i).getEmpleado1() == emp || llamadas.get(i).getEmpleado2() == emp ){
                aux.add(llamadas.get(i));
                System.out.println(llamadas.get(i));
            }
        }
    }
}

