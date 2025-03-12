#include <iostream>
#include <vector>
using namespace std ;
struct Fecha_t {
    int dia;
    int mes;
    int anio;
};
struct Paciente{
    string nombre; 
    int edad;
    int numeroHistoria;
    Fecha_t fecha;
};
void ingresar(vector <Paciente> &pacientes){
    Paciente paciente;
    int n = 0 ; 
    cout << "1 para insertar datos o 2 para salir: " ;
    cin >> n ;
    while ( n == 1 )
    {
        cout << "Ingrese nombre del paciente: " ;
        cin >> paciente.nombre ;
        cout << "Ingrese edad del paciente: "  ;
        cin >> paciente.edad;
        cout << "Ingrese numero de historia: " ;
        cin >> paciente.numeroHistoria ;
        cout << "Ingrese dia de la fecha: "  ;
        cin >> paciente.fecha.dia ; 
        cout << "Ingrese mes de la fecha: "  ;
        cin >> paciente.fecha.mes ; 
        cout << "Ingrese anio de la fecha: "  ;
        cin >> paciente.fecha.anio ; 
        pacientes.push_back(paciente) ;
        cout << "1 para insertar datos o 2 para salir: " ;
        cin >> n ;
        cin.ignore() ;
    }
}
void cancelar(vector <Paciente> &paciente){
    int numero;
    cout<<"dime el numero de historia del paciente"<<endl;
    cin>> numero;
    for (int i = 0; i < paciente.size(); i++)
    {
        if(numero== paciente[i].numeroHistoria)
        paciente.erase(paciente.begin()+i);
    }
}
void mostrarDia(vector <Paciente> paciente){
    int dia;
    int mes;
    int anio;
    cout<<"dime el dia"<<endl;
    cin>> dia;
    cout<<"dime el mes"<<endl;
    cin>> mes;
    cout<<"dime el anio"<<endl;
    cin>> anio;
    for (int i = 0; i < paciente.size(); i++)
    {
        if(dia== paciente[i].fecha.dia)
        {
            if(mes== paciente[i].fecha.mes)
            {
                if(anio== paciente[i].fecha.anio)
                {
                    cout << "Nombre del paciente: " << paciente[i].nombre << endl;
                    cout << "Edad del paciente: " << paciente[i].edad << endl;
                    cout << "Numero de historia: " << paciente[i].numeroHistoria << endl;
                    cout << "Fecha: " << paciente[i].fecha.dia << "/" << paciente[i].fecha.mes << "/" << paciente[i].fecha.anio << endl;
                }
            }
        }
    }
}
void mostrarHistoria (vector <Paciente> pacientes){
    string numero; 
    cout<<"dime el numero de historia del paciente"<<endl;
    cin>> numero;
    for (int i = 0; i < count; i++)
    {
        /* code */
    }
    
}
int main(){
    vector <Paciente> pacientes;
    ingresar(pacientes);
    return 0;
}
