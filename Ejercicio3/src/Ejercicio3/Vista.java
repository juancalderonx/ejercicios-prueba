package Ejercicio3;

public class Vista extends javax.swing.JFrame {

    public Vista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        pedirNumeros = new javax.swing.JLabel();
        num1 = new javax.swing.JTextField();
        num2 = new javax.swing.JTextField();
        btnMultiplicacion = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        resultado = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        pedirNumeros1 = new javax.swing.JLabel();
        reiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(51, 153, 255));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pedirNumeros.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        pedirNumeros.setForeground(new java.awt.Color(0, 51, 204));
        pedirNumeros.setText("Por favor, ingrese los números a calcular aquí:");
        panel.add(pedirNumeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 520, 50));

        num1.setBackground(new java.awt.Color(255, 255, 255));
        num1.setFont(new java.awt.Font("Roboto", 1, 21)); // NOI18N
        num1.setForeground(new java.awt.Color(0, 51, 204));
        num1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panel.add(num1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 80, 60));

        num2.setBackground(new java.awt.Color(255, 255, 255));
        num2.setFont(new java.awt.Font("Roboto", 1, 21)); // NOI18N
        num2.setForeground(new java.awt.Color(0, 51, 204));
        num2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panel.add(num2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 80, 60));

        btnMultiplicacion.setBackground(new java.awt.Color(255, 255, 255));
        btnMultiplicacion.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        btnMultiplicacion.setForeground(new java.awt.Color(0, 51, 204));
        btnMultiplicacion.setText("MULTIPLICACIÓN");
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });
        panel.add(btnMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 140, 110));

        btnResta.setBackground(new java.awt.Color(255, 255, 255));
        btnResta.setFont(new java.awt.Font("Roboto", 1, 21)); // NOI18N
        btnResta.setForeground(new java.awt.Color(0, 51, 204));
        btnResta.setText("RESTA");
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });
        panel.add(btnResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 140, 110));

        btnSuma.setBackground(new java.awt.Color(255, 255, 255));
        btnSuma.setFont(new java.awt.Font("Roboto", 1, 21)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(0, 51, 204));
        btnSuma.setText("SUMA");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        panel.add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 140, 110));

        btnDivision.setBackground(new java.awt.Color(255, 255, 255));
        btnDivision.setFont(new java.awt.Font("Roboto", 1, 21)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(0, 51, 204));
        btnDivision.setText("DIVISIÓN");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });
        panel.add(btnDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, 140, 110));

        resultado.setBackground(new java.awt.Color(255, 255, 255));
        resultado.setFont(new java.awt.Font("Roboto", 1, 21)); // NOI18N
        resultado.setForeground(new java.awt.Color(0, 0, 0));
        resultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        resultado.setEnabled(false);
        panel.add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 90, 50));
        panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 220, 970, -1));

        pedirNumeros1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        pedirNumeros1.setForeground(new java.awt.Color(0, 51, 204));
        pedirNumeros1.setText("Resultado:");
        panel.add(pedirNumeros1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 120, 50));

        reiniciar.setBackground(new java.awt.Color(255, 255, 255));
        reiniciar.setFont(new java.awt.Font("Roboto", 1, 21)); // NOI18N
        reiniciar.setForeground(new java.awt.Color(0, 51, 204));
        reiniciar.setText("Reiniciar");
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });
        panel.add(reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        
        int suma = Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText());
        
        resultado.setText(String.valueOf(suma));
        
        
    }//GEN-LAST:event_btnSumaActionPerformed

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        num1.setText("");
        num2.setText("");
        resultado.setText("");
    }//GEN-LAST:event_reiniciarActionPerformed

    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        int resta = Integer.parseInt(num1.getText()) - Integer.parseInt(num2.getText());
        
        resultado.setText(String.valueOf(resta));
    }//GEN-LAST:event_btnRestaActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        int multiplicacion = Integer.parseInt(num1.getText()) * Integer.parseInt(num2.getText());
        
        resultado.setText(String.valueOf(multiplicacion));
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        double division = Integer.parseInt(num1.getText()) / Integer.parseInt(num2.getText());
        
        resultado.setText(String.valueOf(division));
    }//GEN-LAST:event_btnDivisionActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField num1;
    private javax.swing.JTextField num2;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel pedirNumeros;
    private javax.swing.JLabel pedirNumeros1;
    private javax.swing.JButton reiniciar;
    private javax.swing.JTextField resultado;
    // End of variables declaration//GEN-END:variables
}
