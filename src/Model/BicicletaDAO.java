
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class BicicletaDAO implements Crud{
    
   PreparedStatement ps;
   ResultSet rs;
   Connection conn;
   ConnectionDB connDB = new ConnectionDB();

    @Override
    public List toList() {
        List<Bicicleta> list = new ArrayList<>();
        String sql = "select * from bicicletas";
        try {
            conn = connDB.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                Bicicleta b = new Bicicleta();
                b.setId(rs.getInt(1));
                b.setId_fabricante(rs.getInt(2));
                b.setPrecio(rs.getString(3));
                b.setAño(rs.getString(4));
                list.add(b);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public void store(Object[] o) {
        String sql = "insert into bicicletas values(?,?,?,?)";
        try {
            conn = connDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void update(Object[] o) {
        String sql = "update bicicletas set id_fabricante=?, precio=?, año=? where id=?";
        try {
            conn = connDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    @Override
    public void delete(String clave) {
        String sql = "delete from bicicletas where id=?";
        try {
            conn = connDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, clave);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
