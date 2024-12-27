package frames;

import config.HibernateConfig;
import config_tables.RenderPedidos;
import data.*;
import entidades.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import org.hibernate.Session;

public class GestionPedidosExistentes extends javax.swing.JInternalFrame {

    Class tipo[] = new Class[]{java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class,
        java.lang.Object.class, java.lang.Object.class};

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

    List<Pedido> pedidosBuscados = null;

    public GestionPedidosExistentes() {
        initComponents();
        borrarColumnas();
        jbGuardar.setEnabled(false);
        jcEstado.setSelected(false);
        armarCabeceraTabla();
        actualizarListaPedidos();
        llenarComboProveedores();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtNombreProv = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtDia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtAnio = new javax.swing.JTextField();
        jcMeses = new javax.swing.JComboBox<>();
        jbBuscar = new javax.swing.JButton();
        jbLimpiar2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePedidos = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jbEditar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbExportar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcProveedores = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtMonto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jlFecha = new javax.swing.JLabel();
        jlID = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jlUsuario = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jbLimpiar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jlFdp = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jcEstado = new javax.swing.JCheckBox();

        jCheckBox1.setText("jCheckBox1");

        setClosable(true);
        setTitle("GESTION PEDIDOS EXISTENTES");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "BUSQUEDA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Busqueda por Proveedor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre:");

