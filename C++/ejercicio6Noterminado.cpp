#include <iostream>
#include <vector>
using namespace std;

struct Jugador {
    string nombre;
    string apellido;
    int edad;
};

struct Fecha {
    int dia;
    int mes;
    int anio;
};

struct Equipo {
    string nombre;
    int cantGolesContra;
    int cantGolesFavor;
    int posTorneo;
    int puntos;
    vector<char> historial;
    int diferenciaGoles;
    vector<Jugador> jugadores;
};

struct Partido {
    Equipo equipo1;
    Equipo equipo2;
    int golesEquipo1;
    int golesEquipo2;
    Fecha fechaPartido;
    string estadio;
};


void mostrarPartido(vector<Partido> partidos) {
    string equipoLocal, equipoVisitante;
    cout << "Dime el nombre del equipo local: ";
    cin >> equipoLocal;
    cout << "Dime el nombre del equipo visitante: ";
    cin >> equipoVisitante;
    for (int i = 0; i < partidos.size(); i++) {
        if (equipoLocal == partidos[i].equipo1.nombre && equipoVisitante == partidos[i].equipo2.nombre) {
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
    Equipo equipo;
    Partido partido;
    string equipoLocal;
    string equipoVisitante;
    cout << "Dime el nombre del equipo local: ";
    cin >> equipoLocal;
    cout << "Dime el nombre del equipo visitante: ";
    cin >> equipoVisitante;
    for(int e = 0; e < partidos.size(); e++){
    for (int i = 0; i < equipos.size(); i++)
    {
        if (equipoLocal == partidos[i].equipo1.nombre && equipoVisitante == partidos[i].equipo2.nombre)
        {
            equipos[i].cantGolesFavor = partidos[i].golesEquipo1;
            equipos[i].cantGolesContra = partidos[i].golesEquipo2;
            equipos[i].diferenciaGoles = partidos[i].golesEquipo1 - partidos[i].golesEquipo2;

            if(partidos[i].golesEquipo1 > partidos[i].golesEquipo2)
            {
                equipos[i].puntos += 3;
                equipos[i].historial.push_back('V');
            }
            else if(partidos[i].golesEquipo1 < partidos[i].golesEquipo2)
            {
                
                equipos[i].historial.push_back('D');
            }
            else
            {
                equipos[i].puntos += 1;
                equipos[i].historial.push_back('E');
            }
            
        }
    

    
   
}
}
}

void ordenarEquipos(vector<Equipo> &equipos) {
    Equipo aux;
    for (int i = 0; i < equipos.size(); i++) {
        for (int j = i + 1; j < equipos.size(); j++) {
            if (equipos[i].puntos < equipos[j].puntos) {
                aux = equipos[i];
                equipos[i] = equipos[j];
                equipos[j] = aux;
            } else if (equipos[i].puntos == equipos[j].puntos) {
                if (equipos[i].diferenciaGoles < equipos[j].diferenciaGoles) {
                    aux = equipos[i];
                    equipos[i] = equipos[j];
                    equipos[j] = aux;
                }
            }
        }
    }
}


void imprimir(vector<Equipo> equipos) {
    int opcion;
    cout << "Quieres ver la tabla de posiciones: ";
    cin >> opcion;
    if (opcion == 1) {
        for (int i = 0; i < equipos.size(); i++) {
            cout << "Nombre del equipo: " << equipos[i].nombre << endl;
            cout << "Puntos: " << equipos[i].puntos << endl;
            cout << "Goles a favor: " << equipos[i].cantGolesFavor << endl;
            cout << "Goles en contra: " << equipos[i].cantGolesContra << endl;
            for(int j=0; j < equipos[i].historial.size(); j++)
            {
                cout << "Historial de partidos: " << equipos[i].historial[j] << endl;
            }
            
           
        }
    }
}


void ingresarEquipos(vector<Equipo> &equipo) {
    Equipo equipos;
    Jugador jugador;
    for(int i = 0; i < 2; i++){
        cout << "Dime el nombre del equipo: ";
        cin >> equipos.nombre;
        for (int k = 0; k < 2; k++) {
            
            cout << "Dime el nombre del jugador: ";
            cin >> jugador.nombre;
            cout << "Dime el apellido del jugador: ";
            cin >> jugador.apellido;
            cout << "Dime la edad del jugador: ";
            cin >> jugador.edad;
            equipos.jugadores.push_back(jugador);
        }
        equipo.push_back(equipos);
        }
        }
    
    
    void ingresarPartidos(vector<Partido> &partido, vector<Equipo> &equipo) {
        int opcion;
        cout << "1 para insertar datos o 2 para salir: ";
        cin >> opcion;
        while (opcion == 1) {
            Partido partidos;
            cout << "Ingresaras la informacion del equipo 1" << endl;
            cout << "Dime el nombre del equipo local: ";
            cin >> partidos.equipo1.nombre;
            
            for (int i = 0; i < equipo.size(); i++) {
                if (partidos.equipo1.nombre == equipo[i].nombre) {
                    cout << "Dime la cantidad de goles del equipo 1: ";
                    cin >> partidos.golesEquipo1;
                    cout << "Dime el estadio del equipo local: ";
                    cin >> partidos.estadio;
                  
                }
            }
           
    
            cout << "Dime el nombre del equipo 2: ";
            cin >> partidos.equipo2.nombre;
           
            for (int i = 0; i < equipo.size(); i++) {
                if (partidos.equipo2.nombre == equipo[i].nombre) {
                    cout << "Dime la cantidad de goles del equipo 2: ";
                    cin >> partidos.golesEquipo2;
                    
                   
                }
            }
            
    
            cout << "Dime el dia del partido: ";
            cin >> partidos.fechaPartido.dia;
            cout << "Dime el mes del partido: ";
            cin >> partidos.fechaPartido.mes;
            cout << "Dime el anio del partido: ";
            cin >> partidos.fechaPartido.anio;
    
            partido.push_back(partidos);
            cout << "1 para insertar datos o 2 para salir: ";
            cin >> opcion;
        }
        posicionarEquipos(equipo, partido);
        ordenarEquipos(equipo);
    }
int main() {
    vector<Equipo> equipo;
    vector<Partido> partido;
    int opcion = 0;

    while (opcion != 5) {
        cout << "Quieres ingresar equipos - 1" << endl
             << "Quieres ingresar Partidos - 2" << endl
             << "Quieres Mostrar partidos - 3" << endl
             << "Quieres imprimir la tabla de posiciones - 4" << endl
             << "Salir - 5" << endl;
        cin >> opcion;
        switch (opcion) {
            case 1:
                ingresarEquipos(equipo);
                break;
            case 2:
                ingresarPartidos(partido, equipo);
                break;
            case 3:
                mostrarPartido(partido);
                break;
            case 4:
                
                imprimir(equipo);
                break;
            case 5:
                return 0;
            default:
                cout << "Opcion no valida." << endl;
                break;
        }
    }

    return 0;
}