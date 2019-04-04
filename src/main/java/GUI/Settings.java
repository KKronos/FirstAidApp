/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author up839921
 */
public class Settings extends javax.swing.JFrame {

    /**
     * Creates new form Settings
     */
    public Settings() {
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

        ColourblindSelector = new javax.swing.ButtonGroup();
        back = new javax.swing.JButton();
        header = new javax.swing.JLabel();
        HeaderBackground = new javax.swing.JLabel();
        AccessibilityOptionsLabel = new javax.swing.JLabel();
        DefaultColours = new javax.swing.JRadioButton();
        MagnifyTextCheckBox = new javax.swing.JCheckBox();
        DeuteranopiaColours = new javax.swing.JRadioButton();
        CaptionImagesCheckBox = new javax.swing.JCheckBox();
        ProtanopiaColours = new javax.swing.JRadioButton();
        TritanopiaColours = new javax.swing.JRadioButton();
        RedColourTest = new javax.swing.JPanel();
        GreenColourTest = new javax.swing.JPanel();
        BlueColourTest = new javax.swing.JPanel();
        Seperator2 = new javax.swing.JPanel();
        ColourblindModeLabel = new javax.swing.JLabel();
        Seperator1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(370, 640));
        setMinimumSize(new java.awt.Dimension(370, 640));
        setPreferredSize(new java.awt.Dimension(370, 640));
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

        header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Settings/settingsScreen.png"))); // NOI18N
        getContentPane().add(header);
        header.setBounds(-20, 0, 380, 120);

        HeaderBackground.setBackground(new java.awt.Color(249, 6, 6));
        HeaderBackground.setOpaque(true);
        HeaderBackground.setPreferredSize(new java.awt.Dimension(360, 110));
        getContentPane().add(HeaderBackground);
        HeaderBackground.setBounds(0, 0, 360, 110);

        AccessibilityOptionsLabel.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        AccessibilityOptionsLabel.setText("Accessibility options");
        getContentPane().add(AccessibilityOptionsLabel);
        AccessibilityOptionsLabel.setBounds(10, 116, 250, 37);

