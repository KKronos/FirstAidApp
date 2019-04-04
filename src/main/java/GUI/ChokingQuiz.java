/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author usman
 */
public class ChokingQuiz extends javax.swing.JFrame {

    String userAnswer;
    /**
     * Creates new form Quiz
     */
    public ChokingQuiz() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        back = new javax.swing.JButton();
        header = new javax.swing.JLabel();
        HeaderBackground = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Question1Button = new javax.swing.JButton();
        Question2Button = new javax.swing.JButton();
        Question3Button = new javax.swing.JButton();
        Question4Button = new javax.swing.JButton();
        Question5Button = new javax.swing.JButton();
        SubmitButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Q1Panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Q1_1Answer = new javax.swing.JRadioButton();
        Q1_2Answer = new javax.swing.JRadioButton();
        Q1_3Answer = new javax.swing.JRadioButton();
        Q1_4Answer = new javax.swing.JRadioButton();
        Q2Panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Q2_1Answer = new javax.swing.JRadioButton();
        Q2_2Answer = new javax.swing.JRadioButton();
        Q2_3Answer = new javax.swing.JRadioButton();
        Q2_4Answer = new javax.swing.JRadioButton();
        Q3Panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Q3_1Answer = new javax.swing.JRadioButton();
        Q3_2Answer = new javax.swing.JRadioButton();
        Q3_3Answer = new javax.swing.JRadioButton();
        Q3_4Answer = new javax.swing.JRadioButton();
        Q4Panel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Q4_1Answer = new javax.swing.JRadioButton();
        Q4_2Answer = new javax.swing.JRadioButton();
        Q4_3Answer = new javax.swing.JRadioButton();
        Q4_4Answer = new javax.swing.JRadioButton();
        Q5Panel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Q5_1Answer = new javax.swing.JRadioButton();
        Q5_2Answer = new javax.swing.JRadioButton();
        Q5_3Answer = new javax.swing.JRadioButton();
        Q5_4Answer = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(370, 690));
        setMinimumSize(new java.awt.Dimension(370, 690));
        setPreferredSize(new java.awt.Dimension(370, 690));
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

        header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/quizScreen.png"))); // NOI18N
        getContentPane().add(header);
        header.setBounds(-10, 0, 380, 170);

        HeaderBackground.setBackground(new java.awt.Color(249, 6, 6));
        HeaderBackground.setOpaque(true);
        HeaderBackground.setPreferredSize(new java.awt.Dimension(360, 110));
        getContentPane().add(HeaderBackground);
        HeaderBackground.setBounds(0, 0, 360, 110);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(350, 246));
        jPanel2.setMinimumSize(new java.awt.Dimension(350, 246));
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 246));

        Question1Button.setText("Question 1");
        Question1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Question1ButtonActionPerformed(evt);
            }
        });

        Question2Button.setText("Question 2");
        Question2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Question2ButtonActionPerformed(evt);
            }
        });

        Question3Button.setText("Question 3");
        Question3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Question3ButtonActionPerformed(evt);
            }
        });

        Question4Button.setText("Question 4");
        Question4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Question4ButtonActionPerformed(evt);
            }
        });

        Question5Button.setText("Question 5");
        Question5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Question5ButtonActionPerformed(evt);
            }
        });

        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Question1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Question5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Question4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Question3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Question2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(SubmitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Question1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Question2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Question3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Question4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Question5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(340, 235));
        jPanel3.setMinimumSize(new java.awt.Dimension(340, 235));
        jPanel3.setPreferredSize(new java.awt.Dimension(340, 235));

        Q1Panel.setBackground(new java.awt.Color(255, 255, 255));
        Q1Panel.setMaximumSize(new java.awt.Dimension(340, 235));
        Q1Panel.setMinimumSize(new java.awt.Dimension(340, 235));

        jLabel2.setText("<html><b>1.</b> You realise your dad is choking, what is your key action to help him?</html>");

        buttonGroup1.add(Q1_1Answer);
        Q1_1Answer.setText("Give him back blows");

        buttonGroup1.add(Q1_2Answer);
        Q1_2Answer.setText("Give him a drink");

        buttonGroup1.add(Q1_3Answer);
        Q1_3Answer.setText("Make him sick");

        buttonGroup1.add(Q1_4Answer);
        Q1_4Answer.setText("Turn him on his sides");

        javax.swing.GroupLayout Q1PanelLayout = new javax.swing.GroupLayout(Q1Panel);
        Q1Panel.setLayout(Q1PanelLayout);
        Q1PanelLayout.setHorizontalGroup(
            Q1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Q1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Q1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addGroup(Q1PanelLayout.createSequentialGroup()
                        .addGroup(Q1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Q1_4Answer)
                            .addComponent(Q1_3Answer)
                            .addComponent(Q1_2Answer)
                            .addComponent(Q1_1Answer))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Q1PanelLayout.setVerticalGroup(
            Q1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Q1PanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Q1_1Answer)
                .addGap(18, 18, 18)
                .addComponent(Q1_2Answer)
                .addGap(18, 18, 18)
                .addComponent(Q1_3Answer)
                .addGap(18, 18, 18)
                .addComponent(Q1_4Answer)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        Q2Panel.setBackground(new java.awt.Color(255, 255, 255));
        Q2Panel.setMaximumSize(new java.awt.Dimension(340, 235));
        Q2Panel.setMinimumSize(new java.awt.Dimension(340, 235));

        jLabel3.setText("<html><b>2.</b> If someone is choking, what do you need to help them do?</html>");

        buttonGroup2.add(Q2_1Answer);
        Q2_1Answer.setText("Cool down");

        buttonGroup2.add(Q2_2Answer);
        Q2_2Answer.setText("Stop panicking");

        buttonGroup2.add(Q2_3Answer);
        Q2_3Answer.setText("Hold their breath until help arrives");

        buttonGroup2.add(Q2_4Answer);
        Q2_4Answer.setText("Breathe normally again");

        javax.swing.GroupLayout Q2PanelLayout = new javax.swing.GroupLayout(Q2Panel);
        Q2Panel.setLayout(Q2PanelLayout);
        Q2PanelLayout.setHorizontalGroup(
            Q2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Q2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Q2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addGroup(Q2PanelLayout.createSequentialGroup()
                        .addGroup(Q2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Q2_4Answer)
                            .addComponent(Q2_2Answer)
                            .addComponent(Q2_1Answer)
                            .addComponent(Q2_3Answer))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Q2PanelLayout.setVerticalGroup(
            Q2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Q2PanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Q2_1Answer)
                .addGap(18, 18, 18)
                .addComponent(Q2_2Answer)
                .addGap(18, 18, 18)
                .addComponent(Q2_3Answer)
                .addGap(18, 18, 18)
                .addComponent(Q2_4Answer)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        Q3Panel.setBackground(new java.awt.Color(255, 255, 255));
        Q3Panel.setMaximumSize(new java.awt.Dimension(340, 235));
        Q3Panel.setMinimumSize(new java.awt.Dimension(340, 235));

        jLabel4.setText("<html><b>3.</b> Which of the following statements is true if someone is choking?</html>");

        buttonGroup3.add(Q3_1Answer);
        Q3_1Answer.setText("They will be able to breathe but not speak or cough");

        buttonGroup3.add(Q3_2Answer);
        Q3_2Answer.setText("They won't be able to speak, cough or breathe");

        buttonGroup3.add(Q3_3Answer);
        Q3_3Answer.setText("They will be able to speak and cough but not breathe");

        buttonGroup3.add(Q3_4Answer);
        Q3_4Answer.setText("They will be able to speak, cough and breathe normally");

        javax.swing.GroupLayout Q3PanelLayout = new javax.swing.GroupLayout(Q3Panel);
        Q3Panel.setLayout(Q3PanelLayout);
        Q3PanelLayout.setHorizontalGroup(
            Q3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Q3PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Q3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addGroup(Q3PanelLayout.createSequentialGroup()
                        .addGroup(Q3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Q3_4Answer)
                            .addComponent(Q3_1Answer)
                            .addComponent(Q3_2Answer)
                            .addComponent(Q3_3Answer))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Q3PanelLayout.setVerticalGroup(
            Q3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Q3PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Q3_1Answer)
                .addGap(18, 18, 18)
                .addComponent(Q3_2Answer)
                .addGap(18, 18, 18)
                .addComponent(Q3_3Answer)
                .addGap(18, 18, 18)
                .addComponent(Q3_4Answer)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        Q4Panel.setBackground(new java.awt.Color(255, 255, 255));
        Q4Panel.setMaximumSize(new java.awt.Dimension(340, 235));
        Q4Panel.setMinimumSize(new java.awt.Dimension(340, 235));

        jLabel5.setText("<html><b>4.</b> If someone is choking, you give back blows between their shoulder blades. What does this do?</html>");

        buttonGroup4.add(Q4_1Answer);
        Q4_1Answer.setText("<html>It creates a vibration and pressure, which pushes the oject out of their airway</html>");

        buttonGroup4.add(Q4_2Answer);
        Q4_2Answer.setText("<html>It makes them swallow air, which creates pressure and pushes the object down their airway.</html>");

        buttonGroup4.add(Q4_3Answer);
        Q4_3Answer.setText("<html>It makes them sick, which creates pressure and pushes the object out of their airway.</html>");

        buttonGroup4.add(Q4_4Answer);
        Q4_4Answer.setText("None of the above");

        javax.swing.GroupLayout Q4PanelLayout = new javax.swing.GroupLayout(Q4Panel);
        Q4Panel.setLayout(Q4PanelLayout);
        Q4PanelLayout.setHorizontalGroup(
            Q4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Q4PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Q4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Q4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Q4_2Answer, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(Q4_3Answer, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Q4_1Answer, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                        .addComponent(Q4_4Answer, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Q4PanelLayout.setVerticalGroup(
            Q4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Q4PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Q4_1Answer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Q4_2Answer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Q4_3Answer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Q4_4Answer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Q5Panel.setBackground(new java.awt.Color(255, 255, 255));
        Q5Panel.setMaximumSize(new java.awt.Dimension(340, 235));
        Q5Panel.setMinimumSize(new java.awt.Dimension(340, 235));

        jLabel6.setText("<html><b>5.</b> If a person is choking, which of the following should you use to give back blows?</html>");

        buttonGroup5.add(Q5_1Answer);
        Q5_1Answer.setText("A hard object");

        buttonGroup5.add(Q5_2Answer);
        Q5_2Answer.setText("Your fist");

        buttonGroup5.add(Q5_3Answer);
        Q5_3Answer.setText("The heel of your hand");

        buttonGroup5.add(Q5_4Answer);
        Q5_4Answer.setText("Your foot");

        javax.swing.GroupLayout Q5PanelLayout = new javax.swing.GroupLayout(Q5Panel);
        Q5Panel.setLayout(Q5PanelLayout);
        Q5PanelLayout.setHorizontalGroup(
            Q5PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Q5PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Q5PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(Q5PanelLayout.createSequentialGroup()
                        .addGroup(Q5PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Q5_4Answer)
                            .addComponent(Q5_3Answer)
                            .addComponent(Q5_2Answer)
                            .addComponent(Q5_1Answer))
                        .addGap(0, 189, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Q5PanelLayout.setVerticalGroup(
            Q5PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Q5PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Q5_1Answer)
                .addGap(18, 18, 18)
                .addComponent(Q5_2Answer)
                .addGap(18, 18, 18)
                .addComponent(Q5_3Answer)
                .addGap(18, 18, 18)
                .addComponent(Q5_4Answer)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Q1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Q2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Q3Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Q4Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Q5Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(43, Short.MAX_VALUE)
                    .addComponent(Q1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Q2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Q3Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Q4Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Q5Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 120, 370, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        Score points = new Score();
        points.ProgressBar2(calculatePoints());
        points.setVisible(true);
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void Question1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Question1ButtonActionPerformed
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        
        jPanel3.add(Q1Panel);
        jPanel3.repaint();
        jPanel3.revalidate();
    }//GEN-LAST:event_Question1ButtonActionPerformed

    private void Question2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Question2ButtonActionPerformed
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        
        jPanel3.add(Q2Panel);
        jPanel3.repaint();
        jPanel3.revalidate();
    }//GEN-LAST:event_Question2ButtonActionPerformed

    private void Question3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Question3ButtonActionPerformed
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        
        jPanel3.add(Q3Panel);
        jPanel3.repaint();
        jPanel3.revalidate();
    }//GEN-LAST:event_Question3ButtonActionPerformed

    private void Question4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Question4ButtonActionPerformed
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        
        jPanel3.add(Q4Panel);
        jPanel3.repaint();
        jPanel3.revalidate();
    }//GEN-LAST:event_Question4ButtonActionPerformed

    private void Question5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Question5ButtonActionPerformed
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        
        jPanel3.add(Q5Panel);
        jPanel3.repaint();
        jPanel3.revalidate();
    }//GEN-LAST:event_Question5ButtonActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        
        jPanel3.add(Q1Panel);
        jPanel3.repaint();
        jPanel3.revalidate();
    }//GEN-LAST:event_formWindowActivated

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new QuizList().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    
    
       public int calculatePoints(){
           int Points=0;
           if(Q1_1Answer.isSelected()==true){
               Points+=20;
           }
           if(Q2_4Answer.isSelected()==true){
               Points+=20;
           }
           if(Q3_2Answer.isSelected()==true){
              Points+=20;
           } 
           if(Q4_1Answer.isSelected()==true){
              Points+=20;
           }
           if(Q5_3Answer.isSelected()==true){
              Points+=20;
           }
           return Points;
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
            java.util.logging.Logger.getLogger(ChokingQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChokingQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChokingQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChokingQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChokingQuiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HeaderBackground;
    private javax.swing.JPanel Q1Panel;
    private javax.swing.JRadioButton Q1_1Answer;
    private javax.swing.JRadioButton Q1_2Answer;
    private javax.swing.JRadioButton Q1_3Answer;
    private javax.swing.JRadioButton Q1_4Answer;
    private javax.swing.JPanel Q2Panel;
    private javax.swing.JRadioButton Q2_1Answer;
    private javax.swing.JRadioButton Q2_2Answer;
    private javax.swing.JRadioButton Q2_3Answer;
    private javax.swing.JRadioButton Q2_4Answer;
    private javax.swing.JPanel Q3Panel;
    private javax.swing.JRadioButton Q3_1Answer;
    private javax.swing.JRadioButton Q3_2Answer;
    private javax.swing.JRadioButton Q3_3Answer;
    private javax.swing.JRadioButton Q3_4Answer;
    private javax.swing.JPanel Q4Panel;
    private javax.swing.JRadioButton Q4_1Answer;
    private javax.swing.JRadioButton Q4_2Answer;
    private javax.swing.JRadioButton Q4_3Answer;
    private javax.swing.JRadioButton Q4_4Answer;
    private javax.swing.JPanel Q5Panel;
    private javax.swing.JRadioButton Q5_1Answer;
    private javax.swing.JRadioButton Q5_2Answer;
    private javax.swing.JRadioButton Q5_3Answer;
    private javax.swing.JRadioButton Q5_4Answer;
    private javax.swing.JButton Question1Button;
    private javax.swing.JButton Question2Button;
    private javax.swing.JButton Question3Button;
    private javax.swing.JButton Question4Button;
    private javax.swing.JButton Question5Button;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel header;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
