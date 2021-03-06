package GUI;


import java.awt.Color;
import java.awt.Container;

public class Menu extends javax.swing.JFrame {

    public Container viewMenu;

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        getContentPane().setBackground(new Color(255, 255, 255));  //Sets the background colour to white
        setLocationRelativeTo(null);  //Ensures the frame would open in the centre of the display
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LessonButton = new javax.swing.JButton();
        QuizButton = new javax.swing.JButton();
        PreviewResultsButton = new javax.swing.JButton();
        ScoresButton = new javax.swing.JButton();
        EmergencyButton = new javax.swing.JButton();
        SettingsButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(360, 640));
        setName("Menu"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(360, 640));
        getContentPane().setLayout(null);

        LessonButton.setBackground(new java.awt.Color(249, 6, 6));
        LessonButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lesson/iconLessons_transparent.png"))); // NOI18N
        LessonButton.setMaximumSize(new java.awt.Dimension(159, 169));
        LessonButton.setMinimumSize(new java.awt.Dimension(159, 169));
        LessonButton.setPreferredSize(new java.awt.Dimension(108, 129));
        LessonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LessonButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LessonButton);
        LessonButton.setBounds(42, 68, 108, 129);

        QuizButton.setBackground(new java.awt.Color(249, 6, 6));
        QuizButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/iconQuiz_transparent.png"))); // NOI18N
        QuizButton.setPreferredSize(new java.awt.Dimension(108, 129));
        QuizButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuizButtonActionPerformed(evt);
            }
        });
        getContentPane().add(QuizButton);
        QuizButton.setBounds(210, 68, 108, 129);

        PreviewResultsButton.setBackground(new java.awt.Color(249, 6, 6));
        PreviewResultsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Results/iconResults_transparent.png"))); // NOI18N
        PreviewResultsButton.setPreferredSize(new java.awt.Dimension(108, 129));
        PreviewResultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviewResultsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PreviewResultsButton);
        PreviewResultsButton.setBounds(42, 247, 108, 129);

        ScoresButton.setBackground(new java.awt.Color(249, 6, 6));
        ScoresButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Scores/iconScores_transparent.png"))); // NOI18N
        ScoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScoresButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ScoresButton);
        ScoresButton.setBounds(210, 247, 108, 129);

        EmergencyButton.setBackground(new java.awt.Color(249, 6, 6));
        EmergencyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Emergency/iconEmergency_transparent.png"))); // NOI18N
        EmergencyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmergencyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EmergencyButton);
        EmergencyButton.setBounds(42, 426, 108, 129);

        SettingsButton.setBackground(new java.awt.Color(249, 6, 6));
        SettingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Settings/iconSettings_transparent.png"))); // NOI18N
        SettingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SettingsButton);
        SettingsButton.setBounds(210, 426, 108, 129);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/menuHeader.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-20, 0, 380, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LessonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LessonButtonActionPerformed
        new LessonList().setVisible(true);  //Creates a new LessonList frame
        this.setVisible(false);   //Turn off visibility for this frame
    }//GEN-LAST:event_LessonButtonActionPerformed

    private void QuizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuizButtonActionPerformed
        new QuizList().setVisible(true);  //Creates a new QuizList frame
        this.setVisible(false);   //Turn off visibility for this frame
    }//GEN-LAST:event_QuizButtonActionPerformed

    private void ScoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScoresButtonActionPerformed
        new Score().setVisible(true);  //Creates a new Score frame
        this.setVisible(false);   //Turn off visibility for this frame
    }//GEN-LAST:event_ScoresButtonActionPerformed

    private void EmergencyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmergencyButtonActionPerformed
        new Emergency().setVisible(true);  //Creates a new Emergency frame
        this.setVisible(false);   //Turn off visibility for this frame
    }//GEN-LAST:event_EmergencyButtonActionPerformed

    private void PreviewResultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviewResultsButtonActionPerformed
        new PreviewResultsList().setVisible(true);  //Creates a new PreviewResults frame
        this.setVisible(false);   //Turn off visibility for this frame
    }//GEN-LAST:event_PreviewResultsButtonActionPerformed

    private void SettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsButtonActionPerformed
        new Settings().setVisible(true);  //Creates a new Settings frame
        this.setVisible(false);   //Turn off visibility for this frame
    }//GEN-LAST:event_SettingsButtonActionPerformed
    
    public void defaultColoursSettings(){
        LessonButton.setBackground(new Color(249, 6, 6));
        QuizButton.setBackground(new Color(249, 6, 6));
        PreviewResultsButton.setBackground(new Color(249, 6, 6));
        ScoresButton.setBackground(new Color(249, 6, 6));
        EmergencyButton.setBackground(new Color(249, 6, 6));
        SettingsButton.setBackground(new Color(249, 6, 6));
        //Sets the colours back to the original default
    }
    
    public void DeuteranopiaColoursSettings(){
        LessonButton.setBackground(new Color(238, 43, 150));
        QuizButton.setBackground(new Color(238, 43, 150));
        PreviewResultsButton.setBackground(new Color(238, 43, 150));
        ScoresButton.setBackground(new Color(238, 43, 150));
        EmergencyButton.setBackground(new Color(238, 43, 150));
        SettingsButton.setBackground(new Color(238, 43, 150));       
        //Sets the colours to allow for easier reading for those who suffer from Deuteranopia colourblindness

    }
    
    public void ProtanopiaColoursSettings(){
        LessonButton.setBackground(new Color(250, 56, 143));
        QuizButton.setBackground(new Color(250, 56, 143));
        PreviewResultsButton.setBackground(new Color(250, 56, 143));
        ScoresButton.setBackground(new Color(250, 56, 143));
        EmergencyButton.setBackground(new Color(250, 56, 143));
        SettingsButton.setBackground(new Color(250, 56, 143));
        //Sets the colours to allow for easier reading for those who suffer from Protanopia colourblindness
    }
    
    public void TritanopiaColoursSettings(){
        LessonButton.setBackground(new Color(255, 0, 0));
        QuizButton.setBackground(new Color(255, 0, 0));
        PreviewResultsButton.setBackground(new Color(255, 0, 0));
        ScoresButton.setBackground(new Color(255, 0, 0));
        EmergencyButton.setBackground(new Color(255, 0, 0));
        SettingsButton.setBackground(new Color(255, 0, 0));
        //Sets the colours to allow for easier reading for those who suffer from Tritanopia colourblindness
    }

    

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);  //Creates and show this frame
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EmergencyButton;
    private javax.swing.JButton LessonButton;
    private javax.swing.JButton PreviewResultsButton;
    private javax.swing.JButton QuizButton;
    private javax.swing.JButton ScoresButton;
    private javax.swing.JButton SettingsButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
