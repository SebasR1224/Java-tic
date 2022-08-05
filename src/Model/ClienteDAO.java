
package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements Crud{
    
    PreparedStatement ps;
    ResultSet rs;
    ConnectionDB connDB = new ConnectionDB();
    Connection conn;
    
    public Cliente login(String username, String password){
        Cliente cliente = new Cliente();
        String sql = "select * from clientes where username=? and password=?";
        try {
            conn = connDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {                
                cliente.setUsername(rs.getString(1));
                cliente.setPassword(rs.getString(2));
                cliente.setNombre(rs.getString(3));
                cliente.setApellido(rs.getString(4));
                cliente.setEmail(rs.getString(5));
                cliente.setTelefono(rs.getString(6));
            }
        } catch (Exception e) {
        }
        return  cliente;
    }

    @Override
    public List toList() {
        List<Cliente> list = new ArrayList<>();
        String sql = "select * from clientes";
        try {
            conn = connDB.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                Cliente c = new Cliente();
                c.setUsername(rs.getString(1));
                c.setPassword(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellido(rs.getString(4));
                c.setEmail(rs.getString(5));
                c.setTelefono(rs.getString(6));
                list.add(c);
            }
        } catch (Exception e) {
        }
        return  list;
    }

    @Override
    public void store(Object[] o) {
        String sql = "insert into clientes values(?,?,?,?,?,?)";
        try {
            conn = connDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.executeUpdate();
       } catch (Exception e) {
        }
    }

    @Override
    public void update(Object[] o) {
        String sql = "update clientes set username=?, password=?, nombre=?, apellido=?, email=?, telefono=? where username=?";
        try {
            conn = connDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[0]);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    @Override
    public void delete(String clave) {
        String sql = "delete from clientes where username=?";
        try {
            conn = connDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, clave);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
}
