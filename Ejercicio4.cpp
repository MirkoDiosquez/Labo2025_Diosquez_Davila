#include <iostream>
#include <vector>
using namespace std;

struct Fecha_t {
    int dia;
    int mes;
    int anio;
};

struct Paciente {
    string nombre; 
    int edad;
    int numeroHistoria;
    Fecha_t fecha;
};

void ingresar(vector<Paciente> &pacientes) {
    Paciente paciente;
    int n = 0; 
    cout << "1 para insertar datos o 2 para salir: ";
    cin >> n;
    while (n == 1) {
        cout << "Ingrese nombre del paciente: ";
        cin >> paciente.nombre;
        cout << "Ingrese edad del paciente: ";
        cin >> paciente.edad;
        cout << "Ingrese numero de historia: ";
        cin >> paciente.numeroHistoria;
        cout << "Ingrese dia de la fecha: ";
        cin >> paciente.fecha.dia; 
        cout << "Ingrese mes de la fecha: ";
        cin >> paciente.fecha.mes; 
        cout << "Ingrese anio de la fecha: ";
        cin >> paciente.fecha.anio; 
        pacientes.push_back(paciente);
        cout << "1 para insertar datos o 2 para salir: ";
        cin >> n;
        cin.ignore();
    }
}

void cancelar(vector<Paciente> &pacientes) {
    int numero;
    cout << "Dime el numero de historia del paciente: ";
    cin >> numero;
    for (int i = 0; i < pacientes.size(); i++) {
        if (numero == pacientes[i].numeroHistoria) {
            pacientes.erase(pacientes.begin() + i);
            break;
        }
    }
}

void mostrarDia(const vector<Paciente> &pacientes) {
    int dia, mes, anio;
    cout << "Dime el dia: ";
    cin >> dia;
    cout << "Dime el mes: ";
    cin >> mes;
    cout << "Dime el anio: ";   
    cin >> anio;
    for (const auto &paciente : pacientes) {
        if (dia == paciente.fecha.dia && mes == paciente.fecha.mes && anio == paciente.fecha.anio) {
            cout << "Nombre del paciente: " << paciente.nombre << endl;
            cout << "Edad del paciente: " << paciente.edad << endl;
            cout << "Numero de historia: " << paciente.numeroHistoria << endl;
            cout << "Fecha: " << paciente.fecha.dia << "/" << paciente.fecha.mes << "/" << paciente.fecha.anio << endl;
        }
    }
}

void mostrarHistoria(const vector<Paciente> &pacientes) {
    int numero; 
    cout << "Dime el numero de historia del paciente: ";
    cin >> numero;
    for (const auto &paciente : pacientes) {
        if (numero == paciente.numeroHistoria) {
            cout << "Nombre del paciente: " << paciente.nombre << endl;
            cout << "Edad del paciente: " << paciente.edad << endl;
            cout << "Numero de historia: " << paciente.numeroHistoria << endl;
            cout << "Fecha: " << paciente.fecha.dia << "/" << paciente.fecha.mes << "/" << paciente.fecha.anio << endl;
        }
    }
}

int main() {
    vector<Paciente> pacientes;
    string opcion;
    cout << "Quieres ingresar Pacientes - 1" << endl
         << "Quieres cancelar Pacientes - 2" << endl
         << "Quieres mostrar pacientes por dia - 3" << endl
         << "Quieres mostrar pacientes por numero de historia - 4" << endl;
    cin >> opcion;
    if (opcion == "1") {
        ingresar(pacientes);
    } else if (opcion == "2") {
        cancelar(pacientes);
    } else if (opcion == "3") {
        mostrarDia(pacientes);
    } else if (opcion == "4") {
        mostrarHistoria(pacientes);
    }
    return 0;
}
