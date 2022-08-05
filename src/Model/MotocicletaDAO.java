
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class MotocicletaDAO implements Crud{
    PreparedStatement ps;
    ResultSet rs;
    Connection conn;
    ConnectionDB connDB = new ConnectionDB();
    @Override
    public List toList() {
       List<Motocicleta> list = new ArrayList<>();
       String sql = "select * from motocicletas"; 
        try {
            conn = connDB.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                Motocicleta m = new Motocicleta();
                m.setId(rs.getInt(1));
                m.setId_fabricante(rs.getInt(2));
                m.setPrecio(rs.getString(3));
                m.setAutonomia(rs.getString(4));
                m.setId_proveedor(rs.getInt(5));
                list.add(m);
            }
            
        } catch (Exception e) {
        }
       return  list;
    }

    @Override
    public void store(Object[] o) {
        String sql = "insert into motocicletas values(?,?,?,?,?)";
        try {
            conn = connDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    @Override
    public void update(Object[] o) {
       String sql = "update motocicletas set id_fabricante=?, precio=?, autonomia=?, id_proveedor=? where id=?";
        try {
            conn = connDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    @Override
    public void delete(String clave) {
        String sql = "delete from motocicletas where id=?";
        try {
            conn = connDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, clave);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
}
