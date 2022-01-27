/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ventanas;
import Datos.FuncionesEmpleados;
import Datos.FuncionesFormaDePago;
import Datos.FuncionesProductos;
import Datos.FuncionesTipoPrecio;
import Modelos.FormaDePago;
import Modelos.TipoDePrecio;
import Modelos.Venta;
import Modelos.DetalleVenta;
import Modelos.Empleado;
import Modelos.Producto;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

/**
 *
 * @author eduardo
 */
public class PanelVentas extends javax.swing.JPanel {
    DefaultComboBoxModel <FormaDePago> modeloComboFormaDePago;
    DefaultComboBoxModel <TipoDePrecio> modeloComboTipoPrecio;
    DefaultTableModel modeloTablaDetalleVenta = new DefaultTableModel();
    double descuento = 0;

    private void CargarFormaDePago(){
        FuncionesFormaDePago funcionesFormaDePago = new FuncionesFormaDePago();
        ArrayList<FormaDePago> lista;
        lista = funcionesFormaDePago.MostrarFormaDePago();
        
        for (FormaDePago formaDePago:lista) {
            modeloComboFormaDePago.addElement(formaDePago);
        }
    }
    
    private void CargarTipoDePrecio(){
        FuncionesTipoPrecio funcionesTipoPrecio = new FuncionesTipoPrecio();
        ArrayList<TipoDePrecio> listaTipoPrecio;
        listaTipoPrecio = funcionesTipoPrecio.MostrarTipoPrecio();
        
        for (TipoDePrecio tipoDePrecio:listaTipoPrecio) {
            modeloComboTipoPrecio.addElement(tipoDePrecio);
        }
    }
    
