package EstructuraONG;

import java.sql.SQLOutput;
import java.util.HashSet;

public class SistemaBanco {
    HashSet<Banco> bancoHashSet;

    public SistemaBanco(HashSet<Banco> bancoHashSet) {
        this.bancoHashSet = bancoHashSet;
    }

    public HashSet<Banco> getBancoHashSet() {
        return bancoHashSet;
    }

    public void setBancoHashSet(HashSet<Banco> bancoHashSet) {
        this.bancoHashSet = bancoHashSet;
    }
    public void mostrarCantTrabajadorBanco(){
        for (Banco b: bancoHashSet){
            System.out.println("El banco: "+ b.getNombre() + " Tiene " + b.getUsuarios().size() + " Usuarios");
        }
    }
}
