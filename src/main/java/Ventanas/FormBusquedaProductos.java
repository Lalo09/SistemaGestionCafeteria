/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import Datos.FuncionesProductos;
import Modelos.Producto;
import com.jtattoo.plaf.mint.MintLookAndFeel;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

/**
 *
 * @author eduardo
 */
public class FormBusquedaProductos extends javax.swing.JFrame {

    DefaultTableModel modeloTablaProductos = new DefaultTableModel();
    /**
     * Creates new form FormBusquedaProductos
     */
    public FormBusquedaProductos() {
        initComponents();
        CargarColumnasProducto();
    }

    private void CargarColumnasProducto(){
       modeloTablaProductos.addColumn("num");
       modeloTablaProductos.addColumn("Descripcion");
       modeloTablaProductos.addColumn("Clave");
       modeloTablaProductos.addColumn("Precio");
       modeloTablaProductos.addColumn("Control de inventario");
       modeloTablaProductos.addColumn("Tipo de comida");
       modeloTablaProductos.addColumn("Cantidad");
       
       FuncionesProductos funcionesProductos = new FuncionesProductos();
       ArrayList<Producto> lista = funcionesProductos.MostrarProducto();
       
       int contador =lista.size();
       modeloTablaProductos.setNumRows(contador);
       for (int i = 0; i < contador; i++) {
            Producto producto = lista.get(i);
            modeloTablaProductos.setValueAt(producto.getId_producto(), i, 0);
            modeloTablaProductos.setValueAt(producto.getDescripcion(), i, 1);
            modeloTablaProductos.setValueAt(producto.getClave(), i, 2);
            modeloTablaProductos.setValueAt(producto.getPrecio(), i, 3);
            modeloTablaProductos.setValueAt(producto.getControl_inventario(), i, 4);
            modeloTablaProductos.setValueAt(producto.getId_tipo_comida(), i, 5);
            modeloTablaProductos.setValueAt(producto.getCantidad(), i, 6);
       }
       
       TableColumn columnaId = TablaDeProductos.getColumnModel().getColumn(0);
       columnaId.setMaxWidth(0);
       columnaId.setMinWidth(0);
       columnaId.setPreferredWidth(0);  
       
       TableColumn columnaControl = TablaDeProductos.getColumnModel().getColumn(4);
       columnaControl.setMaxWidth(0);
       columnaControl.setMinWidth(0);
       columnaControl.setPreferredWidth(0);  
       
       TableColumn columnaTipo = TablaDeProductos.getColumnModel().getColumn(5);
       columnaTipo.setMaxWidth(0);
       columnaTipo.setMinWidth(0);
       columnaTipo.setPreferredWidth(0);  
       
       TableColumn columnaCantidad = TablaDeProductos.getColumnModel().getColumn(6);
       columnaCantidad.setMaxWidth(0);
       columnaCantidad.setMinWidth(0);
       columnaCantidad.setPreferredWidth(0);  
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Porcentaje6 = new javax.swing.JLabel();
        txtBuscarProducto = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        lblTitulo3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaDeProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Porcentaje6.setText("Buscar");
        jPanel1.add(Porcentaje6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, 40));

        txtBuscarProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarProductoKeyPressed(evt);
            }
        });
        jPanel1.add(txtBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 330, 40));

        btnBuscarProducto.setIcon(new javax.swing.ImageIcon("/images/lupa.png")); // NOI18N
        btnBuscarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarProductoMouseClicked(evt);
            }
        });
        jPanel1.add(btnBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 50, 60));

        lblTitulo3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblTitulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo3.setText("Listado de productos");
        jPanel1.add(lblTitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 9, 450, 40));

        TablaDeProductos.setModel(modeloTablaProductos);
        TablaDeProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDeProductosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(TablaDeProductos);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 480, 370));

        jLabel1.setIcon(new javax.swing.ImageIcon("/images/close.png")); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarProductoMouseClicked
        Buscar();
    }//GEN-LAST:event_btnBuscarProductoMouseClicked

    private void TablaDeProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDeProductosMouseClicked
        int index = TablaDeProductos.getSelectedRow();
        TableModel model = TablaDeProductos.getModel();
        
        int id = Integer.parseInt(model.getValueAt(index,0).toString());
        String descripcion = model.getValueAt(index,1).toString();
        String clave = model.getValueAt(index,2).toString();
        double precio = Double.parseDouble(model.getValueAt(index,3).toString());
        
        PanelVentas.lblIdProducto.setText(""+id);
        PanelVentas.txtCodigoProducto.setText(clave);
        PanelVentas.lblNombreProducto.setText(descripcion);
        PanelVentas.lblPrecioProducto.setText(""+precio);
        PanelVentas.txtCantidadProducto.setValue(1);
        PanelVentas.lblTotalProducto.setText(""+precio);
        
        this.dispose();
    }//GEN-LAST:event_TablaDeProductosMouseClicked

    private void txtBuscarProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarProductoKeyPressed
        Buscar();
    }//GEN-LAST:event_txtBuscarProductoKeyPressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void Buscar(){
        if (txtBuscarProducto.getText()!="") {
            modeloTablaProductos.setRowCount(0);
            modeloTablaProductos.setColumnCount(0);
            
            modeloTablaProductos.addColumn("num");
            modeloTablaProductos.addColumn("Descripcion");
            modeloTablaProductos.addColumn("Clave");
            modeloTablaProductos.addColumn("Precio");
            modeloTablaProductos.addColumn("Control de inventario");
            modeloTablaProductos.addColumn("Tipo de comida");
            modeloTablaProductos.addColumn("Cantidad");

            FuncionesProductos funcionesProductos = new FuncionesProductos();
            ArrayList<Producto> lista = funcionesProductos.BuscarProducto(txtBuscarProducto.getText().trim());

            int contador =lista.size();
            modeloTablaProductos.setNumRows(contador);
            for (int i = 0; i < contador; i++) {
                 Producto producto = lista.get(i);
                 modeloTablaProductos.setValueAt(producto.getId_producto(), i, 0);
                 modeloTablaProductos.setValueAt(producto.getDescripcion(), i, 1);
                 modeloTablaProductos.setValueAt(producto.getClave(), i, 2);
                 modeloTablaProductos.setValueAt(producto.getPrecio(), i, 3);
                 modeloTablaProductos.setValueAt(producto.getControl_inventario(), i, 4);
                 modeloTablaProductos.setValueAt(producto.getId_tipo_comida(), i, 5);
                 modeloTablaProductos.setValueAt(producto.getCantidad(), i, 6);
            }

            TableColumn columnaId = TablaDeProductos.getColumnModel().getColumn(0);
            columnaId.setMaxWidth(0);
            columnaId.setMinWidth(0);
            columnaId.setPreferredWidth(0);  

            TableColumn columnaControl = TablaDeProductos.getColumnModel().getColumn(4);
            columnaControl.setMaxWidth(0);
            columnaControl.setMinWidth(0);
            columnaControl.setPreferredWidth(0);  

            TableColumn columnaTipo = TablaDeProductos.getColumnModel().getColumn(5);
            columnaTipo.setMaxWidth(0);
            columnaTipo.setMinWidth(0);
            columnaTipo.setPreferredWidth(0);  

            TableColumn columnaCantidad = TablaDeProductos.getColumnModel().getColumn(6);
            columnaCantidad.setMaxWidth(0);
            columnaCantidad.setMinWidth(0);
            columnaCantidad.setPreferredWidth(0);  
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormBusquedaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBusquedaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBusquedaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBusquedaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new MintLookAndFeel());
                    new FormBusquedaProductos().setVisible(true);
                    
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(FormBusquedaProductos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Porcentaje6;
    private javax.swing.JTable TablaDeProductos;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JTextField txtBuscarProducto;
    // End of variables declaration//GEN-END:variables
}