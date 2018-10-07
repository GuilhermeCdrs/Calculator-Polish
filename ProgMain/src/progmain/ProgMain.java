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

            } else if (!x.equals("finish")) {
                
            }
        } while (!x.equals("finish"));
    }
    // Function
    public static void func(String operacao) {
        double pri = test.get(0).getNum(); // First Stack Number
        double seg = test.get(1).getNum(); // Second Cell Number
        double result; // Results of Operations
        if (operacao.equals("+")) {
            result = seg + pri;
            Number t = new Number();
            t.setNum(result);
            test.add(1, t);
            // Removing the first two positions of the ArrayList
            test.remove(0);
            test.remove(1);
        }
        if (operacao.equals("-")) {
            result = seg - pri;
            Number t = new Number();
            t.setNum(result);
            test.add(1, t);
            // Removing the first two positions of the ArrayList
            test.remove(0);
            test.remove(1);
        }
        if (operacao.equals("*")) {
            result = seg * pri;
            Number t = new Number();
            t.setNum(result);
            test.add(1, t);
            // Removing the first two positions of the ArrayList
            test.remove(0);
            test.remove(1);
        }
        if (operacao.equals("/")) {
            if (pri == 0) { // Division by zero not allowed 
                JOptionPane.showMessageDialog(null, "Division by zero not allowed!");
            } else {
                result = seg / pri;
                Number t = new Number();
                t.setNum(result);
                test.add(1, t);
                for (int i = 0; i < test.size(); i++) {
                    System.out.println(test.get(i).getNum() + "\n");
                }
                System.out.println("--------------------\n");
                test.remove(0);
                test.remove(1);
            }
        }
        // Printing Stack
        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i).getNum() + "\n");
        }
        System.out.println("--------------------");
    }
    
    public static void operando() {
        // If the size of the ArrayList is equal to 0 or 1 it can not receive signal
        switch (test.size()) {
            case 0:
                JOptionPane.showMessageDialog(null, "The first element can not be a signal!");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "The second element can not be a signal!");
                break;
            default: // If not, execute func ()
                func(x);
                break;
        }
    }
}
