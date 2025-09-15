package CampeonatoArcoFlecha;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SistemaBar {
    private HashSet<Bar>bares;
    private HashSet<Diana>dianas;
    private HashSet<Beneficio>beneficios;

    public SistemaBar(HashSet<Bar> bares, HashSet<Diana> dianas, HashSet<Beneficio> beneficios) {
        this.bares = bares;
        this.dianas = dianas;
        this.beneficios = beneficios;
    }

    public HashSet<Bar> getBares() {
        return bares;
    }

    public void setBares(HashSet<Bar> bares) {
        this.bares = bares;
    }

    public HashSet<Diana> getDianas() {
        return dianas;
    }

    public void setDianas(HashSet<Diana> dianas) {
        this.dianas = dianas;
    }

    public HashSet<Beneficio> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(HashSet<Beneficio> beneficios) {
        this.beneficios = beneficios;
    }



    public Diana dianaMasPuntaje(){
        Diana aux = null;
        for(Diana d:dianas){
            if(d.getPuntajes().size()>aux.getPuntajes().size()){
                aux=d;
            }
        }
        return aux;
    }

    public static void main(String[] args) {
        HashMap<Integer, Color> puntajes= new HashMap<>();
        puntajes.put(2, Color.AMARRILLO);
        puntajes.put(3, Color.VERDE);
        puntajes.put(4, Color.NEGRO);
        DianaCircular d1 = new DianaCircular("Teo", Nivel.FACIL, puntajes);
        DianaCuadrada d2 = new DianaCuadrada("Maxi", Nivel.FACIL, puntajes, 4);
        DianaRectangular d3 = new DianaRectangular("Mirjo", Nivel.FACIL, puntajes, 3,4);
        HashSet<Diana> dianaHashSet = new HashSet<>();
        dianaHashSet.add(d1);
        dianaHashSet.add(d3);
        dianaHashSet.add(d2);
        HashSet<String> comidas = new HashSet<>();
        comidas.add("hamburgesa");
        comidas.add("pizza");
        BeneficioComida beneficioComida= new BeneficioComida("Hamburguesa", null, comidas );
        HashSet<Beneficio> beneficios1 = new HashSet<>();
        Bar bar = new Bar(dianaHashSet, beneficios1, 0 );
        System.out.println("El area es: "+ d1.calcularArea());
        System.out.println("Cantidad de tragos: "+ bar.cantBeneficiosTrago());

    }

}
