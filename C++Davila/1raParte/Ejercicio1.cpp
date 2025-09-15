#include <iostream>
#include <vector>
using namespace std ;

struct fecha_t
{
    int dia ;
    int mes ;
    int anio ;
};

struct empleado_t
{
    string nombre ;
    string apellido;
    fecha_t nacimiento;
    string sexo ;
    int salario ;
} ;

void Insertar (vector <empleado_t> & empleados)
{
    empleado_t empleado;
    int n = 0 ; 
    cout << "1 para insertar datos o 2 para salir: " ;
    cin >> n ;
    while ( n == 1 )
    {
        cout << "Ingrese nombre: " ;
        cin >> empleado.nombre ;
        cout << "Ingrese apellido: "  ;
        cin >> empleado.apellido;
        cout << "Ingrese dia de nacimiento: " ;
        cin >> empleado.nacimiento.dia ;
        cout << "Ingrese mes de nacimiento: "  ;
        cin >> empleado.nacimiento.mes ; 
        cout << "Ingrese anio de nacimiento: "  ;
        cin >> empleado.nacimiento.anio ;
        cout << "Ingrese sexo: " ;
        cin >> empleado.sexo ;
        cout << "Ingrese salario: " ;
        cin >> empleado.salario ;
        empleados.push_back(empleado) ;
        cout << "1 para insertar datos o 2 para salir: " ;
        cin >> n ;
        cin.ignore() ;
    }
}

int empleadoConMayorSueldo( vector<empleado_t> & empleados , vector <string> & menores )
{
    empleado_t aux ;
    for (int i = 0 ; i < empleados.size() ; i++ )
    {
        if(empleados[i].salario <= 400000 )
        {
            menores.push_back(empleados[i].nombre) ;
        }
    }
    for (int i = 0; i < empleados.size() - 1; i++) {
        for (int j = i + 1; j < empleados.size(); j++) 
        {  
            if (empleados[i].salario < empleados[j].salario) 
            {
                aux = empleados[i];
                empleados[i] = empleados[j];
                empleados[j] = aux;
            }
        }
    }
    
    
}

void imprimir(vector<empleado_t> empleados , vector <string>  menores)
{
    cout << "El empleado con mayor sueldo es " << empleados[0].nombre << " con un sueldo de " << empleados[0].salario << endl ;
    cout << "Los empleados con un sueldo menor a 400k son: " ;
    for(int i = 0 ; i < menores.size(); i++ )
    {
        cout << menores[i] << endl ;
    }
}

int main()
{
    vector <empleado_t> empleados = {} ;
    vector <string> menores = {} ;
    Insertar(empleados);
    empleadoConMayorSueldo(empleados , menores) ;
    imprimir (empleados , menores );
}

