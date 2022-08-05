package View;

import Model.Fabricante;
import Model.FabricanteDAO;
import Model.Motocicleta;
import Model.MotocicletaDAO;
import Model.Proveedor;
import Model.ProveedorDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Motocicletas extends javax.swing.JInternalFrame {

    int fila;
    Motocicleta motocicleta = new Motocicleta();
    MotocicletaDAO dao = new MotocicletaDAO();
    DefaultTableModel model = new DefaultTableModel();

    public Motocicletas() {
        initComponents();
        getfabricantes();
        getProveedores();
        toList();
    }

    public void toList() {
        List<Motocicleta> list = dao.toList();
        model = (DefaultTableModel) table.getModel();
        Object[] ob = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            ob[0] = list.get(i).getId();
            ob[1] = list.get(i).getId_fabricante();
            ob[2] = list.get(i).getPrecio();
            ob[3] = list.get(i).getAutonomia();
            ob[4] = list.get(i).getId_proveedor();
            model.addRow(ob);
        }
        table.setModel(model);
    }

    public void getfabricantes() {
        FabricanteDAO daof = new FabricanteDAO();
        List<Fabricante> list = daof.toList();
        this.fabricante.removeAllItems();
        for (int i = 0; i < list.size(); i++) {
            this.fabricante.addItem(new Fabricante(list.get(i).getId(), list.get(i).getNombre()));
        }
    }

    public void getProveedores() {
        ProveedorDAO daop = new ProveedorDAO();
        List<Proveedor> list = daop.toList();
        this.proveedor.removeAllItems();
        for (int i = 0; i < list.size(); i++) {
            this.proveedor.addItem(new Proveedor(list.get(i).getId(), list.get(i).getNombre(), list.get(i).getDireccion(), list.get(i).getTelefono()));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        fabricante = new javax.swing.JComboBox<>();
        precio = new javax.swing.JTextField();
        autonomia = new javax.swing.JTextField();
        proveedor = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clean = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setTitle("Motocicletas");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Id");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Fabricante");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Precio");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Autonomía");

        id.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        id.setToolTipText("");

        fabricante.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        precio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        autonomia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        proveedor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Proveedor");

        update.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        update.setText("Actualizar");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        delete.setText("Eliminar");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        clean.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        clean.setText("Nuevo");
        clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanActionPerformed(evt);
            }
        });

        add.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        add.setText("Agregar");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(autonomia, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(clean, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(autonomia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update)
                    .addComponent(delete)
                    .addComponent(add)
                    .addComponent(clean))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Fabricante", "Precio", "Autonomía", "Proveedor"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        store();
        cleanTable();
        toList();
        cleanForm();
    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        update();
        cleanTable();
        toList();
        cleanForm();
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        delete();
        cleanTable();
        toList();
        cleanForm();
    }//GEN-LAST:event_deleteActionPerformed

    private void cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanActionPerformed
        cleanForm();
    }//GEN-LAST:event_cleanActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        fila = table.getSelectedRow();
        String id = table.getValueAt(fila, 0).toString();
        String fabricante = table.getValueAt(fila, 1).toString();
        String precio = table.getValueAt(fila, 2).toString();
        String autonomia =  table.getValueAt(fila, 3).toString();
        String proveedor = table.getValueAt(fila, 4).toString();
        
        this.id.setText(id);
        this.fabricante.setSelectedItem(new Fabricante(Integer.parseInt(fabricante)));
        this.precio.setText(precio);
        this.autonomia.setText(autonomia);
        this.proveedor.setSelectedItem(new Proveedor(Integer.parseInt(proveedor)));
        
        this.id.setEditable(false);
    }//GEN-LAST:event_tableMouseClicked

    public void store() {
        String id = this.id.getText();
        int fabricante = this.fabricante.getItemAt(this.fabricante.getSelectedIndex()).getId();
        String precio = this.precio.getText();
        String autonomia = this.autonomia.getText();
        int proveedor = this.proveedor.getItemAt(this.proveedor.getSelectedIndex()).getId();

        Object[] ob = new Object[5];
        ob[0] = id;
        ob[1] = fabricante;
        ob[2] = precio;
        ob[3] = autonomia;
        ob[4] = proveedor;
        dao.store(ob);

    }

    public void update() {
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una motocicleta para actualizar");
        } else {
            String id = this.id.getText();
            int fabricante = this.fabricante.getItemAt(this.fabricante.getSelectedIndex()).getId();
            String precio = this.precio.getText();
            String autonomia = this.autonomia.getText();
            int proveedor = this.proveedor.getItemAt(this.proveedor.getSelectedIndex()).getId();

            Object[] ob = new Object[5];
            ob[0] = fabricante;
            ob[1] = precio;
            ob[2] = autonomia;
            ob[3] = proveedor;
            ob[4] = id;
            dao.update(ob);
        }
    }

    public void delete() {
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una motocicleta para eliminar");
        } else {
            String id = table.getValueAt(fila, 0).toString();
            dao.delete(id);
        }
    }

    public void cleanForm() {
        this.id.setText("");
        this.fabricante.setSelectedIndex(0);
        this.precio.setText("");
        this.autonomia.setText("");
        this.proveedor.setSelectedIndex(0);
        this.id.requestFocus();
        this.id.setEditable(true);
        fila = -1;
    }

    public void cleanTable() {
        for (int i = 0; i < model.getRowCount(); i++) {
            model.removeRow(i);
            i--;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField autonomia;
    private javax.swing.JButton clean;
    private javax.swing.JButton delete;
    private javax.swing.JComboBox<Fabricante> fabricante;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField precio;
    private javax.swing.JComboBox<Proveedor> proveedor;
    private javax.swing.JTable table;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
