/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;


import javax.swing.JOptionPane;

/**
 *
 * @author josen
 */
public class Guia1 extends Menu {

    
  void guia(){
        
        area Area=new area();
        circunferencia circulo= new circunferencia();
        esfera volumen= new esfera();
        cubo Area2=new cubo();
        promedio prom=new promedio();
        int menu=0;
        
        menu=Integer.parseInt(JOptionPane.showInputDialog("Que desea realizar:\n1.calcular el area\n2.calcular la circunferencia\n"
                + "3.calcular el volumen de una esfera\n4.calcular el volumen de un cubo\n5.calcular el promedio de 10 datos"));
        
        if(menu==1){
            Area.calarea();
        }
        if(menu==2){
            circulo.calcircunferencia();
        }
        if(menu==3){
            volumen.volumen();
        }
         if(menu==4){
             Area2.volumen2();
         }
         if(menu==5){
             prom.calpromedio();
         }
    }
    
}
