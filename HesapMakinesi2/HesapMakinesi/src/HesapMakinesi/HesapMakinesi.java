/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HesapMakinesi;

/**
 *
 * @author Lapto-1
 */
public class HesapMakinesi extends javax.swing.JFrame {

    /**
     * Creates new form HesapMakinesi
     */
    double NumEnter1;
    double NumEnter2;
    double Result;     
    String op;
    
    public HesapMakinesi() {
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

        jsonuctext = new javax.swing.JTextField();
        jbtnBackSpace = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtnnokta = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtnCE = new javax.swing.JButton();
        jbtnEsit = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtnC = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtnartieksi = new javax.swing.JButton();
        jbtnEksi = new javax.swing.JButton();
        jbtnBolme = new javax.swing.JButton();
        jbtnArti = new javax.swing.JButton();
        jbtnCarpi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jsonuctext.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jsonuctext.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jsonuctext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsonuctextActionPerformed(evt);
            }
        });

        jbtnBackSpace.setBackground(new java.awt.Color(255, 255, 204));
        jbtnBackSpace.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnBackSpace.setText("<");
        jbtnBackSpace.setPreferredSize(new java.awt.Dimension(75, 70));
        jbtnBackSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackSpaceActionPerformed(evt);
            }
        });

        jbtn7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtn7.setText("7");
        jbtn7.setPreferredSize(new java.awt.Dimension(75, 70));
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });

        jbtn4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtn4.setText("4");
        jbtn4.setPreferredSize(new java.awt.Dimension(75, 70));
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });

        jbtn1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtn1.setText("1");
        jbtn1.setPreferredSize(new java.awt.Dimension(75, 70));
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });

        jbtnnokta.setBackground(new java.awt.Color(255, 255, 204));
        jbtnnokta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnnokta.setText(".");
        jbtnnokta.setPreferredSize(new java.awt.Dimension(75, 70));
        jbtnnokta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnnoktaActionPerformed(evt);
            }
        });

        jbtn0.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtn0.setText("0");
        jbtn0.setPreferredSize(new java.awt.Dimension(75, 70));
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });

        jbtn2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtn2.setText("2");
        jbtn2.setPreferredSize(new java.awt.Dimension(75, 70));
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });

        jbtn5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtn5.setText("5");
        jbtn5.setPreferredSize(new java.awt.Dimension(75, 70));
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });

        jbtn8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtn8.setText("8");
        jbtn8.setPreferredSize(new java.awt.Dimension(75, 70));
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });

        jbtnCE.setBackground(new java.awt.Color(255, 255, 204));
        jbtnCE.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnCE.setText("CE");
        jbtnCE.setPreferredSize(new java.awt.Dimension(75, 70));
        jbtnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCEActionPerformed(evt);
            }
        });

        jbtnEsit.setBackground(new java.awt.Color(102, 0, 0));
        jbtnEsit.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jbtnEsit.setText("=");
        jbtnEsit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnEsit.setPreferredSize(new java.awt.Dimension(75, 70));
        jbtnEsit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEsitActionPerformed(evt);
            }
        });

        jbtn6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtn6.setText("6");
        jbtn6.setPreferredSize(new java.awt.Dimension(75, 70));
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });

        jbtn3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtn3.setText("3");
        jbtn3.setPreferredSize(new java.awt.Dimension(75, 70));
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });

        jbtnC.setBackground(new java.awt.Color(255, 255, 204));
        jbtnC.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnC.setText("C");
        jbtnC.setPreferredSize(new java.awt.Dimension(75, 70));
        jbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCActionPerformed(evt);
            }
        });

        jbtn9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtn9.setText("9");
        jbtn9.setPreferredSize(new java.awt.Dimension(75, 70));
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });

        jbtnartieksi.setBackground(new java.awt.Color(255, 255, 204));
        jbtnartieksi.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnartieksi.setText("+/-");
        jbtnartieksi.setPreferredSize(new java.awt.Dimension(75, 70));
        jbtnartieksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnartieksiActionPerformed(evt);
            }
        });

        jbtnEksi.setBackground(new java.awt.Color(255, 153, 51));
        jbtnEksi.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jbtnEksi.setText("-");
        jbtnEksi.setPreferredSize(new java.awt.Dimension(75, 70));
        jbtnEksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEksiActionPerformed(evt);
            }
        });

        jbtnBolme.setBackground(new java.awt.Color(255, 153, 51));
        jbtnBolme.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnBolme.setText("/");
        jbtnBolme.setPreferredSize(new java.awt.Dimension(75, 70));
        jbtnBolme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBolmeActionPerformed(evt);
            }
        });

        jbtnArti.setBackground(new java.awt.Color(255, 153, 51));
        jbtnArti.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnArti.setText("+");
        jbtnArti.setPreferredSize(new java.awt.Dimension(75, 70));
        jbtnArti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnArtiActionPerformed(evt);
            }
        });

        jbtnCarpi.setBackground(new java.awt.Color(255, 153, 51));
        jbtnCarpi.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnCarpi.setText("x");
        jbtnCarpi.setPreferredSize(new java.awt.Dimension(75, 70));
        jbtnCarpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCarpiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jsonuctext)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnBackSpace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnartieksi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtnC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbtnnokta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnEsit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnEksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnBolme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnArti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnCarpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jsonuctext, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnBackSpace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnartieksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnArti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnEksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnCarpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnBolme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnEsit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnnokta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void EnterNumbers (String q)
    {
        String Nums = jsonuctext.getText() + q;
        jsonuctext.setText(Nums);
    }
            
            
    private void jsonuctextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsonuctextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jsonuctextActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
       EnterNumbers("5"); // TODO add your handling code here:
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
       EnterNumbers("7"); // TODO add your handling code here:
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
       EnterNumbers("8");  // TODO add your handling code here:
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
       EnterNumbers("9"); // TODO add your handling code here:
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
       EnterNumbers("4"); // TODO add your handling code here:
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
       EnterNumbers("6");// TODO add your handling code here:
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
       EnterNumbers("1"); // TODO add your handling code here:
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
        EnterNumbers("2");// TODO add your handling code here:
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
       EnterNumbers("3"); // TODO add your handling code here:
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn0ActionPerformed
       EnterNumbers("0"); // TODO add your handling code here:
    }//GEN-LAST:event_jbtn0ActionPerformed

    private void jbtnBolmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBolmeActionPerformed
        NumEnter1 = Double.parseDouble(jsonuctext.getText());
        jsonuctext.setText("");
        op ="/";
    }//GEN-LAST:event_jbtnBolmeActionPerformed

    private void jbtnCarpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCarpiActionPerformed
        NumEnter1 = Double.parseDouble(jsonuctext.getText());
        jsonuctext.setText("");
        op ="*";
    }//GEN-LAST:event_jbtnCarpiActionPerformed

    private void jbtnEksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEksiActionPerformed
        NumEnter1 = Double.parseDouble(jsonuctext.getText());
        jsonuctext.setText("");
        op ="-";
    }//GEN-LAST:event_jbtnEksiActionPerformed

    private void jbtnArtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnArtiActionPerformed
        NumEnter1 = Double.parseDouble(jsonuctext.getText());
        jsonuctext.setText("");
        op ="+";
    }//GEN-LAST:event_jbtnArtiActionPerformed

    private void jbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCActionPerformed
        jsonuctext.setText("");
    }//GEN-LAST:event_jbtnCActionPerformed

    private void jbtnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCEActionPerformed
        jsonuctext.setText("");
        
        String Fn, Sn;
        
        Fn = String.valueOf(NumEnter1);
        Sn = String.valueOf(NumEnter2);
        
        Fn ="";
        Sn ="";
               
    }//GEN-LAST:event_jbtnCEActionPerformed

    private void jbtnartieksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnartieksiActionPerformed
        double nums = Double.parseDouble(String.valueOf(jsonuctext.getText()));
        nums = nums * (-1);
        jsonuctext.setText(String.valueOf(nums));
    }//GEN-LAST:event_jbtnartieksiActionPerformed

    private void jbtnBackSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackSpaceActionPerformed
        String backSp = null;
        
        if (jsonuctext.getText().length() > 0)
        {
            StringBuilder sb = new StringBuilder(jsonuctext.getText());
            sb.deleteCharAt(jsonuctext.getText().length() - 1);
            backSp = sb.toString();
            jsonuctext.setText(backSp);
        }
    }//GEN-LAST:event_jbtnBackSpaceActionPerformed

    private void jbtnnoktaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnnoktaActionPerformed
      if (! jsonuctext.getText().contains("."))
      {
          jsonuctext.setText(jsonuctext.getText() + jbtnnokta.getText());
      }
    }//GEN-LAST:event_jbtnnoktaActionPerformed

    private void jbtnEsitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEsitActionPerformed
       NumEnter2 = Double.parseDouble(jsonuctext.getText());
       if(op == "+")
       {
           Result = NumEnter1 + NumEnter2;
           jsonuctext.setText(String.valueOf(Result));
       }
       else if(op == "-")
       {
           Result = NumEnter1 - NumEnter2;
           jsonuctext.setText(String.valueOf(Result));
       }
       else if(op == "*")
       {
           Result = NumEnter1 * NumEnter2;
           jsonuctext.setText(String.valueOf(Result));
       }
       else if(op == "/")
       {
           Result = NumEnter1 / NumEnter2;
           jsonuctext.setText(String.valueOf(Result));
       }
    }//GEN-LAST:event_jbtnEsitActionPerformed

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
            java.util.logging.Logger.getLogger(HesapMakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HesapMakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HesapMakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HesapMakinesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HesapMakinesi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnArti;
    private javax.swing.JButton jbtnBackSpace;
    private javax.swing.JButton jbtnBolme;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnCE;
    private javax.swing.JButton jbtnCarpi;
    private javax.swing.JButton jbtnEksi;
    private javax.swing.JButton jbtnEsit;
    private javax.swing.JButton jbtnartieksi;
    private javax.swing.JButton jbtnnokta;
    private javax.swing.JTextField jsonuctext;
    // End of variables declaration//GEN-END:variables
}
