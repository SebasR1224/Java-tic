
package Model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
public class FabricanteDAO  implements Crud{ 
   PreparedStatement ps;
   ResultSet rs;
   Connection conn;
   ConnectionDB connDB = new ConnectionDB();

    @Override
    public List toList() {
        List<Fabricante> list = new ArrayList<>();
        String sql = "select * from fabricantes";
        try {
            conn = connDB.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                Fabricante f = new Fabricante();
                f.setId(rs.getInt(1));
                f.setNombre(rs.getString(2));
                list.add(f);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public void store(Object[] o) {
        String sql = "insert into fabricantes values(?,?)";
        try {
            conn = connDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    @Override
    public void update(Object[] o) {
        String sql = "update fabricantes set nombre=? where id=?";
        try {
            conn = connDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    @Override
    public void delete(String clave) {
        String sql = "delete from fabricantes where id=?";
        try {
            conn = connDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, clave);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
   
   
}
