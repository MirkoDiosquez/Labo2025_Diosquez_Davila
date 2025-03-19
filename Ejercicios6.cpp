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
    int puntos;
    vector <char> historial;
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
    Equipo equipos;
    string n;
    cout<< "Quires ingresar equipos: ";
    cin>> n;
    while(n == "si")
    {
        for (int i = 0; i <= 24; i++)
        {
        cout<< "Dime el nombre del equipo: ";
        cin>> equipos.nombre;
               
        for (int i = 0; i <= 11; i++)
        {
        cout<< "Dimes el nombre del jugador: ";
        cin>> equipos.jugador.nombre;
        cout<< "Dimes el apellido del jugador: ";
        cin>> equipos.jugador.apellido;
        cout<< "Dimes la edad del jugador: ";
        cin>> equipos.jugador.edad;
        equipo.push_back(equipos);
    }
    }
    }
    
}
void ingresarPartidos(vector <Partido> &partido, vector <Equipo> &equipo)
{   
    int opcion;
    cout<< "1 para insertar datos o 2 para salir: : ";
    cin>> opcion;
    Partido partidos;
    Equipo equipos;
    while(opcion == 1)
    {
        cout<<"ingresaras la informacion del equipo 1"<< endl;
        cout<< "Dime el nombre del equipo local: ";
        cin>> partidos.equipo1.nombre;
       for (int i = 0; i < equipo.size(); i++)
       {
        if(partidos.equipo1.nombre == equipo[i].nombre)
        {
            cout<< "Dime la cantidad de goles del equipo 1: ";
            cin>> partidos.golesEquipo1;
            cout<< "Dime el estadio del equipo local: ";
            cin>> partidos.estadio;
            
        }
        else
        {
            cout<< "El equipo no existe";
        }
       }
       
        cout<< "Dime el nombre del equipo 2: ";
        cin>> partidos.equipo2.nombre;
        for (int i = 0; i < equipo.size(); i++)
         {
        if(partidos.equipo2.nombre == equipo[i].nombre)
        {
            cout<< "Dime la cantidad de goles del equipo 2: ";
            cin>> partidos.golesEquipo2;
            cout<< "Dime el estadio del equipo visitante: ";
            cin>> partidos.estadio;
            
        }
        else
        {
            cout<< "El equipo no existe";
        }
       }
       
        cout<< "Dime el dia del partido: ";
        cin>> partidos.fechaPartido.dia;
        cout<< "Dime el mes del partido: ";
        cin>> partidos.fechaPartido.mes;
        cout<< "Dime el anio del partido: ";
        cin>> partidos.fechaPartido.anio;
        
        partido.push_back(partidos);
        cout<< "1 para insertar datos o 2 para salir: ";
        cin>> opcion;
    }
}
void mostrarPartido(vector<Partido> partidos){
    Partido pedidos;
    string equipoLocal;
    string equipoVisitante;
    cout << "Dime el nombre del equipo local: ";
    cin >> equipoLocal;
    cout << "Dime el nombre del equipo visitante: ";
    cin >> equipoVisitante;
    for (int i = 0; i < partidos.size(); i++)
    {
        if (equipoLocal == partidos[i].equipo1.nombre && equipoVisitante == partidos[i].equipo2.nombre)
        {
            cout << "Nombre del equipo local: " << partidos[i].equipo1.nombre << endl;
            cout << "Goles del equipo local: " << partidos[i].golesEquipo1 << endl;
            cout << "Nombre del equipo visitante: " << partidos[i].equipo2.nombre << endl;
            cout << "Goles del equipo visitante: " << partidos[i].golesEquipo2 << endl;
            cout << "Fecha: " << partidos[i].fechaPartido.dia << "/" << partidos[i].fechaPartido.mes << "/" << partidos[i].fechaPartido.anio << endl;
            cout << "Estadio: " << partidos[i].estadio << endl;
        }
    }
}
void posicionarEquipos(vector<Equipo> &equipos, vector<Partido> partidos){
    Equipo equipos;
    Partido partidos;
    Partido pedidos;
    string equipoLocal;
    string equipoVisitante;
    cout << "Dime el nombre del equipo local: ";
    cin >> equipoLocal;
    cout << "Dime el nombre del equipo visitante: ";
    cin >> equipoVisitante;
    for (int i = 0; i < partidos.size(); i++)
    {
        if (equipoLocal == partidos[i].equipo1.nombre && equipoVisitante == partidos[i].equipo2.nombre)
        {
            if(partidos[i].golesEquipo1 > partidos[i].golesEquipo2)
            {
                equipos[i].puntos + 3;
                equipos[i].historial.push_back('V');
            }
            else if(partidos[i].golesEquipo1 < partidos[i].golesEquipo2)
            {
                equipos[i].puntos = 0;
                equipos[i].historial.push_back('D');
            }
            else
            {
                equipos[i].puntos = 1;
            }
        }

    
   
}}
void ordenarEquipos(vector<Equipo> &equipos){
    Equipo aux;
    for (int i = 0; i < equipos.size(); i++)
    {
        for (int j = 0; j < equipos.size(); j++)
        {
            if(equipos[i].puntos > equipos[j].puntos){
                aux = equipos[i];
                equipos[i] = equipos[j];
                equipos[j] = aux;
                
            }else if(equipos[i].puntos == equipos[j].puntos){
                if(equipos[i].cantGolesFavor > equipos[j].cantGolesFavor){
                    aux = equipos[i];
                    equipos[i] = equipos[j];
                    equipos[j] = aux;
                }
            }
        }
    }
}
void imprimir(vector <Equipo> equipos){
    int opcion;
    cout << "quieres ver la tabla de posiciones: ";
    cin >> opcion;
    if(opcion == 1)
    {
        for (int i = 0; i < equipos.size(); i++)
        {
            cout << "Nombre del equipo: " << equipos[i].nombre;
            cout << "Puntos: " << equipos[i].puntos ;
            cout << "Goles a favor: " << equipos[i].cantGolesFavor ;
            cout << "Goles en contra: " << equipos[i].cantGolesContra ;
            cout << "Historial: " << equipos[i].historial << endl;
        }
    }
    

}
int main(){
    vector <Equipo> equipo;
    vector <Partido> partido;
    vector<Equipo> posiciones;

    ingresarEquipos(equipo);
    return 0;
}