/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Ana
 */
public class InfoUsuario extends javax.swing.JFrame {

    /**
     * Creates new form InfoUsuario
     */
    public InfoUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFoto = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblUsuarioActivo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Información del usuario");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 170, 160));

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Usuario");
        lblUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 240, -1));

        lblCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreo.setText("Correo");
        lblCorreo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 240, -1));

        lblApellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApellido.setText("Apellido");
        lblApellido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 240, -1));

        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("Nombre");
        lblNombre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 240, -1));

        lblUsuarioActivo.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        getContentPane().add(lblUsuarioActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 110, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(InfoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel lblApellido;
    public javax.swing.JLabel lblCorreo;
    public javax.swing.JLabel lblFoto;
    public javax.swing.JLabel lblNombre;
    public javax.swing.JLabel lblUsuario;
    public javax.swing.JLabel lblUsuarioActivo;
    // End of variables declaration//GEN-END:variables
}
