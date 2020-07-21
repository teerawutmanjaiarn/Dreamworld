/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgui;
import javax.swing.JOptionPane;
/**
 *
 * @author eve__
 */
public class Window extends javax.swing.JFrame {
    Main main;
    /**
     * Creates new form Window
     */
    public Window() {
        initComponents();
        main = new Main();
        
        //c1 = (CardLayout) jPanel1.getLayout();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usertxt = new javax.swing.JTextField();
        Login = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        passtxt1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Window");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(635, 510));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME TO DREAM PARK");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 100, 350, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("User");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 180, 80, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 250, 110, 50);

        usertxt.setBackground(new java.awt.Color(51, 255, 255));
        usertxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(usertxt);
        usertxt.setBounds(220, 180, 170, 30);

        Login.setBackground(new java.awt.Color(0, 255, 0));
        Login.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login);
        Login.setBounds(150, 330, 110, 50);

        exit.setBackground(new java.awt.Color(255, 0, 0));
        exit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exit.setText("Cancel");
        exit.setMaximumSize(new java.awt.Dimension(75, 31));
        exit.setMinimumSize(new java.awt.Dimension(75, 31));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(310, 330, 110, 50);

        passtxt1.setBackground(new java.awt.Color(102, 255, 255));
        passtxt1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(passtxt1);
        passtxt1.setBounds(220, 260, 170, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgui/fairground-1149626_960_720.jpg"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(500, 640));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 620, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        String user = usertxt.getText();
        String pass = new String(passtxt1.getPassword());
        if (user.equals("")&&pass.equals("")) {
            JOptionPane.showMessageDialog(null, "กรุณากรอก User หรือ Password",
                "Fail",JOptionPane.ERROR_MESSAGE); 
        }
        else if(user.equals("")){
            JOptionPane.showMessageDialog(null,"กรุณากรอก User",
                "Fail",JOptionPane.ERROR_MESSAGE); 
        } 
        else if(pass.equals("")){
            JOptionPane.showMessageDialog(null,"กรุณากรอก Pass",
                "Fail",JOptionPane.ERROR_MESSAGE);
        }
        else if((user.equals("admin"))&&(pass.equals("1234"))){
            JOptionPane.showMessageDialog(null,"เข้าสู่ระบบสำเร็จ",
                "Success",JOptionPane.INFORMATION_MESSAGE);
                main.setVisible(true);
                this.setVisible(false);
                
        }
        else if((!user.equals("admin"))||(!pass.equals("1234"))){
            JOptionPane.showMessageDialog(null,"ท่านกรอก User หรือ Pass ผิด",
                "Fail",JOptionPane.ERROR_MESSAGE);
             }
        
    }//GEN-LAST:event_LoginActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        super.dispose();
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField passtxt1;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables

}
