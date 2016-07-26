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
public class V_Cars extends Thread {

    JLabel V_Car;
    JLabel V_Car1;
    @Override
    public void run() {
        
        V_Car = new JLabel(new ImageIcon(getClass().getResource("car-v.png")));
        V_Car1 = new JLabel(new ImageIcon(getClass().getResource("car1-v.png")));
        Random R=new Random();
        int value = TrafficControl.speedv.getValue();
        int r=R.nextInt(value-4)+4;
//        System.out.println(value+".."+r);
        TrafficControl.carsPanel.add(V_Car);
        TrafficControl.carsPanel.add(V_Car1);
        int X = TrafficControl.carsPanel.getWidth();
        int Y = TrafficControl.carsPanel.getHeight();
        int i;
        for (i = 0; i < Y+60; i++) {
            V_Car.setBounds((X/2)+30, i, 30, 60);
            V_Car1.setBounds((X/2)-60, i, 30, 60);
                            

            try {
                sleep(r);
            } catch (InterruptedException ex) {
                Logger.getLogger(V_Cars.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (i == 190 ) {
                
                break;
            }
        }
//       if(!H_is_passing){
        TrafficControl.c.V_requestPass();
        for (; i < Y+60 ; i++) {
             V_Car.setBounds((X/2)+30, i, 30, 60);
             V_Car1.setBounds((X/2)-60, i, 30, 60);
             
            try {
                sleep(r);
            } catch (InterruptedException ex) {
                Logger.getLogger(V_Cars.class.getName()).log(Level.SEVERE, null, ex);
            }
        if(i==320)
           TrafficControl.c.V_end_Passing();
        }

        
       
        try {
            sleep(r);
            TrafficControl.V.execute(this);
          
        } catch (InterruptedException ex) {
            Logger.getLogger(V_Cars.class.getName()).log(Level.SEVERE, null, ex);
        }
//       }else{
//           System.out.println("VVVVVVVVVVVVVVVVVVVVVVVVV");
//       }
           

    }
}