        jtNombreProv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNombreProvKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtNombreProv)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNombreProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Busqueda por FECHA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jLabel3.setText("Dia :");

        jLabel4.setText("Mes :");

        jtDia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDiaActionPerformed(evt);
            }
        });

        jLabel5.setText("Año :");

        jtAnio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jcMeses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE" }));
        jcMeses.setSelectedIndex(-1);

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lupa.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbLimpiar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/limpiarPequenio.png"))); // NOI18N
        jbLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbLimpiar2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbLimpiar2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jcMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTablePedidos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTablePedidos);

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbEditar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbEditar.setForeground(new java.awt.Color(0, 0, 0));
        jbEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editarx18.png"))); // NOI18N
        jbEditar.setText("EDITAR");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(204, 0, 0));
        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminarx18.png"))); // NOI18N
        jbEliminar.setText("ELIMINAR");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbExportar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbExportar.setForeground(new java.awt.Color(0, 204, 0));
        jbExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/excelx18.png"))); // NOI18N
        jbExportar.setText("EXPORTAR");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbExportar)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbExportar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Datos del pedido", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Proveedor :");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Forma de pago :");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Monto ($) :");

        jtMonto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtMonto.setText("0");
        jtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtMontoKeyPressed(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Fecha (año-mes-dia) :");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ID :");

        jlFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFecha.setText("-");

        jlID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlID.setText("-");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Usuario :");

        jlUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlUsuario.setText("-");

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbLimpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbLimpiar.setForeground(new java.awt.Color(153, 153, 0));
        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/limpiarx18.png"))); // NOI18N
        jbLimpiar.setText("LIMPIAR CAMPOS");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbGuardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbGuardar.setForeground(new java.awt.Color(0, 0, 153));
        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/savex18.png"))); // NOI18N
        jbGuardar.setText("GUARDAR CAMBIOS");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbLimpiar)
                .addContainerGap())
        );

        jlFdp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFdp.setText("-");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Estado :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlFdp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtMonto)
                            .addComponent(jcProveedores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jcEstado)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jlID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jlFdp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jlFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jlUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcEstado))
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDiaActionPerformed

    private void jtNombreProvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreProvKeyReleased
        try {
            String nombreProv = jtNombreProv.getText().toUpperCase();

            borrarFilas();

            for (Pedido p : pedidosBuscados) {
                if (p.getProv().getNombre().toUpperCase().startsWith(nombreProv)) {
                    if (p.isEstado() == true) {
                        modelo.addRow(new Object[]{
                            false,
                            p.getIdPedido(),
                            p.getProv().getNombre(),
                            p.getPrecioTotalCosto(),
                            p.getFecha(),
                            "DISPONIBLE"});
                    } else {
                        modelo.addRow(new Object[]{
                            false,
                            p.getIdPedido(),
                            p.getProv().getNombre(),
                            p.getPrecioTotalCosto(),
                            p.getFecha(),
                            "NO DISPONIBLE"});
                    }
                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }//GEN-LAST:event_jtNombreProvKeyReleased

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try {
            List<Pedido> pedidosXFecha = new ArrayList<>(); // Inicializa la lista

            String diaTexto = jtDia.getText();
            String mesTexto = (String) jcMeses.getSelectedItem();
            int numeroMes = obtenerNumeroMes(mesTexto);
            String anioTexto = jtAnio.getText();

            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(diaTexto));
            calendar.set(Calendar.MONTH, numeroMes - 1); // Resta 1 porque los meses en Calendar van de 0 a 11
            calendar.set(Calendar.YEAR, Integer.parseInt(anioTexto));

            // Establece la hora a medianoche (00:00:00) para ignorar las horas
            calendar.set(Calendar.HOUR_OF_DAY, 0);
            calendar.set(Calendar.MINUTE, 0);
            calendar.set(Calendar.SECOND, 0);
            calendar.set(Calendar.MILLISECOND, 0);

            // Obtiene el objeto Date a partir del Calendar
            Date fechaIngresada = calendar.getTime();

            for (Pedido p : pedidosBuscados) {
                // Crea un nuevo objeto Calendar para la fecha del Pedido
                Calendar calendarPedido = Calendar.getInstance();
                calendarPedido.setTime(p.getFecha());

                // Establece la hora a medianoche para ignorar las horas
                calendarPedido.set(Calendar.HOUR_OF_DAY, 0);
                calendarPedido.set(Calendar.MINUTE, 0);
                calendarPedido.set(Calendar.SECOND, 0);
                calendarPedido.set(Calendar.MILLISECOND, 0);

                // Compara las fechas sin tener en cuenta las horas
                if (calendarPedido.getTime().equals(fechaIngresada)) {
                    pedidosXFecha.add(p);
                }
            }

            borrarFilas();

            for (Pedido p : pedidosXFecha) {
                if (p.isEstado() == true) {
                    modelo.addRow(new Object[]{
                        false,
                        p.getIdPedido(),
                        p.getProv().getNombre(),
                        p.getPrecioTotalCosto(),
                        p.getFecha(),
                        "DISPONIBLE"});
                } else {
                    modelo.addRow(new Object[]{
                        false,
                        p.getIdPedido(),
                        p.getProv().getNombre(),
                        p.getPrecioTotalCosto(),
                        p.getFecha(),
                        "NO DISPONIBLE"});
                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiar2ActionPerformed
        jcMeses.setSelectedIndex(-1);
        jtDia.setText("");
        jtAnio.setText("");
        
        borrarFilas();
        
        for (Pedido p : pedidosBuscados) {
            if (p.isEstado() == true) {
                modelo.addRow(new Object[]{
                    false,
                    p.getIdPedido(),
                    p.getProv().getNombre(),
                    p.getPrecioTotalCosto(),
                    p.getFecha(),
                    "DISPONIBLE"});
            } else {
                modelo.addRow(new Object[]{
                    false,
                    p.getIdPedido(),
                    p.getProv().getNombre(),
                    p.getPrecioTotalCosto(),
                    p.getFecha(),
                    "NO DISPONIBLE"});
            }
        }
    }//GEN-LAST:event_jbLimpiar2ActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed

        try {
            Session session = HibernateConfig.get().openSession();

            jbGuardar.setEnabled(true);

            Pedido_data pd = new Pedido_data(session);

            int idPedido = (int) modelo.getValueAt(jTablePedidos.getSelectedRow(), 1);

            Pedido p = pd.encontrarPorID(idPedido);

            //SETEAR ID
            jlID.setText(p.getIdPedido() + "");

            //SETEAR PROVEEDOR
            for (int i = 0; i < jcProveedores.getItemCount(); i++) {
                Proveedor prov = jcProveedores.getItemAt(i);
                if (p.getProv().getNombre().equals(prov.getNombre())) {
                    jcProveedores.setSelectedItem(prov);
                }
            }

            //SETEAR FORMA DE PAGO
            jlFdp.setText(p.getFdp().getNombreFormaDePago());

            //SETEAR MONTO
            jtMonto.setText(p.getPrecioTotalCosto() + "");

            //SETEAR FECHA
            jlFecha.setText(p.getFecha().toString());

            //SETEAR USUARIO
            jlUsuario.setText(p.getUsuario().getNombre());

            jcEstado.setSelected(p.isEstado());

            session.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        try {
            if (jcProveedores.getSelectedIndex() == -1 || jtMonto.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Asegurese de llenar los campos correctamente");
            } else {
                Session session = HibernateConfig.get().openSession();
                Pedido_data pd = new Pedido_data(session);

                int idPedido = Integer.parseInt(jlID.getText());

                Pedido p = pd.encontrarPorID(idPedido);

                Proveedor prov = (Proveedor) jcProveedores.getSelectedItem();
                Double costo = Double.parseDouble(jtMonto.getText());
                boolean estado = jcEstado.isSelected();

                p.setPrecioTotalCosto(costo);
                p.setProv(prov);
                p.setEstado(estado);

                pd.actualizar(p);

                borrarFilas();
                actualizarListaPedidos();
                jbGuardar.setEnabled(false);
                limpiarCampos();
                JOptionPane.showMessageDialog(null, "El pedido ha sido actualizado");

                session.close();

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        try {
            Session session = HibernateConfig.get().openSession();
            Pedido_data pd = new Pedido_data(session);

            List<Pedido> pedidosAEliminar = new ArrayList<>(); // Inicializar la lista

            boolean ver;
            Pedido p;

            for (int i = 0; i < pedidosBuscados.size(); i++) {
                ver = (boolean) modelo.getValueAt(i, 0);
                p = pd.encontrarPorID((int) modelo.getValueAt(i, 1));
                if (ver) {
                    pedidosAEliminar.add(p);
                }
            }

            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Realmente desea eliminar las filas seleccionadas?", "Confirmacion", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                for (Pedido ps : pedidosAEliminar) {
                    ps.setEstado(false);
                    pd.actualizar(ps);
                }

                borrarFilas();
                actualizarListaPedidos();
                JOptionPane.showMessageDialog(null, "Elementos eliminados exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "Operacion cancelada");
            }

            session.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jtMontoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMontoKeyPressed
        if (Character.isDigit(evt.getKeyChar()) || (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)
                || (evt.isControlDown() && evt.getKeyCode() == KeyEvent.VK_V) || (evt.getKeyChar() == '.')) {
            jtMonto.setEditable(true);
        } else {
            jtMonto.setEditable(false);
        }
    }//GEN-LAST:event_jtMontoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePedidos;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbExportar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbLimpiar2;
    private javax.swing.JCheckBox jcEstado;
    private javax.swing.JComboBox<String> jcMeses;
    private javax.swing.JComboBox<Proveedor> jcProveedores;
    private javax.swing.JLabel jlFdp;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JLabel jlID;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JTextField jtAnio;
    private javax.swing.JTextField jtDia;
    private javax.swing.JTextField jtMonto;
    private javax.swing.JTextField jtNombreProv;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        jlID.setText("-");
        jcProveedores.setSelectedIndex(-1);
        jlFdp.setText("-");
        jlUsuario.setText("-");
        jtMonto.setText("0");
        jlFecha.setText("-");
        jcEstado.setSelected(false);
    }

    public void borrarFilas() {
        int f = modelo.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    public void armarCabeceraTabla() {

        modelo.setColumnCount(0);

        jTablePedidos.setDefaultRenderer(Object.class, new RenderPedidos());

        jTablePedidos.setRowHeight(25);

        modelo.addColumn(" ");
        modelo.addColumn("ID");
        modelo.addColumn("Proveedor");
        modelo.addColumn("Monto ($)");
        modelo.addColumn("Fecha");
        modelo.addColumn("Estado");

        jTablePedidos.setModel(modelo);

        TableColumn column1 = jTablePedidos.getColumnModel().getColumn(1);
        TableColumn column0 = jTablePedidos.getColumnModel().getColumn(0);

        column1.setPreferredWidth(25);
        column0.setPreferredWidth(20);
    }

    public void actualizarListaPedidos() {

        try {

            modelo.setRowCount(0);

            Session session = HibernateConfig.get().openSession();

            Pedido_data pd = new Pedido_data(session);

            pedidosBuscados = pd.listarTodo();

            for (Pedido p : pedidosBuscados) {
                if (p.isEstado() == true) {
                    modelo.addRow(new Object[]{
                        false,
                        p.getIdPedido(),
                        p.getProv().getNombre(),
                        p.getPrecioTotalCosto(),
                        p.getFecha(),
                        "DISPONIBLE"});
                } else {
                    modelo.addRow(new Object[]{
                        false,
                        p.getIdPedido(),
                        p.getProv().getNombre(),
                        p.getPrecioTotalCosto(),
                        p.getFecha(),
                        "NO DISPONIBLE"});
                }
            }

            session.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }

    private void llenarComboProveedores() {
        try {
            jcProveedores.removeAllItems();

            Session session = HibernateConfig.get().openSession();
            Proveedor_data pd = new Proveedor_data(session);
            List<Proveedor> proveedores = pd.listarTodo();

            Set<String> proveedoresAgregados = new HashSet<>();

            for (Proveedor p : proveedores) {
                String nombreProveedores = p.getNombre();
                if (!proveedoresAgregados.contains(nombreProveedores)) {
                    jcProveedores.addItem(p);
                    proveedoresAgregados.add(nombreProveedores);
                }
            }

            jcProveedores.setSelectedIndex(-1);

            session.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
        }
    }

    public void borrarColumnas() {

        modelo.setColumnCount(0);

    }

    private static int obtenerNumeroMes(String mesTexto) {
        switch (mesTexto.toLowerCase()) {
            case "enero":
                return 1;
            case "febrero":
                return 2;
            case "marzo":
                return 3;
            case "abril":
                return 4;
            case "mayo":
                return 5;
            case "junio":
                return 6;
            case "julio":
                return 7;
            case "agosto":
                return 8;
            case "septiembre":
                return 9;
            case "octubre":
                return 10;
            case "noviembre":
                return 11;
            case "diciembre":
                return 12;
            default:
                return 0;
        }

    }
}
