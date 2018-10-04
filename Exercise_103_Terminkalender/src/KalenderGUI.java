
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dominik
 */
public class KalenderGUI extends javax.swing.JFrame {

    AppointmentModell bl = new AppointmentModell();
    /**
     * Creates new form KalenderGUI
     */
    public KalenderGUI() {
        initComponents();
        
        list.setModel(bl);
        File f = new File("./appointments.bin");
        
        try{
           bl.load(f);   
        }
        catch(Exception e){
            e.printStackTrace();
        }
//        bl.add(new Appointment(10,10,10,10,10,"Hi"));
//        bl.add(new Appointment(10,10,10,10,10,"Hallo"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pmPopup = new javax.swing.JPopupMenu();
        miHinzufügen = new javax.swing.JMenuItem();
        miLöschen = new javax.swing.JMenuItem();
        miAendern = new javax.swing.JMenuItem();
        miSave = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();

        miHinzufügen.setText("Hinzufügen");
        miHinzufügen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miHinzufügenActionPerformed(evt);
            }
        });
        pmPopup.add(miHinzufügen);

        miLöschen.setText("Löschen");
        miLöschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLöschenActionPerformed(evt);
            }
        });
        pmPopup.add(miLöschen);

        miAendern.setText("Ändern");
        miAendern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAendernActionPerformed(evt);
            }
        });
        pmPopup.add(miAendern);

        miSave.setText("Save");
        miSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSaveActionPerformed(evt);
            }
        });
        pmPopup.add(miSave);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Termine:");

        list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        list.setComponentPopupMenu(pmPopup);
        jScrollPane1.setViewportView(list);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 477, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miHinzufügenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miHinzufügenActionPerformed
        KalenderDialog kl = new KalenderDialog(this,true);
        kl.setVisible(true);
        
        if(kl.isOk()){
            Appointment a = kl.getAppointment();
            bl.add(a);
        }
    }//GEN-LAST:event_miHinzufügenActionPerformed

    private void miLöschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLöschenActionPerformed
        int i = list.getSelectedIndex();
        bl.delete(i);
    }//GEN-LAST:event_miLöschenActionPerformed

    private void miSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSaveActionPerformed
        try{
            bl.save(new File("./appointments.bin"));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_miSaveActionPerformed

    private void miAendernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAendernActionPerformed
       KalenderDialog kl = new KalenderDialog(this,true);
       kl.setVisible(true);
       
       if(kl.isOk()){
           Appointment alt = (Appointment) bl.getElementAt(list.getSelectedIndex());
           Appointment neu = kl.getAppointment();
//           bl.change(neu, alt);
           bl.delete(list.getSelectedIndex());
           bl.add(neu);
       }
    }//GEN-LAST:event_miAendernActionPerformed

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
            java.util.logging.Logger.getLogger(KalenderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KalenderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KalenderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KalenderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KalenderGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> list;
    private javax.swing.JMenuItem miAendern;
    private javax.swing.JMenuItem miHinzufügen;
    private javax.swing.JMenuItem miLöschen;
    private javax.swing.JMenuItem miSave;
    private javax.swing.JPopupMenu pmPopup;
    // End of variables declaration//GEN-END:variables
}
