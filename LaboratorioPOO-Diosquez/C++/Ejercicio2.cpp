#include <iostream>
#include <vector>
using namespace std;

struct fecha_t {
    int dia;
    int mes;
    int anio;
};

struct productos_t {
    string nombre;
    int codigo;
    string marca;
    float precio;
    bool vencimiento;
    fecha_t fecha;
};

int columnapreciomayor(vector<vector<productos_t>>  gondola) {
    int totalColumna = 0;
    int mayorPrecio = 0;
    int ColumnaMayor = 0;
    for (int j = 0; j < 4; j++) {
        totalColumna = 0;
        for (int i = 0; i < 3; i++) {
            totalColumna += gondola[i][j].precio;
        }
        if (totalColumna > mayorPrecio) {
            mayorPrecio = totalColumna;
            ColumnaMayor = j;
        }
    }
    return ColumnaMayor;    
}

void nombre(vector<vector<productos_t>>  gondola) {
    cout << "El nombre del producto de la fila 2 columna 3 es: " 
         << gondola[2][3].nombre << endl;
}

void promedio(vector<vector<productos_t>>  gondola) {
    float auxi = 0;
    for (int i = 0; i < gondola.size(); i++) {
        for (int j = 0; j < gondola[i].size(); j++) {
            auxi += gondola[i][j].precio;
        }
    }
    auxi /= 12;
    cout << "El promedio de valor de los productos es de: " << auxi << endl;
}
int cantProductosVenc (vector<vector<productos_t>> gondola)
{
    int auxi = 0 ; 
    for (int i = 0; i < gondola.size(); i++) 
    {
        for (int j = 0; j < gondola[i].size(); j++) 
        {
            if (gondola[i][j].vencimiento == true)
            {
                auxi ++ ;
            }
        }
    }
    cout << "La cantidad de productos con fecha de vencimiento es de:" << auxi << endl ;
    return auxi ;
}   

int main() {
    vector<vector<productos_t>> gondola(3, vector<productos_t>(4)) ;

    gondola[0][0] = {"Leche Entera", 101, "La Serenísima", 59.90, false, {}};
    gondola[0][1] = {"Pan de Molde", 102, "Bimbo", 119.50, true, {20, 3, 2025}};
    gondola[0][2] = {"Jugo de Naranja", 103, "TetraPak", 110.00, false, {}};
    gondola[0][3] = {"Yogurt Natural", 104, "Danone", 79.90, true, {5, 12, 2025}};

    gondola[1][0] = {"Aceite de Oliva", 105, "La Española", 299.99, false, {}};
    gondola[1][1] = {"Cereal Integral", 106, "Kellogg's", 180.75, true, {25, 8, 2023}};
    gondola[1][2] = {"Galletitas de Chocolate", 107, "Chocolinas", 85.00, false, {}};
    gondola[1][3] = {"Arroz Integral", 108, "Luchito", 115.50, true, {2, 1, 2026}};

    gondola[2][0] = {"Agua Mineral", 109, "Villa del Sur", 40.00, false, {}};
    gondola[2][1] = {"Cerveza", 110, "Quilmes", 150.50, true, {7, 4, 2024}};
    gondola[2][2] = {"Papel Higiénico", 111, "Regio", 125.00, false, {}};
    gondola[2][3] = {"Detergente Líquido", 112, "Skip", 99.90, true, {23, 9, 2024}};

    int aux = 0;
    
    while (true) {
        cout << "Ingrese 1 para ver la columna de la gondola que tiene mayor precio" << endl;
        cout << "Ingrese 2 para ver el nombre del producto de la fila 2 y columna 3" << endl;
        cout << "Ingrese 3 para ver el promedio del precio de la gondola" << endl;
        cout << "Ingrese 4 para ver la cantidad de productos con fecha de vencimiento" << endl;
        cout << "Ingrese 5 para finalizar el programa" << endl;
        cin >> aux;

        switch (aux) 
        {
            case 1:
                cout << "La columna con mayor precio es: " << columnapreciomayor(gondola) << endl;
                break;
            case 2:
                nombre(gondola);
                break;
            case 3:
                promedio(gondola);
                break;
            case 4:
                cantProductosVenc(gondola);
                break;
            case 5:
                cout << "Programa finalizado" ;
                return 0 ;
        }
    }
}