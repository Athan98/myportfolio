/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import data.*;
import entidades.Divisa;
import entidades.Fecha;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Conversor extends javax.swing.JInternalFrame {

    FondoPanel fondo = new FondoPanel();
    FondoPane1 fondop = new FondoPane1();
    Conexion con = new Conexion();
    Conexion2 con2 = new Conexion2();
    DivisaData divisaData = new DivisaData(con);
    DivisaData2 divisaData1 = new DivisaData2(con2);
    Divisa divisa = new Divisa();
    Divisa divisaBBVA = new Divisa("bbva");
    Divisa divisaNacion = new Divisa("bna");
    Divisa divisaSupervielle = new Divisa("supervielle");
    Divisa divisaGalicia = new Divisa("galicia");
    Divisa divisaHSBC = new Divisa("hsbc");
    Divisa divisaSantander = new Divisa("santander");
    Divisa divisaMacro = new Divisa("macro");
    Divisa divisaPatagonia = new Divisa("patagonia");
    Divisa divisaICBC = new Divisa("icbc");
    Divisa divisaHipotecario = new Divisa("hipotecario");
    Fecha fecha = new Fecha("bna");

    public Conversor() {
        this.setContentPane(fondo);
        initComponents();
        armarCotizaciones();
        jlFecha.setText(divisaData.getFecha(fecha));
        jlVar.setVisible(false);
        jlVariacion.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPane1();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlCompraBBVA = new javax.swing.JLabel();
        jlVentaBBVA = new javax.swing.JLabel();
        jPanel2 = new FondoPane1();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlCompraNacion = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlVentaNacion = new javax.swing.JLabel();
        jPanel3 = new FondoPane1();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jlCompraSupervielle = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jlVentaSupervielle = new javax.swing.JLabel();
        jPanel4 = new FondoPane1();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jlCompraGalicia = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jlVentaGalicia = new javax.swing.JLabel();
        jPanel5 = new FondoPane1();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jlCompraPatagonia = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jlVentaPatagonia = new javax.swing.JLabel();
        jPanel6 = new FondoPane1();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jlCompraMacro = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jlVentaMacro = new javax.swing.JLabel();
        jPanel7 = new FondoPane1();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jlCompraSantander = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jlVentaSantander = new javax.swing.JLabel();
        jPanel8 = new FondoPane1();
        jLabel16 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jlCompraHSBC = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jlVentaHSBC = new javax.swing.JLabel();
        jPanel9 = new FondoPane1();
        jLabel17 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jlCompraHipotecario = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jlVentaHipotecario = new javax.swing.JLabel();
        jPanel10 = new FondoPane1();
        jLabel18 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jlCompraICBC = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jlVentaICBC = new javax.swing.JLabel();
        jCDivisas = new javax.swing.JComboBox<>();
        jbConvertir = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jlFecha = new javax.swing.JLabel();
        jPanel13 = new FondoPane1();
        jlTipoDolar = new javax.swing.JLabel();
        jlCotizacionTipoDolar = new javax.swing.JLabel();
        jlVar = new javax.swing.JLabel();
        jlVariacion = new javax.swing.JLabel();
        jPanel14 = new FondoPane1();
        jLabel = new javax.swing.JLabel();
        jtMontoAConvertir = new javax.swing.JTextField();
        jPanel15 = new FondoPane1();
        jLabel31 = new javax.swing.JLabel();
        jlMontoConvertido = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(776, 650));

        jPanel1.setBackground(new java.awt.Color(60, 83, 147));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(140, 140));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Banco BBVA");
        jLabel1.setPreferredSize(new java.awt.Dimension(92, 30));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Compra:");

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Venta:");

        jlCompraBBVA.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlCompraBBVA.setForeground(new java.awt.Color(255, 255, 255));
        jlCompraBBVA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jlVentaBBVA.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlVentaBBVA.setForeground(new java.awt.Color(255, 255, 255));
        jlVentaBBVA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlVentaBBVA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCompraBBVA, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCompraBBVA, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlVentaBBVA, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(60, 83, 147));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setPreferredSize(new java.awt.Dimension(140, 140));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Banco Nacion");
        jLabel2.setPreferredSize(new java.awt.Dimension(92, 30));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Compra:");

        jlCompraNacion.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlCompraNacion.setForeground(new java.awt.Color(255, 255, 255));
        jlCompraNacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Venta:");

        jlVentaNacion.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlVentaNacion.setForeground(new java.awt.Color(255, 255, 255));
        jlVentaNacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlCompraNacion, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlVentaNacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCompraNacion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlVentaNacion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 38, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(60, 83, 147));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setPreferredSize(new java.awt.Dimension(140, 140));

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Banco Supervielle");
        jLabel3.setPreferredSize(new java.awt.Dimension(92, 30));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Compra:");

        jlCompraSupervielle.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlCompraSupervielle.setForeground(new java.awt.Color(255, 255, 255));
        jlCompraSupervielle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Venta:");

        jlVentaSupervielle.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlVentaSupervielle.setForeground(new java.awt.Color(255, 255, 255));
        jlVentaSupervielle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCompraSupervielle, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlVentaSupervielle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCompraSupervielle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlVentaSupervielle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 38, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(60, 83, 147));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setPreferredSize(new java.awt.Dimension(140, 140));

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Banco Galicia");
        jLabel4.setPreferredSize(new java.awt.Dimension(90, 30));

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Compra:");

        jlCompraGalicia.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlCompraGalicia.setForeground(new java.awt.Color(255, 255, 255));
        jlCompraGalicia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Venta:");

        jlVentaGalicia.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlVentaGalicia.setForeground(new java.awt.Color(255, 255, 255));
        jlVentaGalicia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCompraGalicia, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlVentaGalicia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCompraGalicia, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlVentaGalicia, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 38, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(60, 83, 147));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setPreferredSize(new java.awt.Dimension(140, 140));

        jLabel13.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Banco Patagonia");
        jLabel13.setPreferredSize(new java.awt.Dimension(90, 30));

        jLabel19.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Compra:");

        jlCompraPatagonia.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlCompraPatagonia.setForeground(new java.awt.Color(255, 255, 255));
        jlCompraPatagonia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel25.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Venta:");

        jlVentaPatagonia.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlVentaPatagonia.setForeground(new java.awt.Color(255, 255, 255));
        jlVentaPatagonia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jlCompraPatagonia, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlVentaPatagonia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCompraPatagonia, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlVentaPatagonia, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 38, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(60, 83, 147));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setPreferredSize(new java.awt.Dimension(140, 140));

        jLabel14.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Banco Macro");
        jLabel14.setPreferredSize(new java.awt.Dimension(90, 30));

        jLabel20.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Compra:");

        jlCompraMacro.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlCompraMacro.setForeground(new java.awt.Color(255, 255, 255));
        jlCompraMacro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel26.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Venta:");

        jlVentaMacro.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlVentaMacro.setForeground(new java.awt.Color(255, 255, 255));
        jlVentaMacro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jlCompraMacro, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlVentaMacro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCompraMacro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlVentaMacro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 38, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(60, 83, 147));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setPreferredSize(new java.awt.Dimension(140, 140));

        jLabel15.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Banco Santander");
        jLabel15.setPreferredSize(new java.awt.Dimension(90, 30));

        jLabel21.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Compra:");

        jlCompraSantander.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlCompraSantander.setForeground(new java.awt.Color(255, 255, 255));
        jlCompraSantander.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel27.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Venta:");

        jlVentaSantander.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlVentaSantander.setForeground(new java.awt.Color(255, 255, 255));
        jlVentaSantander.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCompraSantander, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlVentaSantander, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCompraSantander, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlVentaSantander, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 38, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(60, 83, 147));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.setPreferredSize(new java.awt.Dimension(140, 140));

        jLabel16.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Banco HSBC");
        jLabel16.setPreferredSize(new java.awt.Dimension(90, 30));

        jLabel22.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Compra:");

        jlCompraHSBC.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlCompraHSBC.setForeground(new java.awt.Color(255, 255, 255));
        jlCompraHSBC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel28.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Venta:");

        jlVentaHSBC.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlVentaHSBC.setForeground(new java.awt.Color(255, 255, 255));
        jlVentaHSBC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCompraHSBC, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlVentaHSBC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCompraHSBC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlVentaHSBC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 38, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(60, 83, 147));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.setPreferredSize(new java.awt.Dimension(140, 140));

        jLabel17.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Banco Hipotecario");
        jLabel17.setPreferredSize(new java.awt.Dimension(90, 30));

        jLabel23.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Compra:");

        jlCompraHipotecario.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlCompraHipotecario.setForeground(new java.awt.Color(255, 255, 255));
        jlCompraHipotecario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel29.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Venta:");

        jlVentaHipotecario.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlVentaHipotecario.setForeground(new java.awt.Color(255, 255, 255));
        jlVentaHipotecario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCompraHipotecario, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlVentaHipotecario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCompraHipotecario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlVentaHipotecario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 38, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(60, 83, 147));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.setPreferredSize(new java.awt.Dimension(140, 140));

        jLabel18.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Banco ICBC");
        jLabel18.setPreferredSize(new java.awt.Dimension(90, 30));

        jLabel24.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Compra:");

        jlCompraICBC.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlCompraICBC.setForeground(new java.awt.Color(255, 255, 255));
        jlCompraICBC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel30.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Venta:");

        jlVentaICBC.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlVentaICBC.setForeground(new java.awt.Color(255, 255, 255));
        jlVentaICBC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jlCompraICBC, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlVentaICBC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCompraICBC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlVentaICBC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 38, Short.MAX_VALUE))
        );

        jCDivisas.setBackground(new java.awt.Color(204, 204, 204));
        jCDivisas.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jCDivisas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione un tipo de cambio-", "Oficial BBVA", "Oficial Hipotecario", "Oficial Patagonia", "Oficial Macro", "Oficial ICBC", "Oficial HSBC", "Oficial Santander", "Oficial Supervielle", "Oficial Nacion", "Oficial Galicia", "Solidario", "MEP", "BLUE", "MEP AL30", "MEP AL30 Plazo CI", "MEP GD30", "MEP GD30 Plazo CI", "CCL", "CCL AL30", "CCL AL30 Plazo CI", "CCL GD30", "CCL GD30 Plazo CI", "CCB (Dólar Contado con Bitcoin o Dólar Cripto)" }));
        jCDivisas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCDivisasItemStateChanged(evt);
            }
        });

        jbConvertir.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jbConvertir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/coin_icon_151439 muymuy chico.png"))); // NOI18N
        jbConvertir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/coin_icon_151439 muymuy chico.png"))); // NOI18N
        jbConvertir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/coin_icon_151439 muymuy chico.png"))); // NOI18N
        jbConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConvertirActionPerformed(evt);
            }
        });

        jbLimpiar.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/BORRAR.png"))); // NOI18N
        jbLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/BORRAR.png"))); // NOI18N
        jbLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/BORRAR.png"))); // NOI18N
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Arial Narrow", 2, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("COTIZACION AL:");

        jlFecha.setFont(new java.awt.Font("Arial Narrow", 2, 24)); // NOI18N
        jlFecha.setForeground(new java.awt.Color(255, 255, 255));
        jlFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel13.setBackground(new java.awt.Color(60, 83, 147));
        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel13.setPreferredSize(new java.awt.Dimension(140, 140));

        jlTipoDolar.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jlTipoDolar.setForeground(new java.awt.Color(255, 255, 255));
        jlTipoDolar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTipoDolar.setPreferredSize(new java.awt.Dimension(90, 30));

        jlCotizacionTipoDolar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlCotizacionTipoDolar.setForeground(new java.awt.Color(255, 255, 255));
        jlCotizacionTipoDolar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jlVar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jlVar.setForeground(new java.awt.Color(255, 255, 255));
        jlVar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlVar.setText("VAR:");

        jlVariacion.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jlVariacion.setForeground(new java.awt.Color(255, 255, 255));
        jlVariacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlTipoDolar, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCotizacionTipoDolar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jlVar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlVariacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jlTipoDolar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlCotizacionTipoDolar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlVar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlVariacion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel14.setBackground(new java.awt.Color(60, 83, 147));
        jPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel14.setPreferredSize(new java.awt.Dimension(140, 140));

        jLabel.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel.setForeground(new java.awt.Color(255, 255, 255));
        jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel.setText("MONTO A CONVERTIR ($)");
        jLabel.setPreferredSize(new java.awt.Dimension(90, 30));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(jtMontoAConvertir, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtMontoAConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(60, 83, 147));
        jPanel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel15.setPreferredSize(new java.awt.Dimension(140, 140));

        jLabel31.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("TOTAL ($)");
        jLabel31.setPreferredSize(new java.awt.Dimension(90, 30));

        jlMontoConvertido.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jlMontoConvertido.setForeground(new java.awt.Color(255, 255, 255));
        jlMontoConvertido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMontoConvertido.setPreferredSize(new java.awt.Dimension(90, 30));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(jlMontoConvertido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlMontoConvertido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jlFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(100, 100, 100))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jbConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCDivisas, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jCDivisas, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbConvertir)
                            .addComponent(jbLimpiar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(279, 279, 279))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed

        jtMontoAConvertir.setText("");
        jlMontoConvertido.setText("");
        jlCotizacionTipoDolar.setText("");
        jlTipoDolar.setText("");
        jlVar.setVisible(false);
        jlVariacion.setVisible(false);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConvertirActionPerformed

        try {
            if (jtMontoAConvertir.getText().isEmpty()) {

                JOptionPane.showMessageDialog(this, "Debe ingresar un monto");
                jtMontoAConvertir.setText("");

            } else {

                Float montoConvertido = Float.parseFloat(jtMontoAConvertir.getText()) * Float.parseFloat(jlCotizacionTipoDolar.getText());
                DecimalFormat decimalFormat = new DecimalFormat("#.##"); // Cambia el número de decimales según tus necesidades
                String montoConvertidoFormatted = decimalFormat.format(montoConvertido);

                jlMontoConvertido.setText(montoConvertidoFormatted);

            }
        } catch (NumberFormatException | NullPointerException e) {

            JOptionPane.showMessageDialog(this, "Llene los campos correctamente");

        }
    }//GEN-LAST:event_jbConvertirActionPerformed

    private void jCDivisasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCDivisasItemStateChanged

        jlVar.setVisible(false);
        jlVariacion.setVisible(false);

        float var = 0;

        if (jCDivisas.getSelectedItem().toString().equals("-Seleccione un tipo de cambio-")) {
            jlTipoDolar.setText("");
            jlCotizacionTipoDolar.setText("");
        } else if (jCDivisas.getSelectedItem().toString().equals("Oficial BBVA")) {
            jlTipoDolar.setText("Oficial BBVA");
            jlCotizacionTipoDolar.setText(divisaData.cotizacionVenta(divisaBBVA) + "");
        } else if (jCDivisas.getSelectedItem().toString().equals("Oficial Hipotecario")) {
            jlTipoDolar.setText("Oficial Hipotecario");
            jlCotizacionTipoDolar.setText(divisaData.cotizacionVenta(divisaHipotecario) + "");
        } else if (jCDivisas.getSelectedItem().toString().equals("Oficial Patagonia")) {
            jlTipoDolar.setText("Oficial Patagonia");
            jlCotizacionTipoDolar.setText(divisaData.cotizacionVenta(divisaPatagonia) + "");
        } else if (jCDivisas.getSelectedItem().toString().equals("Oficial Macro")) {
            jlTipoDolar.setText("Oficial Macro");
            jlCotizacionTipoDolar.setText(divisaData.cotizacionVenta(divisaMacro) + "");
        } else if (jCDivisas.getSelectedItem().toString().equals("Oficial ICBC")) {
            jlTipoDolar.setText("Oficial ICBC");
            jlCotizacionTipoDolar.setText(divisaData.cotizacionVenta(divisaICBC) + "");
        } else if (jCDivisas.getSelectedItem().toString().equals("Oficial HSBC")) {
            jlTipoDolar.setText("Oficial HSBC");
            jlCotizacionTipoDolar.setText(divisaData.cotizacionVenta(divisaHSBC) + "");
        } else if (jCDivisas.getSelectedItem().toString().equals("Oficial Santander")) {
            jlTipoDolar.setText("Oficial Santander");
            jlCotizacionTipoDolar.setText(divisaData.cotizacionVenta(divisaSantander) + "");
        } else if (jCDivisas.getSelectedItem().toString().equals("Oficial Supervielle")) {
            jlTipoDolar.setText("Oficial Supervielle");
            jlCotizacionTipoDolar.setText(divisaData.cotizacionVenta(divisaSupervielle) + "");
        } else if (jCDivisas.getSelectedItem().toString().equals("Oficial Nacion")) {
            jlTipoDolar.setText("Oficial Nacion");
            jlCotizacionTipoDolar.setText(divisaData.cotizacionVenta(divisaNacion) + "");
        } else if (jCDivisas.getSelectedItem().toString().equals("Oficial Galicia")) {
            jlTipoDolar.setText("Oficial Galicia");
            jlCotizacionTipoDolar.setText(divisaData.cotizacionVenta(divisaGalicia) + "");
        } else if (jCDivisas.getSelectedItem().toString().equals("Solidario")) {
            divisa.setBanco("solidario");
            jlTipoDolar.setText("Solidario");
            jlCotizacionTipoDolar.setText(divisaData1.cotizacionTipoDolar(divisa) + "");
        } else if (jCDivisas.getSelectedItem().toString().equals("MEP")) {
            divisa.setBanco("mep");
            divisa.setVariacion("mep_var");
            jlTipoDolar.setText("MEP");
            jlCotizacionTipoDolar.setText(divisaData1.cotizacionTipoDolar(divisa) + "");
            var = divisaData1.variacionTipoDolar(divisa);
            jlVar.setVisible(true);
            jlVariacion.setVisible(true);
            if (var >= 0.0) {
                jlVariacion.setForeground(Color.GREEN);
                jlVariacion.setText("↑ " + var + "%");
            } else if (var < 0.0) {
                jlVariacion.setForeground(Color.RED);
                jlVariacion.setText("↓ " + var + "%");
            }
        } else if (jCDivisas.getSelectedItem().toString().equals("BLUE")) {
            divisa.setBanco("blue");
            divisa.setVariacion("blue_var");
            jlTipoDolar.setText("BLUE");
            jlCotizacionTipoDolar.setText(divisaData1.cotizacionTipoDolar(divisa) + "");
            var = divisaData1.variacionTipoDolar(divisa);
            jlVar.setVisible(true);
            jlVariacion.setVisible(true);
            if (var >= 0.0) {
                jlVariacion.setForeground(Color.GREEN);
                jlVariacion.setText("↑ " + var + "%");
            } else {
                jlVariacion.setForeground(Color.RED);
                jlVariacion.setText("↓ " + var + "%");
            }
        } else if (jCDivisas.getSelectedItem().toString().equals("MEP AL30")) {
            divisa.setBanco("mepal30");
            jlTipoDolar.setText("MEP AL30");
            jlCotizacionTipoDolar.setText(divisaData1.cotizacionTipoDolar(divisa) + "");
        } else if (jCDivisas.getSelectedItem().toString().equals("MEP AL30 Plazo CI")) {
            divisa.setBanco("mepal30ci");
            jlTipoDolar.setText("MEP AL30 Plazo CI");
            jlCotizacionTipoDolar.setText(divisaData1.cotizacionTipoDolar(divisa) + "");
        } else if (jCDivisas.getSelectedItem().toString().equals("MEP GD30")) {
            divisa.setBanco("mepgd30");
            jlTipoDolar.setText("MEP GD30");
            jlCotizacionTipoDolar.setText(divisaData1.cotizacionTipoDolar(divisa) + "");
        } else if (jCDivisas.getSelectedItem().toString().equals("MEP GD30 Plazo CI")) {
            divisa.setBanco("mepgd30ci");
            jlTipoDolar.setText("MEP GD30 Plazo CI");
            jlCotizacionTipoDolar.setText(divisaData1.cotizacionTipoDolar(divisa) + "");
        } else if (jCDivisas.getSelectedItem().toString().equals("MEP GD30")) {
            divisa.setBanco("mepgd30");
            jlTipoDolar.setText("MEP GD30 Plazo CI");
            jlCotizacionTipoDolar.setText(divisaData1.cotizacionTipoDolar(divisa) + "");
        } else if (jCDivisas.getSelectedItem().toString().equals("CCL")) {
            divisa.setBanco("ccl");
            divisa.setVariacion("ccl_var");
            jlTipoDolar.setText("CCL");
            jlCotizacionTipoDolar.setText(divisaData1.cotizacionTipoDolar(divisa) + "");
            var = divisaData1.variacionTipoDolar(divisa);
            jlVar.setVisible(true);
            jlVariacion.setVisible(true);
            if (var >= 0.0) {
                jlVariacion.setForeground(Color.GREEN);
                jlVariacion.setText("↑ " + var + "%");
            } else {
                jlVariacion.setForeground(Color.RED);
                jlVariacion.setText("↓ " + var + "%");
            }
        } else if (jCDivisas.getSelectedItem().toString().equals("CCL AL30")) {
            divisa.setBanco("cclal30");
            jlTipoDolar.setText("CCL AL30");
            jlCotizacionTipoDolar.setText(divisaData1.cotizacionTipoDolar(divisa) + "");
        } else if (jCDivisas.getSelectedItem().toString().equals("CCL AL30 Plazo CI")) {
            divisa.setBanco("cclal30ci");
            jlTipoDolar.setText("CCL AL30 Plazo CI");
            jlCotizacionTipoDolar.setText(divisaData1.cotizacionTipoDolar(divisa) + "");
        } else if (jCDivisas.getSelectedItem().toString().equals("CCL GD30")) {
            divisa.setBanco("cclgd30");
            jlTipoDolar.setText("CCL GD30");
            jlCotizacionTipoDolar.setText(divisaData1.cotizacionTipoDolar(divisa) + "");
        } else if (jCDivisas.getSelectedItem().toString().equals("CCL GD30 Plazo CI")) {
            divisa.setBanco("cclgd30ci");
            jlTipoDolar.setText("CCL GD30 Plazo CI");
            jlCotizacionTipoDolar.setText(divisaData1.cotizacionTipoDolar(divisa) + "");
        } else if (jCDivisas.getSelectedItem().toString().equals("CCB (Dólar Contado con Bitcoin o Dólar Cripto)")) {
            divisa.setBanco("ccb");
            divisa.setVariacion("ccb_var");
            jlTipoDolar.setText("Dolar Cripto");
            jlCotizacionTipoDolar.setText(divisaData1.cotizacionTipoDolar(divisa) + "");
            var = divisaData1.variacionTipoDolar(divisa);
            jlVar.setVisible(true);
            jlVariacion.setVisible(true);
            if (var >= 0.0) {
                jlVariacion.setForeground(Color.GREEN);
                jlVariacion.setText("↑ " + var + "%");
            } else if (var < 0.0) {
                jlVariacion.setForeground(Color.RED);
                jlVariacion.setText("↓ " + var + "%");
            }
        }


    }//GEN-LAST:event_jCDivisasItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCDivisas;
    private javax.swing.JLabel jLabel;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbConvertir;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JLabel jlCompraBBVA;
    private javax.swing.JLabel jlCompraGalicia;
    private javax.swing.JLabel jlCompraHSBC;
    private javax.swing.JLabel jlCompraHipotecario;
    private javax.swing.JLabel jlCompraICBC;
    private javax.swing.JLabel jlCompraMacro;
    private javax.swing.JLabel jlCompraNacion;
    private javax.swing.JLabel jlCompraPatagonia;
    private javax.swing.JLabel jlCompraSantander;
    private javax.swing.JLabel jlCompraSupervielle;
    private javax.swing.JLabel jlCotizacionTipoDolar;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JLabel jlMontoConvertido;
    private javax.swing.JLabel jlTipoDolar;
    private javax.swing.JLabel jlVar;
    private javax.swing.JLabel jlVariacion;
    private javax.swing.JLabel jlVentaBBVA;
    private javax.swing.JLabel jlVentaGalicia;
    private javax.swing.JLabel jlVentaHSBC;
    private javax.swing.JLabel jlVentaHipotecario;
    private javax.swing.JLabel jlVentaICBC;
    private javax.swing.JLabel jlVentaMacro;
    private javax.swing.JLabel jlVentaNacion;
    private javax.swing.JLabel jlVentaPatagonia;
    private javax.swing.JLabel jlVentaSantander;
    private javax.swing.JLabel jlVentaSupervielle;
    private javax.swing.JTextField jtMontoAConvertir;
    // End of variables declaration//GEN-END:variables

    private void armarCotizaciones() {
        jlCompraBBVA.setText("$" + divisaData.cotizacionCompra(divisaBBVA));
        jlVentaBBVA.setText("$" + divisaData.cotizacionVenta(divisaBBVA));
        jlCompraNacion.setText("$" + divisaData.cotizacionCompra(divisaNacion));
        jlVentaNacion.setText("$" + divisaData.cotizacionVenta(divisaNacion));
        jlCompraSupervielle.setText("$" + divisaData.cotizacionCompra(divisaSupervielle));
        jlVentaSupervielle.setText("$" + divisaData.cotizacionVenta(divisaSupervielle));
        jlCompraGalicia.setText("$" + divisaData.cotizacionCompra(divisaGalicia));
        jlVentaGalicia.setText("$" + divisaData.cotizacionVenta(divisaGalicia));
        jlCompraHipotecario.setText("$" + divisaData.cotizacionCompra(divisaHipotecario));
        jlVentaHipotecario.setText("$" + divisaData.cotizacionVenta(divisaHipotecario));
        jlCompraHSBC.setText("$" + divisaData.cotizacionCompra(divisaHSBC));
        jlVentaHSBC.setText("$" + divisaData.cotizacionVenta(divisaHSBC));
        jlCompraICBC.setText("$" + divisaData.cotizacionCompra(divisaICBC));
        jlVentaICBC.setText("$" + divisaData.cotizacionVenta(divisaICBC));
        jlCompraMacro.setText("$" + divisaData.cotizacionCompra(divisaMacro));
        jlVentaMacro.setText("$" + divisaData.cotizacionVenta(divisaMacro));
        jlCompraSantander.setText("$" + divisaData.cotizacionCompra(divisaSantander));
        jlVentaSantander.setText("$" + divisaData.cotizacionVenta(divisaSantander));
        jlCompraPatagonia.setText("$" + divisaData.cotizacionCompra(divisaPatagonia));
        jlVentaPatagonia.setText("$" + divisaData.cotizacionVenta(divisaPatagonia));

    }

    class FondoPanel extends JPanel {

        private Image imagen;

        public void paint(Graphics g) {

            imagen = new ImageIcon(getClass().getResource("/icons/wallpaper-trade.jpg")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }
    }

    class FondoPane1 extends JPanel {

        private Image imagen;

        public void paint(Graphics g) {

            imagen = new ImageIcon(getClass().getResource("/icons/texturapane.jpg")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }
    }

}
