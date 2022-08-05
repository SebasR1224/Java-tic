
package Model;


public class Proveedor {
    int id;
    String nombre;
    String direccion;
    String telefono;

    public Proveedor() {
    }

    public Proveedor(int id) {
        this.id = id;
    }
    
    public Proveedor(int id, String nombre, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString(){
        return id + " - " + nombre;
    }
    
    @Override
    public  boolean equals(Object obj){
        
        return this.id == ((Proveedor) obj).id;
    }
}
