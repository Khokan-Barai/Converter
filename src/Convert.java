/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KHOKAN
 */
public class Convert extends javax.swing.JFrame {

    double result;
    double result2;
    double result3;
    double result4;
    double result5;
    double result6;
    double firstnumber;
    double secondnumber;
     double firstnumber2;
    double secondnumber2;
     double firstnumber3;
    double secondnumber3;
    public Convert() {
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

        textShow1 = new javax.swing.JTextField();
        converT = new javax.swing.JButton();
        textGet1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        again1 = new javax.swing.JButton();
        textShow2 = new javax.swing.JTextField();
        converT1 = new javax.swing.JButton();
        textGet2 = new javax.swing.JTextField();
        again2 = new javax.swing.JButton();
        textShow3 = new javax.swing.JTextField();
        converT2 = new javax.swing.JButton();
        textGet3 = new javax.swing.JTextField();
        again3 = new javax.swing.JButton();
        converT_2 = new javax.swing.JButton();
        converT1_2 = new javax.swing.JButton();
        converT2_2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textShow1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textShow1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textShow1.setText("Celsius");
        textShow1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textShow1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textShow1MouseClicked(evt);
            }
        });
        textShow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textShow1ActionPerformed(evt);
            }
        });

        converT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        converT.setText("To");
        converT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                converTActionPerformed(evt);
            }
        });

        textGet1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textGet1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textGet1.setText("Fahrenheit");
        textGet1.setToolTipText("");
        textGet1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textGet1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textGet1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textGet1FocusLost(evt);
            }
        });
        textGet1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textGet1MouseClicked(evt);
            }
        });
        textGet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textGet1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Converter");

        again1.setText("Again");
        again1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                again1ActionPerformed(evt);
            }
        });

        textShow2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textShow2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textShow2.setText("Kelvin");
        textShow2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textShow2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textShow2MouseClicked(evt);
            }
        });
        textShow2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textShow2ActionPerformed(evt);
            }
        });

        converT1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        converT1.setText("To");
        converT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                converT1ActionPerformed(evt);
            }
        });

        textGet2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textGet2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textGet2.setText("Fahrenheit");
        textGet2.setToolTipText("");
        textGet2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textGet2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textGet2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textGet2FocusLost(evt);
            }
        });
        textGet2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textGet2MouseClicked(evt);
            }
        });
        textGet2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textGet2ActionPerformed(evt);
            }
        });

        again2.setText("Again");
        again2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                again2ActionPerformed(evt);
            }
        });

        textShow3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textShow3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textShow3.setText("Kelvin");
        textShow3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textShow3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textShow3MouseClicked(evt);
            }
        });
        textShow3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textShow3ActionPerformed(evt);
            }
        });

        converT2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        converT2.setText("To");
        converT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                converT2ActionPerformed(evt);
            }
        });

        textGet3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textGet3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textGet3.setText("Celsius");
        textGet3.setToolTipText("");
        textGet3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textGet3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textGet3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textGet3FocusLost(evt);
            }
        });
        textGet3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textGet3MouseClicked(evt);
            }
        });
        textGet3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textGet3ActionPerformed(evt);
            }
        });

        again3.setText("Again");
        again3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                again3ActionPerformed(evt);
            }
        });

        converT_2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        converT_2.setText("To");
        converT_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                converT_2ActionPerformed(evt);
            }
        });

        converT1_2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        converT1_2.setText("To");
        converT1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                converT1_2ActionPerformed(evt);
            }
        });

        converT2_2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        converT2_2.setText("To");
        converT2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                converT2_2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(142, 142, 142))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textGet1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(converT, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(textShow1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(converT_2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textGet2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(converT1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(textShow2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(converT1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(again2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(again1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textGet3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(converT2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textShow3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(converT2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(again3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textShow1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textGet1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(again1)
                    .addComponent(converT_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(converT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textShow2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(converT1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textGet2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(again2)
                    .addComponent(converT1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textShow3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(converT2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textGet3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(again3)
                    .addComponent(converT2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textGet1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textGet1ActionPerformed
       String Enternumber = textGet1.getText();
        textGet1.setText(Enternumber);
    }//GEN-LAST:event_textGet1ActionPerformed

    private void textShow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textShow1ActionPerformed
           String Enternumber2 = textShow1.getText();
             textShow1.setText(Enternumber2);
    }//GEN-LAST:event_textShow1ActionPerformed

    private void converTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_converTActionPerformed
        String answer;
        firstnumber = Double.parseDouble(textGet1.getText());
        result = (firstnumber - 32)/1.8;
        answer = String.format("%.2f", result);
            textShow1.setText(answer);
    }//GEN-LAST:event_converTActionPerformed

    private void textGet1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textGet1FocusLost
    
    }//GEN-LAST:event_textGet1FocusLost

    private void textGet1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textGet1FocusGained

    }//GEN-LAST:event_textGet1FocusGained

    private void textGet1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textGet1MouseClicked
        textGet1.setText("");
    }//GEN-LAST:event_textGet1MouseClicked

    private void textShow2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textShow2ActionPerformed
         String Enternumber2 = textShow2.getText();
             textShow2.setText(Enternumber2);
    }//GEN-LAST:event_textShow2ActionPerformed

    private void converT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_converT1ActionPerformed
        String answer3;
        firstnumber2 = Double.parseDouble(textGet2.getText());
        result3 = (firstnumber2 + 459.67)*0.55555556;
        answer3 = String.format("%.2f", result3);
            textShow2.setText(answer3);
    }//GEN-LAST:event_converT1ActionPerformed

    private void textGet2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textGet2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_textGet2FocusGained

    private void textGet2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textGet2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_textGet2FocusLost

    private void textGet2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textGet2MouseClicked
        textGet2.setText("");
    }//GEN-LAST:event_textGet2MouseClicked

    private void textGet2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textGet2ActionPerformed
        String Enternumber = textGet2.getText();
        textGet2.setText(Enternumber);
    }//GEN-LAST:event_textGet2ActionPerformed

    private void textShow3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textShow3ActionPerformed
        String Enternumber = textShow3.getText();
        textShow3.setText(Enternumber);
    }//GEN-LAST:event_textShow3ActionPerformed

    private void converT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_converT2ActionPerformed
        String answer5;
        firstnumber3 = Double.parseDouble(textGet3.getText());
        result5 = (firstnumber3 + 273);
        answer5 = String.format("%.2f", result5);
            textShow3.setText(answer5);
    }//GEN-LAST:event_converT2ActionPerformed

    private void textGet3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textGet3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_textGet3FocusGained

    private void textGet3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textGet3FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_textGet3FocusLost

    private void textGet3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textGet3MouseClicked
        textGet3.setText("");
    }//GEN-LAST:event_textGet3MouseClicked

    private void textGet3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textGet3ActionPerformed
        String Enternumber = textGet3.getText();
        textGet3.setText(Enternumber);
    }//GEN-LAST:event_textGet3ActionPerformed

    private void again1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_again1ActionPerformed
        textGet1.setText("");
        textShow1.setText("");
        textGet1.setText("Fahrenheit");
        textShow1.setText("Celsius");
    }//GEN-LAST:event_again1ActionPerformed

    private void textShow1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textShow1MouseClicked
        textShow1.setText("");
    }//GEN-LAST:event_textShow1MouseClicked

    private void converT_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_converT_2ActionPerformed
        String answer2;
        secondnumber = Double.parseDouble(textShow1.getText());
        result2 = (secondnumber * 1.8)+32;
        answer2 = String.format("%.2f", result2);
            textGet1.setText(answer2);
    }//GEN-LAST:event_converT_2ActionPerformed

    private void converT1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_converT1_2ActionPerformed
        String answer4;
        secondnumber2 = Double.parseDouble(textShow2.getText());
        result4 = 1.8*(secondnumber2-273)+32;
        answer4 = String.format("%.2f", result4);
            textGet2.setText(answer4);
    }//GEN-LAST:event_converT1_2ActionPerformed

    private void again2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_again2ActionPerformed
        textGet2.setText("");
        textShow2.setText("");
        textGet2.setText("Fahrenheit");
        textShow2.setText("Kelvin");
    }//GEN-LAST:event_again2ActionPerformed

    private void textShow2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textShow2MouseClicked
        textShow2.setText("");
    }//GEN-LAST:event_textShow2MouseClicked

    private void converT2_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_converT2_2ActionPerformed
        String answer6;
        secondnumber3 = Double.parseDouble(textShow3.getText());
        result6 = (secondnumber3 - 273);
        answer6 = String.format("%.2f", result6);
            textGet3.setText(answer6);
    }//GEN-LAST:event_converT2_2ActionPerformed

    private void again3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_again3ActionPerformed
        textGet3.setText("");
        textShow3.setText("");
        textGet3.setText("Celsius");
        textShow3.setText("Kelvin");
    }//GEN-LAST:event_again3ActionPerformed

    private void textShow3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textShow3MouseClicked
        textShow3.setText("");
    }//GEN-LAST:event_textShow3MouseClicked

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
            java.util.logging.Logger.getLogger(Convert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Convert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Convert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Convert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Convert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton again1;
    private javax.swing.JButton again2;
    private javax.swing.JButton again3;
    private javax.swing.JButton converT;
    private javax.swing.JButton converT1;
    private javax.swing.JButton converT1_2;
    private javax.swing.JButton converT2;
    private javax.swing.JButton converT2_2;
    private javax.swing.JButton converT_2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField textGet1;
    private javax.swing.JTextField textGet2;
    private javax.swing.JTextField textGet3;
    private javax.swing.JTextField textShow1;
    private javax.swing.JTextField textShow2;
    private javax.swing.JTextField textShow3;
    // End of variables declaration//GEN-END:variables
}
