package GestionDeMascotas;

import java.util.ArrayList;

public class Aplicacion {
    private ArrayList<Animal> mascotas = new ArrayList<>();

    public Aplicacion(ArrayList<Animal> mascotas) {
        this.mascotas = mascotas;
    }
    public void altaMascota(){
        for (Animal a:mascotas){
            System.out.println(a.getDueño() + " " + a.getNombre() + " " + a.getClass().getCanonicalName());
        }
    }
    public void removeMascota(Animal mascotaEliminada){
        mascotas.remove(mascotaEliminada);
    }
    public void modifyMascota(Animal nuevaMascota, Animal mascotaEliminada){
        removeMascota(mascotaEliminada);
        mascotas.add(nuevaMascota);
    }
    public String Saludar(String nombreDueño, Animal Mascota, String tipo){
        if (nombreDueño.equals(Mascota.getDueño()))
            return Mascota.saludar();
        else  Mascota.saludarAgresivo();
        return  "";
    }
    public void removePez(){
        for (Animal m: mascotas){
            if(m instanceof Pez){
                if (m.getVidas()==0)removeMascota(m);
            }
        }
    }
}
