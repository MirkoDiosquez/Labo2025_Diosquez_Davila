#include <iostream>
#include <vector>
using namespace std;
struct Producto{
    string nombre;
    bool promocion;
    int cantVentas;
    int precio;
    string categoria ;
};
struct fecha_t {
    int dia;
    int mes;
    int anio;
};
struct Pedido{
    string nombre;
    Producto productos;
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
        cout << "Ingrese el precio del producto "<<endl;
        cin >> producto.precio;
        cout << "Ingrese si esta en promocion 0 para no/1 para si : "<<endl;
        cin >> producto.promocion;
        if(producto.promocion == true){
            producto.precio = producto.precio-(producto.precio * 0.2);
        }
       
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
    Producto producto;
    int n=0;
    int cantidad = 0;
    int total = 0;
    cout << "1 para insertar datos o 2 para salir: "<<endl;
    cin >> n;
    
    while(n==1){
        cout << "Ingrese nombre del cliente: "<<endl;
        cin >> pedido.nombre;
        cout<< "Dime la cantidad de productos que deseas comprar: "<<endl;
        cin >> pedido.cantidad;
        for (int i = 0; i < pedido.cantidad; i++) {
            Producto producto;
            cout << "Ingrese nombre del producto: " << endl;
            cin >> producto.nombre;
            

            for (int j = 0; j < productos.size(); j++) {
                if (producto.nombre == productos[j].nombre) {
                    pedido.productos.nombre = productos[j].nombre;
                    pedido.precio =pedido.precio+ productos[j].precio;
                    pedido.productos.categoria = productos[j].categoria;
                    pedido.productos.promocion = productos[j].promocion;
                    productos[j].cantVentas++;
                    
                    
                }
            }

        }
        
        cout << "Ingrese dia de la fecha: "<< endl;
        cin >> pedido.fecha.dia; 
        cout << "Ingrese mes de la fecha: "<< endl;
        cin >> pedido.fecha.mes; 
        cout << "Ingrese anio de la fecha: "<< endl;
        cin >> pedido.fecha.anio; 
        cout << "El total de la compra es: " << pedido.precio << endl;

        pedidos.push_back(pedido);
        cout << "1 para insertar datos o 2 para salir: " << endl;
        cin >> n;
        cin.ignore();
}
}
void pedidoCliente(vector <Pedido> &pedidos){
    string nombre;
    cout << "Dime el nombre del cliente: ";
    cin >> nombre;
    for (int i = 0; i < pedidos.size(); i++)
    {
        if(nombre == pedidos[i].nombre){
            cout << "Nombre del cliente: " << pedidos[i].nombre << endl;
            cout << "Nombre del producto/s: " << pedidos[i].productos.nombre << endl;
            cout << "Cantidad: " << pedidos[i].cantidad << endl;
            cout << "Precio: " << pedidos[i].precio << endl;
            cout << "Fecha: " << pedidos[i].fecha.dia << "/" << pedidos[i].fecha.mes << "/" << pedidos[i].fecha.anio << endl;
        }
    }
}
void imprimir(vector <Producto> productos){
    for (int i = 0; i < productos.size(); i++)
    {
        cout << "Nombre del producto: " << productos[i].nombre << endl;
        cout << "Cantidad de ventas: " << productos[i].cantVentas << endl;
        cout << "Categoria: " << productos[i].categoria << endl;
        cout << "Cantidad de ventas" << productos[i].cantVentas << endl;
}}
void ordenarMayorVentas(vector<Producto> &productos){
    Producto aux;
    for (int i = 0; i < productos.size(); i++)
    {
        for (int j = 0; j < productos.size(); j++)
        {
            if(productos[i].cantVentas > productos[j].cantVentas){
                aux = productos[i];
                productos[i] = productos[j];
                productos[j] = aux;
                imprimir(productos);
            }
        }
    }
   
}

int main() {
    vector<Pedido> pedidos;
    vector<Producto> productos;
    int opcion = 0;

    while (opcion != 5) {
        cout << "Quieres ingresar Productos - 1" << endl
             << "Quieres ingresar Pedidos - 2" << endl
             << "Quieres Mostrar Pedidos por nombre del cliente - 3" << endl
             << "Quieres mostrar productos por cantidad de ventas - 4" << endl
             << "Salir - 5" << endl;
        cin >> opcion;
        switch (opcion) {
            case 1:
                insertar(productos);
                break;
            case 2:
                realizarPedido(pedidos, productos);
                break;
            case 3:
                pedidoCliente(pedidos);
                break;
            case 4:
                ordenarMayorVentas(productos);
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