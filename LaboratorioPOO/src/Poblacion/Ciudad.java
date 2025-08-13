package Poblacion;

import java.util.HashSet;

public class Ciudad  extends Lugar{
 private HashSet<Barrio> barrios = new HashSet<>();

 public Ciudad(String nombre, int codigo, Coordenadas coordenadas, HashSet<Barrio> barrios) {
  super(nombre, codigo, coordenadas);
  this.barrios = barrios;
 }

 public HashSet<Barrio> getBarrios() {
  return barrios;
 }

 public void setBarrios(HashSet<Barrio> barrios) {
  this.barrios = barrios;
 }

 public void addLugar(Barrio b){
  barrios.add(b);
 }

 public void removeLugar(Barrio b){
  barrios.remove(b);
 }
 public void modifyL(Barrio lN, Barrio lR){
  removeLugar(lR);
  addLugar(lN);
 }
 public int cantPoblacion(){
  int cantidad=0;
  for (Barrio b: barrios){
   cantidad+=b.getPoblacion();
  }
  return cantidad;
 }
}
