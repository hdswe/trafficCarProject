/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficcapproject;
import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**
 *
 * @author Abdallah
 */
public class H_Car extends Thread {

    JLabel H_Car;
    JLabel H_Car1;

    @Override
    public void run() {
        H_Car = new JLabel(new ImageIcon(getClass().getResource("car-h.png")));
        H_Car1 = new JLabel(new ImageIcon(getClass().getResource("car1-h.png")));
        H_Car.setSize(60, 30);
         Random R=new Random();
        int value = TrafficControl.speedh.getValue();
        int r=R.nextInt(value-4)+4;
        TrafficControl.carsPanel.add(H_Car);
        TrafficControl.carsPanel.add(H_Car1);
        int X =TrafficControl.carsPanel.getWidth();
        int Y = TrafficControl.carsPanel.getHeight();
        int i = 0;
        for (; i < X+60; i++) {
            H_Car.setBounds(i-40, (Y/2)+30, 60, 30);
             H_Car1.setBounds(i, (Y/2)-60, 60, 30);
            try {
                sleep(r);
            } catch (InterruptedException ex) {
                Logger.getLogger(V_Cars.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (i == 180) {
                
                
                break;
                
            }
        }

//        if(!V_is_passing){
        TrafficControl.c.H_requestPass();
        for (; i < X+60; i++) {
            H_Car.setBounds(i-40,(Y/2)+30, 60, 30);
             H_Car1.setBounds(i, (Y/2)-60, 60, 30);
            try {
            sleep(r);
        } catch (InterruptedException ex) {
            Logger.getLogger(V_Cars.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(i==300){
           TrafficControl.c.H_end_Passing();
           try {
            sleep(r);
            TrafficControl.H.execute(this);
        } catch (InterruptedException ex) {
            Logger.getLogger(V_Cars.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        }
//        }else{
//            System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
//        }
        
        
        
    }
}
