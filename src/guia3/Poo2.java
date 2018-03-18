
package guia3;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class Poo2 {

  
    void Guia2(){
        
    
        
      Matriz llenar=new Matriz();   
      
        
        int menu=0;
     do{   
        menu=Integer.parseInt(JOptionPane.showInputDialog("que desea realizar\n1.ingresar datos\n2.ordenar datos\n3.mostrar datos"));
     if(menu==1){
       llenar.llenado();  
       
     }
      if(menu==2){
          llenar.ordenado();
      }
      if(menu==3){
          llenar.mostrar();
      }
     
     }while(menu>=1 && menu<=3);
        
        
        
    }
}
    class Matriz{
        
         String vector[]= new String [10]; 
         boolean ordenado=false;
         
         public void llenado(){
           
        
        for(int i=0;i<10;i++){
            vector[i]=JOptionPane.showInputDialog("Ingrese un caracter");
            
        }
        
        }
        
        public void ordenado(){
           ordenado=true;
            for(int i=0;i<10;i++){
                Arrays.sort(vector);
            }
            
          
           
            
        }
        public void mostrar(){
            String cadena="";
            if(ordenado==true){
            System.out.println("ORDENADO:");
            }else if(ordenado==false){
                 System.out.println("SIN ORDENAR");
            }
            for(int i=0;i<10;i++){
               cadena=cadena+vector[i]+" ";
           }
            JOptionPane.showMessageDialog(null,cadena);
        }
}
    

