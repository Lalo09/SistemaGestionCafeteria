package Ventanas;
import com.jtattoo.plaf.mint.MintLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import Modelos.*;
import Datos.*;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

/**
 * @author eduardo
 */
public class Main extends javax.swing.JFrame {
    
    //Modelos de tablas
    DefaultTableModel modeloTablaTipoPrecio = new DefaultTableModel();
    DefaultTableModel modeloTablaTipoProducto = new DefaultTableModel();
    DefaultTableModel modeloTablaFormaPago = new DefaultTableModel();
    DefaultTableModel modeloTablaEmpleado = new DefaultTableModel();
    
    //Cargar modelos de tablas
    private void CargarColumnasTipoPrecio(){
       modeloTablaTipoPrecio.addColumn("num");
       modeloTablaTipoPrecio.addColumn("Tipo de precio");
       modeloTablaTipoPrecio.addColumn("Porcentaje %");
       
       FuncionesTipoPrecio funcionesTipoPrecio = new FuncionesTipoPrecio();
       ArrayList<TipoDePrecio> lista = funcionesTipoPrecio.MostrarTipoPrecio();
       
       int contador =lista.size();
       modeloTablaTipoPrecio.setNumRows(contador);
       for (int i = 0; i < contador; i++) {
            TipoDePrecio tipoDePrecio = lista.get(i);
            modeloTablaTipoPrecio.setValueAt(tipoDePrecio.getId_tipo_de_precio(), i, 0);
            modeloTablaTipoPrecio.setValueAt(tipoDePrecio.getTipo(), i, 1);
            modeloTablaTipoPrecio.setValueAt(tipoDePrecio.getPaga(), i, 2);
       }
       
       TableColumn columna = TablaPreciosVenta.getColumnModel().getColumn(0);
       columna.setMaxWidth(0);
       columna.setMinWidth(0);
       columna.setPreferredWidth(0);
       
    }
    
    private void CargarColumnasTipoProducto(){
       modeloTablaTipoProducto.addColumn("num prod");
       modeloTablaTipoProducto.addColumn("Descripcion");
       modeloTablaTipoProducto.addColumn("Horario");
       
       FuncionesTipoProducto funcionesTipoProducto = new FuncionesTipoProducto();
       ArrayList<TipoProducto> lista = funcionesTipoProducto.MostrarTipoProducto();
       
       int contador =lista.size();
       modeloTablaTipoProducto.setNumRows(contador);
       for (int i = 0; i < contador; i++) {
            TipoProducto tipoProducto = lista.get(i);
            modeloTablaTipoProducto.setValueAt(tipoProducto.getId(), i, 0);
            modeloTablaTipoProducto.setValueAt(tipoProducto.getDescripcion(), i, 1);
            modeloTablaTipoProducto.setValueAt(tipoProducto.getHorario(), i, 2);
       }
       
       TableColumn columna = TablaTiposDeProductos.getColumnModel().getColumn(0);
       columna.setMaxWidth(0);
       columna.setMinWidth(0);
       columna.setPreferredWidth(0);
       
    }
    
    private void CargarColumnasFormaDePago(){
       modeloTablaFormaPago.addColumn("num");
       modeloTablaFormaPago.addColumn("Tipo de pago");
       
       FuncionesFormaDePago funcionesFormaDePago = new FuncionesFormaDePago();
       ArrayList<FormaDePago> lista = funcionesFormaDePago.MostrarFormaDePago();
       
       int contador =lista.size();
       modeloTablaFormaPago.setNumRows(contador);
       for (int i = 0; i < contador; i++) {
            FormaDePago formaDePago = lista.get(i);
            modeloTablaFormaPago.setValueAt(formaDePago.getId_forma_de_pago(), i, 0);
            modeloTablaFormaPago.setValueAt(formaDePago.getTipo(), i, 1);
       }
       
       TableColumn columna = TablaFormaDePago.getColumnModel().getColumn(0);
       columna.setMaxWidth(0);
       columna.setMinWidth(0);
       columna.setPreferredWidth(0);
       
    }
    
