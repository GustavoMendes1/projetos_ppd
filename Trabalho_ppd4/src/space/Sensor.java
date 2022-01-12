package space;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import space.Message;
import static java.lang.Float.parseFloat;
import net.jini.space.JavaSpace;


/**
 *
 * @author Gustavo Mendes
 */
public class Sensor extends javax.swing.JFrame {
    
    
    String tipoSensor;
    String name;
    float atual;
    float maximo;
    float minimo;
    WriteMessage write;
    /** Creates new form NewJFrame */
    public Sensor() {
        initComponents();
        
        setSize(550, 450);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        temperaturaBtn = new javax.swing.JRadioButton();
        umidadeBtn = new javax.swing.JRadioButton();
        velocidadeBtn = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        valorAtual = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        valorMax = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        valorMin = new javax.swing.JTextField();
        atualizar = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        criar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 40, 20));
        getContentPane().add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 430, -1));

        buttonGroup1.add(temperaturaBtn);
        temperaturaBtn.setText("Temperatura");
        getContentPane().add(temperaturaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        buttonGroup1.add(umidadeBtn);
        umidadeBtn.setText("Umidade");
        getContentPane().add(umidadeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        buttonGroup1.add(velocidadeBtn);
        velocidadeBtn.setText("Velocidade");
        velocidadeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                velocidadeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(velocidadeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jLabel2.setText("Tipo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 30, 20));

        valorAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorAtualActionPerformed(evt);
            }
        });
        getContentPane().add(valorAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 170, -1));

        jLabel3.setText("Valor Atual:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 80, 20));

        jLabel4.setText("Valor Max:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 80, 20));

        valorMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorMaxActionPerformed(evt);
            }
        });
        getContentPane().add(valorMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 170, -1));

        jLabel5.setText("Valor Min:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 80, 20));

        valorMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorMinActionPerformed(evt);
            }
        });
        getContentPane().add(valorMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 170, -1));

        atualizar.setText("Atualizar");
        atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarActionPerformed(evt);
            }
        });
        getContentPane().add(atualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 480, 50));

        titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        criar1.setText("Criar");
        criar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criar1ActionPerformed(evt);
            }
        });
        getContentPane().add(criar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 480, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void velocidadeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_velocidadeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_velocidadeBtnActionPerformed

    private void valorAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorAtualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorAtualActionPerformed

    private void valorMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorMaxActionPerformed

    private void valorMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorMinActionPerformed

    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed
        atual = parseFloat(valorAtual.getText());
        maximo = parseFloat(valorMax.getText());
        minimo = parseFloat(valorMin.getText());
        WriteMessage write = new WriteMessage();
        String message="";
        if (atual>maximo){
            message = name +" de "+tipoSensor+ " ultrapassou o valor máximo de "+valorMax.getText()+". Valor atual: " +valorAtual.getText();
        }else if(atual<minimo){
            message = name +" de "+tipoSensor+ " está abaixo do valor mínimo de "+valorMin.getText()+". Valor atual: " +valorAtual.getText();
        }
        write.sendMessage(name+"Notification", message);
    }//GEN-LAST:event_atualizarActionPerformed

    private void criar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criar1ActionPerformed
        criar1.setEnabled(false);
        nome.setEnabled(false);
        umidadeBtn.setEnabled(false);
        temperaturaBtn.setEnabled(false);
        velocidadeBtn.setEnabled(false);
        
        name = nome.getText();
        atual = parseFloat(valorAtual.getText());
        maximo = parseFloat(valorMax.getText());
        minimo = parseFloat(valorMin.getText());
        
        titulo.setText(name);
        
        if(umidadeBtn.isSelected()){
            tipoSensor = umidadeBtn.getText();
        }else if(temperaturaBtn.isSelected()){
            tipoSensor = temperaturaBtn.getText();
        }else{
            tipoSensor = velocidadeBtn.getText();
        }
        write = new WriteMessage();
        write.sendMessage(name,"sensor");
    }//GEN-LAST:event_criar1ActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(Sensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sensor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton criar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nome;
    private javax.swing.JRadioButton temperaturaBtn;
    private javax.swing.JLabel titulo;
    private javax.swing.JRadioButton umidadeBtn;
    private javax.swing.JTextField valorAtual;
    private javax.swing.JTextField valorMax;
    private javax.swing.JTextField valorMin;
    private javax.swing.JRadioButton velocidadeBtn;
    // End of variables declaration//GEN-END:variables

    
    public class WriteMessage {

    public void sendMessage( String name, String message) {
        try {
            System.out.println("Procurando pelo servico JavaSpace...");
            Lookup finder = new Lookup(JavaSpace.class);
            JavaSpace space = (JavaSpace) finder.getService();
            if (space == null) {
                    System.out.println("O servico JavaSpace nao foi encontrado. Encerrando...");
                    System.exit(-1);
            } 
            System.out.println("O servico JavaSpace foi encontrado.");
            System.out.println(space);
            
            Message msg = new Message();
            System.out.println("Cadastrando sensor");
            msg.content = message;
            msg.name = name;
            space.write(msg, null, 60 * 100000);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
}
