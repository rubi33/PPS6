/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Kevin
 */
public class InterCalcu extends javax.swing.JFrame
{

    double datoA;
    double datoB = 0.0;
    Boolean dos = false;
    double resultado;
    String ope = "";

    /**
     * Creates new form InterCalcu
     */
    public InterCalcu()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        TCaja = new javax.swing.JTextField();
        TRespuesta = new javax.swing.JTextField();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B0 = new javax.swing.JButton();
        BIgual = new javax.swing.JButton();
        BDel = new javax.swing.JButton();
        BAc = new javax.swing.JButton();
        BMulti = new javax.swing.JButton();
        BDiv = new javax.swing.JButton();
        BSuma = new javax.swing.JButton();
        BResta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TCaja.setEnabled(false);

        TRespuesta.setEnabled(false);

        B1.setText("1");
        B1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                B1ActionPerformed(evt);
            }
        });

        B2.setText("2");
        B2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                B2ActionPerformed(evt);
            }
        });

        B3.setText("3");
        B3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                B3ActionPerformed(evt);
            }
        });

        B4.setText("4");
        B4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                B4ActionPerformed(evt);
            }
        });

        B5.setText("5");
        B5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                B5ActionPerformed(evt);
            }
        });

        B6.setText("6");
        B6.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                B6ActionPerformed(evt);
            }
        });

        B7.setText("7");
        B7.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                B7ActionPerformed(evt);
            }
        });

        B8.setText("8");
        B8.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                B8ActionPerformed(evt);
            }
        });

        B9.setText("9");
        B9.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                B9ActionPerformed(evt);
            }
        });

        B0.setText("0");
        B0.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                B0ActionPerformed(evt);
            }
        });

        BIgual.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BIgual.setText("=");
        BIgual.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BIgualActionPerformed(evt);
            }
        });

        BDel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        BDel.setText("DEL");
        BDel.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BDelActionPerformed(evt);
            }
        });

        BAc.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        BAc.setText("AC");
        BAc.setToolTipText("");
        BAc.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BAcActionPerformed(evt);
            }
        });

        BMulti.setText("X");
        BMulti.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BMultiActionPerformed(evt);
            }
        });

        BDiv.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BDiv.setText("/");
        BDiv.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BDivActionPerformed(evt);
            }
        });

        BSuma.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BSuma.setText("+");
        BSuma.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BSumaActionPerformed(evt);
            }
        });

        BResta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BResta.setText("-");
        BResta.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BRestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TCaja)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B0, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BResta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BDel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BAc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BDel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BResta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void B1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_B1ActionPerformed
    {//GEN-HEADEREND:event_B1ActionPerformed

        TCaja.setText(TCaja.getText() + "1");

    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_B2ActionPerformed
    {//GEN-HEADEREND:event_B2ActionPerformed

        TCaja.setText(TCaja.getText() + "2");

    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_B3ActionPerformed
    {//GEN-HEADEREND:event_B3ActionPerformed

        TCaja.setText(TCaja.getText() + "3");

    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_B4ActionPerformed
    {//GEN-HEADEREND:event_B4ActionPerformed

        TCaja.setText(TCaja.getText() + "4");

    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_B5ActionPerformed
    {//GEN-HEADEREND:event_B5ActionPerformed

        TCaja.setText(TCaja.getText() + "5");

    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_B6ActionPerformed
    {//GEN-HEADEREND:event_B6ActionPerformed

        TCaja.setText(TCaja.getText() + "6");

    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_B7ActionPerformed
    {//GEN-HEADEREND:event_B7ActionPerformed

        TCaja.setText(TCaja.getText() + "7");

    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_B8ActionPerformed
    {//GEN-HEADEREND:event_B8ActionPerformed

        TCaja.setText(TCaja.getText() + "8");

    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_B9ActionPerformed
    {//GEN-HEADEREND:event_B9ActionPerformed

        TCaja.setText(TCaja.getText() + "9");

    }//GEN-LAST:event_B9ActionPerformed

    private void B0ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_B0ActionPerformed
    {//GEN-HEADEREND:event_B0ActionPerformed

        TCaja.setText(TCaja.getText() + "0");

    }//GEN-LAST:event_B0ActionPerformed

    private void BIgualActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BIgualActionPerformed
    {//GEN-HEADEREND:event_BIgualActionPerformed

        datoB = Double.valueOf(TCaja.getText());
        if (datoA != 0.0 && datoB != 0.0)
        {
            switch (ope)
            {
                case "+":
                    resultado = Suma(datoA, datoB);
                    break;
                case "-":
                    resultado = Resta(datoA, datoB);
                    break;
                case "/":
                    resultado = Divicion(datoA, datoB);
                    break;
                case "X":
                    resultado = Multiplicacion(datoA, datoB);
                    break;
            }
            TRespuesta.setText(String.valueOf(resultado));
            datoA = resultado;
        }
        TCaja.setText("");
        datoB = 0.0;

    }//GEN-LAST:event_BIgualActionPerformed

    private void BDelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BDelActionPerformed
    {//GEN-HEADEREND:event_BDelActionPerformed
        if (TCaja.getText().length() != 0)
        {
            TCaja.setText(TCaja.getText().substring(0, TCaja.getText().length() - 1));
        }
    }//GEN-LAST:event_BDelActionPerformed

    private void BAcActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BAcActionPerformed
    {//GEN-HEADEREND:event_BAcActionPerformed
        TCaja.setText("");
        TRespuesta.setText("");
        datoA = 0.0;
        datoB = 0.0;
        resultado = 0.0;
    }//GEN-LAST:event_BAcActionPerformed

    private void BMultiActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BMultiActionPerformed
    {//GEN-HEADEREND:event_BMultiActionPerformed

        TRespuesta.setText("");
        ope = "X";
        if (!TCaja.getText().equals(""))
        {
            if (datoA == 0.0)
            {
                datoA = Double.valueOf(TCaja.getText());
                TCaja.setText("");
            } else
            {
                datoB = Double.valueOf(TCaja.getText());
                switch (ope)
                {
                    case "+":
                        resultado = Suma(datoA, datoB);
                        break;
                    case "-":
                        resultado = Resta(datoA, datoB);
                        break;
                    case "/":
                        resultado = Divicion(datoA, datoB);
                        break;
                    case "X":
                        resultado = Multiplicacion(datoA, datoB);
                        break;
                }
                TRespuesta.setText(String.valueOf(resultado));
                datoA = resultado;
            }
            TCaja.setText("");
            datoB = 0.0;
        }


    }//GEN-LAST:event_BMultiActionPerformed

    private void BDivActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BDivActionPerformed
    {//GEN-HEADEREND:event_BDivActionPerformed

        TRespuesta.setText("");
        ope = "/";
        if (!TCaja.getText().equals(""))
        {
            if (datoA == 0.0)
            {
                datoA = Double.valueOf(TCaja.getText());
                TCaja.setText("");
            } else
            {
                datoB = Double.valueOf(TCaja.getText());
                switch (ope)
                {
                    case "+":
                        resultado = Suma(datoA, datoB);
                        break;
                    case "-":
                        resultado = Resta(datoA, datoB);
                        break;
                    case "/":
                        resultado = Divicion(datoA, datoB);
                        break;
                    case "X":
                        resultado = Multiplicacion(datoA, datoB);
                        break;
                }
                TRespuesta.setText(String.valueOf(resultado));
                datoA = resultado;
            }
            TCaja.setText("");
            datoB = 0.0;
        }

    }//GEN-LAST:event_BDivActionPerformed

    private void BSumaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BSumaActionPerformed
    {//GEN-HEADEREND:event_BSumaActionPerformed

        TRespuesta.setText("");
        ope = "+";
        if (!TCaja.getText().equals(""))
        {
            if (datoA == 0.0)
            {
                datoA = Double.valueOf(TCaja.getText());
                TCaja.setText("");
            } else
            {
                datoB = Double.valueOf(TCaja.getText());
                switch (ope)
                {
                    case "+":
                        resultado = Suma(datoA, datoB);
                        break;
                    case "-":
                        resultado = Resta(datoA, datoB);
                        break;
                    case "/":
                        resultado = Divicion(datoA, datoB);
                        break;
                    case "X":
                        resultado = Multiplicacion(datoA, datoB);
                        break;
                }
                TRespuesta.setText(String.valueOf(resultado));
                datoA = resultado;
            }
            TCaja.setText("");
            datoB = 0.0;
        }

    }//GEN-LAST:event_BSumaActionPerformed

    private void BRestaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BRestaActionPerformed
    {//GEN-HEADEREND:event_BRestaActionPerformed

        TRespuesta.setText("");
        ope = "-";
        if (!TCaja.getText().equals(""))
        {
            if (datoA == 0.0)
            {
                datoA = Double.valueOf(TCaja.getText());
                TCaja.setText("");
            } else
            {
                datoB = Double.valueOf(TCaja.getText());
                switch (ope)
                {
                    case "+":
                        resultado = Suma(datoA, datoB);
                        break;
                    case "-":
                        resultado = Resta(datoA, datoB);
                        break;
                    case "/":
                        resultado = Divicion(datoA, datoB);
                        break;
                    case "X":
                        resultado = Multiplicacion(datoA, datoB);
                        break;
                }
                TRespuesta.setText(String.valueOf(resultado));
                TCaja.setText("");
                datoA = resultado;
            }
            datoB = 0.0;
        }
    }//GEN-LAST:event_BRestaActionPerformed

    public double Multiplicacion(double datoA, double datoB)
    {
        double res = datoA * datoB;
        return res;
    }

    public double Divicion(double datoA, double datoB)
    {
        double res = datoA / datoB;
        return res;
    }

    public double Suma(double datoA, double datoB)
    {
        double res = datoA + datoB;
        return res;
    }

    public double Resta(double datoA, double datoB)
    {
        double res = datoA - datoB;
        return res;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(InterCalcu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(InterCalcu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(InterCalcu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(InterCalcu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new InterCalcu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B0;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton BAc;
    private javax.swing.JButton BDel;
    private javax.swing.JButton BDiv;
    private javax.swing.JButton BIgual;
    private javax.swing.JButton BMulti;
    private javax.swing.JButton BResta;
    private javax.swing.JButton BSuma;
    private javax.swing.JTextField TCaja;
    private javax.swing.JTextField TRespuesta;
    // End of variables declaration//GEN-END:variables
}
