/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progmain;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author guilh
 */
public class ProgMain {
    public static ArrayList<Number> test;
    public static String x;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        test = new ArrayList();
        
        do {  // Input (Menu)
            // If the battery does not have enough numbers 
            if (test.isEmpty() || test.size() == 1) {
                x = JOptionPane.showInputDialog(null, "<< Enter a Number >>\n\n");
            }
            if (test.size() >= 2) {
                x = JOptionPane.showInputDialog(null, "<< Number || Operation >>\n");
            }

            double pri = 0; // First Stack Element
            double seg = 0; // Second stack element
            // Checking if the entry is operators  
            if (x.equals("-")) {

            } else if (x.equals("*")) {

            } else if (x.equals("/")) {

            } else if (x.equals("+")) {

            } else if (!x.equals("sair")) {
                
            }
        } while (!x.equals("finish"));
    }
    
}
