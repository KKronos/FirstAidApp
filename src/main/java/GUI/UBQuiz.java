/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author up865096
 */
public class UBQuiz extends javax.swing.JFrame {
    String userAnswer;
    /**
     * Creates new form UBQuiz
     */
    public UBQuiz() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        question1Button = new javax.swing.JButton();
        question5Button = new javax.swing.JButton();
        question2Button = new javax.swing.JButton();
        question4Button = new javax.swing.JButton();
        question3Button = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userAnswer1 = new javax.swing.JRadioButton();
        userAnswer2 = new javax.swing.JRadioButton();
        userAnswer3 = new javax.swing.JRadioButton();
        userAnswer4 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        userAnswer5 = new javax.swing.JRadioButton();
        userAnswer6 = new javax.swing.JRadioButton();
        userAnswer7 = new javax.swing.JRadioButton();
        userAnswer8 = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        userAnswer9 = new javax.swing.JRadioButton();
        userAnswer10 = new javax.swing.JRadioButton();
        userAnswer11 = new javax.swing.JRadioButton();
        userAnswer12 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        question1Button.setText("q1");
        question1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                question1ButtonActionPerformed(evt);
            }
        });

        question5Button.setText("q5");

        question2Button.setText("q2");
        question2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                question2ButtonActionPerformed(evt);
            }
        });

        question4Button.setText("q4");
        question4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                question4ButtonActionPerformed(evt);
            }
        });

        question3Button.setText("q3");
        question3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                question3ButtonActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(question5Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(question4Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(question3Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(question2Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(question1Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(submitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(question1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(question2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(question3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(question4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(question5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setText("Why is it important to move someone who is unresponsive and breathing onto their  side?");

        userAnswer1.setText("More comfortable sleeping position");
        userAnswer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAnswer1ActionPerformed(evt);
            }
        });

        userAnswer2.setText("You can check for injuries to their body");
        userAnswer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAnswer2ActionPerformed(evt);
            }
        });

        userAnswer3.setText("Moving the person may help wake them up");
        userAnswer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAnswer3ActionPerformed(evt);
            }
        });

        userAnswer4.setText("It helps to keep their airway clear and allows them to continue breathing normally");
        userAnswer4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAnswer4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userAnswer3)
                            .addComponent(userAnswer1)
                            .addComponent(userAnswer2)
                            .addComponent(userAnswer4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userAnswer1)
                .addGap(18, 18, 18)
                .addComponent(userAnswer2)
                .addGap(18, 18, 18)
                .addComponent(userAnswer4)
                .addGap(18, 18, 18)
                .addComponent(userAnswer3)
                .addGap(0, 87, Short.MAX_VALUE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("After you’ve moved a person who is unresponsive \nand breathing onto their side, you should…what?");
        jScrollPane1.setViewportView(jTextArea1);

        userAnswer5.setText("leave the person alone now they are comfortable, they’ll wake up soon");
        userAnswer5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAnswer5ActionPerformed(evt);
            }
        });

        userAnswer6.setText("stay with the person and keep checking their head is tilted back to allow them to keep breathing normally");
        userAnswer6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAnswer6ActionPerformed(evt);
            }
        });

        userAnswer7.setText("sit with but do not touch the person again. If they move, it is just them starting to wake up");
        userAnswer7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAnswer7ActionPerformed(evt);
            }
        });

        userAnswer8.setText("give 50 grams of Vodka");
        userAnswer8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAnswer8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userAnswer8)
                            .addComponent(userAnswer7)
                            .addComponent(userAnswer5)
                            .addComponent(userAnswer6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userAnswer5)
                .addGap(18, 18, 18)
                .addComponent(userAnswer6)
                .addGap(18, 18, 18)
                .addComponent(userAnswer7)
                .addGap(18, 18, 18)
                .addComponent(userAnswer8)
                .addGap(0, 37, Short.MAX_VALUE))
        );

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("If someone is unresponsive, which three senses\ncan you use to tell if they are breathing?");
        jScrollPane2.setViewportView(jTextArea2);

        userAnswer9.setText("Sound, smell, touch");
        userAnswer9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAnswer9ActionPerformed(evt);
            }
        });

        userAnswer10.setText("Sight, sound, touch");
        userAnswer10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAnswer10ActionPerformed(evt);
            }
        });

        userAnswer11.setText("Smell, touch, taste");
        userAnswer11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAnswer11ActionPerformed(evt);
            }
        });

        userAnswer12.setText("Sight, smell, sound");
        userAnswer12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAnswer12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userAnswer9)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(userAnswer11)
                        .addComponent(userAnswer10)
                        .addComponent(userAnswer12)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(userAnswer9)
                .addGap(18, 18, 18)
                .addComponent(userAnswer10)
                .addGap(18, 18, 18)
                .addComponent(userAnswer11)
                .addGap(18, 18, 18)
                .addComponent(userAnswer12)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(20, 20, 20)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(1, 1, 1)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void question4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_question4ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_question4ButtonActionPerformed

    private void userAnswer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAnswer1ActionPerformed
        // TODO add your handling code here:
        userAnswer = "1";
    }//GEN-LAST:event_userAnswer1ActionPerformed

    private void userAnswer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAnswer2ActionPerformed
        // TODO add your handling code here:
        userAnswer = "2";
    }//GEN-LAST:event_userAnswer2ActionPerformed

    private void userAnswer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAnswer3ActionPerformed
        // TODO add your handling code here:
        userAnswer = "3";
    }//GEN-LAST:event_userAnswer3ActionPerformed

    private void userAnswer4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAnswer4ActionPerformed
        // TODO add your handling code here:
        userAnswer = "4";
    }//GEN-LAST:event_userAnswer4ActionPerformed

    private void question1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_question1ButtonActionPerformed
        // TODO add your handling code here:
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        
        jPanel3.add(jPanel4);
        jPanel3.repaint();
        jPanel3.revalidate();
    }//GEN-LAST:event_question1ButtonActionPerformed

    private void question2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_question2ButtonActionPerformed
        // TODO add your handling code here:
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        
        jPanel3.add(jPanel5);
       
        jPanel3.repaint();
        jPanel3.revalidate();
        
    }//GEN-LAST:event_question2ButtonActionPerformed

    private void question3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_question3ButtonActionPerformed
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        
        jPanel3.add(jPanel9);
       
        jPanel3.repaint();
        jPanel3.revalidate();
    }//GEN-LAST:event_question3ButtonActionPerformed

    private void userAnswer5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAnswer5ActionPerformed
        // TODO add your handling code here:
        userAnswer = "1";
    }//GEN-LAST:event_userAnswer5ActionPerformed

    private void userAnswer6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAnswer6ActionPerformed
        // TODO add your handling code here:
        userAnswer = "2";
    }//GEN-LAST:event_userAnswer6ActionPerformed

    private void userAnswer7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAnswer7ActionPerformed
        // TODO add your handling code here:
        userAnswer = "3";
    }//GEN-LAST:event_userAnswer7ActionPerformed

    private void userAnswer8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAnswer8ActionPerformed
        // TODO add your handling code here:
        userAnswer = "4";
    }//GEN-LAST:event_userAnswer8ActionPerformed

    private void userAnswer9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAnswer9ActionPerformed
        // TODO add your handling code here:
        userAnswer = "1";
    }//GEN-LAST:event_userAnswer9ActionPerformed

    private void userAnswer10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAnswer10ActionPerformed
        // TODO add your handling code here:
        userAnswer = "2";
    }//GEN-LAST:event_userAnswer10ActionPerformed

    private void userAnswer11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAnswer11ActionPerformed
        // TODO add your handling code here:
        userAnswer = "3";
    }//GEN-LAST:event_userAnswer11ActionPerformed

    private void userAnswer12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAnswer12ActionPerformed
        // TODO add your handling code here:
        userAnswer = "4";
    }//GEN-LAST:event_userAnswer12ActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        
          try{
        this.calPoint();
        Scores obj=new Scores();
        obj.setVisible(true);
        //obj.getPoints(this.Points);
        this.dispose();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_submitButtonActionPerformed
public  double marks=0.0;
      
       public double Points=0.0;
       public void calPoint(){
           marks=0.0;
           if(userAnswer4.isSelected()==true){
               marks+=33.33;
           }
           if(userAnswer6.isSelected()==true){
               marks+=33.33;
           }
           if(userAnswer10.isSelected()==true){
              marks+=33.34;
           }
           Points=marks;
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
            java.util.logging.Logger.getLogger(UBQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UBQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UBQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UBQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UBQuiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton question1Button;
    private javax.swing.JButton question2Button;
    private javax.swing.JButton question3Button;
    private javax.swing.JButton question4Button;
    private javax.swing.JButton question5Button;
    private javax.swing.JButton submitButton;
    private javax.swing.JRadioButton userAnswer1;
    private javax.swing.JRadioButton userAnswer10;
    private javax.swing.JRadioButton userAnswer11;
    private javax.swing.JRadioButton userAnswer12;
    private javax.swing.JRadioButton userAnswer2;
    private javax.swing.JRadioButton userAnswer3;
    private javax.swing.JRadioButton userAnswer4;
    private javax.swing.JRadioButton userAnswer5;
    private javax.swing.JRadioButton userAnswer6;
    private javax.swing.JRadioButton userAnswer7;
    private javax.swing.JRadioButton userAnswer8;
    private javax.swing.JRadioButton userAnswer9;
    // End of variables declaration//GEN-END:variables
}
