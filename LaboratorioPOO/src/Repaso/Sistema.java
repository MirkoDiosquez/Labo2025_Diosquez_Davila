package Repaso;

import java.util.ArrayList;

public class Sistema {
    ArrayList<Videoclub> videoclubs = new ArrayList<>();

    public Sistema(ArrayList<Videoclub> videoclubs) {
        this.videoclubs = videoclubs;
    }

    public ArrayList<Videoclub> getVideoclubs() {
        return videoclubs;
    }

    public void setVideoclubs(ArrayList<Videoclub> videoclubs) {
        this.videoclubs = videoclubs;
    }
    public void AddVideoclubs(Videoclub vc){
        videoclubs.add(vc);
    }
    public void bajarVideoclub(Videoclub vc)
    {
        videoclubs.remove(vc);
    }
    public void modificarVideoclub(Videoclub oldVideoClub, Videoclub newVideoclub)
    {
        bajarVideoclub(oldVideoClub);
        AddVideoclubs(newVideoclub);
    }
    public String comunaParticular(String comuna){
        String direccion = "";
        for (Videoclub videoclub:videoclubs)
        {
            if (videoclub.getComuna()== comuna) direccion= videoclub.getDireccion();
        }
        return direccion;
    }
    public void peliculasMayor90(){
        for (Videoclub videoclub:videoclubs)
        {
            for (Estanteria estanteria: videoclub.getEstanterias()){
                for (Pelicula pelicula: estanteria.getPeliculas())
                if (pelicula.getDuracion()>90)System.out.println("El nombre de la pelicula es " + pelicula.getNombre() + "La ubicacion es "+ videoclub.getDireccion());
        }
    }
    public Videoclub mayorCantPeliculas (){
        Videoclub mayPeliculas = null;
        for (Videoclub videoclub1:videoclubs){
            if (videoclub1.cantidadPeliculasVideoClub() > mayPeliculas.cantidadPeliculasVideoClub())mayPeliculas=videoclub1;

        }
        return mayPeliculas;
    }

}
