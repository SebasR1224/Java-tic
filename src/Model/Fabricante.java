
package Model;


public class Fabricante {
    int id;
    String nombre;

    public Fabricante() {
    }
    
    public Fabricante(int id) {
        this.id = id;
    }

    public Fabricante(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return id + " - " + nombre;
    }
    
    @Override
    public  boolean equals(Object obj){
        
        return this.id == ((Fabricante) obj).id;
    }
}