        ColourblindSelector.add(DefaultColours);
        DefaultColours.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        DefaultColours.setSelected(true);
        DefaultColours.setText("Default");
        DefaultColours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultColoursActionPerformed(evt);
            }
        });
        getContentPane().add(DefaultColours);
        DefaultColours.setBounds(10, 403, 115, 45);

        MagnifyTextCheckBox.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        MagnifyTextCheckBox.setText("Magnify Text");
        MagnifyTextCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MagnifyTextCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(MagnifyTextCheckBox);
        MagnifyTextCheckBox.setBounds(41, 167, 185, 45);

        ColourblindSelector.add(DeuteranopiaColours);
        DeuteranopiaColours.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        DeuteranopiaColours.setText("Deuteranopia");
        DeuteranopiaColours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeuteranopiaColoursActionPerformed(evt);
            }
        });
        getContentPane().add(DeuteranopiaColours);
        DeuteranopiaColours.setBounds(10, 448, 193, 45);

        CaptionImagesCheckBox.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        CaptionImagesCheckBox.setText("Caption Images");
        CaptionImagesCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaptionImagesCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(CaptionImagesCheckBox);
        CaptionImagesCheckBox.setBounds(41, 212, 215, 45);

        ColourblindSelector.add(ProtanopiaColours);
        ProtanopiaColours.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        ProtanopiaColours.setText("Protanopia");
        ProtanopiaColours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProtanopiaColoursActionPerformed(evt);
            }
        });
        getContentPane().add(ProtanopiaColours);
        ProtanopiaColours.setBounds(10, 493, 161, 45);

        ColourblindSelector.add(TritanopiaColours);
        TritanopiaColours.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        TritanopiaColours.setText("Tritanopia");
        TritanopiaColours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TritanopiaColoursActionPerformed(evt);
            }
        });
        getContentPane().add(TritanopiaColours);
        TritanopiaColours.setBounds(10, 538, 151, 45);

        RedColourTest.setBackground(new java.awt.Color(249, 6, 6));
        RedColourTest.setBorder(new javax.swing.border.SoftBevelBorder(50));
        RedColourTest.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout RedColourTestLayout = new javax.swing.GroupLayout(RedColourTest);
        RedColourTest.setLayout(RedColourTestLayout);
        RedColourTestLayout.setHorizontalGroup(
            RedColourTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        RedColourTestLayout.setVerticalGroup(
            RedColourTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(RedColourTest);
        RedColourTest.setBounds(52, 335, 50, 50);

        GreenColourTest.setBackground(new java.awt.Color(0, 128, 0));
        GreenColourTest.setBorder(new javax.swing.border.SoftBevelBorder(50));
        GreenColourTest.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout GreenColourTestLayout = new javax.swing.GroupLayout(GreenColourTest);
        GreenColourTest.setLayout(GreenColourTestLayout);
        GreenColourTestLayout.setHorizontalGroup(
            GreenColourTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        GreenColourTestLayout.setVerticalGroup(
            GreenColourTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(GreenColourTest);
        GreenColourTest.setBounds(155, 335, 50, 50);

        BlueColourTest.setBackground(new java.awt.Color(77, 77, 255));
        BlueColourTest.setBorder(new javax.swing.border.SoftBevelBorder(50));
        BlueColourTest.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout BlueColourTestLayout = new javax.swing.GroupLayout(BlueColourTest);
        BlueColourTest.setLayout(BlueColourTestLayout);
        BlueColourTestLayout.setHorizontalGroup(
            BlueColourTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        BlueColourTestLayout.setVerticalGroup(
            BlueColourTestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(BlueColourTest);
        BlueColourTest.setBounds(268, 335, 50, 50);

        Seperator2.setBackground(new java.awt.Color(249, 6, 6));
        Seperator2.setPreferredSize(new java.awt.Dimension(300, 5));

        javax.swing.GroupLayout Seperator2Layout = new javax.swing.GroupLayout(Seperator2);
        Seperator2.setLayout(Seperator2Layout);
        Seperator2Layout.setHorizontalGroup(
            Seperator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        Seperator2Layout.setVerticalGroup(
            Seperator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        getContentPane().add(Seperator2);
        Seperator2.setBounds(30, 285, 300, 5);

        ColourblindModeLabel.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        ColourblindModeLabel.setText("Colourblind Mode:");
        getContentPane().add(ColourblindModeLabel);
        ColourblindModeLabel.setBounds(10, 296, 231, 37);

        Seperator1.setBackground(new java.awt.Color(249, 6, 6));
        Seperator1.setPreferredSize(new java.awt.Dimension(300, 5));

        javax.swing.GroupLayout Seperator1Layout = new javax.swing.GroupLayout(Seperator1);
        Seperator1.setLayout(Seperator1Layout);
        Seperator1Layout.setHorizontalGroup(
            Seperator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        Seperator1Layout.setVerticalGroup(
            Seperator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        getContentPane().add(Seperator1);
        Seperator1.setBounds(30, 155, 300, 5);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DefaultColoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DefaultColoursActionPerformed
        header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Settings/settingsScreen.png")));
        defaultColoursSettings();
        //Set default colours across all screens here
    }//GEN-LAST:event_DefaultColoursActionPerformed

    private void DeuteranopiaColoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeuteranopiaColoursActionPerformed
        header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Settings/settingsScreen.png")));
        DeuteranopiaColoursSettings();
        //Set Deutranopia colours across all screens here
    }//GEN-LAST:event_DeuteranopiaColoursActionPerformed

    private void ProtanopiaColoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProtanopiaColoursActionPerformed
        header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Settings/settingsScreen.png")));
        ProtanopiaColoursSettings();
        //Set Protanopia colours across all screens here
    }//GEN-LAST:event_ProtanopiaColoursActionPerformed

    private void TritanopiaColoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TritanopiaColoursActionPerformed
        header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Settings/settingsScreen.png")));
        TritanopiaColoursSettings();
        //Set Tritanopia colours across all screens here
    }//GEN-LAST:event_TritanopiaColoursActionPerformed

    private void MagnifyTextCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MagnifyTextCheckBoxActionPerformed
        if (MagnifyTextCheckBox.isSelected()) {
            MagnifiedTextSizeSettings();
        } else {
            NormalTextSizeSettings();
        }
    }//GEN-LAST:event_MagnifyTextCheckBoxActionPerformed

    private void CaptionImagesCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaptionImagesCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CaptionImagesCheckBoxActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new Menu().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    public void defaultColoursSettings(){
        back.setBackground(new Color(249, 6, 6));
        HeaderBackground.setBackground(new Color(249, 6, 6));
        RedColourTest.setBackground(new Color(249, 6, 6));
        GreenColourTest.setBackground(new Color(0, 128, 0));
        BlueColourTest.setBackground(new Color(77, 77, 255));
        
        Seperator1.setBackground(new Color(249, 6, 6));
        Seperator2.setBackground(new Color(249, 6, 6));
    }
    
    public void DeuteranopiaColoursSettings(){
        back.setBackground(new Color(238, 43, 150));
        HeaderBackground.setBackground(new Color(238, 43, 150));
        RedColourTest.setBackground(new Color(238, 43, 150));
        GreenColourTest.setBackground(new Color(0, 155, 33));
        BlueColourTest.setBackground(new Color(0, 64, 224));
        
        Seperator1.setBackground(new Color(238, 43, 150));
        Seperator2.setBackground(new Color(238, 43, 150));
    }
    
    public void ProtanopiaColoursSettings(){
        back.setBackground(new Color(250, 56, 143));
        HeaderBackground.setBackground(new Color(250, 56, 143));
        RedColourTest.setBackground(new Color(250, 56, 143));
        GreenColourTest.setBackground(new Color(0, 128, 28));
        BlueColourTest.setBackground(new Color(6, 68, 224));
        
        Seperator1.setBackground(new Color(250, 56, 143));
        Seperator2.setBackground(new Color(250, 56, 143));
    }
    
    public void TritanopiaColoursSettings(){
        back.setBackground(new Color(255, 0, 0));
        HeaderBackground.setBackground(new Color(255, 0, 0));
        RedColourTest.setBackground(new Color(255, 0, 0));
        GreenColourTest.setBackground(new Color(0, 179, 60));
        BlueColourTest.setBackground(new Color(0, 0, 196));
        
        Seperator1.setBackground(new Color(255, 0, 0));
        Seperator2.setBackground(new Color(255, 0, 0));
    }
    
    
    
    public void MagnifiedTextSizeSettings() {
        AccessibilityOptionsLabel.setFont(new Font("Calibri", Font.PLAIN, 30));
        MagnifyTextCheckBox.setFont(new Font("Calibri", Font.PLAIN, 30));
        CaptionImagesCheckBox.setFont(new Font("Calibri", Font.PLAIN, 30));
        ColourblindModeLabel.setFont(new Font("Calibri", Font.PLAIN, 30));
        DefaultColours.setFont(new Font("Calibri", Font.PLAIN, 30));
        DeuteranopiaColours.setFont(new Font("Calibri", Font.PLAIN, 30));
        ProtanopiaColours.setFont(new Font("Calibri", Font.PLAIN, 30));
        TritanopiaColours.setFont(new Font("Calibri", Font.PLAIN, 30));
    }
    
    public void NormalTextSizeSettings() {
        AccessibilityOptionsLabel.setFont(new Font("Calibri", Font.PLAIN, 24));
        MagnifyTextCheckBox.setFont(new Font("Calibri", Font.PLAIN, 24));
        CaptionImagesCheckBox.setFont(new Font("Calibri", Font.PLAIN, 24));
        ColourblindModeLabel.setFont(new Font("Calibri", Font.PLAIN, 24));
        DefaultColours.setFont(new Font("Calibri", Font.PLAIN, 24));
        DeuteranopiaColours.setFont(new Font("Calibri", Font.PLAIN, 24));
        ProtanopiaColours.setFont(new Font("Calibri", Font.PLAIN, 24));
        TritanopiaColours.setFont(new Font("Calibri", Font.PLAIN, 24));    
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
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Settings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccessibilityOptionsLabel;
    private javax.swing.JPanel BlueColourTest;
    private javax.swing.JCheckBox CaptionImagesCheckBox;
    private javax.swing.JLabel ColourblindModeLabel;
    private javax.swing.ButtonGroup ColourblindSelector;
    private javax.swing.JRadioButton DefaultColours;
    private javax.swing.JRadioButton DeuteranopiaColours;
    private javax.swing.JPanel GreenColourTest;
    private javax.swing.JLabel HeaderBackground;
    private javax.swing.JCheckBox MagnifyTextCheckBox;
    private javax.swing.JRadioButton ProtanopiaColours;
    private javax.swing.JPanel RedColourTest;
    private javax.swing.JPanel Seperator1;
    private javax.swing.JPanel Seperator2;
    private javax.swing.JRadioButton TritanopiaColours;
    private javax.swing.JButton back;
    private javax.swing.JLabel header;
    // End of variables declaration//GEN-END:variables
}
