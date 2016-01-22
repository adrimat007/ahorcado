
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import sun.swing.ImageIconUIResource;

/*
1º modo array con varias palabras
2º se pinte de forma automatica el numero de guiones 
3º que el juego tenga fin
 */

/**
 *
 * @author adrian
 */
public class VentanaAhorcado2 extends javax.swing.JFrame {
    
    String palabraOculta = "CETYS";
    int numeroFalllos = 0; 
    public VentanaAhorcado2() {
        initComponents();
        cambiaImagenAhorcado();
        //aqui ca el codigo que poniamos en el run en ACM
    }
    
    private void cambiaImagenAhorcado(){
        String nombreImagen = "";
        
        switch(numeroFalllos){
                case 0:
                 nombreImagen = "/ahorcado_0.png";
                 break;
                 case 1:
                 nombreImagen = "/ahorcado_1.png";
                 break;
                 case 2:
                 nombreImagen = "/ahorcado_2.png";
                 break;
                 case 3:
                 nombreImagen = "/ahorcado_3.png";
                 break;
                 case 4:
                 nombreImagen = "/ahorcado_4.png";
                 break;
                 case 5:
                 nombreImagen = "/ahorcado_5.png";
                 break;
                case 6:
                 nombreImagen = "/ahorcado_fin.png";
                 break;
                case -100:
                    nombreImagen = "/acertasteTodo.png";
                 break;
                default : nombreImagen = "/ahorcado_fin.png";
            }
        ImageIcon imagen = new ImageIcon(getClass().getResource(nombreImagen));
        // despues del switch tendremos el nombreImagen el nombre correcto de la imagen que tenemos que mostrar dependiendo del numero de fallos 
       Image auxiliar = imagen.getImage().getScaledInstance(jLabel2.getWidth(),jLabel2.getHeight() , Image.SCALE_DEFAULT);
       ImageIcon imageIcon = new ImageIcon(auxiliar);
        jLabel2.setIcon(imageIcon);
        
        
    }


  
    private void chequeaLetra(JButton boton){
        if(boton.isEnabled()){
        boton.setEnabled(false);
        String letra = boton.getText();
        String palabraConGuiones = jLabel1.getText();
        if (palabraOculta.contains(letra)){
           for (int i=0; i < palabraOculta.length(); i++ ){
               if (palabraOculta.charAt(i) == letra.charAt(0)){
                   palabraConGuiones =palabraConGuiones.substring(0,2*i)
                           + letra + palabraConGuiones.substring(2*i +1);
               }
           }
           jLabel1.setText(palabraConGuiones);
           //Compruebo si en la palabraCpmGuiones hya quiones o no
           //si hay algun guion no hago nada porque no he advinado todavia la partida
           //si hay guiones, tengo que undicar de alguna forma que he agando al partida
           if (!palabraConGuiones.contains("_")){
               numeroFalllos = -100;
               
           }
        } else {
            numeroFalllos++;
            
        }
        }
      cambiaImagenAhorcado(); 
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        q = new javax.swing.JButton();
        e = new javax.swing.JButton();
        r = new javax.swing.JButton();
        w = new javax.swing.JButton();
        t = new javax.swing.JButton();
        y = new javax.swing.JButton();
        A6 = new javax.swing.JButton();
        A7 = new javax.swing.JButton();
        A8 = new javax.swing.JButton();
        A9 = new javax.swing.JButton();
        A11 = new javax.swing.JButton();
        A12 = new javax.swing.JButton();
        A13 = new javax.swing.JButton();
        A14 = new javax.swing.JButton();
        A16 = new javax.swing.JButton();
        A17 = new javax.swing.JButton();
        A18 = new javax.swing.JButton();
        A19 = new javax.swing.JButton();
        A20 = new javax.swing.JButton();
        A21 = new javax.swing.JButton();
        A22 = new javax.swing.JButton();
        A27 = new javax.swing.JButton();
        A28 = new javax.swing.JButton();
        A29 = new javax.swing.JButton();
        A30 = new javax.swing.JButton();
        A31 = new javax.swing.JButton();
        A32 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("_ _ _ _ _ ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 320, 91));

        q.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        q.setForeground(new java.awt.Color(102, 0, 255));
        q.setText("Q");
        q.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        q.setBorderPainted(false);
        q.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                qMousePressed(evt);
            }
        });
        getContentPane().add(q, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 150, 35, 35));

        e.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        e.setForeground(new java.awt.Color(102, 0, 255));
        e.setText("E");
        e.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        e.setBorderPainted(false);
        e.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eMousePressed(evt);
            }
        });
        getContentPane().add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 150, 35, 35));

        r.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        r.setForeground(new java.awt.Color(102, 0, 255));
        r.setText("R");
        r.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        r.setBorderPainted(false);
        r.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rMousePressed(evt);
            }
        });
        r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rActionPerformed(evt);
            }
        });
        getContentPane().add(r, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 150, 35, 35));

        w.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        w.setForeground(new java.awt.Color(102, 0, 255));
        w.setText("W");
        w.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        w.setBorderPainted(false);
        w.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                wMousePressed(evt);
            }
        });
        getContentPane().add(w, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 150, 35, 35));

        t.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        t.setForeground(new java.awt.Color(102, 0, 255));
        t.setText("T");
        t.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        t.setBorderPainted(false);
        t.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tMousePressed(evt);
            }
        });
        getContentPane().add(t, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 150, 35, 35));

        y.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        y.setForeground(new java.awt.Color(102, 0, 255));
        y.setText("Y");
        y.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        y.setBorderPainted(false);
        y.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                yMousePressed(evt);
            }
        });
        getContentPane().add(y, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 150, 35, 35));

        A6.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        A6.setForeground(new java.awt.Color(102, 0, 255));
        A6.setText("U");
        A6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A6.setBorderPainted(false);
        A6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                A6MousePressed(evt);
            }
        });
        getContentPane().add(A6, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 150, 35, 35));

        A7.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        A7.setForeground(new java.awt.Color(102, 0, 255));
        A7.setText("I");
        A7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A7.setBorderPainted(false);
        A7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                A7MousePressed(evt);
            }
        });
        getContentPane().add(A7, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 150, 35, 35));

        A8.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        A8.setForeground(new java.awt.Color(102, 0, 255));
        A8.setText("O");
        A8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A8.setBorderPainted(false);
        A8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                A8MousePressed(evt);
            }
        });
        getContentPane().add(A8, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 150, 35, 35));

        A9.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        A9.setForeground(new java.awt.Color(102, 0, 255));
        A9.setText("P");
        A9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A9.setBorderPainted(false);
        A9.setFocusPainted(false);
        A9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                A9MousePressed(evt);
            }
        });
        getContentPane().add(A9, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 150, 35, 35));

        A11.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        A11.setForeground(new java.awt.Color(102, 0, 255));
        A11.setText("J");
        A11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A11.setBorderPainted(false);
        A11.setOpaque(false);
        A11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                A11MousePressed(evt);
            }
        });
        getContentPane().add(A11, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 186, 35, 35));

        A12.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        A12.setForeground(new java.awt.Color(102, 0, 255));
        A12.setText("K");
        A12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A12.setBorderPainted(false);
        A12.setOpaque(false);
        A12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                A12MousePressed(evt);
            }
        });
        getContentPane().add(A12, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 186, 35, 35));

        A13.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        A13.setForeground(new java.awt.Color(102, 0, 255));
        A13.setText("L");
        A13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A13.setBorderPainted(false);
        A13.setOpaque(false);
        A13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                A13MousePressed(evt);
            }
        });
        getContentPane().add(A13, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 186, 35, 35));

        A14.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        A14.setForeground(new java.awt.Color(102, 0, 255));
        A14.setText("Ñ");
        A14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A14.setBorderPainted(false);
        A14.setOpaque(false);
        A14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                A14MousePressed(evt);
            }
        });
        getContentPane().add(A14, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 186, 35, 35));

        A16.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        A16.setForeground(new java.awt.Color(102, 0, 255));
        A16.setText("A");
        A16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A16.setBorderPainted(false);
        A16.setOpaque(false);
        A16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                A16MousePressed(evt);
            }
        });
        getContentPane().add(A16, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 186, 35, 35));

        A17.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        A17.setForeground(new java.awt.Color(102, 0, 255));
        A17.setText("D");
        A17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A17.setBorderPainted(false);
        A17.setOpaque(false);
        A17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                A17MousePressed(evt);
            }
        });
        getContentPane().add(A17, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 186, 35, 35));

        A18.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        A18.setForeground(new java.awt.Color(102, 0, 255));
        A18.setText("F");
        A18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A18.setBorderPainted(false);
        A18.setOpaque(false);
        A18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                A18MousePressed(evt);
            }
        });
        getContentPane().add(A18, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 186, 35, 35));

        A19.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        A19.setForeground(new java.awt.Color(102, 0, 255));
        A19.setText("S");
        A19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A19.setBorderPainted(false);
        A19.setOpaque(false);
        A19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                A19MousePressed(evt);
            }
        });
        getContentPane().add(A19, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 186, 35, 35));

        A20.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        A20.setForeground(new java.awt.Color(102, 0, 255));
        A20.setText("G");
        A20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A20.setBorderPainted(false);
        A20.setOpaque(false);
        A20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                A20MousePressed(evt);
            }
        });
        getContentPane().add(A20, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 186, 35, 35));

        A21.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        A21.setForeground(new java.awt.Color(102, 0, 255));
        A21.setText("H");
        A21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A21.setBorderPainted(false);
        A21.setOpaque(false);
        A21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                A21MousePressed(evt);
            }
        });
        getContentPane().add(A21, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 186, 35, 35));

        A22.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        A22.setForeground(new java.awt.Color(102, 0, 255));
        A22.setText("M");
        A22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A22.setBorderPainted(false);
        A22.setOpaque(false);
        A22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                A22MousePressed(evt);
            }
        });
        getContentPane().add(A22, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 230, 35, 35));

        A27.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        A27.setForeground(new java.awt.Color(102, 0, 255));
        A27.setText("Z");
        A27.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A27.setBorderPainted(false);
        A27.setOpaque(false);
        A27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                A27MousePressed(evt);
            }
        });
        getContentPane().add(A27, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 230, 35, 35));

        A28.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        A28.setForeground(new java.awt.Color(102, 0, 255));
        A28.setText("C");
        A28.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A28.setBorderPainted(false);
        A28.setOpaque(false);
        A28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                A28MousePressed(evt);
            }
        });
        getContentPane().add(A28, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 230, 35, 35));

        A29.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        A29.setForeground(new java.awt.Color(102, 0, 255));
        A29.setText("V");
        A29.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A29.setBorderPainted(false);
        A29.setOpaque(false);
        A29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                A29MousePressed(evt);
            }
        });
        getContentPane().add(A29, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 230, 35, 35));

        A30.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        A30.setForeground(new java.awt.Color(102, 0, 255));
        A30.setText("X");
        A30.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A30.setBorderPainted(false);
        A30.setOpaque(false);
        A30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                A30MousePressed(evt);
            }
        });
        getContentPane().add(A30, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 230, 35, 35));

        A31.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        A31.setForeground(new java.awt.Color(102, 0, 255));
        A31.setText("B");
        A31.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A31.setBorderPainted(false);
        A31.setOpaque(false);
        A31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                A31MousePressed(evt);
            }
        });
        getContentPane().add(A31, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 230, 35, 35));

        A32.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        A32.setForeground(new java.awt.Color(102, 0, 255));
        A32.setText("N");
        A32.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        A32.setBorderPainted(false);
        A32.setOpaque(false);
        A32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                A32MousePressed(evt);
            }
        });
        getContentPane().add(A32, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 230, 35, 35));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 470, 150));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 130, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void qMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qMousePressed
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_qMousePressed

    private void eMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eMousePressed
            chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_eMousePressed

    private void rMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rMousePressed
            chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_rMousePressed

    private void rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rActionPerformed
            chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_rActionPerformed

    private void wMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wMousePressed
            chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_wMousePressed

    private void tMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMousePressed
            chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_tMousePressed

    private void yMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yMousePressed
            chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_yMousePressed

    private void A6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A6MousePressed
            chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_A6MousePressed

    private void A7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A7MousePressed
            chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_A7MousePressed

    private void A8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A8MousePressed
            chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_A8MousePressed

    private void A9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A9MousePressed
            chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_A9MousePressed

    private void A11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A11MousePressed
            chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_A11MousePressed

    private void A12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A12MousePressed
            chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_A12MousePressed

    private void A13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A13MousePressed
            chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_A13MousePressed

    private void A14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A14MousePressed
            chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_A14MousePressed

    private void A16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A16MousePressed
            chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_A16MousePressed

    private void A17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A17MousePressed
            chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_A17MousePressed

    private void A18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A18MousePressed
            chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_A18MousePressed

    private void A19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A19MousePressed
            chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_A19MousePressed

    private void A20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A20MousePressed
            chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_A20MousePressed

    private void A21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A21MousePressed
            chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_A21MousePressed

    private void A22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A22MousePressed
            chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_A22MousePressed

    private void A27MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A27MousePressed
        chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_A27MousePressed

    private void A28MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A28MousePressed
            chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_A28MousePressed

    private void A29MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A29MousePressed
            chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_A29MousePressed

    private void A30MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A30MousePressed
           chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_A30MousePressed

    private void A31MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A31MousePressed
            chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_A31MousePressed

    private void A32MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A32MousePressed
            chequeaLetra((JButton)evt.getSource());
    }//GEN-LAST:event_A32MousePressed

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
            java.util.logging.Logger.getLogger(VentanaAhorcado2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAhorcado2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A11;
    private javax.swing.JButton A12;
    private javax.swing.JButton A13;
    private javax.swing.JButton A14;
    private javax.swing.JButton A16;
    private javax.swing.JButton A17;
    private javax.swing.JButton A18;
    private javax.swing.JButton A19;
    private javax.swing.JButton A20;
    private javax.swing.JButton A21;
    private javax.swing.JButton A22;
    private javax.swing.JButton A27;
    private javax.swing.JButton A28;
    private javax.swing.JButton A29;
    private javax.swing.JButton A30;
    private javax.swing.JButton A31;
    private javax.swing.JButton A32;
    private javax.swing.JButton A6;
    private javax.swing.JButton A7;
    private javax.swing.JButton A8;
    private javax.swing.JButton A9;
    private javax.swing.JButton e;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton q;
    private javax.swing.JButton r;
    private javax.swing.JButton t;
    private javax.swing.JButton w;
    private javax.swing.JButton y;
    // End of variables declaration//GEN-END:variables
}
