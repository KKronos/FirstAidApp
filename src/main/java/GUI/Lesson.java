/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author up873711
 */
public class Lesson extends javax.swing.JFrame {

    /**
     * Creates new form Lesson
     */
    public Lesson() {
        initComponents();
        getContentPane().setBackground(new Color(255, 255, 255));
        setLocationRelativeTo(null);
    }

    public void CPR() {
        lessonTitle.setFont(new java.awt.Font("Calibri", 0, 40));
        lessonTitle.setText("<html>CPR</html>");
        lessonDescription.setText("<html>1) Open their airway<br />2) Check their breathing<br />3) Call for help and start CPR<br />4) Start giving chest compressions<br />5) Start giving rescue breaths</html>");
        lessonImage.setText("");
        lessonImage.setIcon(new ImageIcon(getClass().getResource("/Lesson/CPR (1).png")));
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JButton();
        lessonTitle = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        HeaderBackground = new javax.swing.JLabel();
        lessonDescription = new javax.swing.JLabel();
        lessonImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("lesson"); // NOI18N
        setPreferredSize(new java.awt.Dimension(370, 640));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        back.setBackground(new java.awt.Color(255, 51, 51));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/back.png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(20, 40, 30, 60);

        lessonTitle.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        lessonTitle.setForeground(new java.awt.Color(255, 255, 255));
        lessonTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lessonTitle.setText("<insert title here>");
        getContentPane().add(lessonTitle);
        lessonTitle.setBounds(140, 30, 190, 70);

        header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lesson/lessonScreen_blank.png"))); // NOI18N
        getContentPane().add(header);
        header.setBounds(-10, -50, 380, 190);

        HeaderBackground.setBackground(new java.awt.Color(249, 6, 6));
        HeaderBackground.setOpaque(true);
        HeaderBackground.setPreferredSize(new java.awt.Dimension(360, 110));
        getContentPane().add(HeaderBackground);
        HeaderBackground.setBounds(0, 0, 360, 110);

        lessonDescription.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        lessonDescription.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lessonDescription.setText("<insert desciptions here>");
        getContentPane().add(lessonDescription);
        lessonDescription.setBounds(30, 360, 300, 260);

        lessonImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lessonImage.setText("<insert image here>");
        getContentPane().add(lessonImage);
        lessonImage.setBounds(10, 160, 330, 180);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new LessonList().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        CPR();
        
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Lesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lesson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lesson().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HeaderBackground;
    private javax.swing.JButton back;
    private javax.swing.JLabel header;
    private javax.swing.JLabel lessonDescription;
    private javax.swing.JLabel lessonImage;
    private javax.swing.JLabel lessonTitle;
    // End of variables declaration//GEN-END:variables
}
