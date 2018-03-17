
package guia3;

import javax.swing.JOptionPane;


public class area extends Guia1{
    
    void calarea(){
        double resultado=0,diagonal=0;
       
      
            double base=Double.parseDouble(JOptionPane.showInputDialog("ingrese la base"));
            double altura=Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura"));
            
            resultado=base*altura;
            diagonal=Math.sqrt(Math.pow(base,2)+Math.pow(altura,2));
            
            
        JOptionPane.showMessageDialog(null,"el area es: "+resultado+"la diagonal es: "+diagonal);
        
        
    }
    
}
