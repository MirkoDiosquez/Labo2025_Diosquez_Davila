#include <iostream>
#include <vector>
using namespace std ;
struct Producto
{
    string nombre;
    int precio;
    int cantidad;
    
};

struct Pedido
{
    int numeroPedido;
    string nombreCliente;
    Producto productos;
        
};
void insertar(vector <Pedido> & pedidos)
{
    Pedido pedido;
    int n = 0 ; 
    cout << "1 para insertar datos o 2 para salir: " ;
    cin >> n ;
    while ( n == 1 )
    {
        cout << "Ingrese numero de pedido: " ;
        cin >> pedido.numeroPedido ;
        cout << "Ingrese nombre del cliente: "  ;
        cin >> pedido.nombreCliente;
        cout << "Ingrese cantidad: " ;
        cin >> pedido.productos.cantidad ;
        cout << "Ingrese precio: "  ;
        cin >> pedido.productos.precio ; 
        cout << "Ingrese producto: "  ;
        cin >> pedido.productos.nombre ;
        pedidos.push_back(pedido) ;
        cout << "1 para insertar datos o 2 para salir: " ;
        cin >> n ;
        cin.ignore() ;
    }
}
void borrarPedidos(vector <Pedido> pedidos, vector<Pedido> &pedidosBorrados){
Pedido pedido;
int numero;
cout<<"dime el numero del pedido"<<endl;
cin>> numero;
for (int i = 0; i < pedidos.size(); i++)
{
    if(numero== pedidos[i].numeroPedido)
    pedidos.erase(pedidos.begin()+i);
}


}
void mostrar(const vector<Pedido> &pedidos)
{
    int total = 0;
    for (int i = 0; i < pedidos.size(); i++)
    {
        cout << "Numero de Pedido: " << pedidos[i].numeroPedido << endl;
        cout << "Nombre del Cliente: " << pedidos[i].nombreCliente << endl;
        cout << "Producto: " << pedidos[i].productos.nombre << endl;
        cout << "Cantidad: " << pedidos[i].productos.cantidad << endl;
        cout << "Precio: " << pedidos[i].productos.precio << endl;
        int subtotal = pedidos[i].productos.precio * pedidos[i].productos.cantidad;
        cout << "Total: " << subtotal << endl;
        total += subtotal;
    }
    cout << "Total de la compra: " << total << endl;
}

int main(){
vector <Pedido> pedidos;
vector<Pedido> pedidosBorrados;
string opcion;
cout<<"Quiere Ingresar Pedidos 1 para si 2 para no 3 para borrar pedidos: ";
cin>>opcion;
if(opcion=="1"){
    insertar(pedidos);
}else if (opcion == "3")
{
    borrarPedidos(pedidos, pedidosBorrados);
}
else{
    return 0;
}

mostrar(pedidos);

    return 0;
}