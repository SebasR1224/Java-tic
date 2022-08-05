
package Model;


public class Compra {
    int id;
    String cliente;
    int id_fabricante;
    String fecha;

    public Compra() {
    }

    public Compra(int id, String cliente, int id_fabricante, String fecha) {
        this.id = id;
        this.cliente = cliente;
        this.id_fabricante = id_fabricante;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getId_fabricante() {
        return id_fabricante;
    }

    public void setId_fabricante(int id_fabricante) {
        this.id_fabricante = id_fabricante;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
