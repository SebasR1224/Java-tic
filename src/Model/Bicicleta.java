
package Model;


public class Bicicleta {
    int id;
    int id_fabricante;
    String precio;
    String año;

    public Bicicleta() {
    }

    public Bicicleta(int id, int id_fabricante, String precio, String año) {
        this.id = id;
        this.id_fabricante = id_fabricante;
        this.precio = precio;
        this.año = año;
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

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

}
