
package Mercado;

import java.util.ArrayList;


public class Compra {
    private ArrayList<Puesto>listaPuestos;//El ArrayList o solo puesto
    private ArrayList<mayorista>listaMayoristas;//El ArrayList o solo mayorista
    private ArrayList<Producto>listaProductos;//El ArrayList o solo producto??
    private int precio;
    private int cantidad;
    
    public Compra(){
        listaPuestos=new ArrayList<>();//o puesto
        listaMayoristas=new ArrayList<>();// o mayorista
        listaProductos=new ArrayList<>();// o producto
        //precio??
        //cantidad??
    }
    public int getprecio(){
        return precio;
    }
    public void setPrecio(int unPrecio){
        precio=unPrecio;
    }
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int unaCantidad){
        cantidad=unaCantidad;
    }
    
    @Override
    public String toString(){
        return ;
    }
    
    
    
    
}
