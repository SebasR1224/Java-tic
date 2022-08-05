
package Model;

public class Motocicleta {
    int id;
    int id_fabricante;
    String precio;
    String autonomia;
    int id_proveedor;

    public Motocicleta() {
    }

    public Motocicleta(int id, int id_fabricante, String precio, String autonomia, int id_proveedor) {
        this.id = id;
        this.id_fabricante = id_fabricante;
        this.precio = precio;
        this.autonomia = autonomia;
        this.id_proveedor = id_proveedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_fabricante() {
        return id_fabricante;
    }

    public void setId_fabricante(int id_fabricante) {
        this.id_fabricante = id_fabricante;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(String autonomia) {
        this.autonomia = autonomia;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    
    
    
}