    private void CargarColumnasEmpleado(){
       modeloTablaEmpleado.addColumn("num");
       modeloTablaEmpleado.addColumn("Codigo empleado");
       modeloTablaEmpleado.addColumn("Nombres");
       modeloTablaEmpleado.addColumn("Apellidos");
       
       FuncionesEmpleados funcionesEmpleados = new FuncionesEmpleados();
       ArrayList<Empleado> lista = funcionesEmpleados.MostrarEmpleado();
       
       int contador =lista.size();
       modeloTablaEmpleado.setNumRows(contador);
       for (int i = 0; i < contador; i++) {
            Empleado empleado = lista.get(i);
            modeloTablaEmpleado.setValueAt(empleado.getId_empleado(), i, 0);
            modeloTablaEmpleado.setValueAt(empleado.getCodigo_empleado(), i, 1);
            modeloTablaEmpleado.setValueAt(empleado.getNombres(), i, 2);
            modeloTablaEmpleado.setValueAt(empleado.getApellidos(), i, 3);
       }
       
       TableColumn columna = TablaEmpleados.getColumnModel().getColumn(0);
       columna.setMaxWidth(0);
       columna.setMinWidth(0);
       columna.setPreferredWidth(0);
       
    }

    /**
     * Inicio
     */
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        
        //Cargar tablas
        CargarColumnasTipoPrecio();
        CargarColumnasTipoProducto();
        CargarColumnasFormaDePago();
        CargarColumnasEmpleado();
        
