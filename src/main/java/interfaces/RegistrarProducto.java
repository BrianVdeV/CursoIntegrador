/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import client.CrearMarca_CB;
import client.CrearMascotas_CB;
import client.CrearProductoClient;
import domain.Marca;
import domain.TipoMascota;
import static interfaces.ModificarProducto.marcaService;
import interfaces.GestionarAlmacen;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import service.MarcaService;
import service.TipoMascotaService;

/**
 *
 * @author JESSY
 */
public class RegistrarProducto extends javax.swing.JFrame {

    static MarcaService marcaService = new MarcaService();
    static TipoMascotaService tipoMascotaService = new TipoMascotaService();
 
    public RegistrarProducto() {
        initComponents();

        //Descactivas la opción de ampliar pantalla
        setResizable(false);

        
        MostrarMarcas(cbx_Marca_RegistrarProducto);
        MostrarTipoMascota(cbx_TipoMascota_RegistrarProducto);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_Nombre_RegistrarProducto = new javax.swing.JTextField();
        txt_Codigo_RegistrarProducto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_Stock_RegistrarProducto = new javax.swing.JTextField();
        cbx_TipoMascota_RegistrarProducto = new javax.swing.JComboBox<>();
        cbx_Marca_RegistrarProducto = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_Crear_RegistrarProducto = new javax.swing.JButton();
        btn_Cancelar_RegistrarProducto = new javax.swing.JButton();
        btn_AgregarMascota_RegistrarProducto = new javax.swing.JButton();
        btn_AgregarMarca_RegistrarProducto = new javax.swing.JButton();
        txt_PrecioVenta_RegistrarProducto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(75, 90, 165));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Broadway", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SuperPet");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 170, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ImgRecuperarContraseña/imagen1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 30, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ImgCrearProducto/imagen1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("© 2024. Creado y diseñado por Peter Son Alcoser");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 650));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel5.setText("Crear producto:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel6.setText("Nombre del producto:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel7.setText("Código:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        txt_Nombre_RegistrarProducto.setBackground(new java.awt.Color(197, 254, 254));
        jPanel2.add(txt_Nombre_RegistrarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 350, 30));

        txt_Codigo_RegistrarProducto.setBackground(new java.awt.Color(197, 254, 254));
        jPanel2.add(txt_Codigo_RegistrarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 350, 30));

        jLabel8.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel8.setText("Precio de venta:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        txt_Stock_RegistrarProducto.setBackground(new java.awt.Color(197, 254, 254));
        jPanel2.add(txt_Stock_RegistrarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 190, 30));

        cbx_TipoMascota_RegistrarProducto.setBackground(new java.awt.Color(197, 254, 254));
        jPanel2.add(cbx_TipoMascota_RegistrarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 230, 30));

        cbx_Marca_RegistrarProducto.setBackground(new java.awt.Color(197, 254, 254));
        cbx_Marca_RegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_Marca_RegistrarProductoActionPerformed(evt);
            }
        });
        jPanel2.add(cbx_Marca_RegistrarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 230, 30));

        jLabel9.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel9.setText("Stock");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel11.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel11.setText("¿Para qué tipos mascotas?");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, -1, -1));

        btn_Crear_RegistrarProducto.setBackground(new java.awt.Color(207, 202, 250));
        btn_Crear_RegistrarProducto.setText("Crear");
        btn_Crear_RegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Crear_RegistrarProductoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Crear_RegistrarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 100, 40));

        btn_Cancelar_RegistrarProducto.setBackground(new java.awt.Color(240, 65, 116));
        btn_Cancelar_RegistrarProducto.setText("Cancelar");
        btn_Cancelar_RegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Cancelar_RegistrarProductoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Cancelar_RegistrarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 100, 40));

        btn_AgregarMascota_RegistrarProducto.setBackground(new java.awt.Color(240, 187, 245));
        btn_AgregarMascota_RegistrarProducto.setText("Agregar Mascotas");
        btn_AgregarMascota_RegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarMascota_RegistrarProductoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_AgregarMascota_RegistrarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 570, 130, 30));

        btn_AgregarMarca_RegistrarProducto.setBackground(new java.awt.Color(240, 187, 245));
        btn_AgregarMarca_RegistrarProducto.setText("Agregar Marca");
        btn_AgregarMarca_RegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarMarca_RegistrarProductoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_AgregarMarca_RegistrarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 130, 30));

        txt_PrecioVenta_RegistrarProducto.setBackground(new java.awt.Color(197, 254, 254));
        jPanel2.add(txt_PrecioVenta_RegistrarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 150, 30));

        jLabel12.setFont(new java.awt.Font("Microsoft Tai Le", 1, 12)); // NOI18N
        jLabel12.setText("Marca:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        jLabel13.setFont(new java.awt.Font("Microsoft Tai Le", 1, 10)); // NOI18N
        jLabel13.setText("Tiene que ser mayor o igual a Cero \"0\"");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jLabel3.setBackground(new java.awt.Color(197, 254, 254));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ImgCrearProducto/imagen3.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ImgCrearProducto/imagen4.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 690, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Cancelar_RegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Cancelar_RegistrarProductoActionPerformed
        GestionarAlmacen ga = new GestionarAlmacen();
        ga.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_Cancelar_RegistrarProductoActionPerformed

    private void btn_AgregarMarca_RegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarMarca_RegistrarProductoActionPerformed

        RegistrarProducto rg = new RegistrarProducto();
        
        new AgregarMarca().setVisible(true);
//        AgregarMarca ag = new AgregarMarca();
//        ag.setVisible(true);
        rg.setVisible(false);

    }//GEN-LAST:event_btn_AgregarMarca_RegistrarProductoActionPerformed

    private void btn_AgregarMascota_RegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarMascota_RegistrarProductoActionPerformed
        AgregarMascota am = new AgregarMascota();
        am.setVisible(true);
        this.setVisible(false);
        

    }//GEN-LAST:event_btn_AgregarMascota_RegistrarProductoActionPerformed

    private void btn_Crear_RegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Crear_RegistrarProductoActionPerformed
        
        new CrearProductoClient(this);

        
        
    }//GEN-LAST:event_btn_Crear_RegistrarProductoActionPerformed

    private void cbx_Marca_RegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_Marca_RegistrarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_Marca_RegistrarProductoActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_AgregarMarca_RegistrarProducto;
    public javax.swing.JButton btn_AgregarMascota_RegistrarProducto;
    public javax.swing.JButton btn_Cancelar_RegistrarProducto;
    public javax.swing.JButton btn_Crear_RegistrarProducto;
    public javax.swing.JComboBox<String> cbx_Marca_RegistrarProducto;
    public javax.swing.JComboBox<String> cbx_TipoMascota_RegistrarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    public javax.swing.JTextField txt_Codigo_RegistrarProducto;
    public javax.swing.JTextField txt_Nombre_RegistrarProducto;
    public javax.swing.JTextField txt_PrecioVenta_RegistrarProducto;
    public javax.swing.JTextField txt_Stock_RegistrarProducto;
    // End of variables declaration//GEN-END:variables

    DefaultComboBoxModel combo = new DefaultComboBoxModel();
    CrearMarca_CB crearMarca = new CrearMarca_CB();
    Marca marcaCB = new Marca();

    Marca[] col = marcaService.consultar();
    int col2 = col.length;
    ArrayList<Marca> marcas = new ArrayList<>();

    private void MostrarMarcas(JComboBox cbmx) {

        for (int i = 1; i <= col2; i++) {

            Marca marca = marcaService.consultarPorId(i);
            if (marca != null) {
                marcas.add(marca);
            }

        }

        cbmx.setModel(combo);

        //aregglo que contriene todaas las marcas creadas   
        for (Marca marcaCBMX : marcas) {

            marcaCB.setMarca(marcaCBMX.getMarca());

            crearMarca.AgregarMArca(marcaCBMX);

            combo.addElement(marcaCB.getMarca());

        }

    }

    DefaultComboBoxModel combo1 = new DefaultComboBoxModel();

    CrearMascotas_CB crearTipoMascota = new CrearMascotas_CB();

    TipoMascota mascotaCB = new TipoMascota();

    private void MostrarTipoMascota(JComboBox cbmx) {

//        combo1.removeAllElements();
        cbmx.setModel(combo1);

        //aregglo que contriene todaas las marcas creadas

        TipoMascota[] tipoMascotaCol = tipoMascotaService.consultar();
        int tipoMascotaCol2 = tipoMascotaCol.length;
        ArrayList<TipoMascota> tipoMascota = new ArrayList<>();

        for (int i = 1; i <= tipoMascotaCol2; i++) {

            TipoMascota tipoMascotas = tipoMascotaService.consultarPorId(i);
            if (tipoMascotas != null) {
                tipoMascota.add(tipoMascotas);
            }

        }

        for (TipoMascota mascotaCBMX : tipoMascota) {

            mascotaCB.setMascota(mascotaCBMX.getMascota());

            crearTipoMascota.AgregarTipoMascota(mascotaCBMX);

            combo1.addElement(mascotaCB.getMascota());

        }

    }

}
