
package Model;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ProveedorDAO implements Crud{
    PreparedStatement ps;
    ResultSet rs;
    Connection conn;
    ConnectionDB connDB = new ConnectionDB();

    @Override
    public List toList() {
        List<Proveedor> list = new ArrayList<>();
        String sql = "Select * from proveedores";
        try {
            conn = connDB.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                Proveedor p = new Proveedor();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setDireccion(rs.getString(3));
                p.setTelefono(rs.getString(4));
                list.add(p);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public void store(Object[] o) {
        String sql = "insert into proveedores values(?,?,?,?)";
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
        String sql = "update proveedores set nombre=?, direccion=?, telefono=? where id=?";
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
        String sql ="delete from proveedores where id=?";
        try {
            conn = connDB.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, clave);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    
}