        //Componentes a ocultar
        lblEditandoPreciosVenta.setVisible(false);
        lblTipoPrecioVenta.setVisible(false);
        lblEditandoTipoDeProducto.setVisible(false);
        lblTipoProducto.setVisible(false);
        lblEditandoFormaDePago.setVisible(false);
        lblIdFormaDePago.setVisible(false);
        lblEditandoEmpleado.setVisible(false);
        lblIdEmpleado.setVisible(false);
    }

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
        lblTipoPrecioVenta = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblEditandoPreciosVenta = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        PanelTipoProducto = new javax.swing.JPanel();
        lblTitulo1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblEditandoTipoDeProducto = new javax.swing.JLabel();
        txtDescripcionTipoProd = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblTipoProducto = new javax.swing.JLabel();
        txtHorario = new javax.swing.JTextField();
        Porcentaje1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        BtnEliminarTipoProducto = new javax.swing.JButton();
        BtnGuardarTipoProducto = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaTiposDeProductos = new javax.swing.JTable();
        BtnLimpiarPanelTipoProductos = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        PanelFormaDePago = new javax.swing.JPanel();
        lblTitulo2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFormaDePago = new javax.swing.JTextField();
        BtnLimpiarPanelFormaDePago = new javax.swing.JButton();
        BtnGuardarFormaDePago = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaFormaDePago = new javax.swing.JTable();
        BtnEliminarFormaDePago = new javax.swing.JButton();
        lblIdFormaDePago = new javax.swing.JLabel();
        lblEditandoFormaDePago = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        PanelUsuarios = new javax.swing.JPanel();
        PanelEmpleados = new javax.swing.JPanel();
        lblTitulo3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCodigoEmpleado = new javax.swing.JTextField();
        Porcentaje2 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        btnLimpiarFormEmpleado = new javax.swing.JButton();
        btnGuardarEmpleado = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaEmpleados = new javax.swing.JTable();
        btnBuscarEmpleado = new javax.swing.JButton();
        lblIdEmpleado = new javax.swing.JLabel();
        lblEditandoEmpleado = new javax.swing.JLabel();
        Porcentaje3 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        Porcentaje4 = new javax.swing.JLabel();
        txtBuscarEmpleado = new javax.swing.JTextField();
        btnEliminarEmpleado1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        PanelDeUsuarios = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        PanelProductos = new javax.swing.JPanel();
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

        jTabbedPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTabbedPane2MousePressed(evt);
            }
        });

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
        BtnLimpiarPanelPRecioVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnLimpiarPanelPRecioVentaMouseClicked(evt);
            }
        });
        PanelTipoPrecio.add(BtnLimpiarPanelPRecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 230, 50));

        BtnGuardarPrecioVenta.setIcon(new javax.swing.ImageIcon("/images/save.png")); // NOI18N
        BtnGuardarPrecioVenta.setText("Guardar");
        BtnGuardarPrecioVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnGuardarPrecioVentaMouseClicked(evt);
            }
        });
        PanelTipoPrecio.add(BtnGuardarPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, 50));
        PanelTipoPrecio.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 350, 10));
        PanelTipoPrecio.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 350, 10));

        TablaPreciosVenta.setModel(modeloTablaTipoPrecio);
        TablaPreciosVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaPreciosVentaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaPreciosVenta);

        PanelTipoPrecio.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 490, 140));

        BtnEliminarPrecioVentaj.setIcon(new javax.swing.ImageIcon("/images/eliminar.png")); // NOI18N
        BtnEliminarPrecioVentaj.setText("Eliminar");
        BtnEliminarPrecioVentaj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEliminarPrecioVentajMouseClicked(evt);
            }
        });
        PanelTipoPrecio.add(BtnEliminarPrecioVentaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, -1, 50));

        lblTipoPrecioVenta.setText("0");
        PanelTipoPrecio.add(lblTipoPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, -1, -1));

        jLabel3.setText("%");
        PanelTipoPrecio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, -1, -1));

        lblEditandoPreciosVenta.setForeground(new java.awt.Color(251, 0, 0));
        lblEditandoPreciosVenta.setText("jLabel4");
        PanelTipoPrecio.add(lblEditandoPreciosVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));

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

        lblTitulo1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo1.setText("Edicion tipos de productos");
        PanelTipoProducto.add(lblTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1130, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("/images/caja.png")); // NOI18N
        PanelTipoProducto.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        lblEditandoTipoDeProducto.setForeground(new java.awt.Color(251, 0, 0));
        lblEditandoTipoDeProducto.setText("jLabel4");
        PanelTipoProducto.add(lblEditandoTipoDeProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));
        PanelTipoProducto.add(txtDescripcionTipoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 180, 40));

        jLabel7.setText("descripcion");
        PanelTipoProducto.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 108, 120, 40));

        lblTipoProducto.setText("0");
        PanelTipoProducto.add(lblTipoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, -1, -1));
        PanelTipoProducto.add(txtHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 180, 40));

        Porcentaje1.setText("Horario");
        PanelTipoProducto.add(Porcentaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 180, 70, 40));
        PanelTipoProducto.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 350, 10));

        BtnEliminarTipoProducto.setIcon(new javax.swing.ImageIcon("/images/eliminar.png")); // NOI18N
        BtnEliminarTipoProducto.setText("Eliminar");
        BtnEliminarTipoProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEliminarTipoProductoMouseClicked(evt);
            }
        });
        PanelTipoProducto.add(BtnEliminarTipoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, -1, 50));

        BtnGuardarTipoProducto.setIcon(new javax.swing.ImageIcon("/images/save.png")); // NOI18N
        BtnGuardarTipoProducto.setText("Guardar");
        BtnGuardarTipoProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnGuardarTipoProductoMouseClicked(evt);
            }
        });
        PanelTipoProducto.add(BtnGuardarTipoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, 50));
        PanelTipoProducto.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 350, 10));

        TablaTiposDeProductos.setModel(modeloTablaTipoProducto);
        TablaTiposDeProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaTiposDeProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaTiposDeProductos);

        PanelTipoProducto.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 490, 140));

        BtnLimpiarPanelTipoProductos.setIcon(new javax.swing.ImageIcon("/images/limpiar.png")); // NOI18N
        BtnLimpiarPanelTipoProductos.setText("Limpiar todo");
        BtnLimpiarPanelTipoProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnLimpiarPanelTipoProductosMouseClicked(evt);
            }
        });
        PanelTipoProducto.add(BtnLimpiarPanelTipoProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 230, 50));

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
        PanelFormaDePago.add(txtFormaDePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 180, 40));

        BtnLimpiarPanelFormaDePago.setIcon(new javax.swing.ImageIcon("/images/limpiar.png")); // NOI18N
        BtnLimpiarPanelFormaDePago.setText("Limpiar todo");
        BtnLimpiarPanelFormaDePago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnLimpiarPanelFormaDePagoMouseClicked(evt);
            }
        });
        PanelFormaDePago.add(BtnLimpiarPanelFormaDePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, 230, 50));

        BtnGuardarFormaDePago.setIcon(new javax.swing.ImageIcon("/images/save.png")); // NOI18N
        BtnGuardarFormaDePago.setText("Guardar");
        BtnGuardarFormaDePago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnGuardarFormaDePagoMouseClicked(evt);
            }
        });
        PanelFormaDePago.add(BtnGuardarFormaDePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, 50));
        PanelFormaDePago.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 350, 10));
        PanelFormaDePago.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 350, 10));

        TablaFormaDePago.setModel(modeloTablaFormaPago);
        TablaFormaDePago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaFormaDePagoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TablaFormaDePago);

        PanelFormaDePago.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 490, 200));

        BtnEliminarFormaDePago.setIcon(new javax.swing.ImageIcon("/images/eliminar.png")); // NOI18N
        BtnEliminarFormaDePago.setText("Eliminar");
        BtnEliminarFormaDePago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEliminarFormaDePagoMouseClicked(evt);
            }
        });
        PanelFormaDePago.add(BtnEliminarFormaDePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, -1, 50));

        lblIdFormaDePago.setText("0");
        PanelFormaDePago.add(lblIdFormaDePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, -1, -1));

        lblEditandoFormaDePago.setForeground(new java.awt.Color(251, 0, 0));
        lblEditandoFormaDePago.setText("jLabel4");
        PanelFormaDePago.add(lblEditandoFormaDePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));

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

        PanelEmpleados.setBackground(new java.awt.Color(254, 254, 254));
        PanelEmpleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblTitulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo3.setText("Edicion de empleados");
        PanelEmpleados.add(lblTitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1130, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("/images/user.png")); // NOI18N
        PanelEmpleados.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jLabel9.setText("Codigo empleado");
        PanelEmpleados.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 160, 40));
        PanelEmpleados.add(txtCodigoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 130, 40));

        Porcentaje2.setText("Nombres");
        PanelEmpleados.add(Porcentaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 180, 80, 40));
        PanelEmpleados.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 330, 40));

        btnLimpiarFormEmpleado.setIcon(new javax.swing.ImageIcon("/images/limpiar.png")); // NOI18N
        btnLimpiarFormEmpleado.setText("Limpiar todo");
        btnLimpiarFormEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarFormEmpleadoMouseClicked(evt);
            }
        });
        PanelEmpleados.add(btnLimpiarFormEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 230, 50));

        btnGuardarEmpleado.setIcon(new javax.swing.ImageIcon("/images/save.png")); // NOI18N
        btnGuardarEmpleado.setText("Guardar");
        btnGuardarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarEmpleadoMouseClicked(evt);
            }
        });
        PanelEmpleados.add(btnGuardarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, 50));
        PanelEmpleados.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 460, 10));

        TablaEmpleados.setModel(modeloTablaEmpleado);
        TablaEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TablaEmpleados);

        PanelEmpleados.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 490, 390));

        btnBuscarEmpleado.setIcon(new javax.swing.ImageIcon("/images/lupa.png")); // NOI18N
        btnBuscarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarEmpleadoMouseClicked(evt);
            }
        });
        PanelEmpleados.add(btnBuscarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1056, 100, 50, 60));

        lblIdEmpleado.setText("0");
        PanelEmpleados.add(lblIdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        lblEditandoEmpleado.setForeground(new java.awt.Color(251, 0, 0));
        lblEditandoEmpleado.setText("jLabel4");
        PanelEmpleados.add(lblEditandoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        Porcentaje3.setText("Apellidos");
        PanelEmpleados.add(Porcentaje3, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 250, 80, 40));
        PanelEmpleados.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 330, 40));

        Porcentaje4.setText("Buscar");
        PanelEmpleados.add(Porcentaje4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 80, 40));
        PanelEmpleados.add(txtBuscarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 330, 40));

        btnEliminarEmpleado1.setIcon(new javax.swing.ImageIcon("/images/eliminar.png")); // NOI18N
        btnEliminarEmpleado1.setText("Eliminar");
        btnEliminarEmpleado1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarEmpleado1MouseClicked(evt);
            }
        });
        PanelEmpleados.add(btnEliminarEmpleado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, 50));

        PanelUsuarios.add(PanelEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        jTabbedPane2.addTab("Empleados", jPanel8);

        PanelDeUsuarios.setBackground(new java.awt.Color(254, 254, 254));

        javax.swing.GroupLayout PanelDeUsuariosLayout = new javax.swing.GroupLayout(PanelDeUsuarios);
        PanelDeUsuarios.setLayout(PanelDeUsuariosLayout);
        PanelDeUsuariosLayout.setHorizontalGroup(
            PanelDeUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1130, Short.MAX_VALUE)
        );
        PanelDeUsuariosLayout.setVerticalGroup(
            PanelDeUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDeUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDeUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Usuarios", jPanel9);

        PanelProductos.setBackground(new java.awt.Color(254, 254, 254));

        javax.swing.GroupLayout PanelProductosLayout = new javax.swing.GroupLayout(PanelProductos);
        PanelProductos.setLayout(PanelProductosLayout);
        PanelProductosLayout.setHorizontalGroup(
            PanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1130, Short.MAX_VALUE)
        );
        PanelProductosLayout.setVerticalGroup(
            PanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

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

    private void BtnGuardarPrecioVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarPrecioVentaMouseClicked
        String tipo = txtTipoDePrecioPV.getText().trim();
        int paga = Integer.parseInt(txtPagaPV.getText().trim());
        
        TipoDePrecio tipoDeprecio = new TipoDePrecio(Integer.parseInt(lblTipoPrecioVenta.getText()), tipo, paga);
        FuncionesTipoPrecio funcionesTipoPrecio = new FuncionesTipoPrecio();
        
        if (Integer.parseInt(lblTipoPrecioVenta.getText()) == 0) {
            if (funcionesTipoPrecio.GuardarTipoPrecio(tipoDeprecio)) {
                JOptionPane.showMessageDialog(null,"Se ha registrado correctamente el tipo de precio "+tipo);
                LimpiarFormularioTipoPrecio();
            }else{
                 JOptionPane.showMessageDialog(null, "No se ha podido guardar la informacion, verifique la informacion","Error!", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            if (funcionesTipoPrecio.ActualizarTipoPrecio(tipoDeprecio)) {
                JOptionPane.showMessageDialog(null,"Se ha actualizado correctamente el tipo de precio "+tipo);
                LimpiarFormularioTipoPrecio();
            }else{
                JOptionPane.showMessageDialog(null, "No se ha podido guardar la informacion, verifique la informacion","Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BtnGuardarPrecioVentaMouseClicked

    private void BtnLimpiarPanelPRecioVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarPanelPRecioVentaMouseClicked
        LimpiarFormularioTipoPrecio();
    }//GEN-LAST:event_BtnLimpiarPanelPRecioVentaMouseClicked

    private void TablaPreciosVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaPreciosVentaMouseClicked
        int index = TablaPreciosVenta.getSelectedRow();
        TableModel model = TablaPreciosVenta.getModel();
        
        int id = Integer.parseInt(model.getValueAt(index,0).toString());
        String tipo = model.getValueAt(index,1).toString();
        int paga = Integer.parseInt(model.getValueAt(index,2).toString());
        
        lblTipoPrecioVenta.setText(""+id);
        txtTipoDePrecioPV.setText(tipo);
        txtPagaPV.setText(""+paga);
        
        lblEditandoPreciosVenta.setVisible(true);
        lblEditandoPreciosVenta.setText("Editando informacion de "+tipo);
    }//GEN-LAST:event_TablaPreciosVentaMouseClicked

    private void BtnEliminarPrecioVentajMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarPrecioVentajMouseClicked
        FuncionesTipoPrecio funcionesTipoPrecio = new FuncionesTipoPrecio();
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "¿Desea eliminar el tipo de precio?","Advertencia",dialogButton);
        
        if(dialogResult == JOptionPane.YES_OPTION){
            if (funcionesTipoPrecio.EliminarTipoPrecio(Integer.parseInt(lblTipoPrecioVenta.getText()))) {
                JOptionPane.showMessageDialog(null,"Se ha eliminado correctamente el tipo de precio ");
                LimpiarFormularioTipoPrecio();
            }else{
                JOptionPane.showMessageDialog(null, "No es posible eliminar el tipo de precio","Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BtnEliminarPrecioVentajMouseClicked

    private void BtnEliminarTipoProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarTipoProductoMouseClicked
        FuncionesTipoProducto funcionesTipoProducto = new FuncionesTipoProducto();
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "¿Desea eliminar el tipo de producto?","Advertencia",dialogButton);
        
        if(dialogResult == JOptionPane.YES_OPTION){
            if (funcionesTipoProducto.EliminarTipoProducto(Integer.parseInt(lblTipoProducto.getText()))) {
                JOptionPane.showMessageDialog(null,"Se ha eliminado correctamente el tipo de producto ");
                LimpiarFormularioTipoProducto();
            }else{
                JOptionPane.showMessageDialog(null, "No es posible eliminar el tipo de producto","Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BtnEliminarTipoProductoMouseClicked

    private void BtnGuardarTipoProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarTipoProductoMouseClicked
        String descripcion = txtDescripcionTipoProd.getText().trim();
        String horario = txtHorario.getText().trim();
        
        TipoProducto tipoProducto = new TipoProducto(Integer.parseInt(lblTipoProducto.getText()), descripcion,horario);
        FuncionesTipoProducto funcionesTipoProducto = new FuncionesTipoProducto();
        
        if (Integer.parseInt(lblTipoProducto.getText()) == 0) {
            if (funcionesTipoProducto.GuardarTipoProducto(tipoProducto)) {
                JOptionPane.showMessageDialog(null,"Se ha registrado correctamente el tipo de producto "+descripcion);
                LimpiarFormularioTipoProducto();
            }else{
                 JOptionPane.showMessageDialog(null, "No se ha podido guardar la informacion, verifique la informacion","Error!", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            if (funcionesTipoProducto.ActualizarTipoProducto(tipoProducto)) {
                JOptionPane.showMessageDialog(null,"Se ha actualizado correctamente el tipo de producto "+descripcion);
                LimpiarFormularioTipoProducto();
            }else{
                JOptionPane.showMessageDialog(null, "No se ha podido guardar la informacion, verifique la informacion","Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BtnGuardarTipoProductoMouseClicked

    private void TablaTiposDeProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaTiposDeProductosMouseClicked
        int index = TablaTiposDeProductos.getSelectedRow();
        TableModel model = TablaTiposDeProductos.getModel();
        
        int id = Integer.parseInt(model.getValueAt(index,0).toString());
        String descripcion = model.getValueAt(index,1).toString();
        String horario = model.getValueAt(index,2).toString();
        
        lblTipoProducto.setText(""+id);
        txtDescripcionTipoProd.setText(descripcion);
        txtHorario.setText(""+horario);
        
        lblEditandoTipoDeProducto.setVisible(true);
        lblEditandoTipoDeProducto.setText("Editando informacion de "+descripcion);
    }//GEN-LAST:event_TablaTiposDeProductosMouseClicked

    private void BtnLimpiarPanelTipoProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarPanelTipoProductosMouseClicked
        LimpiarFormularioTipoProducto();
    }//GEN-LAST:event_BtnLimpiarPanelTipoProductosMouseClicked

    private void BtnGuardarFormaDePagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarFormaDePagoMouseClicked
        String tipo = txtFormaDePago.getText().trim();
        
        FormaDePago formaDePago = new FormaDePago(Integer.parseInt(lblIdFormaDePago.getText()), tipo);
        FuncionesFormaDePago funcionesFormaDePago = new FuncionesFormaDePago();
        
        if (Integer.parseInt(lblIdFormaDePago.getText()) == 0) {
            if (funcionesFormaDePago.GuardarFormaDePago(formaDePago)) {
                JOptionPane.showMessageDialog(null,"Se ha registrado correctamente la forma de pago "+tipo);
                LimpiarFormularioFormaDePago();
            }else{
                 JOptionPane.showMessageDialog(null, "No se ha podido guardar la informacion, verifique la informacion","Error!", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            if (funcionesFormaDePago.ActualizarFormaDePago(formaDePago)) {
                JOptionPane.showMessageDialog(null,"Se ha actualizado la informacion");
                LimpiarFormularioFormaDePago();
            }else{
                JOptionPane.showMessageDialog(null, "No se ha podido guardar la informacion, verifique la informacion","Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BtnGuardarFormaDePagoMouseClicked

    private void BtnEliminarFormaDePagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarFormaDePagoMouseClicked
        FuncionesFormaDePago funcionesFormaDePago = new FuncionesFormaDePago();
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "¿Desea eliminar la forma de pago?","Advertencia",dialogButton);
        
        if(dialogResult == JOptionPane.YES_OPTION){
            if (funcionesFormaDePago.EliminarFormaDePago(Integer.parseInt(lblIdFormaDePago.getText()))) {
                JOptionPane.showMessageDialog(null,"Se ha eliminado correctamente la forma de pago ");
                LimpiarFormularioFormaDePago();
            }else{
                JOptionPane.showMessageDialog(null, "No es posible eliminar la forma de pago","Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BtnEliminarFormaDePagoMouseClicked

    private void TablaFormaDePagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaFormaDePagoMouseClicked
        int index = TablaFormaDePago.getSelectedRow();
        TableModel model = TablaFormaDePago.getModel();
        
        int id = Integer.parseInt(model.getValueAt(index,0).toString());
        String tipo = model.getValueAt(index,1).toString();
        
        lblIdFormaDePago.setText(""+id);
        txtFormaDePago.setText(tipo);
        
        lblEditandoFormaDePago.setVisible(true);
        lblEditandoFormaDePago.setText("Editando informacion de "+tipo);
    }//GEN-LAST:event_TablaFormaDePagoMouseClicked

    private void BtnLimpiarPanelFormaDePagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLimpiarPanelFormaDePagoMouseClicked
        LimpiarFormularioFormaDePago();
    }//GEN-LAST:event_BtnLimpiarPanelFormaDePagoMouseClicked

    private void btnLimpiarFormEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarFormEmpleadoMouseClicked
        LimpiarFormularioEmpleado();
    }//GEN-LAST:event_btnLimpiarFormEmpleadoMouseClicked

    private void btnGuardarEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarEmpleadoMouseClicked
        String codigoEmpleado = txtCodigoEmpleado.getText().trim();
        String nombres = txtNombres.getText().trim();
        String apellidos = txtApellidos.getText().trim();
        
        Empleado empleado = new Empleado(Integer.parseInt(lblIdEmpleado.getText()), codigoEmpleado,nombres,apellidos);
        FuncionesEmpleados funcionesEmpleados = new FuncionesEmpleados();
        
        if (Integer.parseInt(lblIdEmpleado.getText()) == 0) {
            if (funcionesEmpleados.GuardarEmpleado(empleado)) {
                JOptionPane.showMessageDialog(null,"Se ha registrado correctamente al empleado "+nombres+" "+apellidos+" con el codigo"+codigoEmpleado);
                LimpiarFormularioEmpleado();
            }else{
                 JOptionPane.showMessageDialog(null, "No se ha podido guardar la informacion, verifique la informacion","Error!", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            if (funcionesEmpleados.ActualizarEmpleado(empleado)) {
                JOptionPane.showMessageDialog(null,"Se ha actualizado la informacion");
                LimpiarFormularioEmpleado();
            }else{
                JOptionPane.showMessageDialog(null, "No se ha podido guardar la informacion, verifique la informacion","Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnGuardarEmpleadoMouseClicked

    private void TablaEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaEmpleadosMouseClicked
        int index = TablaEmpleados.getSelectedRow();
        TableModel model = TablaEmpleados.getModel();
        
        int id = Integer.parseInt(model.getValueAt(index,0).toString());
        String codigo = model.getValueAt(index,1).toString();
        String nombres = model.getValueAt(index,2).toString();
        String apellidos = model.getValueAt(index,3).toString();
        
        lblIdEmpleado.setText(""+id);
        txtCodigoEmpleado.setText(codigo);
        txtNombres.setText(nombres);
        txtApellidos.setText(apellidos);
        
        lblEditandoEmpleado.setVisible(true);
        lblEditandoEmpleado.setText("Editando informacion de "+nombres+" "+apellidos);
    }//GEN-LAST:event_TablaEmpleadosMouseClicked

    private void btnBuscarEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarEmpleadoMouseClicked
        if (txtBuscarEmpleado.getText().trim() != "") {
            modeloTablaEmpleado.setRowCount(0);
            modeloTablaEmpleado.setColumnCount(0);
            modeloTablaEmpleado.addColumn("num");
            modeloTablaEmpleado.addColumn("Codigo empleado");
            modeloTablaEmpleado.addColumn("Nombres");
            modeloTablaEmpleado.addColumn("Apellidos");

            FuncionesEmpleados funcionesEmpleados = new FuncionesEmpleados();
            ArrayList<Empleado> lista = funcionesEmpleados.BuscarEmpleado(txtBuscarEmpleado.getText().trim());

            int contador =lista.size();
            modeloTablaEmpleado.setNumRows(contador);
            for (int i = 0; i < contador; i++) {
                 Empleado empleado = lista.get(i);
                 modeloTablaEmpleado.setValueAt(empleado.getId_empleado(), i, 0);
                 modeloTablaEmpleado.setValueAt(empleado.getCodigo_empleado(), i, 1);
                 modeloTablaEmpleado.setValueAt(empleado.getNombres(), i, 2);
                 modeloTablaEmpleado.setValueAt(empleado.getApellidos(), i, 3);
            }

            TableColumn columna = TablaEmpleados.getColumnModel().getColumn(0);
            columna.setMaxWidth(0);
            columna.setMinWidth(0);
            columna.setPreferredWidth(0);
        }
        else{
           JOptionPane.showMessageDialog(null,"Ingrese el nombre del empleado a buscar ");
        }
    }//GEN-LAST:event_btnBuscarEmpleadoMouseClicked

    private void btnEliminarEmpleado1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarEmpleado1MouseClicked
       FuncionesEmpleados funcionesEmpleados = new FuncionesEmpleados();
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "¿Desea eliminar la forma de pago?","Advertencia",dialogButton);
        
        if(dialogResult == JOptionPane.YES_OPTION){
            if (funcionesEmpleados.EliminarEmpleado(Integer.parseInt(lblIdEmpleado.getText()))) {
                JOptionPane.showMessageDialog(null,"Se ha eliminado correctamente la forma de pago ");
                LimpiarFormularioEmpleado();
            }else{
                JOptionPane.showMessageDialog(null, "No es posible eliminar la forma de pago","Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEliminarEmpleado1MouseClicked

    private void jTabbedPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane2MouseClicked
        PanelUsuarios pUsuario = new PanelUsuarios();
        pUsuario.setSize(1130, 560); 
        pUsuario.setLocation(0, 0);
        
        PanelDeUsuarios.removeAll();
        PanelDeUsuarios.add(pUsuario, BorderLayout.CENTER);
        PanelDeUsuarios.revalidate();
        PanelDeUsuarios.repaint();
    }//GEN-LAST:event_jTabbedPane2MouseClicked

    private void jTabbedPane2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane2MousePressed
        PanelProductos pProductos = new PanelProductos();
        pProductos.setSize(1130, 560); 
        pProductos.setLocation(0, 0);
        
        PanelProductos.removeAll();
        PanelProductos.add(pProductos, BorderLayout.CENTER);
        PanelProductos.revalidate();
        PanelProductos.repaint();
    }//GEN-LAST:event_jTabbedPane2MousePressed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new MintLookAndFeel());
                    new Main().setVisible(true);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    //Funciones de limpieza de formularios
    private void LimpiarFormularioTipoPrecio(){
        txtTipoDePrecioPV.setText("");
        txtPagaPV.setText("");
        lblTipoPrecioVenta.setText(""+0);
        
        modeloTablaTipoPrecio.setRowCount(0);
        modeloTablaTipoPrecio.setColumnCount(0);
        CargarColumnasTipoPrecio();
        
        lblEditandoPreciosVenta.setVisible(false);
    }
    
    private void LimpiarFormularioTipoProducto(){
        txtDescripcionTipoProd.setText("");
        txtHorario.setText("");
        lblTipoProducto.setText(""+0);
        
        modeloTablaTipoProducto.setRowCount(0);
        modeloTablaTipoProducto.setColumnCount(0);
        CargarColumnasTipoProducto();
        
        lblEditandoTipoDeProducto.setVisible(false);
    }
    
    private void LimpiarFormularioFormaDePago(){
        txtFormaDePago.setText("");
        lblIdFormaDePago.setText(""+0);
        
        modeloTablaFormaPago.setRowCount(0);
        modeloTablaFormaPago.setColumnCount(0);
        CargarColumnasFormaDePago();
        
        lblEditandoFormaDePago.setVisible(false);
    }
    
    private void LimpiarFormularioEmpleado(){
        txtCodigoEmpleado.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        lblIdEmpleado.setText(""+0);
        
        modeloTablaEmpleado.setRowCount(0);
        modeloTablaEmpleado.setColumnCount(0);
        CargarColumnasEmpleado();
        
        lblEditandoEmpleado.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminarFormaDePago;
    private javax.swing.JButton BtnEliminarPrecioVentaj;
    private javax.swing.JButton BtnEliminarTipoProducto;
    private javax.swing.JButton BtnGuardarFormaDePago;
    private javax.swing.JButton BtnGuardarPrecioVenta;
    private javax.swing.JButton BtnGuardarTipoProducto;
    private javax.swing.JButton BtnLimpiarPanelFormaDePago;
    private javax.swing.JButton BtnLimpiarPanelPRecioVenta;
    private javax.swing.JButton BtnLimpiarPanelTipoProductos;
    private javax.swing.JPanel PanelCajero;
    private javax.swing.JPanel PanelDeUsuarios;
    private javax.swing.JPanel PanelEmpleados;
    private javax.swing.JPanel PanelFormaDePago;
    private javax.swing.JPanel PanelInventario1;
    private javax.swing.JPanel PanelProductos;
    private javax.swing.JPanel PanelTipoPrecio;
    private javax.swing.JPanel PanelTipoProducto;
    private javax.swing.JPanel PanelUsuarios;
    private javax.swing.JLabel Porcentaje;
    private javax.swing.JLabel Porcentaje1;
    private javax.swing.JLabel Porcentaje2;
    private javax.swing.JLabel Porcentaje3;
    private javax.swing.JLabel Porcentaje4;
    private javax.swing.JTable TablaEmpleados;
    private javax.swing.JTable TablaFormaDePago;
    private javax.swing.JTable TablaPreciosVenta;
    private javax.swing.JTable TablaTiposDeProductos;
    private javax.swing.JButton btnBuscarEmpleado;
    private javax.swing.JButton btnEliminarEmpleado1;
    private javax.swing.JButton btnGuardarEmpleado;
    private javax.swing.JButton btnLimpiarFormEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JLabel lblEditandoEmpleado;
    private javax.swing.JLabel lblEditandoFormaDePago;
    private javax.swing.JLabel lblEditandoPreciosVenta;
    private javax.swing.JLabel lblEditandoTipoDeProducto;
    private javax.swing.JLabel lblIdEmpleado;
    private javax.swing.JLabel lblIdFormaDePago;
    private javax.swing.JLabel lblTipoPrecioVenta;
    private javax.swing.JLabel lblTipoProducto;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuscarEmpleado;
    private javax.swing.JTextField txtCodigoEmpleado;
    private javax.swing.JTextField txtDescripcionTipoProd;
    private javax.swing.JTextField txtFormaDePago;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtPagaPV;
    private javax.swing.JTextField txtTipoDePrecioPV;
    // End of variables declaration//GEN-END:variables
}
