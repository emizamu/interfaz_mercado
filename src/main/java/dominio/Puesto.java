package dominio;

public class Puesto {

    private String identificacion;
    private Dueno elDueno;
    private String ubicacion;
    private int cantEmpleados;

    public Puesto(String unaIdentificacion, Dueno unDueno, String unaUbicacion, int cantidadE) {
        identificacion = unaIdentificacion;
        elDueno = unDueno;
        ubicacion = unaUbicacion;
        cantEmpleados = cantidadE;

    }

    public String getIdentificacion() {
        return this.identificacion;
    }

    public Dueno getDueno() {
        return this.elDueno;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public int getCantEmpleados() {
        return this.cantEmpleados;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setElDueno(Dueno elDueno) {
        this.elDueno = elDueno;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setCantEmpleados(int cantEmpleados) {
        this.cantEmpleados = cantEmpleados;
    }

    @Override
    public String toString() {
        return "Puesto{" + "identificacion=" + identificacion + ", elDueno=" + elDueno + ", ubicacion=" + ubicacion + ", cantEmpleados=" + cantEmpleados + '}';
    }

}
