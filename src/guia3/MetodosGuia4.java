package guia3;

import javax.swing.JOptionPane;




    public class MetodosGuia4 extends jfGuia3 {

   // int sumapuntaje = 0, garantia = getDato9();
        int sumapuntaje = 0, garantia =0;

   // int nucleos = getDato(), mpxPrincipal = getPixP(), mpxFrontal = getPixF();
        int nucleos = 0, mpxPrincipal =0, mpxFrontal =0;
//int num2 = getBat();
        int num2 = 0;
    //double pant = getDato2(), precio = getDato7(), gb = getDato4();
    double pant = 0, precio = 0, gb = 0;
    //String marca = getMarca();
    int puntuacion=0;
    
    
    
    void BateriaPantalla() {

       

        if (pant<= 4) {
            if (bat<= 1200) {
                puntuacion = 3;
            }
            if (bat > 1200 || bat< 24060) {
                puntuacion = 4;
            }
            if (bat> 2400 && bat< 3100) {
                puntuacion = 5;
            }
            if (bat> 3100) {
                puntuacion= 6;
            }

        }
        if (pant <= 5) {
            if (bat<= 1200) {
                puntuacion = 1;
            }
            if (bat > 1200 || bat < 2400) {
                puntuacion= 2;
            }
            if (bat > 2400 && bat < 3100) {
                puntuacion = 3;
            }
            if (bat > 3100) {
                puntuacion = 4;
            }
        }
        if (pant <= 6) {
            if (bat <= 1200) {
                puntuacion = 0;
            }
            if (bat > 1200 || bat < 2400) {
                puntuacion = 1;
            }
            if (bat > 2400 && bat < 3100) {
                puntuacion = 2;
            }
            if (bat > 3100) {
                puntuacion = 3;
            }
        }
        sumapuntaje = sumapuntaje + puntuacion;
    }

    public int getSumapuntaje() {
        return sumapuntaje;
    }

    public void setSumapuntaje() {
        this.sumapuntaje = sumapuntaje;
    }

    void refDeMarca() {
      
        if (marca.equals("Nexus") || marca.equals("Google") || marca.equals("Lenovo") || marca.equals("Huawei") || marca.equals("Sony") || marca.equals("Apple")) {
            puntuacion = 4;
        }

        if (marca.equals("Samsung") || marca.equals("Alcatel") || marca.equals("Lg")) {
            puntuacion = 3;
        }
        if (marca.equals("Otro")) {
            puntuacion = 2;
        }
        sumapuntaje = sumapuntaje + puntuacion;
    }

    void rangoPrecio() {
       
        if (precio < 100) {
            puntuacion = 2;
        }
        if (precio >= 100 || precio <= 350) {
            puntuacion = 3;
        }
        if (precio > 350) {
            puntuacion= 4;
        }
        sumapuntaje = sumapuntaje + puntuacion;
    }

    void Pixelaje() {
        
        if (mpxPrincipal <= 5) {
            if (mpxFrontal < 2) {
                puntuacion = 1;
            }
            if (mpxFrontal > 2) {
                puntuacion = 2;
            }
        }
        if (mpxPrincipal > 5 && mpxPrincipal <= 8) {
            if (mpxFrontal < 2) {
                puntuacion = 1;
            }
            if (mpxFrontal > 1 && mpxFrontal <= 3) {
                puntuacion = 2;
            }
            if (mpxFrontal > 3) {
                puntuacion = 3;
            }
        }
        if (mpxPrincipal > 8) {
            if (mpxFrontal < 2) {
                puntuacion = 1;
            }
            if (mpxFrontal > 2 && mpxFrontal < 5) {
                puntuacion = 2;
            }
            if (mpxFrontal > 5) {
                puntuacion = 3;
            }
        }
        sumapuntaje = sumapuntaje + puntuacion;
    }

    void garantia() {
        
        if (garantia <= 3) {
            puntuacion = 1;

        }
        if (garantia > 3 || garantia < 6) {
            puntuacion = 2;

        }
        if (garantia > 6) {
            puntuacion = 3;
        }

    }

    void cpu() {
       
        if (nucleos == 2) {
            puntuacion = 0;
        }
        if (nucleos == 4) {
            puntuacion = 1;
        }
        if (nucleos == 6) {
            puntuacion = 2;
        }
        if (nucleos == 8) {
            puntuacion = 3;
        }
        sumapuntaje = sumapuntaje + puntuacion;
    }

    void ram() {
        
        if (gb <= 1) {
            puntuacion = 0;
        }
        if (gb > 1 || gb <= 2) {
            puntuacion = 2;
        }
        if (gb > 2 || gb <= 4) {
            puntuacion = 4;
        }
        if (gb > 4) {
            puntuacion = 6;
        }
        sumapuntaje = sumapuntaje +puntuacion;
    }
        public int suma() {
        int suma=sumapuntaje;
        
        return suma();
    }
    
}



