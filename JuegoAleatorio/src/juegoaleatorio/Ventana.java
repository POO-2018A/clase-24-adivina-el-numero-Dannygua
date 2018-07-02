
package juegoaleatorio;

import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {

Random aleatorio = new Random(System.currentTimeMillis());
int intAletorio = aleatorio.nextInt(1001);
    
    
    public Ventana() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        m1 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        Mensaje1 = new javax.swing.JLabel();
        Mensaje2 = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JButton();
        btnAdivinar = new javax.swing.JButton();
        m2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 153, 51));
        titulo.setText("Adivina el numero");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        m1.setBackground(new java.awt.Color(255, 255, 255));
        m1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        m1.setForeground(new java.awt.Color(0, 153, 51));
        m1.setText("Numero: ");
        getContentPane().add(m1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        txtNumero.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 280, -1));

        Mensaje1.setBackground(new java.awt.Color(255, 255, 255));
        Mensaje1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Mensaje1.setForeground(new java.awt.Color(0, 153, 51));
        getContentPane().add(Mensaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 100, 30));

        Mensaje2.setBackground(new java.awt.Color(255, 255, 255));
        Mensaje2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Mensaje2.setForeground(new java.awt.Color(0, 153, 51));
        getContentPane().add(Mensaje2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 190, 30));

        btnReiniciar.setBackground(new java.awt.Color(255, 255, 255));
        btnReiniciar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnReiniciar.setForeground(new java.awt.Color(0, 153, 51));
        btnReiniciar.setText("Reiniciar Juego");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        btnAdivinar.setBackground(new java.awt.Color(255, 255, 255));
        btnAdivinar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAdivinar.setForeground(new java.awt.Color(0, 153, 51));
        btnAdivinar.setText("Adivinar Numero");
        btnAdivinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdivinarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdivinar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, -1, -1));

        m2.setBackground(new java.awt.Color(255, 255, 255));
        m2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        m2.setForeground(new java.awt.Color(0, 153, 51));
        m2.setText("Tengo un numero entre 1 y 1000. Puede usted adivinarlo?");
        getContentPane().add(m2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText(" Por favor escriba su primer intento");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 611));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdivinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdivinarActionPerformed

        if (!txtNumero.getText().equals("")){
        int numero = Integer.parseInt(txtNumero.getText());
        System.out.println(intAletorio);
        
        if(numero<intAletorio){
            Mensaje2.setText("Demasiado Bajo");
        }else{
            Mensaje2.setText("Demasiado Alto");
            
        }
        
        
        if (numero <intAletorio+11 && numero >intAletorio-11){
            this.getContentPane().setBackground(Color.red);
        }else{
            this.getContentPane().setBackground(Color.blue); 
        }
        
        if (numero== intAletorio){
            
            txtNumero.setEditable(false);
            Mensaje1.setText("Correcto");
            Mensaje2.setText("");
            this.getContentPane().setBackground(Color.orange); 
            
        }else{
            Mensaje1.setText("Incorrecto");
        }
 
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "Ingrese un numero");
        }
    }//GEN-LAST:event_btnAdivinarActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        intAletorio = aleatorio.nextInt(1001);
        Mensaje1.setText("");
        Mensaje2.setText("");
        txtNumero.setText("");
        txtNumero.setEditable(true);
        
    }//GEN-LAST:event_btnReiniciarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Mensaje1;
    private javax.swing.JLabel Mensaje2;
    private javax.swing.JButton btnAdivinar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel m1;
    private javax.swing.JLabel m2;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