    /**
     * Creates new form PanelVentas
     */
    public PanelVentas() {
        modeloComboFormaDePago = new DefaultComboBoxModel<FormaDePago>();
        modeloComboTipoPrecio = new DefaultComboBoxModel<TipoDePrecio>();
        CargarFormaDePago();
        CargarTipoDePrecio();
        initComponents();
        txtCodigoEmpleado.setEnabled(false);
        
       TableColumn columna = TablaProductos.getColumnModel().getColumn(0);
       columna.setMaxWidth(0);
       columna.setMinWidth(0);
       columna.setPreferredWidth(0);
       
       lblTotalProducto1.setVisible(false);
       lblTotalProducto.setVisible(false);
       lblNombreProducto.setVisible(false);
       lblIdProducto.setVisible(false);
       lblPrecioProducto.setVisible(false);
       lblIdEmpleado.setVisible(false);
       lblNombreProducto.setVisible(false);
       lblNombreEmpleado.setVisible(false);
              
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo3 = new javax.swing.JLabel();
        PanelCajero = new javax.swing.JPanel();
        lblTitulo4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPrecioProducto = new javax.swing.JLabel();
        btnBuscarProducto = new javax.swing.JButton();
        btnLimpiarFormulario = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbTiposDePrecio = new javax.swing.JComboBox<>();
        cmbFormasDePago = new javax.swing.JComboBox<>();
        btnReimprimirTicket = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblSumaProductos = new javax.swing.JLabel();
        lblTotalFinal = new javax.swing.JLabel();
        btnAgregarProducto = new javax.swing.JButton();
        btnCobrar = new javax.swing.JButton();
        lblTotalProducto = new javax.swing.JLabel();
        btnQuitarProducto = new javax.swing.JButton();
        lblIdProducto = new javax.swing.JLabel();
        txtCantidadProducto = new javax.swing.JSpinner();
        lblTotalProducto1 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        lblIdEmpleado = new javax.swing.JLabel();
        txtCodigoEmpleado = new javax.swing.JTextField();
        lblNombreProducto = new javax.swing.JLabel();
        lblNombreEmpleado = new javax.swing.JLabel();

        lblTitulo3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblTitulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo3.setText("Edicion de productos y consumibles");

        PanelCajero.setBackground(new java.awt.Color(254, 254, 254));
        PanelCajero.setPreferredSize(new java.awt.Dimension(1146, 618));
        PanelCajero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo4.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        lblTitulo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo4.setText("Cajero");
        PanelCajero.add(lblTitulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 860, -1));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(25, 25, 25));
        jLabel6.setText("Logo empresa");
        PanelCajero.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 110, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("/images/empresa.png")); // NOI18N
        PanelCajero.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("/images/cafeteria.png")); // NOI18N
        PanelCajero.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 90));

        jLabel2.setText("Tipo de precio");
        PanelCajero.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 140, 40));

        lblPrecioProducto.setText("[Precio]");
        PanelCajero.add(lblPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 70, 40));

        btnBuscarProducto.setIcon(new javax.swing.ImageIcon("/images/buscar.png")); // NOI18N
        btnBuscarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarProductoMouseClicked(evt);
            }
        });
        PanelCajero.add(btnBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, -1, 40));

        btnLimpiarFormulario.setIcon(new javax.swing.ImageIcon("/images/limpiar.png")); // NOI18N
        btnLimpiarFormulario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarFormularioMouseClicked(evt);
            }
        });
        PanelCajero.add(btnLimpiarFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 380, 50, 40));

        jLabel4.setText("Cantidad");
        PanelCajero.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 90, 40));

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descripcion", "Cantidad", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TablaProductosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(TablaProductos);
        if (TablaProductos.getColumnModel().getColumnCount() > 0) {
            TablaProductos.getColumnModel().getColumn(0).setResizable(false);
            TablaProductos.getColumnModel().getColumn(0).setPreferredWidth(0);
            TablaProductos.getColumnModel().getColumn(1).setResizable(false);
            TablaProductos.getColumnModel().getColumn(1).setPreferredWidth(0);
            TablaProductos.getColumnModel().getColumn(2).setResizable(false);
            TablaProductos.getColumnModel().getColumn(2).setPreferredWidth(0);
            TablaProductos.getColumnModel().getColumn(3).setResizable(false);
            TablaProductos.getColumnModel().getColumn(3).setPreferredWidth(0);
        }

        PanelCajero.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 800, 150));

        jLabel7.setText("Codigo producto");
        PanelCajero.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 150, 40));

        jLabel8.setText("Total a pagar");
        PanelCajero.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 550, 120, 40));

        cmbTiposDePrecio.setModel(modeloComboTipoPrecio );
        cmbTiposDePrecio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTiposDePrecioItemStateChanged(evt);
            }
        });
        cmbTiposDePrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbTiposDePrecioFocusLost(evt);
            }
        });
        cmbTiposDePrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbTiposDePrecioMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbTiposDePrecioMousePressed(evt);
            }
        });
        cmbTiposDePrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTiposDePrecioActionPerformed(evt);
            }
        });
        PanelCajero.add(cmbTiposDePrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 200, 40));

        cmbFormasDePago.setModel(modeloComboFormaDePago);
        cmbFormasDePago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbFormasDePagoMouseClicked(evt);
            }
        });
        PanelCajero.add(cmbFormasDePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 260, 40));

        btnReimprimirTicket.setIcon(new javax.swing.ImageIcon("/images/impresora.png")); // NOI18N
        btnReimprimirTicket.setText("Reimprimir ticket");
        btnReimprimirTicket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReimprimirTicketMouseClicked(evt);
            }
        });
        PanelCajero.add(btnReimprimirTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 280, 60));

        jLabel10.setText("Forma de pago");
        PanelCajero.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 170, 40));

        jLabel11.setText("Suma");
        PanelCajero.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, 50, 40));

        lblSumaProductos.setText("0");
        PanelCajero.add(lblSumaProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 480, 240, 40));

        lblTotalFinal.setText("0");
        PanelCajero.add(lblTotalFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 550, 230, 40));

        btnAgregarProducto.setIcon(new javax.swing.ImageIcon("/images/anadir-al-carrito.png")); // NOI18N
        btnAgregarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarProductoMouseClicked(evt);
            }
        });
        PanelCajero.add(btnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, 40));

        btnCobrar.setIcon(new javax.swing.ImageIcon("/images/dinero-en-efectivo.png")); // NOI18N
        btnCobrar.setText("Cobrar");
        btnCobrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCobrarMouseClicked(evt);
            }
        });
        PanelCajero.add(btnCobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 280, 60));

        lblTotalProducto.setText("Total");
        PanelCajero.add(lblTotalProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 60, -1));

        btnQuitarProducto.setIcon(new javax.swing.ImageIcon("/images/quitar-del-carrito.png")); // NOI18N
        btnQuitarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuitarProductoMouseClicked(evt);
            }
        });
        PanelCajero.add(btnQuitarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 320, 50, 50));

        lblIdProducto.setText("0");
        PanelCajero.add(lblIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        txtCantidadProducto.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtCantidadProductoStateChanged(evt);
            }
        });
        txtCantidadProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCantidadProductoMouseClicked(evt);
            }
        });
        PanelCajero.add(txtCantidadProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 140, 40));

        lblTotalProducto1.setText("Total");
        PanelCajero.add(lblTotalProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 60, -1));

        txtCodigoProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoProductoKeyPressed(evt);
            }
        });
        PanelCajero.add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 140, 40));

        jCheckBox2.setText("credito de empleado");
        jCheckBox2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox2StateChanged(evt);
            }
        });
        jCheckBox2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCheckBox2KeyPressed(evt);
            }
        });
        PanelCajero.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 200, -1));

        lblIdEmpleado.setText("idEmpleado");
        PanelCajero.add(lblIdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, -1, -1));

        txtCodigoEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoEmpleadoKeyPressed(evt);
            }
        });
        PanelCajero.add(txtCodigoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 90, 40));

        lblNombreProducto.setForeground(new java.awt.Color(255, 111, 0));
        lblNombreProducto.setText("[Nombre de producto]");
        PanelCajero.add(lblNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        lblNombreEmpleado.setForeground(new java.awt.Color(86, 86, 86));
        lblNombreEmpleado.setText("[Nombre de empleado]");
        PanelCajero.add(lblNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 150, 320, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCajero, javax.swing.GroupLayout.DEFAULT_SIZE, 1170, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCajero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarProductoMouseClicked
        FormBusquedaProductos formBusquedaProductos = new FormBusquedaProductos();
        formBusquedaProductos.setVisible(true);
    }//GEN-LAST:event_btnBuscarProductoMouseClicked

    private void btnLimpiarFormularioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarFormularioMouseClicked
        LimpiarTodo();
    }//GEN-LAST:event_btnLimpiarFormularioMouseClicked

    private void btnReimprimirTicketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReimprimirTicketMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReimprimirTicketMouseClicked

    private void btnAgregarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProductoMouseClicked
        
        if ((Integer.parseInt(lblIdProducto.getText())!=0)) {
            DefaultTableModel model = (DefaultTableModel)TablaProductos.getModel();
        boolean existe = false;
        
        for (int i = 0; i < model.getRowCount(); i++) {
            if (Integer.parseInt(lblIdProducto.getText().trim()) == Integer.parseInt(model.getValueAt(i,0).toString())) {
                existe = true;
                break;
            }
        }
        
        if (existe) {
            JOptionPane.showMessageDialog(this,"Ya se ha seleccionado ese producto");
        }else{
            model.addRow(new Object[]{lblIdProducto.getText(),lblNombreProducto.getText(),txtCantidadProducto.getValue(),lblTotalProducto.getText()});
        
            double total = 0;
            for (int i = 0; i < model.getRowCount(); i++) {
                total += Double.parseDouble(model.getValueAt(i,3).toString());
            }

            DecimalFormat df = new DecimalFormat("#.00");
            lblSumaProductos.setText(""+df.format(total));

            lblNombreProducto.setText("");
            lblIdProducto.setText(""+0);
            lblPrecioProducto.setText(""+0);
            txtCodigoProducto.setText("");
            txtCantidadProducto.setValue(1);
            lblTotalProducto.setText(""+0);

            TipoDePrecio tipoPrecio = (TipoDePrecio) cmbTiposDePrecio.getSelectedItem();
            descuento = tipoPrecio.getPaga();
            double descuento =Double.parseDouble(lblSumaProductos.getText().trim())* this.descuento/100;
            double totalVenta = Double.parseDouble(lblSumaProductos.getText().trim()) - descuento;
            lblSumaProductos.setText(""+totalVenta);
        }
        }

    }//GEN-LAST:event_btnAgregarProductoMouseClicked

    private void btnCobrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCobrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCobrarMouseClicked

    private void btnQuitarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitarProductoMouseClicked
        DefaultTableModel model = (DefaultTableModel)TablaProductos.getModel();
        
        try {
            //Seleccionar row
            int selectedRow = TablaProductos.getSelectedRow();
            model.removeRow(selectedRow);
            TipoDePrecio tipoPrecio = (TipoDePrecio) cmbTiposDePrecio.getSelectedItem();
            descuento = tipoPrecio.getPaga();
            double descuento =Double.parseDouble(lblSumaProductos.getText().trim())* this.descuento/100;
            double totalVenta = Double.parseDouble(lblSumaProductos.getText().trim()) - descuento;
            lblSumaProductos.setText(""+totalVenta);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Selecciona un producto de la lista");
        }
    }//GEN-LAST:event_btnQuitarProductoMouseClicked

    private void txtCantidadProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantidadProductoMouseClicked
        
    }//GEN-LAST:event_txtCantidadProductoMouseClicked

    private void txtCantidadProductoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtCantidadProductoStateChanged
        int valor = (int) txtCantidadProducto.getValue();
        if (valor==0) {
            txtCantidadProducto.setValue(1);
            valor = 1;
        }
        
        double precio = Double.parseDouble(lblPrecioProducto.getText());
        lblTotalProducto.setText(""+precio*valor);
    }//GEN-LAST:event_txtCantidadProductoStateChanged

    private void cmbFormasDePagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbFormasDePagoMouseClicked
        
    }//GEN-LAST:event_cmbFormasDePagoMouseClicked

    private void txtCodigoProductoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoProductoKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_DOWN) {
            FuncionesProductos funcionesProductos = new FuncionesProductos();
            ArrayList<Producto> lista=funcionesProductos.BuscarProductoPorCodigo(txtCodigoProducto.getText().trim());
            int contador =lista.size();
            for (int i = 0; i < contador; i++) {
                Producto producto = lista.get(i);
                txtCodigoProducto.setText(""+producto.getClave());
                lblIdProducto.setText(""+producto.getId_producto());
                lblNombreProducto.setText(producto.getDescripcion());
                lblPrecioProducto.setText(""+producto.getPrecio());
                txtCantidadProducto.setValue(1);
                lblTotalProducto.setText(""+producto.getPrecio());
            }
        }
        
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            JOptionPane.showMessageDialog(this,"Añadir a tabla");
        }
        
        //Limpiar si esta vacio
        if (evt.getKeyCode()==KeyEvent.VK_BACK_SPACE && txtCodigoProducto.getText().equals("")) {
            lblIdProducto.setText("");
            lblNombreProducto.setText("");
            lblPrecioProducto.setText("");
            txtCantidadProducto.setValue(1);
            lblTotalProducto.setText("");
        }
    }//GEN-LAST:event_txtCodigoProductoKeyPressed

    private void jCheckBox2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCheckBox2KeyPressed
        
    }//GEN-LAST:event_jCheckBox2KeyPressed

    private void jCheckBox2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox2StateChanged
       if (jCheckBox2.isSelected()) {
            txtCodigoEmpleado.setEnabled(true);
        }else{
            txtCodigoEmpleado.setEnabled(false);
            txtCodigoEmpleado.setText("");
            lblIdEmpleado.setText(""+0);
        }
    }//GEN-LAST:event_jCheckBox2StateChanged

    private void txtCodigoEmpleadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoEmpleadoKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_DOWN) {
            FuncionesEmpleados funcionesEmpleados = new FuncionesEmpleados();
            ArrayList<Empleado> lista=funcionesEmpleados.BuscarEmpleadoPorCodigo(txtCodigoEmpleado.getText().trim());
            int contador =lista.size();
            for (int i = 0; i < contador; i++) {
                Empleado empleado = lista.get(i);
                lblIdEmpleado.setText(""+empleado.getId_empleado());
                lblNombreEmpleado.setText(empleado.getNombres()+" "+empleado.getApellidos());
                txtCodigoEmpleado.setText(empleado.getCodigo_empleado());
            }
        }
        
        if (evt.getKeyCode()==KeyEvent.VK_BACK_SPACE && txtCodigoEmpleado.getText().equals("")) {
            lblIdEmpleado.setText(""+0);
            lblNombreEmpleado.setText("");
        }
    }//GEN-LAST:event_txtCodigoEmpleadoKeyPressed

    private void TablaProductosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TablaProductosKeyPressed
        
    }//GEN-LAST:event_TablaProductosKeyPressed

    private void cmbTiposDePrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTiposDePrecioActionPerformed
        
    }//GEN-LAST:event_cmbTiposDePrecioActionPerformed

    private void cmbTiposDePrecioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbTiposDePrecioMouseClicked
        TipoDePrecio tipoPrecio = (TipoDePrecio) cmbTiposDePrecio.getSelectedItem();
        descuento = tipoPrecio.getPaga();
        double descuento =Double.parseDouble(lblSumaProductos.getText().trim())* this.descuento/100;
        double totalVenta = Double.parseDouble(lblSumaProductos.getText().trim()) - descuento;
        lblSumaProductos.setText(""+totalVenta);
    }//GEN-LAST:event_cmbTiposDePrecioMouseClicked

    private void cmbTiposDePrecioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTiposDePrecioItemStateChanged
        
    }//GEN-LAST:event_cmbTiposDePrecioItemStateChanged

    private void cmbTiposDePrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbTiposDePrecioFocusLost
    
    }//GEN-LAST:event_cmbTiposDePrecioFocusLost

    private void cmbTiposDePrecioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbTiposDePrecioMousePressed
       
    }//GEN-LAST:event_cmbTiposDePrecioMousePressed

    private void LimpiarTodo(){
        lblNombreProducto.setVisible(false);
        lblIdProducto.setText(""+0);
        txtCantidadProducto.setValue(1);
        lblNombreEmpleado.setText(""+0);
        cmbFormasDePago.setSelectedIndex(0);
        cmbTiposDePrecio.setSelectedIndex(0);
        lblSumaProductos.setText(""+0);
        lblTotalFinal.setText(""+0);
        DefaultTableModel model = (DefaultTableModel)TablaProductos.getModel();
        model.setRowCount(0);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCajero;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnCobrar;
    private javax.swing.JButton btnLimpiarFormulario;
    private javax.swing.JButton btnQuitarProducto;
    private javax.swing.JButton btnReimprimirTicket;
    private javax.swing.JComboBox<FormaDePago> cmbFormasDePago;
    private javax.swing.JComboBox<TipoDePrecio> cmbTiposDePrecio;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIdEmpleado;
    public static javax.swing.JLabel lblIdProducto;
    private javax.swing.JLabel lblNombreEmpleado;
    public static javax.swing.JLabel lblNombreProducto;
    public static javax.swing.JLabel lblPrecioProducto;
    private javax.swing.JLabel lblSumaProductos;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JLabel lblTitulo4;
    private javax.swing.JLabel lblTotalFinal;
    public static javax.swing.JLabel lblTotalProducto;
    public static javax.swing.JLabel lblTotalProducto1;
    public static javax.swing.JSpinner txtCantidadProducto;
    private javax.swing.JTextField txtCodigoEmpleado;
    public static javax.swing.JTextField txtCodigoProducto;
    // End of variables declaration//GEN-END:variables
}