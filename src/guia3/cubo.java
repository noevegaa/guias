
package guia3;


import javax.swing.JOptionPane;


public class cubo extends esfera{
    void volumen2(){
        double resultado=0;
        
        double area=Double.parseDouble(JOptionPane.showInputDialog("ingrese el area del cubo"));
        
        
        resultado=(Math.pow(area,3));
        
        JOptionPane.showMessageDialog(null,"el volumen del cubo es: "+resultado);
    }
}
