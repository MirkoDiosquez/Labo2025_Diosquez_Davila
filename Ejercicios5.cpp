#include <iostream>
#include <vector>
using namespace std;
struct Producto{
    string nombre;
    bool promocion;
    int cantVentas;
    string categoria ;
};
struct fecha_t {
    int dia;
    int mes;
    int anio;
};
struct Pedido{
    string nombre;
    string productos;
    int cantidad;
    int precio;
    fecha_t fecha;

};
void insertar(vector<Producto> &productos){
    Producto producto;
    int n = 0;
    cout << "1 para insertar datos o 2 para salir: ";
    cin >> n;
    while (n == 1) {
        cout << "Ingrese nombre del producto: "<<endl;
        cin >> producto.nombre;
        cout << "Ingrese si esta en promocion: "<<endl;
        cin >> producto.promocion;
        cout << "Ingrese la cantidad de ventas: "<<endl;
        cin >> producto.cantVentas;
        cout << "Ingrese la categoria del producto: "<<endl;
        cin >> producto.categoria;
        productos.push_back(producto);
        cout << "1 para insertar datos o 2 para salir: "<<endl;
        cin >> n;
        cin.ignore();
    }
}
void realizarPedido(vector<Pedido> &pedidos, vector<Producto> &productos){
    Pedido pedido;
    int n=0;
    cout << "1 para insertar datos o 2 para salir: "<<endl;
    cin >> n;
    while(n==1){
        cout << "Ingrese nombre del cliente: "<<endl;
        cin >> pedido.nombre;
        cout << "Ingrese el producto: "<<endl;
        cin >> pedido.productos;
        cout << "Ingrese la cantidad: "<<endl;
        cin >> pedido.cantidad;
        cout << "Ingrese el precio: "<< endl;
        cin >> pedido.precio;
        cout << "Ingrese dia de la fecha: "<< endl;
        cin >> pedido.fecha.dia; 
        cout << "Ingrese mes de la fecha: "<< endl;
        cin >> pedido.fecha.mes; 
        cout << "Ingrese anio de la fecha: "<< endl;
        cin >> pedido.fecha.anio; 
        if(productos.promocion= true){
            cout<<"El precio total es: "<<pedido.cantidad*pedido.precio*1.2<<endl;
        }
        else
        cout<<"El precio total es: "<<pedido.cantidad*pedido.precio<<endl;

        pedidos.push_back(pedido);
        cout << "1 para insertar datos o 2 para salir: " << endl;
        cin >> n;
        cin.ignore();
}
}

int main(){
    vector<Pedido> pedidos;
    vector<Producto> productos;
    insertar(productos);
    return 0;

}