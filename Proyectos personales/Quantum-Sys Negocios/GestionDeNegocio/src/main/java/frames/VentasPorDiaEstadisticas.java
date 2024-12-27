package frames;

import config.HibernateConfig;
import data.Venta_data;
import entidades.Venta;
import exportarExcel.Controlador;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class VentasPorDiaEstadisticas extends javax.swing.JInternalFrame {

    private final DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int fila, int col) {
            return false;
        }
    };

    public VentasPorDiaEstadisticas() {
        initComponents();
        armarCabeceraTabla();
        borrarFilas();
        actualizarTabla();
        jcMeses.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableVentas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jtAnio = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jcMeses = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jbGraficar = new javax.swing.JButton();
        jbExportar = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(634, 540));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtableVentas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtableVentas);

        jLabel1.setText("AÑO :");

        jtAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtAnioKeyPressed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("MES: ");

        jcMeses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbBuscar)
                        .addGap(0, 133, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar)
                    .addComponent(jLabel2)
                    .addComponent(jcMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbGraficar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbGraficar.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color2"));
        jbGraficar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficar.png"))); // NOI18N
        jbGraficar.setText("  GRAFICAR");
        jbGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGraficarActionPerformed(evt);
            }
        });

        jbExportar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbExportar.setForeground(new java.awt.Color(0, 153, 0));
        jbExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/excel.png"))); // NOI18N
        jbExportar.setText("EXPORTAR");
        jbExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbGraficar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbExportar)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGraficar)
                    .addComponent(jbExportar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        modelo.setRowCount(0);

        Session session = HibernateConfig.get().openSession();

        Venta_data provd = new Venta_data(session);

        List<Venta> ventas = provd.listarTodo();

        for (Venta v : ventas) {
            String yearString = jtAnio.getText();
            String mesString = (String) jcMeses.getSelectedItem();

            // Intentar convertir las cadenas a números enteros
            int yearInTextField = Integer.parseInt(yearString);

            // Obtén la fecha del Date
            Date date = v.getFecha();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            // Obtén el número del mes
            int mesInDate = calendar.get(Calendar.MONTH) + 1;
            int yearInDate = calendar.get(Calendar.YEAR);

            // Compara el año del Date con el año ingresado en el TextField
            if (yearInDate == yearInTextField && obtenerNombreMes(mesInDate).equalsIgnoreCase(mesString)) {
                modelo.addRow(new Object[]{
                    v.getIdVenta(),
                    v.getFecha(),
                    v.getPrecioTotalVenta(),
                    v.getFormaDePago(),
                    v.getUsuario()});
            }

        }
        session.close();

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGraficarActionPerformed

        String mes = (String) jcMeses.getSelectedItem();
        int fila = modelo.getRowCount();
        Map<Integer, Double> ventasPorDia = new HashMap<>();

        for (int i = 0; i < fila; i++) {
            double monto = (double) jtableVentas.getValueAt(i, 2);

            Date fecha = (Date) jtableVentas.getValueAt(i, 1);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(fecha);

            // Obtener el día
            int diaDelMes = calendar.get(Calendar.DAY_OF_MONTH);

            // Sumar el monto al total de ventas para ese día
            ventasPorDia.put(diaDelMes, ventasPorDia.getOrDefault(diaDelMes, 0.0) + monto);
        }

        XYSeries ventasDiarias = new XYSeries("Ventas totales diarias");

        for (Map.Entry<Integer, Double> entry : ventasPorDia.entrySet()) {
            int dia = entry.getKey();
            double montoTotal = entry.getValue();
            ventasDiarias.add(dia, montoTotal);
        }

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(ventasDiarias);

        JFreeChart graficoXY = ChartFactory.createXYLineChart(
                "Ventas totales diarias del mes: " + mes,
                "Dias",
                "Monto ($)",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

// Configurar el formateo del eje X para mostrar enteros
        XYPlot plot = graficoXY.getXYPlot();
        NumberAxis xAxis = (NumberAxis) plot.getDomainAxis();
        xAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        ChartPanel panel = new ChartPanel(graficoXY);

        JFrame ventana = new JFrame("Gráfica");
        ventana.setVisible(true);
        ventana.setSize(1000, 700);
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventana.add(panel);


    }//GEN-LAST:event_jbGraficarActionPerformed

    private void jbExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExportarActionPerformed
        Controlador obj;
        try {
            obj = new Controlador();
            obj.exportarExcel(jtableVentas);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error de archivo");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ERROR: " + ex.getMessage());
        }
    }//GEN-LAST:event_jbExportarActionPerformed

    private void jtAnioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtAnioKeyPressed
        if (Character.isDigit(evt.getKeyChar()) || (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            jtAnio.setEditable(true);
        } else {
            jtAnio.setEditable(false);
        }
    }//GEN-LAST:event_jtAnioKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbExportar;
    private javax.swing.JButton jbGraficar;
    private javax.swing.JComboBox<String> jcMeses;
    private javax.swing.JTextField jtAnio;
    private javax.swing.JTable jtableVentas;
    // End of variables declaration//GEN-END:variables

    private String obtenerNombreMes(int numeroMes) {
        String[] nombresMeses = {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};
        return nombresMeses[numeroMes - 1];  // Restar 1 porque los arrays se indexan desde 0
    }

    public void borrarFilas() {
        int f = modelo.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    public void armarCabeceraTabla() {
        modelo.setColumnCount(0);

        modelo.addColumn("ID");
        modelo.addColumn("Fecha");
        modelo.addColumn("Monto ($)");
        modelo.addColumn("Formas de pago");
        modelo.addColumn("Vendedor");

        jtableVentas.setModel(modelo);
    }

    public void actualizarTabla() {

        modelo.setRowCount(0);

        Session session = HibernateConfig.get().openSession();

        Venta_data provd = new Venta_data(session);

        List<Venta> ventas = provd.listarTodo();

        for (Venta v : ventas) {
            modelo.addRow(new Object[]{
                v.getIdVenta(),
                v.getFecha(),
                v.getPrecioTotalVenta(),
                v.getFormaDePago(),
                v.getUsuario()});
        }
        session.close();
    }

}
