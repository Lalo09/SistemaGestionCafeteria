/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import com.jtattoo.plaf.AbstractLookAndFeel;
import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import com.jtattoo.plaf.aero.AeroLookAndFeel;
import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;
import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import com.jtattoo.plaf.luna.LunaLookAndFeel;
import com.jtattoo.plaf.mcwin.McWinLookAndFeel;
import com.jtattoo.plaf.mint.MintLookAndFeel;
import com.jtattoo.plaf.noire.NoireLookAndFeel;
import com.jtattoo.plaf.smart.SmartLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.multi.MultiLookAndFeel;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author eduardo
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
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
        jSeparator1 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        PanelCajero = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        PanelTipoPrecio = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTipoDePrecioPV = new javax.swing.JTextField();
        Porcentaje = new javax.swing.JLabel();
        txtPagaPV = new javax.swing.JTextField();
        BtnLimpiarPanelPRecioVenta = new javax.swing.JButton();
        BtnGuardarPrecioVenta = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPreciosVenta = new javax.swing.JTable();
        BtnEliminarPrecioVentaj = new javax.swing.JButton();
        lblPrecioVenta = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        PanelTipoProducto = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        PanelFormaDePago = new javax.swing.JPanel();
        lblTitulo2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTipoDePrecioPV2 = new javax.swing.JTextField();
        Descripcion = new javax.swing.JLabel();
        txtPagaPV2 = new javax.swing.JTextField();
        BtnLimpiarPanelPRecioVenta2 = new javax.swing.JButton();
        BtnGuardarPrecioVenta2 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaPreciosVenta2 = new javax.swing.JTable();
        BtnEliminarPrecioVentaj2 = new javax.swing.JButton();
        lblPrecioVenta2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        PanelUsuarios = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        PanelEmpleados = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        PanelProductos = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        PanelInventario = new javax.swing.JPanel();
        PanelInventario1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        PanelCajero.setBackground(new java.awt.Color(254, 254, 254));
        PanelCajero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelCajero, javax.swing.GroupLayout.DEFAULT_SIZE, 1146, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelCajero, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cajero", jPanel2);

        PanelTipoPrecio.setBackground(new java.awt.Color(254, 254, 254));
        PanelTipoPrecio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Edicion tipos de precios de venta");
        PanelTipoPrecio.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("/images/PanelPrecio.png")); // NOI18N
        PanelTipoPrecio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jLabel2.setText("Tipo de precio");
        PanelTipoPrecio.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 108, 120, 40));
        PanelTipoPrecio.add(txtTipoDePrecioPV, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 180, 40));

        Porcentaje.setText("Paga");
        PanelTipoPrecio.add(Porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, 40));
        PanelTipoPrecio.add(txtPagaPV, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 60, 40));

        BtnLimpiarPanelPRecioVenta.setIcon(new javax.swing.ImageIcon("/images/limpiar.png")); // NOI18N
        BtnLimpiarPanelPRecioVenta.setText("Limpiar todo");
        PanelTipoPrecio.add(BtnLimpiarPanelPRecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 230, 50));

        BtnGuardarPrecioVenta.setIcon(new javax.swing.ImageIcon("/images/save.png")); // NOI18N
        BtnGuardarPrecioVenta.setText("Guardar");
        PanelTipoPrecio.add(BtnGuardarPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, 50));
        PanelTipoPrecio.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 350, 10));
        PanelTipoPrecio.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 350, 10));

        TablaPreciosVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaPreciosVenta);

        PanelTipoPrecio.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 490, 140));

        BtnEliminarPrecioVentaj.setIcon(new javax.swing.ImageIcon("/images/eliminar.png")); // NOI18N
        BtnEliminarPrecioVentaj.setText("Eliminar");
        PanelTipoPrecio.add(BtnEliminarPrecioVentaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, -1, 50));

        lblPrecioVenta.setText("0");
        PanelTipoPrecio.add(lblPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, -1, -1));

        jLabel3.setText("%");
        PanelTipoPrecio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, -1, -1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTipoPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTipoPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Precios de venta", jPanel5);

        PanelTipoProducto.setBackground(new java.awt.Color(254, 254, 254));
        PanelTipoProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTipoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTipoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Tipo de producto", jPanel6);

        PanelFormaDePago.setBackground(new java.awt.Color(254, 254, 254));
        PanelFormaDePago.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo2.setText("Edicion formas de pago");
        PanelFormaDePago.add(lblTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1130, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("/images/money.png")); // NOI18N
        PanelFormaDePago.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jLabel6.setText("Forma de pago");
        PanelFormaDePago.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 108, 120, 40));
        PanelFormaDePago.add(txtTipoDePrecioPV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 180, 40));

        Descripcion.setText("Descripcion");
        PanelFormaDePago.add(Descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, 40));
        PanelFormaDePago.add(txtPagaPV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 220, 40));

        BtnLimpiarPanelPRecioVenta2.setIcon(new javax.swing.ImageIcon("/images/limpiar.png")); // NOI18N
        BtnLimpiarPanelPRecioVenta2.setText("Limpiar todo");
        PanelFormaDePago.add(BtnLimpiarPanelPRecioVenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 230, 50));

        BtnGuardarPrecioVenta2.setIcon(new javax.swing.ImageIcon("/images/save.png")); // NOI18N
        BtnGuardarPrecioVenta2.setText("Guardar");
        PanelFormaDePago.add(BtnGuardarPrecioVenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, 50));
        PanelFormaDePago.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 350, 10));
        PanelFormaDePago.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 350, 10));

        TablaPreciosVenta2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(TablaPreciosVenta2);

        PanelFormaDePago.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 490, 140));

        BtnEliminarPrecioVentaj2.setIcon(new javax.swing.ImageIcon("/images/eliminar.png")); // NOI18N
        BtnEliminarPrecioVentaj2.setText("Eliminar");
        PanelFormaDePago.add(BtnEliminarPrecioVentaj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, -1, 50));

        lblPrecioVenta2.setText("0");
        PanelFormaDePago.add(lblPrecioVenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, -1, -1));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFormaDePago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFormaDePago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Forma de pago", jPanel7);

        PanelUsuarios.setBackground(new java.awt.Color(254, 254, 254));
        PanelUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Usuarios", jPanel8);

        PanelEmpleados.setBackground(new java.awt.Color(254, 254, 254));
        PanelEmpleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Empleados", jPanel9);

        PanelProductos.setBackground(new java.awt.Color(254, 254, 254));
        PanelProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Productos", jPanel10);

        PanelInventario.setBackground(new java.awt.Color(254, 254, 254));
        PanelInventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Inventarios", jPanel11);

        PanelInventario1.setBackground(new java.awt.Color(254, 254, 254));
        PanelInventario1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane2.addTab("Cancelar ticket", PanelInventario1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Mantenimientos", jPanel3);

        jPanel23.setBackground(new java.awt.Color(254, 254, 254));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Cierre de caja", jPanel12);

        jPanel24.setBackground(new java.awt.Color(254, 254, 254));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Productos", jPanel13);

        jPanel25.setBackground(new java.awt.Color(254, 254, 254));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Consumo de empleados", jPanel14);

        jPanel26.setBackground(new java.awt.Color(254, 254, 254));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Reporte de ventas", jPanel15);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1146, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Reportes", jPanel4);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new MintLookAndFeel());
                    new Menu().setVisible(true);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminarPrecioVentaj;
    private javax.swing.JButton BtnEliminarPrecioVentaj2;
    private javax.swing.JButton BtnGuardarPrecioVenta;
    private javax.swing.JButton BtnGuardarPrecioVenta2;
    private javax.swing.JButton BtnLimpiarPanelPRecioVenta;
    private javax.swing.JButton BtnLimpiarPanelPRecioVenta2;
    private javax.swing.JLabel Descripcion;
    private javax.swing.JPanel PanelCajero;
    private javax.swing.JPanel PanelEmpleados;
    private javax.swing.JPanel PanelFormaDePago;
    private javax.swing.JPanel PanelInventario;
    private javax.swing.JPanel PanelInventario1;
    private javax.swing.JPanel PanelProductos;
    private javax.swing.JPanel PanelTipoPrecio;
    private javax.swing.JPanel PanelTipoProducto;
    private javax.swing.JPanel PanelUsuarios;
    private javax.swing.JLabel Porcentaje;
    private javax.swing.JTable TablaPreciosVenta;
    private javax.swing.JTable TablaPreciosVenta2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JLabel lblPrecioVenta;
    private javax.swing.JLabel lblPrecioVenta2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JTextField txtPagaPV;
    private javax.swing.JTextField txtPagaPV2;
    private javax.swing.JTextField txtTipoDePrecioPV;
    private javax.swing.JTextField txtTipoDePrecioPV2;
    // End of variables declaration//GEN-END:variables
}
