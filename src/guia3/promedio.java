/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;


import javax.swing.JOptionPane;


public class promedio extends cubo{
    void calpromedio(){
        double vector[]=new double[10];
        double suma=0,promedio=0;
        for(int i=0;i<10;i++){
            vector[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese dato "+(i+1)));
            suma=suma+vector[i];
        }
        promedio=suma/10;
        
        JOptionPane.showMessageDialog(null,"el promedio de los datos ingresados es: "+promedio);
        
    }
}
