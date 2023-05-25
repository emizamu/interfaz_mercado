package dominio;

public class Producto {

    private String nombre;
    private String descripcion;
    private String tipo;
    private String unidadDeVenta;

    public Producto(String unNombre, String unaDescripcion, String unTipo, String unaUnidad) {

        this.nombre = unNombre;
        this.descripcion = unaDescripcion;
        this.tipo = unTipo;
        this.unidadDeVenta = unidadDeVenta;

    }

}
