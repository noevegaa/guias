/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class jfGuia3 extends javax.swing.JFrame {

    int dato = 0, bat = 0, pixP = 0, pixF = 0, dato9 = 0;
    double dato2 = 0, dato4 = 0, dato7 = 0;
    String dato1 = "", dato3 = "", dato5 = "", dato6 = "", dato8 = "", marca;

 
                // MetodosGuia4 meto=new MetodosGuia4();
     
                 
    
    
    public jfGuia3() {
        initComponents();
        
        
        this.getContentPane().setBackground(Color.orange);
       
        /**btngCamaras.add(rbtnPrincipal);
        btngCamaras.add(rbtnSecundaria);
        btngCamaras.add(rbtnFlash);
        */
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngCamaras = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtCpu = new javax.swing.JTextField();
        jtRam = new javax.swing.JTextField();
        jtTam1 = new javax.swing.JTextField();
        jtGarantia = new javax.swing.JTextField();
        cmbMarca = new javax.swing.JComboBox<>();
        rbtnPrincipal = new javax.swing.JRadioButton();
        rbtnSecundaria = new javax.swing.JRadioButton();
        rbtnFlash = new javax.swing.JRadioButton();
        btnEjecutar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtCampo = new javax.swing.JTextArea();
        txtPrecio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMegapixeles = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtGpu = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtBat = new javax.swing.JTextField();
        txtMegapixeles1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cpu numero de nucleos");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setText("Puntaje de Moviles");

        jLabel3.setText("Tamano de pantallas");

        jLabel4.setText("Cantidad de ram");

        jLabel5.setText("Tiempo de garantia");

        jLabel6.setText("Precio");

        jLabel7.setText("Marca");

        jtCpu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCpuActionPerformed(evt);
            }
        });
        jtCpu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCpuKeyTyped(evt);
            }
        });

        jtRam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtRamActionPerformed(evt);
            }
        });
        jtRam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtRamKeyTyped(evt);
            }
        });

        jtTam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTam1ActionPerformed(evt);
            }
        });
        jtTam1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtTam1KeyTyped(evt);
            }
        });

        jtGarantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtGarantiaActionPerformed(evt);
            }
        });
        jtGarantia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtGarantiaKeyTyped(evt);
            }
        });

        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nexus", "PIixie", "Lenovo", "Huawei", "Sony", "Apple", "Samsung", "Alcatel", "Lg", "Otr" }));
        cmbMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMarcaActionPerformed(evt);
            }
        });

        rbtnPrincipal.setText("Principal");

        rbtnSecundaria.setText("Secundaria");

        rbtnFlash.setText("Flash");

        btnEjecutar.setText("EJECUTAR");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        jtxtCampo.setEditable(false);
        jtxtCampo.setColumns(20);
        jtxtCampo.setRows(5);
        jScrollPane1.setViewportView(jtxtCampo);

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        jLabel8.setText("Camaras:");

        txtMegapixeles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMegapixelesActionPerformed(evt);
            }
        });

        jLabel9.setText("MP principal :");

        jLabel10.setText("GPU:");

        txtGpu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGpuActionPerformed(evt);
            }
        });

        jLabel11.setText("capacidad de bat. en mA.");

        txtBat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBatActionPerformed(evt);
            }
        });
        txtBat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBatKeyTyped(evt);
            }
        });

        txtMegapixeles1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMegapixeles1ActionPerformed(evt);
            }
        });

        jLabel12.setText("MP frontal :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBat, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtRam, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtTam1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(209, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbtnPrincipal)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbtnSecundaria))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(txtGpu, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(rbtnFlash))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(txtMegapixeles1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addGap(16, 16, 16)
                                .addComponent(txtMegapixeles, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(btnEjecutar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtTam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtBat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtnPrincipal)
                        .addComponent(rbtnSecundaria)
                        .addComponent(rbtnFlash))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMegapixeles, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMegapixeles1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEjecutar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtCpuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCpuActionPerformed
       
        
    }//GEN-LAST:event_jtCpuActionPerformed

    private void jtRamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtRamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtRamActionPerformed

    private void jtTam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTam1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTam1ActionPerformed

    private void jtGarantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtGarantiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtGarantiaActionPerformed

    private void cmbMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMarcaActionPerformed

    private void jtCpuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCpuKeyTyped
        char k = evt.getKeyChar();

        dato5 = dato5 + k;
        dato = Integer.parseInt(dato5);
        
        if (dato > 12) {
            JOptionPane.showMessageDialog(null, "NO se permite ingreso mayor a 12");
            jtCpu.setText(null);
            evt.consume();
            dato = 0;
            dato5 = "";
        }

        
       
        if(k<'0' || k>'9'){
            
            evt.consume();       
        }
         int limite=2;
        if(jtCpu.getText().length()==limite){
            evt.consume();
        } 
        
    }//GEN-LAST:event_jtCpuKeyTyped

    public int getBat() {
        return bat;
    }

    public void setBat(int bat) {
        this.bat = bat;
    }

    public int getDato9() {
        return dato9;
    }

    public void setDato9(int dato9) {
        this.dato9 = dato9;
    }

  

    private void jtTam1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTam1KeyTyped
        char k = evt.getKeyChar();

        dato1 = dato1 + k;
        dato2 = Double.parseDouble(dato1);

        if (dato2 < 3.0 || dato2 > 6.7) {
            JOptionPane.showMessageDialog(null, "NO se permite ingreso mayor a 6.7 ni menor a 3.0");
            jtTam1.setText(null);
            evt.consume();
            dato2 = 0;
            dato1 = "";
        }

        if ((k < '0' || k > '9') && k != '.') {
            evt.consume();

        }
        int limite = 3;
        if (jtTam1.getText().length() == limite) {
            evt.consume();

        }

    }//GEN-LAST:event_jtTam1KeyTyped

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void jtRamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtRamKeyTyped
      
        char k = evt.getKeyChar();

        dato3 = dato3 + k;
        dato4 = Double.parseDouble(dato3);

        if (dato4 < 0.5 || dato4 > 6.0) {
            JOptionPane.showMessageDialog(null, "NO se permite ingreso mayor a 6.0 ni menor a 0.5");
            jtRam.setText(null);
            evt.consume();
            dato4 = 0;
            dato3 = "";
        }

        if ((k < '0' || k > '9') && k != '.') {
            evt.consume();

        }
        int limite = 3;
        if (jtRam.getText().length() == limite) {
            evt.consume();
        }

    }//GEN-LAST:event_jtRamKeyTyped

    private void jtGarantiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtGarantiaKeyTyped
      
        char k=evt.getKeyChar();
        
        
        dato6=dato6+k;
        dato9=Integer.parseInt(dato6);
        if(dato9>24){
            JOptionPane.showMessageDialog(null,"NO se permite ingreso mayor a 24");
            jtGarantia.setText(null);
            evt.consume();
            dato9=0;
            dato6="";
        }
        
        
       
        if(k<'0' || k>'9'){
            
            evt.consume();
            
        }
         int limite=2;
        if(jtGarantia.getText().length()==limite){
            evt.consume();
        }

    }//GEN-LAST:event_jtGarantiaKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
         char k=evt.getKeyChar();
         
         dato8=dato8+k;
        dato7=Double.parseDouble(dato8);
        
        if(dato7<0.01 || dato7>999.99){
            JOptionPane.showMessageDialog(null,"NO se permite ingreso mayor a 999.99 ni menor a 0.01");
            txtPrecio.setText(null);
            evt.consume();
            dato7=0;
            dato8="";
        }
         
         if((k<'0' || k>'9') && k!='.'){
            evt.consume();

        }
         int limite=6;
        if(txtPrecio.getText().length()==limite){
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

/*    public int getPixP() {
        return pixP;
    }

    public void setPixP(int pixP) {
        this.pixP = pixP;
    }

    public int getPixF() {
        return pixF;
    }

    public void setPixF(int pixF) {
        this.pixF = pixF;
    }
*/
    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
     /*  meto.BateriaPantalla();
       meto.Pixelaje();
       meto.cpu();
       meto.garantia();
       meto.suma();
       meto.ram();
       meto.rangoPrecio();
       meto.refDeMarca();*/
       
        String camara="";
       marca=String.valueOf((cmbMarca.getSelectedItem()));
      // pixP=Integer.parseInt(String.valueOf(txtMegapixeles));
       
       if(rbtnFlash.isSelected()){
           camara=camara+"Flash ";
       }
         if(rbtnPrincipal.isSelected()){
           camara=camara+"Principal ";
       } if(rbtnSecundaria.isSelected()){
           camara=camara+"Secundaria ";
       }
       
       
        jtxtCampo.setText("el numero del cpu es:"+dato+"\n"+"el tamano de la pantalla es:"+dato2+"\n"+
            "la cantidad de ram es:"+dato4+"\n"+"el numero de garantia es:"+dato6+" meses\n"+"el precio es de: $"+txtPrecio.getText()+"\n"+"marca:"+cmbMarca.getSelectedItem()+"\n"+"Posee camara:"+camara+
                        " de"+txtMegapixeles.getText()+" Megapixeles "+"puntaje ");
        
     
        
    }//GEN-LAST:event_btnEjecutarActionPerformed

   

    

   /* public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


   

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public double getDato2() {
        return dato2;
    }

    public void setDato2(double dato2) {
        this.dato2 = dato2;
    }

    public double getDato4() {
        return dato4;
    }

    public void setDato4(double dato4) {
        this.dato4 = dato4;
    }

    public double getDato7() {
        return dato7;
    }

    public void setDato7(double dato7) {
        this.dato7 = dato7;
    }

    public String getDato1() {
        return dato1;
    }

    public void setDato1(String dato1) {
        this.dato1 = dato1;
    }

    public String getDato3() {
        return dato3;
    }

    public void setDato3(String dato3) {
        this.dato3 = dato3;
    }

    public String getDato5() {
        return dato5;
    }

    public void setDato5(String dato5) {
        this.dato5 = dato5;
    }

    public String getDato6() {
        return dato6;
    }

    public void setDato6(String dato6) {
        this.dato6 = dato6;
    }

    public String getDato8() {
        return dato8;
    }

    public void setDato8(String dato8) {
        this.dato8 = dato8;
    }

    public ButtonGroup getBtngCamaras() {
        return btngCamaras;
    }

    public void setBtngCamaras(ButtonGroup btngCamaras) {
        this.btngCamaras = btngCamaras;
    }

    public JComboBox<String> getCmbMarca() {
        return cmbMarca;
    }

    public void setCmbMarca(JComboBox<String> cmbMarca) {
        this.cmbMarca = cmbMarca;
    }
*/
    private void txtGpuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGpuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGpuActionPerformed

    private void txtBatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBatActionPerformed
     
    }//GEN-LAST:event_txtBatActionPerformed

    private void txtBatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBatKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBatKeyTyped

    private void txtMegapixelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMegapixelesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMegapixelesActionPerformed

    private void txtMegapixeles1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMegapixeles1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMegapixeles1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jfGuia3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfGuia3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfGuia3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfGuia3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfGuia3().setVisible(true);
            }
        });
        MetodosGuia4 meto=new MetodosGuia4();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEjecutar;
    private javax.swing.ButtonGroup btngCamaras;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtCpu;
    private javax.swing.JTextField jtGarantia;
    private javax.swing.JTextField jtRam;
    private javax.swing.JTextField jtTam1;
    private javax.swing.JTextArea jtxtCampo;
    private javax.swing.JRadioButton rbtnFlash;
    private javax.swing.JRadioButton rbtnPrincipal;
    private javax.swing.JRadioButton rbtnSecundaria;
    private javax.swing.JTextField txtBat;
    private javax.swing.JTextField txtGpu;
    private javax.swing.JTextField txtMegapixeles;
    private javax.swing.JTextField txtMegapixeles1;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
