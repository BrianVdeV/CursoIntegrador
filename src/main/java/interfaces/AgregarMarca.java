/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import client.MarcaClient;

/**
 *
 * @author JESSY
 */
public class AgregarMarca extends javax.swing.JFrame {
    
    

    /**
     * Creates new form AgregarMarca
     */
    public AgregarMarca() {
        initComponents();
        
        //Descactivas la opción de ampliar pantalla
        setResizable(false);
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
        txt_AgregarMarca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_Cancelar_AgregarMarca = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_Listo_AgregarMarca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_AgregarMarca.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txt_AgregarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AgregarMarcaActionPerformed(evt);
            }
        });
        jPanel1.add(txt_AgregarMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 230, 30));

        jLabel1.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        jLabel1.setText("Agregue el nombre de la marca:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        btn_Cancelar_AgregarMarca.setBackground(new java.awt.Color(250, 187, 92));
        btn_Cancelar_AgregarMarca.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        btn_Cancelar_AgregarMarca.setText("Cancelar");
        btn_Cancelar_AgregarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Cancelar_AgregarMarcaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Cancelar_AgregarMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 90, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\JESSY\\OneDrive - Universidad Tecnologica del Peru\\ciclo 7\\integrador 1\\proyecto 1\\SupertPet\\src\\main\\java\\Imagenes\\interfaz\\ImgAgregarMarca_Mascota\\imagen1-removebg-preview.png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 430, 500));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("© 2024. Creado y diseñado por Peter Son Alcoser");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        btn_Listo_AgregarMarca.setBackground(new java.awt.Color(250, 187, 92));
        btn_Listo_AgregarMarca.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        btn_Listo_AgregarMarca.setText("Listo");
        btn_Listo_AgregarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Listo_AgregarMarcaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Listo_AgregarMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Cancelar_AgregarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Cancelar_AgregarMarcaActionPerformed

        RegistrarProducto rp = new RegistrarProducto();
        rp.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_btn_Cancelar_AgregarMarcaActionPerformed

    private void btn_Listo_AgregarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Listo_AgregarMarcaActionPerformed
        
       
       new MarcaClient(this);
        
    }//GEN-LAST:event_btn_Listo_AgregarMarcaActionPerformed

    private void txt_AgregarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AgregarMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AgregarMarcaActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarMarca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_Cancelar_AgregarMarca;
    public javax.swing.JButton btn_Listo_AgregarMarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txt_AgregarMarca;
    // End of variables declaration//GEN-END:variables
}
