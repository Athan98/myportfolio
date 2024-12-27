package frames;

import config.HibernateConfig;
import config_tables.Render;
import config_tables.RenderProductos;
import data.Categoria_data;
import data.Producto_data;
import entidades.Categoria;
import entidades.Producto;
import exportarExcel.Controlador;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hibernate.Session;

public class Productos extends javax.swing.JInternalFrame {

    Class tipo[] = new Class[]{java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class,
        java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class};

    private final DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int fila, int col) {
            return col == 0;  // Hacer la primera columna (checkbox) editable
        }

        @Override
        public Class getColumnClass(int index) {
            return tipo[index];
        }
    };

    List<Producto> productosBuscados = null;
    List<Categoria> categoriasBuscadas = null;

    public Productos() {
        initComponents();
        jbGuardar.setEnabled(false);
        jbAgregar.setEnabled(true);
        jcEstado.setSelectedIndex(-1);
        jlCargaImport.setVisible(false);
        cargarComboBox();
        armarCabeceraTabla();
        actualizarListaProductos();
        categoriasBuscadas = listarCategorias();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDescripcion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jcCategorias = new javax.swing.JComboBox<>();
        jbAgregarCategoria = new javax.swing.JButton();
        jlID = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbEscanearNuevo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jcEstado = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtCostoUnitario = new javax.swing.JTextField();
        jtPrecioVenta = new javax.swing.JTextField();
        jtStock = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtGanancia = new javax.swing.JTextField();
        jbCalcularPrecioVenta = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jbAgregar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jtBuscarPorNombre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtBusquedaCodigo = new javax.swing.JTextField();
        jbEscanear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jtTasaActualizacion = new javax.swing.JTextField();
        jbActualizarMasiva = new javax.swing.JButton();
        jbLimpiarCodigo = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jcCategoriasAct = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jtActualizarCat = new javax.swing.JTextField();
        jbActualizarCat = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jbImportarExcel = new javax.swing.JButton();
        jlCargaImport = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jbEditarProducto = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbExportarExcel = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jcCategoriasActGan = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jtTasaActGanancia = new javax.swing.JTextField();
        jbCalcularGan = new javax.swing.JButton();

        setClosable(true);
        setTitle("PRODUCTOS");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 20))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descripciones del producto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jtDescripcion.setColumns(20);
        jtDescripcion.setRows(5);
        jScrollPane1.setViewportView(jtDescripcion);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Descripcion:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre:");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Codigo:");

        jtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCodigoActionPerformed(evt);
            }
        });
        jtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtCodigoKeyPressed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Categoria:");

        jbAgregarCategoria.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jbAgregarCategoria.setText("NUEVO");
        jbAgregarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarCategoriaActionPerformed(evt);
            }
        });

        jlID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlID.setText("-");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ID:");

        jbEscanearNuevo.setText("Escanear");
        jbEscanearNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEscanearNuevoActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/refresh.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Estado:");

        jcEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DISPONIBLE", "NO DISPONIBLE", "SIN STOCK" }));
        jcEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbEscanearNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlID, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcEstado, 0, 202, Short.MAX_VALUE)
                                    .addComponent(jcCategorias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbAgregarCategoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlID, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCodigo)
                    .addComponent(jbEscanearNuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbAgregarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Precios y Stock", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Precio venta unitario ($) :");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Precio costo unitario ($) :");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Stock:");

        jtCostoUnitario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtCostoUnitario.setText("0");
        jtCostoUnitario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtCostoUnitarioKeyPressed(evt);
            }
        });

        jtPrecioVenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtPrecioVenta.setText("0");
        jtPrecioVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtPrecioVentaKeyPressed(evt);
            }
        });

        jtStock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtStock.setText("0");
        jtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtStockKeyPressed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Ganancia (%):");

        jtGanancia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtGanancia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtGananciaKeyPressed(evt);
            }
        });

        jbCalcularPrecioVenta.setForeground(new java.awt.Color(0, 153, 0));
        jbCalcularPrecioVenta.setText("Calcular $");
        jbCalcularPrecioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcularPrecioVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtGanancia)
                    .addComponent(jtPrecioVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(jtStock)
                    .addComponent(jtCostoUnitario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCalcularPrecioVenta)
                .addGap(142, 142, 142))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCostoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCalcularPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbAgregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbAgregar.setForeground(new java.awt.Color(51, 153, 0));
        jbAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregarx18.png"))); // NOI18N
        jbAgregar.setText("AGREGAR");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbLimpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/limpiarx18.png"))); // NOI18N
        jbLimpiar.setText("LIMPIAR");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbGuardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbGuardar.setForeground(new java.awt.Color(0, 0, 153));
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/savex18.png"))); // NOI18N
        jbGuardar.setText("GUARDAR");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregar)
                    .addComponent(jbLimpiar)
                    .addComponent(jbGuardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 20))); // NOI18N

        jLabel10.setText("Buscar por nombre:");

        jtBuscarPorNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtBuscarPorNombreKeyReleased(evt);
            }
        });

        jLabel11.setText("Buscar por codigo:");

        jtBusquedaCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtBusquedaCodigoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtBusquedaCodigoKeyReleased(evt);
            }
        });

        jbEscanear.setText("Escanear");
        jbEscanear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEscanearActionPerformed(evt);
            }
        });

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTableProductos);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actualizacion $ masivo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel12.setText("Multiplicar por (%) :");

        jtTasaActualizacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtTasaActualizacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtTasaActualizacionKeyPressed(evt);
            }
        });

        jbActualizarMasiva.setForeground(new java.awt.Color(0, 153, 0));
        jbActualizarMasiva.setText("Actualizar");
        jbActualizarMasiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarMasivaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbActualizarMasiva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtTasaActualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtTasaActualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbActualizarMasiva)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbLimpiarCodigo.setText("Limpiar");
        jbLimpiarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarCodigoActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actualizar $ por categoria", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel13.setText("Categoria:");

        jLabel14.setText("%");

        jbActualizarCat.setForeground(new java.awt.Color(0, 153, 0));
        jbActualizarCat.setText("Actualizar");
        jbActualizarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarCatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcCategoriasAct, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jtActualizarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbActualizarCat))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jcCategoriasAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jbActualizarCat)
                    .addComponent(jtActualizarCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actualizar $ con Excel", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Archivo:");

        jbImportarExcel.setForeground(new java.awt.Color(0, 153, 0));
        jbImportarExcel.setText("Importar");
        jbImportarExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbImportarExcelActionPerformed(evt);
            }
        });

        jlCargaImport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCargaImport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cargar.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbImportarExcel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlCargaImport, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCargaImport, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbImportarExcel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbEditarProducto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbEditarProducto.setForeground(new java.awt.Color(0, 0, 0));
        jbEditarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editarx18.png"))); // NOI18N
        jbEditarProducto.setText("EDITAR");
        jbEditarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarProductoActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(204, 0, 0));
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminarx18.png"))); // NOI18N
        jbEliminar.setText("ELIMINAR");
        jbEliminar.setToolTipText("");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbExportarExcel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbExportarExcel.setForeground(new java.awt.Color(51, 153, 0));
        jbExportarExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/excelx18.png"))); // NOI18N
        jbExportarExcel.setText("EXPORTAR");
        jbExportarExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExportarExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbEditarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jbExportarExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jbExportarExcel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbEditarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbEliminar)))
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calcular ganancia por categoria", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel16.setText("Categoria:");

        jLabel18.setText("%");

        jbCalcularGan.setForeground(new java.awt.Color(0, 153, 0));
        jbCalcularGan.setText("Actualizar");
        jbCalcularGan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcularGanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcCategoriasActGan, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jtTasaActGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbCalcularGan))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jcCategoriasActGan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jbCalcularGan)
                    .addComponent(jtTasaActGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jtBusquedaCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbEscanear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbLimpiarCodigo))
                            .addComponent(jtBuscarPorNombre)))
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtBuscarPorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtBusquedaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEscanear)
                    .addComponent(jbLimpiarCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        try {
            Session session = HibernateConfig.get().openSession();
            Categoria cat = (Categoria) jcCategorias.getSelectedItem();
            String disponibilidad = (String) jcEstado.getSelectedItem();
            String nombreProd = reemplazarEnie(jtNombre.getText());
            String descripcion = jtDescripcion.getText();
            String codigo = jtCodigo.getText();
            Double precioVentaUnitario = Double.parseDouble(jtPrecioVenta.getText());
            Double precioCostoUnitario = Double.parseDouble(jtCostoUnitario.getText());
            int stock = Integer.parseInt(jtStock.getText());

            if (jtCodigo.getText().isEmpty() || jtNombre.getText().isEmpty()
                    || jcCategorias.getSelectedIndex() == -1 || jtPrecioVenta.getText().isEmpty()
                    || jtCostoUnitario.getText().isEmpty() || jtStock.getText().isEmpty() || jcEstado.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(null, "Todos los campos deben estar completos");
            } else {

                Producto prod = new Producto(cat, nombreProd, descripcion, codigo, precioVentaUnitario, precioCostoUnitario, stock, disponibilidad);

                Producto_data pd = new Producto_data(session);

                pd.agregar(prod);

                limpiarCampos();
                borrarFilas();
                actualizarListaProductos();
                JOptionPane.showMessageDialog(null, "El producto ha sido agregado a la base de datos");
            }

            session.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbEscanearNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEscanearNuevoActionPerformed
        jtCodigo.setText("");
        JOptionPane.showMessageDialog(null, "Presione ACEPTAR y escanee el producto");
        jtCodigo.requestFocus();
    }//GEN-LAST:event_jbEscanearNuevoActionPerformed

    private void jbAgregarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarCategoriaActionPerformed
        Categorias c = new Categorias(this);
        c.setVisible(true);
        Principal.escritorio.add(c);
        Principal.escritorio.moveToFront(c);
        c.setLocation((Principal.escritorio.getWidth() - c.getWidth()) / 2, (Principal.escritorio.getHeight() - c.getHeight()) / 2);
    }//GEN-LAST:event_jbAgregarCategoriaActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        try {
            if (jtCodigo.getText().isEmpty() || jtNombre.getText().isEmpty()
                    || jcCategorias.getSelectedIndex() == -1 || jtPrecioVenta.getText().isEmpty()
                    || jtCostoUnitario.getText().isEmpty() || jtStock.getText().isEmpty() || jcEstado.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(null, "Todos los campos deben estar completos");
            } else {
                Session session = HibernateConfig.get().openSession();
                Producto_data pd = new Producto_data(session);

                int idProducto = Integer.parseInt(jlID.getText());
                String codigo = jtCodigo.getText();
                String nombre = reemplazarEnie(jtNombre.getText());
                String descripcion = jtDescripcion.getText();
                Categoria cat = (Categoria) jcCategorias.getSelectedItem();
                String disponibilidad = (String) jcEstado.getSelectedItem();
                Double precioCosto = Double.parseDouble(jtCostoUnitario.getText());
                Double precioVenta = Double.parseDouble(jtPrecioVenta.getText());
                int stock = Integer.parseInt(jtStock.getText());

                Producto prod = new Producto(idProducto, cat, nombre, descripcion, codigo, precioVenta, precioCosto, stock, disponibilidad);
                pd.actualizar(prod);

                borrarFilas();
                actualizarListaProductos();
                limpiarCampos();
                JOptionPane.showMessageDialog(null, "El producto ha sido actualizado");

                session.close();

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private String reemplazarEnie(String cadena) {
        try {
            // Car�cter Unicode para la letra "�" min�scula
            char enieMinuscula = '\u00F1';
            // Car�cter Unicode para la letra "�" may�scula
            char enieMayuscula = '\u00D1';

            // Reemplazar "�" min�scula
            cadena = cadena.replace("�", String.valueOf(enieMinuscula));
            // Reemplazar "�" may�scula
            cadena = cadena.replace("�", String.valueOf(enieMayuscula));

            return cadena;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
        return null;
    }

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbCalcularPrecioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcularPrecioVentaActionPerformed
        try {
            Double costoUnitario = Double.parseDouble(jtCostoUnitario.getText());
            Double porcentajeGanancia = Double.parseDouble(jtGanancia.getText()) / 100;
            Double resultado = costoUnitario + (costoUnitario * porcentajeGanancia);

            jtPrecioVenta.setText(Math.round(resultado * 100.0) / 100.0 + "");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }//GEN-LAST:event_jbCalcularPrecioVentaActionPerformed

    private void jbEscanearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEscanearActionPerformed
        jtBusquedaCodigo.setText("");
        JOptionPane.showMessageDialog(null, "Presione ACEPTAR y escanee el producto");
        jtBusquedaCodigo.requestFocus();
    }//GEN-LAST:event_jbEscanearActionPerformed

    private void jtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCodigoKeyPressed
        if ((Character.isDigit(evt.getKeyChar()) || (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE))
                || (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_V)) {
            jtCodigo.setEditable(true);
        } else {
            jtCodigo.setEditable(false);
        }
    }//GEN-LAST:event_jtCodigoKeyPressed

    private void jtCostoUnitarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCostoUnitarioKeyPressed
        if (Character.isDigit(evt.getKeyChar()) || (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)
                || (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_V) || (evt.getKeyChar() == '.')) {

            jtCostoUnitario.setEditable(true);
        } else {
            jtCostoUnitario.setEditable(false);
        }
    }//GEN-LAST:event_jtCostoUnitarioKeyPressed

    private void jtGananciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtGananciaKeyPressed
        if (Character.isDigit(evt.getKeyChar()) || (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE) || (evt.getKeyChar() == '.')) {
            jtGanancia.setEditable(true);
        } else {
            jtGanancia.setEditable(false);
        }
    }//GEN-LAST:event_jtGananciaKeyPressed

    private void jtPrecioVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioVentaKeyPressed
        if (Character.isDigit(evt.getKeyChar()) || (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE) || (evt.getKeyChar() == '.')) {
            jtPrecioVenta.setEditable(true);
        } else {
            jtPrecioVenta.setEditable(false);
        }
    }//GEN-LAST:event_jtPrecioVentaKeyPressed

    private void jtStockKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtStockKeyPressed
        if (Character.isDigit(evt.getKeyChar()) || (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            jtStock.setEditable(true);
        } else {
            jtStock.setEditable(false);
        }
    }//GEN-LAST:event_jtStockKeyPressed

    private void jtBusquedaCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBusquedaCodigoKeyPressed
        if (Character.isDigit(evt.getKeyChar()) || (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            jtBusquedaCodigo.setEditable(true);
        } else {
            jtBusquedaCodigo.setEditable(false);
        }
    }//GEN-LAST:event_jtBusquedaCodigoKeyPressed

    private void jtBuscarPorNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBuscarPorNombreKeyReleased
        try {
            String campoBuscarNombre = jtBuscarPorNombre.getText().toUpperCase();

            borrarFilas();

            for (Producto p : productosBuscados) {
                if (p.getNombre().toUpperCase().startsWith(campoBuscarNombre)) {
                    modelo.addRow(new Object[]{
                        false,
                        p.getIdProducto(),
                        p.getCodigo(),
                        p.getCategoria().getNombre(),
                        p.getNombre(),
                        p.getPrecioCostoUnitario(),
                        p.getPrecioVentaUnitario(),
                        p.getStock(),
                        p.getDisponibilidad()});
                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }//GEN-LAST:event_jtBuscarPorNombreKeyReleased

    private void jbEditarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarProductoActionPerformed
        jbAgregar.setEnabled(false);
        jbGuardar.setEnabled(true);

        try {

            Producto prod = new Producto();

            int idProducto = (int) modelo.getValueAt(jTableProductos.getSelectedRow(), 1);

            Session session = HibernateConfig.get().openSession();

            Producto_data prod_data = new Producto_data(session);

            prod = prod_data.encontrarPorID(idProducto);

            jlID.setText(prod.getIdProducto() + "");
            jtCodigo.setText(prod.getCodigo());
            jtNombre.setText(prod.getNombre());
            jtDescripcion.setText(prod.getDescripcion());
            jtCostoUnitario.setText(prod.getPrecioCostoUnitario() + "");
            jtPrecioVenta.setText(prod.getPrecioVentaUnitario() + "");
            jtStock.setText(prod.getStock() + "");

            float ganancia = (float) (Math.round(((((prod.getPrecioVentaUnitario() / prod.getPrecioCostoUnitario())) - 1) * 100) * 100) / 100);

            jtGanancia.setText(ganancia + "");

            Object categoriaSeleccionada = modelo.getValueAt(jTableProductos.getSelectedRow(), 3);

            for (int i = 0; i < jcCategorias.getItemCount(); i++) {
                Categoria categoria = jcCategorias.getItemAt(i);
                if (categoria.getNombre().equals(categoriaSeleccionada)) {
                    jcCategorias.setSelectedIndex(i);
                    break;
                }
            }

            for (int i = 0; i < jcEstado.getItemCount(); i++) {
                String disponibilidad = jcEstado.getItemAt(i);
                if (prod.getDisponibilidad().equals(disponibilidad)) {
                    jcEstado.setSelectedIndex(i);
                    break;
                }
            }

            session.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }//GEN-LAST:event_jbEditarProductoActionPerformed

    private void jbLimpiarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarCodigoActionPerformed
        try {
            jtBusquedaCodigo.setText("");
            borrarFilas();
            for (Producto p : productosBuscados) {
                modelo.addRow(new Object[]{
                    false,
                    p.getIdProducto(),
                    p.getCodigo(),
                    p.getCategoria().getNombre(),
                    p.getNombre(),
                    p.getPrecioCostoUnitario(),
                    p.getPrecioVentaUnitario(),
                    p.getStock(),
                    p.getDisponibilidad()});

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }//GEN-LAST:event_jbLimpiarCodigoActionPerformed

    private void jbActualizarMasivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarMasivaActionPerformed
        try {
            Session session = HibernateConfig.get().openSession();
            Producto_data pd = new Producto_data(session);

            double coeficiente = ((Double.parseDouble(jtTasaActualizacion.getText())) + 100) / 100;
            double nuevoPrecio = 0;

            for (Producto p : productosBuscados) {
                nuevoPrecio = p.getPrecioVentaUnitario() * coeficiente;
                p.setPrecioVentaUnitario(Math.round(nuevoPrecio * 100.0) / 100.0);

                pd.actualizar(p);
            }
            borrarFilas();
            JOptionPane.showMessageDialog(null, "La lista de productos ha sido actualizada completamente");
            actualizarListaProductos();
            jtTasaActualizacion.setText("");
            session.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }//GEN-LAST:event_jbActualizarMasivaActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        try {
            Session session = HibernateConfig.get().openSession();
            Producto_data pd = new Producto_data(session);

            List<Producto> productosAEliminar = new ArrayList<>(); // Inicializar la lista

            boolean ver;
            Producto dp;

            for (int i = 0; i < productosBuscados.size(); i++) {
                ver = (boolean) modelo.getValueAt(i, 0);
                dp = pd.encontrarPorID((int) modelo.getValueAt(i, 1));
                if (ver) {
                    productosAEliminar.add(dp);
                }
            }

            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Realmente desea eliminar las filas seleccionadas?", "Confirmaci�n", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                for (Producto ps : productosAEliminar) {
                    ps.setDisponibilidad("NO DISPONIBLE");
                    pd.actualizar(ps);
                }

                borrarFilas();
                actualizarListaProductos();
                JOptionPane.showMessageDialog(null, "Elementos eliminados exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Operacion cancelada");
            }

            session.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }

    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbExportarExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExportarExcelActionPerformed
        Controlador obj;
        try {
            obj = new Controlador();
            obj.exportarExcel(jTableProductos);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error de archivo");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ERROR: " + ex.getMessage());
        }
    }//GEN-LAST:event_jbExportarExcelActionPerformed

    private void jtTasaActualizacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTasaActualizacionKeyPressed
        if (Character.isDigit(evt.getKeyChar()) || (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            jtTasaActualizacion.setEditable(true);
        } else {
            jtTasaActualizacion.setEditable(false);
        }
    }//GEN-LAST:event_jtTasaActualizacionKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cargarComboBox();
        categoriasBuscadas = listarCategorias();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtBusquedaCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBusquedaCodigoKeyReleased
        try {
            String campoBuscarCodigo = jtBusquedaCodigo.getText();

            borrarFilas();

            for (Producto p : productosBuscados) {
                if (p.getCodigo().startsWith(campoBuscarCodigo) || p.getCodigo().equals(campoBuscarCodigo)) {
                    modelo.addRow(new Object[]{
                        false,
                        p.getIdProducto(),
                        p.getCodigo(),
                        p.getCategoria().getNombre(),
                        p.getNombre(),
                        p.getPrecioCostoUnitario(),
                        p.getPrecioVentaUnitario(),
                        p.getStock(),
                        p.getDisponibilidad()});
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }//GEN-LAST:event_jtBusquedaCodigoKeyReleased

    private void jbActualizarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarCatActionPerformed
        try {
            Categoria cat = (Categoria) jcCategoriasAct.getSelectedItem();

            Session session = HibernateConfig.get().openSession();
            Producto_data pd = new Producto_data(session);

            double coeficiente = ((Double.parseDouble(jtActualizarCat.getText())) + 100) / 100;
            double nuevoPrecio = 0;

            for (Producto p : productosBuscados) {
                if (p.getCategoria().getNombre().equals(cat.getNombre())) {
                    nuevoPrecio = p.getPrecioVentaUnitario() * coeficiente;
                    p.setPrecioVentaUnitario(Math.round(nuevoPrecio * 100.0) / 100.0);
                    pd.actualizar(p);
                }
            }

            borrarFilas();
            actualizarListaProductos();
            jtActualizarCat.setText("");
            jcCategoriasAct.setSelectedIndex(-1);
            JOptionPane.showMessageDialog(null, "Los precios de los productos de la categoria " + cat.getNombre() + " han sido actualizados");
            session.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }//GEN-LAST:event_jbActualizarCatActionPerformed

    private void jtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCodigoActionPerformed

    private void jbImportarExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbImportarExcelActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Excel", "xls", "xlsx");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Seleccionar archivo Excel");

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            // Crear un hilo para ejecutar el procesamiento en segundo plano
            Thread importThread = new Thread(() -> {
                try {
                    SwingUtilities.invokeLater(() -> jlCargaImport.setVisible(true));
                    File selectedFile = chooser.getSelectedFile();
                    FileInputStream fis = new FileInputStream(selectedFile);

                    XSSFWorkbook libro = new XSSFWorkbook(fis);
                    XSSFSheet hoja = libro.getSheetAt(1);

                    int numFilas = hoja.getLastRowNum();

                    // Mostrar jlCargaImport antes de comenzar el procesamiento
                    for (int i = 0; i <= numFilas; i++) {
                        Row fila = hoja.getRow(i);

                        Cell nombreCelda = fila.getCell(4);
                        Cell costoCelda = fila.getCell(5);

                        String nombre = "";
                        Double costoUnitario = 0.0;

                        if (nombreCelda != null && costoCelda != null) {
                            switch (nombreCelda.getCellTypeEnum()) {
                                case STRING:
                                    nombre = nombreCelda.getStringCellValue();
                                    break;
                                default:
                                    break;
                            }

                            switch (costoCelda.getCellTypeEnum()) {
                                case NUMERIC:
                                    costoUnitario = costoCelda.getNumericCellValue();
                                    break;
                                default:
                                    break;
                            }

                            // Llamada al m�todo para actualizar el precio en la base de datos
                            actualizarPrecios(nombre, costoUnitario);
                        }
                    }

                    fis.close();
                    // Ocultar jlCargaImport despu�s de finalizar el procesamiento
                    SwingUtilities.invokeLater(() -> jlCargaImport.setVisible(false));
                    borrarFilas();
                    actualizarListaProductos();
                    JOptionPane.showMessageDialog(null, "Todos los precios fueron actualizados");
                } catch (Exception ex) {
                    // Ocultar jlCargaImport en caso de error
                    SwingUtilities.invokeLater(() -> jlCargaImport.setVisible(false));
                    JOptionPane.showMessageDialog(null, "No se pudieron actualizar los precios");
                }
            });

            // Iniciar el hilo
            importThread.start();
        }
    }//GEN-LAST:event_jbImportarExcelActionPerformed

    private void jcEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEstadoActionPerformed

    }//GEN-LAST:event_jcEstadoActionPerformed

    private void jbCalcularGanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcularGanActionPerformed
        try {
            Categoria cat = (Categoria) jcCategoriasActGan.getSelectedItem();

            Session session = HibernateConfig.get().openSession();
            Producto_data pd = new Producto_data(session);

            double coeficiente = ((Double.parseDouble(jtTasaActGanancia.getText())) + 100) / 100;
            double nuevoPrecio = 0;

            for (Producto p : productosBuscados) {
                if (p.getCategoria().getNombre().equals(cat.getNombre())) {
                    nuevoPrecio = p.getPrecioCostoUnitario() * coeficiente;
                    p.setPrecioVentaUnitario(Math.round(nuevoPrecio * 100.0) / 100.0);
                    pd.actualizar(p);
                }
            }

            borrarFilas();
            actualizarListaProductos();
            jtTasaActGanancia.setText("");
            jcCategoriasActGan.setSelectedIndex(-1);
            JOptionPane.showMessageDialog(null, "Los precios de los productos de la categoria " + cat.getNombre() + " han sido seteados");
            session.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }//GEN-LAST:event_jbCalcularGanActionPerformed

    private void actualizarPrecios(String nombre, Double costo) {

        try {
            Session session = HibernateConfig.get().openSession();
            Producto_data pd = new Producto_data(session);

            Double costoUnitario = costo;
            String nombreString = obtenerNombreProducto(nombre);
            System.out.println(nombreString);

            for (Producto p : productosBuscados) {
                if (p.getNombre().equals(nombreString)) {
                    p.setPrecioCostoUnitario(costoUnitario);
                    pd.actualizar(p);
                }
            }

            session.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }

    }

    private String obtenerNombreProducto(String nombre) {
        try {
            // Patrón para coincidir con texto después de un espacio
            Pattern pattern = Pattern.compile("\\s(.+)");
            Matcher matcher = pattern.matcher(nombre);

            // Encuentra la coincidencia
            if (matcher.find()) {
                // Obtiene el texto después del espacio
                String textoDespuesDelEspacio = matcher.group(1).trim();

                // Retorna el texto después del espacio
                return textoDespuesDelEspacio;
            }

            // Si no se encuentra un espacio, retorna el nombre original
            return nombre.trim();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }

        return "";
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JButton jbActualizarCat;
    private javax.swing.JButton jbActualizarMasiva;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbAgregarCategoria;
    private javax.swing.JButton jbCalcularGan;
    private javax.swing.JButton jbCalcularPrecioVenta;
    private javax.swing.JButton jbEditarProducto;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbEscanear;
    private javax.swing.JButton jbEscanearNuevo;
    private javax.swing.JButton jbExportarExcel;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbImportarExcel;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbLimpiarCodigo;
    private javax.swing.JComboBox<Categoria> jcCategorias;
    private javax.swing.JComboBox<Categoria> jcCategoriasAct;
    private javax.swing.JComboBox<Categoria> jcCategoriasActGan;
    private javax.swing.JComboBox<String> jcEstado;
    private javax.swing.JLabel jlCargaImport;
    private javax.swing.JLabel jlID;
    private javax.swing.JTextField jtActualizarCat;
    private javax.swing.JTextField jtBuscarPorNombre;
    private javax.swing.JTextField jtBusquedaCodigo;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtCostoUnitario;
    private javax.swing.JTextArea jtDescripcion;
    private javax.swing.JTextField jtGanancia;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPrecioVenta;
    private javax.swing.JTextField jtStock;
    private javax.swing.JTextField jtTasaActGanancia;
    private javax.swing.JTextField jtTasaActualizacion;
    // End of variables declaration//GEN-END:variables

    public void cargarComboBox() {
        try {
            jcCategorias.removeAllItems();
            jcCategoriasAct.removeAllItems();
            jcCategoriasActGan.removeAllItems();

            Session session = HibernateConfig.get().openSession();
            Categoria_data cat_data = new Categoria_data(session);
            List<Categoria> categorias = cat_data.listarTodo();

            Set<String> categoriasAgregadas = new HashSet<>();

            for (Categoria cat : categorias) {
                String categoria = cat.getNombre();
                if (!categoriasAgregadas.contains(categoria)) {
                    jcCategorias.addItem(cat);
                    jcCategoriasAct.addItem(cat);
                    jcCategoriasActGan.addItem(cat);
                    categoriasAgregadas.add(categoria);
                }
            }

            jcCategorias.setSelectedIndex(-1);
            jcCategoriasAct.setSelectedIndex(-1);
            jcCategoriasActGan.setSelectedIndex(-1);

            session.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }

    private List<Categoria> listarCategorias() {
        try {

            Session session = HibernateConfig.get().openSession();
            Categoria_data cat_data = new Categoria_data(session);
            List<Categoria> categorias = cat_data.listarTodo();
            session.close();

            return categorias;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }

        return null;

    }

    private void limpiarCampos() {
        jcCategorias.setSelectedIndex(-1);
        jlID.setText("");
        jtCodigo.setText("");
        jtNombre.setText("");
        jtDescripcion.setText("");
        jtCostoUnitario.setText("0");
        jtPrecioVenta.setText("0");
        jtGanancia.setText("0");
        jtStock.setText("0");
        jtBuscarPorNombre.setText("");
        jtBusquedaCodigo.setText("");
        jbAgregar.setEnabled(true);
        jbGuardar.setEnabled(false);
        jcEstado.setSelectedIndex(-1);
    }

    public void armarCabeceraTabla() {
        modelo.setColumnCount(0);

        jTableProductos.setDefaultRenderer(Object.class, new RenderProductos());

        jTableProductos.setRowHeight(25);

        modelo.addColumn(" ");
        modelo.addColumn("ID");
        modelo.addColumn("Codigo");
        modelo.addColumn("Categoria");
        modelo.addColumn("Nombre");
        modelo.addColumn("Costo unitario");
        modelo.addColumn("Precio venta unitario");
        modelo.addColumn("Stock");
        modelo.addColumn("Disponibilidad");

        jTableProductos.setModel(modelo);

        TableColumn column1 = jTableProductos.getColumnModel().getColumn(1);
        TableColumn column0 = jTableProductos.getColumnModel().getColumn(0);

        column1.setPreferredWidth(25);
        column0.setPreferredWidth(20);
    }

    public void actualizarListaProductos() {

        try {

            modelo.setRowCount(0);

            Session session = HibernateConfig.get().openSession();

            Producto_data pd = new Producto_data(session);

            productosBuscados = pd.listarTodo();

            for (Producto p : productosBuscados) {
                modelo.addRow(new Object[]{
                    false,
                    p.getIdProducto(),
                    p.getCodigo(),
                    p.getCategoria().getNombre(),
                    p.getNombre(),
                    p.getPrecioCostoUnitario(),
                    p.getPrecioVentaUnitario(),
                    p.getStock(),
                    p.getDisponibilidad()});

            }

            session.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }

    public void borrarFilas() {
        int f = modelo.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
}
