package Alarmas;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Dispositivo> dispositivos = new ArrayList<>();

    public Sistema(ArrayList<Dispositivo> dispositivos) {
        this.dispositivos = dispositivos;
    }
    public Sistema(){this.dispositivos=null;}

    public ArrayList<Dispositivo> getDispositivos() {
        return dispositivos;
    }

    public void setDispositivos(ArrayList<Dispositivo> dispositivos) {
        this.dispositivos = dispositivos;
    }
    public void addDispositivo(Dispositivo nuevoDispositivo){
        dispositivos.add(nuevoDispositivo);
    }
    public void removeDispositivo(Dispositivo dispositivoRemover){
        dispositivos.remove(dispositivoRemover);
    }
    public void modifyDispositivo(Dispositivo nuevo, Dispositivo removido){
        removeDispositivo(removido);
        addDispositivo(nuevo);
    }
}
