/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;


import javax.swing.JOptionPane;


public class circunferencia extends area{
   
    void calcircunferencia(){
        double resultado=0;
        
        double radio=Double.parseDouble(JOptionPane.showInputDialog("ingrese el radio de la circunferencia"));
        
        resultado=(3.14)*(radio*2);
        
        JOptionPane.showMessageDialog(null,"la circunferencia del circulo es: "+resultado);
    }
}
