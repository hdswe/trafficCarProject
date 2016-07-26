/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficcapproject;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Abdallah
 */
public class Controller {
 static int waiting_H_Cars;
 static  int waiting_V_Cars;
 static boolean H_is_passing;
 static boolean V_is_passing;
 static  int lock_V_Cars;
 static  int lock_H_Cars;
 
 
    private boolean V_car_behind;
    private boolean H_car_behind;
   JLabel JLabel= new JLabel(new ImageIcon(getClass().getResource("cop.png")));
ImageIcon icon = new ImageIcon("cop.png"); 
    synchronized void H_requestPass() {
        lock_H_Cars++;
        System.out.println("H_requestPass()");
         waiting_H_Cars++;
        while(V_is_passing ){
//            TrafficControl.waitingCars_H.setIcon(icon);
                    TrafficControl.carsPanel.add(JLabel);

    //x=130,y=414
             JLabel.setBounds(130, 414, 100, 100);
            try {
              wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        notifyAll();
        H_car_behind=true;
      waiting_H_Cars--;
      H_Start_passing();
    }

  synchronized void V_requestPass() {
      lock_V_Cars++;
      System.out.println("V_requestPass()");
      waiting_V_Cars++;
             while(H_is_passing){
                  TrafficControl.carsPanel.add(JLabel);
                  JLabel.setBounds(412, 145, 100, 100);

            try {
             wait();
                
                wait(); 
            } catch (InterruptedException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
             V_car_behind=true;
        notifyAll();
        waiting_V_Cars--;
        V_Start_passing();
    }

     public void H_Start_passing() {
         System.out.println("H_Start_passing()");
         H_is_passing=true;
         
         
         TrafficControl.carsPanel.add(JLabel);
         JLabel.setBounds(412, 145, 0, 0);
         
    }
     public  void V_Start_passing() {
         System.out.println("V_Start_passing()");
          V_is_passing=true;
          
          TrafficControl.carsPanel.add(JLabel);
         JLabel.setBounds(412, 145, 0, 0);
    }
     

    synchronized void H_end_Passing() {
        lock_H_Cars--;
        System.out.println("H_end_Passing()");
        if(H_car_behind )
        H_is_passing=false;
        
        notifyAll();
        TrafficControl.carsPanel.add(JLabel);
         JLabel.setBounds(412, 145, 0, 0);
       
    }
   synchronized void V_end_Passing() {
       lock_V_Cars--;
       System.out.println("V_end_Passing()");
       if(V_car_behind)
        V_is_passing=false;
        notifyAll();
        TrafficControl.carsPanel.add(JLabel);
         JLabel.setBounds(412, 145, 0, 0);
    }
}
