/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;

import javax.swing.*;

/**
 *
 * @author blhad3491
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Car car1 = new Car ();
        Car car2 = new Car ("Challenger", "Dodge", "Yes", "No", 2018, 27295.99);
        Car car3 = new Car ("z06", "Corvette");
        
        //displaying cars
        JOptionPane.showMessageDialog(null,car1);
        JOptionPane.showMessageDialog(null,car2);
        JOptionPane.showMessageDialog(null,car3);
        
        //honking
        car1.honkTheHorn();
        car2.honkTheHorn();
        car3.littleHorn();
        
        }
                
    }
    

