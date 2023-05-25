package dominio;

import java.util.ArrayList;

public class Mercado {

    private ArrayList<Puesto> listaPuestos = new ArrayList<>();
    private ArrayList<Producto> listaProductos = new ArrayList<>();
    private ArrayList<Mayorista> listaMayoristas = new ArrayList<>();
    private ArrayList<Dueno> listaDuenos = new ArrayList<>();
    private ArrayList<Compra> listaCompras = new ArrayList<>();
    private ArrayList<Venta> listaVentas = new ArrayList<>();

    public ArrayList<Puesto> getPuestos() {
        return this.listaPuestos;
    }

    public ArrayList<Producto> getProductos() {
        return this.listaProductos;
    }

    public ArrayList<Mayorista> getMayoristas() {
        return this.listaMayoristas;
    }

    public ArrayList<Dueno> getDuenos() {
        return this.listaDuenos;
    }

    public ArrayList<Compra> getCompras() {
        return this.listaCompras;
    }

    public ArrayList<Venta> getVentas() {
        return this.listaVentas;
    }

}
