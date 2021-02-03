package calculator;

public class calcu extends javax.swing.JFrame {
    
    public calcu() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        input1 = new javax.swing.JTextField();
        input2 = new javax.swing.JTextField();
        resultdisplay = new javax.swing.JTextField();
        multisign = new javax.swing.JButton();
        divsign = new javax.swing.JButton();
        addsign = new javax.swing.JButton();
        subsign = new javax.swing.JButton();
        modsign = new javax.swing.JButton();
        CLEAR = new javax.swing.JButton();
        firstnum = new javax.swing.JTextField();
        secondnum = new javax.swing.JTextField();
        result = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Swing Arithmetic");

        input1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input1ActionPerformed(evt);
            }
        });

        input2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input2ActionPerformed(evt);
            }
        });

        resultdisplay.setEditable(false);
        resultdisplay.setBackground(new java.awt.Color(240, 240, 240));
        resultdisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultdisplayActionPerformed(evt);
            }
        });

        multisign.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        multisign.setText("*");
        multisign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multisignActionPerformed(evt);
            }
        });

        divsign.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        divsign.setText("/");
        divsign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divsignActionPerformed(evt);
            }
        });

        addsign.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addsign.setText("+");
        addsign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsignActionPerformed(evt);
            }
        });

        subsign.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        subsign.setText("-");
        subsign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subsignActionPerformed(evt);
            }
        });

        modsign.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        modsign.setText("%");
        modsign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modsignActionPerformed(evt);
            }
        });

        CLEAR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CLEAR.setText("CLEAR");
        CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARActionPerformed(evt);
            }
        });

        firstnum.setEditable(false);
        firstnum.setText("First Number");
        firstnum.setBorder(null);

        secondnum.setEditable(false);
        secondnum.setText("Second Number");
        secondnum.setBorder(null);

        result.setEditable(false);
        result.setText("Result");
        result.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modsign, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addsign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(firstnum)
                    .addComponent(multisign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(secondnum, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(result))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(divsign, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(input1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(resultdisplay, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(subsign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(input2)
                    .addComponent(CLEAR, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(firstnum)
                    .addComponent(input1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(secondnum)
                    .addComponent(input2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(result)
                    .addComponent(resultdisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subsign, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addsign, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(multisign, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divsign, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modsign, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input2ActionPerformed

    }//GEN-LAST:event_input2ActionPerformed

    private void resultdisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultdisplayActionPerformed
    }//GEN-LAST:event_resultdisplayActionPerformed

    private void addsignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addsignActionPerformed
        int firstnum=Integer.parseInt(input1.getText());
        int secondnum=Integer.parseInt(input2.getText());
        
        String result = String.valueOf(firstnum+secondnum);
        resultdisplay.setText(result);
    }//GEN-LAST:event_addsignActionPerformed

    private void input1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input1ActionPerformed
    }//GEN-LAST:event_input1ActionPerformed

    private void multisignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multisignActionPerformed
        int firstnum=Integer.parseInt(input1.getText());
        int secondnum=Integer.parseInt(input2.getText());
        
        String result = String.valueOf(firstnum*secondnum);
        resultdisplay.setText(result);
    }//GEN-LAST:event_multisignActionPerformed

    private void modsignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modsignActionPerformed
        int firstnum=Integer.parseInt(input1.getText());
        int secondnum=Integer.parseInt(input2.getText());
        
        String result = String.valueOf(firstnum%secondnum);
        resultdisplay.setText(result);
    }//GEN-LAST:event_modsignActionPerformed

    private void subsignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subsignActionPerformed
       int firstnum=Integer.parseInt(input1.getText());
        int secondnum=Integer.parseInt(input2.getText());
        
        String result = String.valueOf(firstnum-secondnum);
        resultdisplay.setText(result);
    }//GEN-LAST:event_subsignActionPerformed

    private void divsignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divsignActionPerformed
       int firstnum=Integer.parseInt(input1.getText());
        int secondnum=Integer.parseInt(input2.getText());
        
        String result = String.valueOf(firstnum/secondnum);
        resultdisplay.setText(result);
    }//GEN-LAST:event_divsignActionPerformed

    private void CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARActionPerformed
        int firstnum=Integer.parseInt(input1.getText());
        int secondnum=Integer.parseInt(input2.getText());
        
        resultdisplay.setText("");
    }//GEN-LAST:event_CLEARActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calcu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CLEAR;
    private javax.swing.JButton addsign;
    private javax.swing.JButton divsign;
    private javax.swing.JTextField firstnum;
    private javax.swing.JTextField input1;
    private javax.swing.JTextField input2;
    private javax.swing.JButton modsign;
    private javax.swing.JButton multisign;
    private javax.swing.JTextField result;
    private javax.swing.JTextField resultdisplay;
    private javax.swing.JTextField secondnum;
    private javax.swing.JButton subsign;
    // End of variables declaration//GEN-END:variables
}
