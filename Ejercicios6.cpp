#include <iostream>
#include <vector>
using namespace std;
struct Jugador{
    string nombre;
    string apellido;
    int edad;
};
struct Fecha{
    int dia;
    int mes;
    int anio;
};
struct Equipo{
    string nombre;
    int cantGolesContra;
    int cantGolesFavor;
    int posTorneo;
    string historial;
    Jugador jugador;
};
struct Partido{
    Equipo equipo1;
    Equipo equipo2;
    int golesEquipo1;
    int golesEquipo2;
    Fecha fechaPartido;
    string estadio;
};
void ingresarEquipos(vector <Equipo> &equipo)
{   
    int cantidad;
    Equipo equipo;
    string n;
    cout<< "Quires ingresar equipos: ";
    cin>> n;
    while(n == "si")
    {
        cout<< "Dime el nombre del equipo: ";
        cin>> equipo.nombre;
        cout<< "Dime la cantidad de goles a favor: ";
        cin>> equipo.cantGolesFavor;
        cout<< "Dime la cantidad de goles en contra: ";
        cin>> equipo.cantGolesContra;
        cout<< "Dime la posicion en el torneo: ";
        cin>> equipo.posTorneo;
        cout<< "Dime el historial del equipo: ";
        cin>> equipo.historial;
        cout<< "Dime el nombre del jugador: ";
        cin>> equipo.jugador.nombre;
        cout<< "Dime el apellido del jugador: ";
        cin>> equipo.jugador.apellido;
        cout<< "Dime la edad del jugador: ";
        cin>> equipo.jugador.edad;
        equipo.push_back(equipo);
    }
    
}
void ingresarPartidos(vector <Partido> &partido)
{
    cout<< "Quires ingresar partidos: ";
}
int main(){
    vector <Equipo> equipo;
    vector <Partido> partido;
    ingresarEquipos(equipo);
    return 0;
}