/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import domain.Producto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import service.ProductoService;

/**
 *
 * @author JESSY
 */
public class GestionarAlmacen extends javax.swing.JFrame {

    /**
     * Creates new form GestionarAlmacen
     */
    public GestionarAlmacen() {
        initComponents();

        //Descactivas la opción de ampliar pantalla
        setResizable(false);
        MostrarDatos(tbl_MostrarProducto_GestionarAlmacen);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_MostrarProducto_GestionarAlmacen = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_CrearProducto_GestionarAlmacen = new javax.swing.JButton();
        btn_EditarProducto_GestionarAlmacen = new javax.swing.JButton();
        btn_Salir_VistaPrevia = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cbx_Filtro_GestionarAlmacen = new javax.swing.JComboBox<>();
        btn_Buscar_GestionarAlmacen = new javax.swing.JButton();
        txt_TextoFiltro_GestionarAlmacen = new javax.swing.JTextField();
        btn_OrdenarStock_GestionarAlmacen = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("© 2024. Creado y diseñado por Peter Son Alcoser");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 650, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ImgGestionAlmacen/patitader.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 150, -1, 800));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ImgGestionAlmacen/patitaizq.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, 220));

        tbl_MostrarProducto_GestionarAlmacen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Código", "Nombre", "Precio venta", "Stock", "Marca", "Mascotas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Short.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Short.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_MostrarProducto_GestionarAlmacen);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 730, 280));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Editar producto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ordenar por Stock");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 130, 20));

        jLabel4.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Buscar");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 60, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Crear producto");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        btn_CrearProducto_GestionarAlmacen.setFont(new java.awt.Font("Artifakt Element", 1, 12)); // NOI18N
        btn_CrearProducto_GestionarAlmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ImgGestionAlmacen/imagen2.png"))); // NOI18N
        btn_CrearProducto_GestionarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CrearProducto_GestionarAlmacenActionPerformed(evt);
            }
        });
        getContentPane().add(btn_CrearProducto_GestionarAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 140, 40));

        btn_EditarProducto_GestionarAlmacen.setFont(new java.awt.Font("Artifakt Element", 1, 12)); // NOI18N
        btn_EditarProducto_GestionarAlmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ImgGestionAlmacen/imagen3.png"))); // NOI18N
        btn_EditarProducto_GestionarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarProducto_GestionarAlmacenActionPerformed(evt);
            }
        });
        getContentPane().add(btn_EditarProducto_GestionarAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 140, 40));

        btn_Salir_VistaPrevia.setBackground(new java.awt.Color(30, 60, 101));
        btn_Salir_VistaPrevia.setForeground(new java.awt.Color(30, 60, 101));
        btn_Salir_VistaPrevia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ImgVistaPrevia/imagen5.jpg"))); // NOI18N
        btn_Salir_VistaPrevia.setBorder(null);
        btn_Salir_VistaPrevia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Salir_VistaPreviaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Salir_VistaPrevia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 50, 50));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel12.setText("REGRESAR");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 90, -1));

        cbx_Filtro_GestionarAlmacen.setBackground(new java.awt.Color(255, 145, 242));
        cbx_Filtro_GestionarAlmacen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nombre", "Marca", "Mascota", "Stock" }));
        getContentPane().add(cbx_Filtro_GestionarAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 170, 30));

        btn_Buscar_GestionarAlmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ImgGestionAlmacen/imagen4.png"))); // NOI18N
        btn_Buscar_GestionarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Buscar_GestionarAlmacenActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Buscar_GestionarAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 80, 30));

        txt_TextoFiltro_GestionarAlmacen.setBackground(new java.awt.Color(239, 220, 235));
        getContentPane().add(txt_TextoFiltro_GestionarAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 310, 40));

        btn_OrdenarStock_GestionarAlmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ImgGestionAlmacen/imagen5.png"))); // NOI18N
        btn_OrdenarStock_GestionarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OrdenarStock_GestionarAlmacenActionPerformed(evt);
            }
        });
        getContentPane().add(btn_OrdenarStock_GestionarAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 150, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ImgGestionAlmacen/cuellito.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 590, 790, 120));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ImgGestionAlmacen/cabeza.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, -40, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 730, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ImgGestionAlmacen/imagen1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, -1, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Salir_VistaPreviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Salir_VistaPreviaActionPerformed

        VistaPrevia vp = new VistaPrevia();
        vp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_Salir_VistaPreviaActionPerformed

    private void btn_OrdenarStock_GestionarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OrdenarStock_GestionarAlmacenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_OrdenarStock_GestionarAlmacenActionPerformed

    private void btn_CrearProducto_GestionarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CrearProducto_GestionarAlmacenActionPerformed

        RegistrarProducto rp = new RegistrarProducto();
        rp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_CrearProducto_GestionarAlmacenActionPerformed

    private void btn_EditarProducto_GestionarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarProducto_GestionarAlmacenActionPerformed

        ModificarProducto mp = new ModificarProducto();
        mp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_EditarProducto_GestionarAlmacenActionPerformed

    private void btn_Buscar_GestionarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Buscar_GestionarAlmacenActionPerformed
        posicion = Lista.BuscarCodigo(codbuscado);
          if(posicion==-1){
              JOptionPane.showMessageDialog(null,
                      "Codigo buscado no existe...");
          }else{
              Empleado emp = Lista.RecuperarEmpleado(posicion);
              vista.txtCodigo.setText(emp.getCodigo());
              vista.txtNombre.setText(emp.getNombre());
              vista.txtCorreo.setText(emp.getCorreo());
              vista.txtSueldo.setText(String.valueOf(emp.getSueldo()));
          }
    }//GEN-LAST:event_btn_Buscar_GestionarAlmacenActionPerformed

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
            java.util.logging.Logger.getLogger(GestionarAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarAlmacen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Buscar_GestionarAlmacen;
    private javax.swing.JButton btn_CrearProducto_GestionarAlmacen;
    private javax.swing.JButton btn_EditarProducto_GestionarAlmacen;
    private javax.swing.JButton btn_OrdenarStock_GestionarAlmacen;
    private javax.swing.JButton btn_Salir_VistaPrevia;
    private javax.swing.JComboBox<String> cbx_Filtro_GestionarAlmacen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_MostrarProducto_GestionarAlmacen;
    private javax.swing.JTextField txt_TextoFiltro_GestionarAlmacen;
    // End of variables declaration//GEN-END:variables

    static ProductoService productoService = new ProductoService();
    public void MostrarDatos(JTable tbl) {
        // Crear un nuevo modelo de tabla cada vez
        DefaultTableModel tabla = new DefaultTableModel();

        // Definir las columnas de la tabla
        String[] columnas = {"ID", "Código", "Nombre", "Precio Venta", "Stock", "Marca", "Tipo Mascota"};
        tabla.setColumnIdentifiers(columnas);

        // Obtener los datos de los productos
        Producto[] productos = productoService.consultar();

        // Añadir los datos de los productos a la tabla
        for (Producto producto : productos) {
            Object[] fila = new Object[7];
            fila[0] = producto.getIdProducto();
            fila[1] = producto.getCodigo();
            fila[2] = producto.getNombre();
            fila[3] = producto.getPrecioVenta();
            fila[4] = producto.getStock();
            fila[5] = producto.getMarc();
            fila[6] = producto.getTipoMasc();
            tabla.addRow(fila);
        }

        // Establecer el modelo de la tabla
        tbl.setModel(tabla);
    }
}
