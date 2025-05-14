package Unidad_1;


import java.util.ArrayList;

public class CD {
    private ArrayList<Cancion> cd = new ArrayList<Cancion>();

    public CD(){
        cd= new ArrayList<Cancion>();
    }

    public ArrayList<Cancion> getCd() {
        return cd;
    }

    public void setCd(ArrayList<Cancion> cd) {
        this.cd = cd;
    }
    public void numeroCanciones(){
        System.out.println("El numero de canciones es "+ cd.size());
    }
    public Cancion posicionCancion (int posicion){
        for (int i = 0; i < cd.size(); i++) {
            if (posicion== i){
                return cd.get(posicion);
            }

        }
        return  null;
    }
    public void grabarCancion(int posicion, Cancion nuevaCancion){
        cd.set(posicion, nuevaCancion );
    }
    public void agregarCancion(Cancion cancion){
        cd.add(cancion);
    }
    public void eliminarCanciones(int posicion){
                cd.remove(posicion);
        }
    }

