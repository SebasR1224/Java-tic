package Model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
public class CompraDAO implements Crud{

    PreparedStatement ps;
    ResultSet rs;
    Connection conn;
    ConnectionDB connDB = new ConnectionDB();

    @Override
    public List toList() {
        List<Compra> list = new ArrayList<>();
        String sql = "select * from intencion_compra";
        try {
            conn = connDB.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                Compra c = new Compra();
                c.setId(rs.getInt(1));
                c.setCliente(rs.getString(2));
                c.setId_fabricante(rs.getInt(3));
                c.setFecha(rs.getString(4));
                list.add(c);
            }
        } catch (Exception e) {
        }
        return  list;
    }

    @Override
    public void store(Object[] o) {
        String sql = "insert into intencion_compra values(?,?,?,?)";
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
    public void update(Object[] o) {
        String sql = "update intencion_compra set cliente=?, id_fabricante=?, fecha=? where id=?";
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
        String sql="delete from intencion_compra where id=?";
        try {
            conn = connDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, clave);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
}
