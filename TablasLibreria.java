/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menubasedatos;

import Db_Academia.ConexionLibreria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Miguel Castillo
 */
public class TablasLibreria extends javax.swing.JFrame {
    ConexionLibreria con=new ConexionLibreria();
    Connection conx1=con.conxdatabase();
    PreparedStatement ps=null;
    
    ResultSet rs=null;

    
    public TablasLibreria() {
        initComponents();
        cargatabla();
        cargatabla2();
        cargatabla3();
        cargatabla4();
        cargatabla5();
    }
    
    public void cargatabla(){
        DefaultTableModel tab=new DefaultTableModel();
        tab.addColumn("Documentos");
        tab.addColumn("Nombre Usuario");
        tab.addColumn("Clave");
        TablaUsuario.setModel(tab);
        String datos[]=new String[3];
        
        try {
            ps=conx1.prepareStatement("SELECT *FROM Usuario");
            rs=ps.executeQuery();
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                tab.addRow(datos);
            } 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
        public void cargatabla2(){
        DefaultTableModel tab=new DefaultTableModel();
        tab.addColumn("Documentos Cliente");
        tab.addColumn("Nombre Cliente");
        tab.addColumn("Apellido Cliente");
        tab.addColumn("Direccion Cliente");
        tab.addColumn("Departamento Cliente");
        tab.addColumn("Mes Cumpleaños Cliente");
        TablaCliente.setModel(tab);
        String datos[]=new String[6];
        
        try {
            ps=conx1.prepareStatement("SELECT *FROM Cliente");
            rs=ps.executeQuery();
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                tab.addRow(datos);
            } 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
        
        public void cargatabla3(){
        DefaultTableModel tab=new DefaultTableModel();
        tab.addColumn("ID Articulo");
        tab.addColumn("Titulo Articulo");
        tab.addColumn("Autor Articulo");
        tab.addColumn("Editorial Articulo");
        tab.addColumn("Precio Articulo");
        TablaArticulo.setModel(tab);
        String datos[]=new String[5];
        
        try {
            ps=conx1.prepareStatement("SELECT *FROM Articulo");
            rs=ps.executeQuery();
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                tab.addRow(datos);
            } 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
        public void cargatabla4(){
        DefaultTableModel tab=new DefaultTableModel();
        tab.addColumn("ID Pedido");
        tab.addColumn("ID cliente Pedido");
        tab.addColumn("Fecha Pedido");
        tab.addColumn("Valor Pedido");
        TablaPedido.setModel(tab);
        String datos[]=new String[4];
        
        try {
            ps=conx1.prepareStatement("SELECT *FROM Pedido");
            rs=ps.executeQuery();
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                tab.addRow(datos);
            } 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
        public void cargatabla5(){
        DefaultTableModel tab=new DefaultTableModel();
        tab.addColumn("ID. ped. Art. X Pedido");
        tab.addColumn("ID. Art. X Pedido");
        tab.addColumn("Cantidad Art. Art. X Pedido");
        tab.addColumn("valor_vent Art. Art. X Pedido");
        TablaArtxPed.setModel(tab);
        String datos[]=new String[4];
        
        try {
            ps=conx1.prepareStatement("SELECT *FROM ArtxPed");
            rs=ps.executeQuery();
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                tab.addRow(datos);
            } 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaUsuario = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaCliente = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaArticulo = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaPedido = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaArtxPed = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        TablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaUsuario);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 20, 1056, 60);

        TablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TablaCliente);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 104, 1056, 90);

        TablaArticulo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(TablaArticulo);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(0, 218, 1056, 89);

        TablaPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(TablaPedido);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(0, 333, 1056, 90);

        TablaArtxPed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(TablaArtxPed);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(0, 445, 1056, 89);

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jButton1.setText("ATRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(819, 540, 184, 54);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TABLAS DE LIBRERIA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(407, 0, 120, 14);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USUARIO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 60, 14);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CLIENTE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 86, 60, 14);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ARTICULO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 200, 70, 14);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ARTICULO X PEDIDO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 425, 120, 14);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PEDIDO");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 313, 60, 14);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menubasedatos/libreria.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 1060, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MENUS men=new MENUS();
        men.setVisible(true);
        men.setSize(920,570);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TablasLibreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablasLibreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablasLibreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablasLibreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TablasLibreria().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaArticulo;
    private javax.swing.JTable TablaArtxPed;
    private javax.swing.JTable TablaCliente;
    private javax.swing.JTable TablaPedido;
    private javax.swing.JTable TablaUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
