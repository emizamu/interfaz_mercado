
package Mercado;


public class Dueno {//nombre, edad, años experiencia
    private String nombre;
    private int edad;
    private int anosExp;
    
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String unNombre){
        nombre=unNombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int unaEdad){
        edad=unaEdad;
    }
    public int getAnosExperiencia(){
        return anosExp;
    }
    public void setAnosExperiencia(int unosAnosExp){
        anosExp=unosAnosExp;
    }
    
    /*public Dueno(){
        
    }*/

    public Dueno(String unNombre, int unaEdad, int unosAnosExp) {
        this.nombre = unNombre;
        this.edad = unaEdad;
        this.anosExp = unosAnosExp;
    }
    
    /*@Override
    public String toString(){
        return
    }*/

    @Override
    public String toString() {
        return "Dueno{nombre= " + nombre + ", edad= " + edad + ", anosExp= " + 
                anosExp + '}';
    }
    
    
    
}
