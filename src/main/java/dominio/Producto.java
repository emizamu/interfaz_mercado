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
        this.unidadDeVenta = unaUnidad;

    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getUnidadDeVenta() {
        return unidadDeVenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setUnidadDeVenta(String unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", tipo=" + tipo + ", unidadDeVenta=" + unidadDeVenta + '}';
    }

}
