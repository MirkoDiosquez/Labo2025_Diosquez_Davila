#include <iostream>
#include <vector>
using namespace std;
int cant_pilotos = 20 ;

struct piloto_t 
{
    string nombre ;
    int numero_auto ;
    string equipo ;
    int posicion_inicial ;
    int posicion_final ;
    int puntos ;
};
struct vueltarap_t
{
    int numero_vuelta;
    int tiempo;
    string nombre_piloto;
};
      
struct equipo_t
{
    string nombre;
    int puntos;
};


void cargarDatosCarrera(vector<piloto_t> & pilotos, vueltarap_t & vuelta)
{
    piloto_t auxx ;
    bool auxTF ;
    for (int i = 0 ; i < cant_pilotos ; i ++)
    {
        cout << "Ingrese los datos del piloto que llego en la posicion " << i + 1 << endl ;
        cout << "Nombre: " ;
        cin >> auxx.nombre ;
        cout << "Numero del auto: " ;
        cin >> auxx.numero_auto ;
        cin.ignore();
        cout << "Nombre del equipo: " ;
        getline (cin , auxx.equipo) ;
        cout << "Posicion inicial: " ;
        cin >> auxx.posicion_inicial ;
        cout << "Posicion final: " ;
        cin >> auxx.posicion_final ;
        cout << "¿Hizo la vuelta rápida?" << endl ;
        cin >> auxTF ;
        if (auxTF == true )
        {
            vuelta.nombre_piloto = auxx.nombre ;
            cout << "Numero de vuelta de la vuelta rápida:" ;
            cin >> vuelta.numero_vuelta ;
            cout << "Tiempo de vuelta de la vuelta rápida:" ;
            cin >> vuelta.tiempo ;
        }
        pilotos.push_back(auxx) ;
    }
}

void calcularPuntajePilotoEquipo(vector<piloto_t> & pilotos, vueltarap_t vuelta)
{
    pilotos[0].puntos = 25 ;
    pilotos[1].puntos = 18 ;
    pilotos[2].puntos = 15 ;
    pilotos[3].puntos = 12 ;
    pilotos[4].puntos = 10 ;
    pilotos[5].puntos = 8 ;
    pilotos[6].puntos = 6 ;
    pilotos[7].puntos = 4 ;
    pilotos[8].puntos = 2 ;
    pilotos[9].puntos = 1 ;

    for (int i  = 0 ; i < 10 ; i++)
    {
        if (pilotos[i].nombre == vuelta.nombre_piloto)
        {
            pilotos[i].puntos +=  1 ;
        }
    }
}

void sumarPuntajeEquipo(vector<piloto_t> pilotos, vector<equipo_t> & equipos)
{
    equipos[0].nombre = "Mercedes Benz" ;
    equipos[1].nombre = "Red Bull" ;
    equipos[2].nombre = "Ferrari" ;
    equipos[3].nombre = "McLaren" ;
    equipos[4].nombre = "Kick Sauber" ;
    equipos[5].nombre = "RB" ;
    equipos[6].nombre = "Aston Martin" ;
    equipos[7].nombre = "Alpine" ;
    equipos[8].nombre = "Williams" ;
    equipos[9].nombre = "Haas" ; 

    for (int i = 0 ; i < cant_pilotos ; i++)
    {
        if (pilotos[i].equipo == "Mercedes Benz")
        {
            equipos[0].puntos += pilotos[i].puntos ;
        }
        if (pilotos[i].equipo == "Red Bull")
        {
            equipos[1].puntos += pilotos[i].puntos ;
        }
        if (pilotos[i].equipo == "Ferrari")
        {
            equipos[2].puntos += pilotos[i].puntos ;
        }
        if (pilotos[i].equipo == "McLaren")
        {
            equipos[3].puntos += pilotos[i].puntos ;
        }
        if (pilotos[i].equipo == "Kick Sauber")
        {                
            equipos[4].puntos += pilotos[i].puntos ;
        }
        if (pilotos[i].equipo == "RB")
        {
            equipos[5].puntos += pilotos[i].puntos ;
        }
        
        if (pilotos[i].equipo == "Aston Martin")
        {
            equipos[6].puntos += pilotos[i].puntos ;
        }   
        if (pilotos[i].equipo == "Alpine")
        {
            equipos[7].puntos += pilotos[i].puntos ;
        }
        if (pilotos[i].equipo == "Williams")
        {
            equipos[8].puntos += pilotos[i].puntos ;
        }
        if (pilotos[i].equipo == "Haas")
        {
            equipos[9].puntos += pilotos[i].puntos ;
        }
    }
}

void ordenarTablaEquipos(vector<equipo_t> & equipos) 
{
    equipo_t aux ;
    for (int i = 0 ; i > equipos.size() ; i++)
    {
        if (equipos[i].puntos < equipos[i+1].puntos )
        {
            aux = equipos[i] ;
            equipos[i] = equipos[i+1] ;
            equipos[i+1] = aux ;
        }
    } 
}

void mostrarTablaEquipos(vector<equipo_t> equipos)
{
    cout << "El equipo CAMPEON ANUAL de la F1 es " << equipos[0].nombre << " con " << equipos[0].puntos << " puntos " << endl ;
    cout << "A continuacion mostraremos como quedo la tabla final" << endl ;
    
    cout << "1.° " << equipos[0].nombre << equipos[0].puntos << " pts" << endl ;
    cout << "2.° " << equipos[1].nombre << equipos[1].puntos << " pts" << endl ;
    cout << "3.° " << equipos[2].nombre << equipos[2].puntos << " pts" << endl ;
    cout << "4.° " << equipos[3].nombre << equipos[3].puntos << " pts" << endl ;
    cout << "5.° " << equipos[4].nombre << equipos[4].puntos << " pts" << endl ;
    cout << "6.° " << equipos[5].nombre << equipos[5].puntos << " pts" << endl ;
    cout << "7.° " << equipos[6].nombre << equipos[6].puntos << " pts" << endl ;
    cout << "8.° " << equipos[7].nombre << equipos[7].puntos << " pts" << endl ;
    cout << "9.° " << equipos[8].nombre << equipos[8].puntos << " pts" << endl ;
    cout << "10.° " << equipos[9].nombre << equipos[9].puntos << " pts" << endl ;

    
}

int main()
{
    vueltarap_t vuelta ;
    vector<equipo_t> equipos;
    vector<piloto_t> pilotos;
    for (int i = 0; i < 3; i++)
    {       
    cout << "A continuacion estaras ingresando los datos de la carrea número " << i + 1 << endl ;    
    cargarDatosCarrera(pilotos, vuelta );
    calcularPuntajePilotoEquipo(pilotos, vuelta);  
    sumarPuntajeEquipo(pilotos, equipos);
    } 
    ordenarTablaEquipos(equipos);
    mostrarTablaEquipos(equipos);
}
