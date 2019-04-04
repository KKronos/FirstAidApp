/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;

/**
 *
 * @author up839921
 */
public class Results extends javax.swing.JFrame {

    /**
     * Creates new form Results
     */
    public Results() {
        initComponents();
        getContentPane().setBackground(new Color(255,255,255));
        setLocationRelativeTo(null);
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
        HeaderBackground = new javax.swing.JLabel();
        Q1Panel = new javax.swing.JPanel();
        Q1Label = new javax.swing.JLabel();
        Q1_1Answer = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        Q2Panel = new javax.swing.JPanel();
        Q2Label = new javax.swing.JLabel();
        Q2_4Answer = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Results/resultsScreen.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, 0, 370, 170);

        HeaderBackground.setBackground(new java.awt.Color(249, 6, 6));
        HeaderBackground.setOpaque(true);
        HeaderBackground.setPreferredSize(new java.awt.Dimension(360, 110));
        getContentPane().add(HeaderBackground);
        HeaderBackground.setBounds(0, 0, 360, 110);

        Q1Panel.setLayout(null);

        Q1Label.setText("<html><b>1.</b> Why is it important to move someone who is unresponsive and breathing onto their  side?</html>");
        Q1Panel.add(Q1Label);
        Q1Label.setBounds(10, 11, 317, 51);

        Q1_1Answer.setText("More comfortable sleeping position");
        Q1Panel.add(Q1_1Answer);
        Q1_1Answer.setBounds(10, 69, 191, 23);

        jLabel2.setBackground(new java.awt.Color(0, 204, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/correct.png"))); // NOI18N
        jLabel2.setOpaque(true);
        Q1Panel.add(jLabel2);
        jLabel2.setBounds(210, 70, 32, 30);

        getContentPane().add(Q1Panel);
        Q1Panel.setBounds(10, 140, 340, 110);

        Q2Panel.setLayout(null);

        Q2Label.setText("<html><b>2.</b> After you have moved a person who is unresponsive  and breathing onto their side, you should do what?</html>");
        Q2Panel.add(Q2Label);
        Q2Label.setBounds(10, 11, 311, 33);

        Q2_4Answer.setText("Offer them a drink to keep them hydrated");
        Q2_4Answer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q2_4AnswerActionPerformed(evt);
            }
        });
        Q2Panel.add(Q2_4Answer);
        Q2_4Answer.setBounds(10, 62, 227, 23);

        jLabel3.setBackground(new java.awt.Color(255, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/wrong.png"))); // NOI18N
        jLabel3.setOpaque(true);
        Q2Panel.add(jLabel3);
        jLabel3.setBounds(240, 60, 30, 30);

        getContentPane().add(Q2Panel);
        Q2Panel.setBounds(10, 260, 330, 110);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Q2_4AnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q2_4AnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Q2_4AnswerActionPerformed

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
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Results().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HeaderBackground;
    private javax.swing.JLabel Q1Label;
    private javax.swing.JPanel Q1Panel;
    private javax.swing.JRadioButton Q1_1Answer;
    private javax.swing.JLabel Q2Label;
    private javax.swing.JPanel Q2Panel;
    private javax.swing.JRadioButton Q2_4Answer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
