/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model;

import java.util.List;

/**
 *
 * @author User
 */
public interface Crud {
    public List toList();
    public void store(Object[] o);
    public void update(Object[] o);
    public void delete(String clave);
}
