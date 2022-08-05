
package Model;


public class Cliente {
    String username;
    String password;
    String nombre;
    String apellido;
    String email;
    String telefono;

    public Cliente() {
    }

    public Cliente(String username) {
        this.username = username;
    }
    
    public Cliente(String username, String password, String nombre, String apellido, String email, String telefono) {
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString(){
        return username;
    }
    
    @Override
    public  boolean equals(Object obj){
        
        return this.username.equals(((Cliente) obj).username);
    }
}

