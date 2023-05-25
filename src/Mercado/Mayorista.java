
package Mercado;

import java.util.ArrayList;


public class Mayorista {//rut, nombre, dirección, lista de productos
    private String rut;
    private String nombre;
    private String direccion;
    private ArrayList<Producto>listaProductos;
    
    public String getRut(){
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    
    
    /*public Mayorista(){
        this.setRut("");
        this.setNombre("");
        this.setDireccion("");
        this.setListadeproductos<Producto>;
    }*/

    public Mayorista(String rut, String nombre, String direccion, ArrayList<Producto> listaProductos) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaProductos = listaProductos;
    }

    @Override
    public String toString() {
        return "Mayorista: rut= " + rut + ", nombre= " + nombre +
                ", direccion= " + direccion + ", listaProductos= " + 
                listaProductos;
    }
    

}