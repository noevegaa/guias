
package guia3;


import javax.swing.JOptionPane;


public class esfera extends circunferencia{
    
    void volumen(){
    double resultado=0;
        
        double radio=Double.parseDouble(JOptionPane.showInputDialog("ingrese el radio de la esfera"));
        
        
        resultado=(4.18666)*(Math.pow(radio,3));
        
        JOptionPane.showMessageDialog(null,"el volumen de la esfera es: "+resultado);
}
}