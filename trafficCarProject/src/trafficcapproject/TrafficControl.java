/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficcapproject;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Magic
 */
public class TrafficControl extends javax.swing.JFrame {

    public static ExecutorService V;
    public static ExecutorService H;
    static Controller c;

    /**
     * Creates new form NewJFrame
     */
    public TrafficControl() {
        initComponents();
        c = new Controller();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gpanel = new javax.swing.JPanel();
        carsPanel = new javax.swing.JPanel();
        waitingCars_V = new javax.swing.JLabel();
        waitingCars_H = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        speedh = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        speedv = new javax.swing.JSlider();
        background_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(648, 672));
        setResizable(false);

        gpanel.setLayout(null);

        carsPanel.setOpaque(false);

        jLabel3.setText("سرعة السيارات القادمة");

        speedh.setMajorTickSpacing(2);
        speedh.setMaximum(20);
        speedh.setMinimum(8);
        speedh.setMinorTickSpacing(2);
        speedh.setPaintLabels(true);
        speedh.setPaintTicks(true);
        speedh.setSnapToTicks(true);
        speedh.setToolTipText("");
        speedh.setValue(8);
        speedh.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("سرعة السيارات القادمة");

        speedv.setMajorTickSpacing(2);
        speedv.setMaximum(20);
        speedv.setMinimum(8);
        speedv.setMinorTickSpacing(2);
        speedv.setPaintLabels(true);
        speedv.setPaintTicks(true);
        speedv.setSnapToTicks(true);
        speedv.setToolTipText("");
        speedv.setValue(8);
        speedv.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout carsPanelLayout = new javax.swing.GroupLayout(carsPanel);
        carsPanel.setLayout(carsPanelLayout);
        carsPanelLayout.setHorizontalGroup(
            carsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(speedh, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(carsPanelLayout.createSequentialGroup()
                .addGroup(carsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(carsPanelLayout.createSequentialGroup()
                        .addGroup(carsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(carsPanelLayout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(waitingCars_H, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(carsPanelLayout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(jLabel4)))
                        .addGap(0, 361, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, carsPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(carsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, carsPanelLayout.createSequentialGroup()
                                .addComponent(waitingCars_V, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(speedv, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        carsPanelLayout.setVerticalGroup(
            carsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, carsPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(carsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(waitingCars_V, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(speedv, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(232, 232, 232)
                .addComponent(waitingCars_H, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(speedh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );

        gpanel.add(carsPanel);
        carsPanel.setBounds(0, 0, 640, 640);

        background_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trafficcapproject/road1.jpg"))); // NOI18N
        background_lbl.setOpaque(true);
        gpanel.add(background_lbl);
        background_lbl.setBounds(4, 4, 640, 640);

        getContentPane().add(gpanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws InterruptedException {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrafficControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrafficControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrafficControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrafficControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the form
         */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    Random R = new Random();
                    new TrafficControl().setVisible(true);
                    //(Integer.parseInt(carGnerateV.getText()))/2
                    V = Executors.newFixedThreadPool(3);
                    //speedv.getValue()
                    H = Executors.newFixedThreadPool(3);
                 for (int i = 0; i <10; i++) {
                    
                
                    V.execute(new V_Cars());
                    H.execute(new H_Car());
                 }
              
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background_lbl;
    public static javax.swing.JPanel carsPanel;
    public static javax.swing.JPanel gpanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JSlider speedh;
    public static javax.swing.JSlider speedv;
    public static javax.swing.JLabel waitingCars_H;
    public static javax.swing.JLabel waitingCars_V;
    // End of variables declaration//GEN-END:variables
}
