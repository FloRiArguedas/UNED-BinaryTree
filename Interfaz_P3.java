
package proyecto3_floricelaarguedas;




public class Interfaz_P3 extends javax.swing.JFrame {

   ArbolBinario arbol;
    public Interfaz_P3() {
        initComponents();
        this.setLocationRelativeTo(null);//Ventana en el centro
        this.setTitle("SISTEMA DE ARBOLES BINARIOS");//Título de ventana
        this.arbol = new ArbolBinario(this);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLa_Tittle = new javax.swing.JLabel();
        jText_NumeroAinsertar = new javax.swing.JTextField();
        jButton_Insertar = new javax.swing.JButton();
        jButton_EliminarNumero = new javax.swing.JButton();
        jButton_MAltura = new javax.swing.JButton();
        jButton_RPreOrden = new javax.swing.JButton();
        jButton_RPostOrden = new javax.swing.JButton();
        jButton_InOrden = new javax.swing.JButton();
        jButton_MostrarNodosHojas = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField_AVISOS = new javax.swing.JTextField();
        jLabel_TextMostrar = new javax.swing.JLabel();
        jLabel_ClicRecorrido = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RESULTADOS = new javax.swing.JTextArea();
        jButton_limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("ARBOLES BINARIOS");

        jLa_Tittle.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        jLa_Tittle.setText("Indique el numero:");

        jText_NumeroAinsertar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jText_NumeroAinsertarKeyTyped(evt);
            }
        });

        jButton_Insertar.setBackground(new java.awt.Color(153, 255, 153));
        jButton_Insertar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jButton_Insertar.setForeground(new java.awt.Color(102, 102, 102));
        jButton_Insertar.setText("INSERTAR AL NODO");
        jButton_Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_InsertarActionPerformed(evt);
            }
        });

        jButton_EliminarNumero.setBackground(new java.awt.Color(204, 0, 0));
        jButton_EliminarNumero.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jButton_EliminarNumero.setForeground(new java.awt.Color(255, 255, 255));
        jButton_EliminarNumero.setText("ELIMINAR DEL NODO");
        jButton_EliminarNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EliminarNumeroActionPerformed(evt);
            }
        });

        jButton_MAltura.setBackground(new java.awt.Color(255, 204, 102));
        jButton_MAltura.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jButton_MAltura.setForeground(new java.awt.Color(102, 102, 102));
        jButton_MAltura.setText("MOSTRAR ALTURA");
        jButton_MAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MAlturaActionPerformed(evt);
            }
        });

        jButton_RPreOrden.setBackground(new java.awt.Color(255, 153, 153));
        jButton_RPreOrden.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        jButton_RPreOrden.setForeground(new java.awt.Color(255, 255, 255));
        jButton_RPreOrden.setText("PRE-ORDEN");
        jButton_RPreOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RPreOrdenActionPerformed(evt);
            }
        });

        jButton_RPostOrden.setBackground(new java.awt.Color(255, 153, 153));
        jButton_RPostOrden.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        jButton_RPostOrden.setForeground(new java.awt.Color(255, 255, 255));
        jButton_RPostOrden.setText("POST - ORDEN");
        jButton_RPostOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RPostOrdenActionPerformed(evt);
            }
        });

        jButton_InOrden.setBackground(new java.awt.Color(255, 153, 153));
        jButton_InOrden.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        jButton_InOrden.setForeground(new java.awt.Color(255, 255, 255));
        jButton_InOrden.setText("IN-ORDEN");
        jButton_InOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_InOrdenActionPerformed(evt);
            }
        });

        jButton_MostrarNodosHojas.setBackground(new java.awt.Color(255, 204, 51));
        jButton_MostrarNodosHojas.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jButton_MostrarNodosHojas.setForeground(new java.awt.Color(102, 102, 102));
        jButton_MostrarNodosHojas.setText("MOSTRAR NODOS HOJAS");
        jButton_MostrarNodosHojas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MostrarNodosHojasActionPerformed(evt);
            }
        });

        jTextField_AVISOS.setEditable(false);
        jTextField_AVISOS.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        jTextField_AVISOS.setForeground(new java.awt.Color(255, 51, 51));

        jLabel_TextMostrar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        jLabel_TextMostrar.setText("De clic en lo que desea mostrar");

        jLabel_ClicRecorrido.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        jLabel_ClicRecorrido.setText("De clic en el tipo de recorrido que desea hacer");

        RESULTADOS.setEditable(false);
        RESULTADOS.setColumns(20);
        RESULTADOS.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        RESULTADOS.setRows(5);
        jScrollPane1.setViewportView(RESULTADOS);

        jButton_limpiar.setBackground(new java.awt.Color(204, 255, 204));
        jButton_limpiar.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jButton_limpiar.setText("LIMPIAR");
        jButton_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButton_Insertar)
                        .addGap(48, 48, 48)
                        .addComponent(jButton_EliminarNumero))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLa_Tittle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jText_NumeroAinsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_AVISOS)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_MAltura)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_MostrarNodosHojas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jButton_RPreOrden)
                        .addGap(29, 29, 29)
                        .addComponent(jButton_RPostOrden)
                        .addGap(33, 33, 33)
                        .addComponent(jButton_InOrden)))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_limpiar)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1092, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(174, 174, 174))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_TextMostrar)
                                .addGap(184, 184, 184)))
                        .addComponent(jLabel_ClicRecorrido)
                        .addGap(72, 72, 72))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_ClicRecorrido)
                            .addComponent(jLabel_TextMostrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_MAltura)
                            .addComponent(jButton_RPreOrden)
                            .addComponent(jButton_RPostOrden)
                            .addComponent(jButton_InOrden)
                            .addComponent(jButton_MostrarNodosHojas))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_AVISOS, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_EliminarNumero)
                            .addComponent(jButton_Insertar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jText_NumeroAinsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLa_Tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_limpiar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void jButton_RPostOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RPostOrdenActionPerformed
        // Llamado a la funcion PostOrden
        RESULTADOS.setText(" ");
        if (!this.arbol.Vacio()) {
            this.arbol.POSTOrden(this.arbol.raizArbol);
        } else {
            jTextField_AVISOS.setText("No se puede recorrer, el árbol esta vacio.");
        }
    }//GEN-LAST:event_jButton_RPostOrdenActionPerformed

    private void jButton_InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_InsertarActionPerformed
        try {
            RESULTADOS.setText(" ");
            // Codigo para insertar
            int numInsert = Integer.parseInt(jText_NumeroAinsertar.getText());
            //REVISAR QUE NO EXISTAR EL VALOR
            if (!this.arbol.HayRepetido(numInsert)) {
                //Llamado a la funcion de insertar
                this.arbol.insertNewNodo(numInsert);
                jTextField_AVISOS.setText("Se agregó exitosamente.");
            }else{
                jTextField_AVISOS.setText("ERROR. NO ES POSIBLE INGRESAR UN VALOR YA EXISTENTE.");
            }
        } catch (NumberFormatException ERROR) {
            jTextField_AVISOS.setText("A OCURRIDO UN ERROR INESPERADO,POR FAVOR INDIQUE UN VALOR.");
        }
    }//GEN-LAST:event_jButton_InsertarActionPerformed

    private void jButton_InOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_InOrdenActionPerformed
        // Accion de recorrer InOrden
        RESULTADOS.setText(" ");
        if (!this.arbol.Vacio()) {
            this.arbol.INOrden(this.arbol.raizArbol);

        } else {
            jTextField_AVISOS.setText("No se puede recorrer, el árbol esta vacio.");
        }
    }//GEN-LAST:event_jButton_InOrdenActionPerformed

    private void jButton_RPreOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RPreOrdenActionPerformed
        // Llamo a funcion para recorrer preorden
        RESULTADOS.setText(" ");
        if (!this.arbol.Vacio()) {
            this.arbol.PREOrden(this.arbol.raizArbol);
        } else {
            jTextField_AVISOS.setText("No se puede recorrer, el árbol esta vacio.");
        }
    }//GEN-LAST:event_jButton_RPreOrdenActionPerformed

    private void jButton_EliminarNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EliminarNumeroActionPerformed
        // Codigo para eliminar un nodo, llamado a la funcion
        RESULTADOS.setText(" ");
        try {
            int numEliminar = Integer.parseInt(jText_NumeroAinsertar.getText());
            if (this.arbol.HayRepetido(numEliminar) == true) {
                if (!this.arbol.Vacio()) {
                    this.arbol.EliminarNodo(numEliminar);
                    jTextField_AVISOS.setText("Eliminacion exitosa.");
                    RESULTADOS.setText(" ");
                } else {
                    jTextField_AVISOS.setText("No se puede eliminar, el árbol esta vacio.");
                }
            } else {

                jTextField_AVISOS.setText("No se puede eliminar, el valor no está en el árbol.");
            }
        } catch (NumberFormatException ERROR) {
            jTextField_AVISOS.setText("A OCURRIDO UN ERROR INESPERADO,POR FAVOR INDIQUE UN VALOR.");
        }
    }//GEN-LAST:event_jButton_EliminarNumeroActionPerformed

    private void jButton_MAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MAlturaActionPerformed
        // Llamo a la funcion para mostrar la altura
        int AlturaArbol = this.arbol.AlturaArbol(this.arbol.raizArbol);
        RESULTADOS.setText(" La Altura del Árbol es: "+AlturaArbol);
    }//GEN-LAST:event_jButton_MAlturaActionPerformed

    private void jButton_MostrarNodosHojasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MostrarNodosHojasActionPerformed
        // Llamado a la funcion
        RESULTADOS.setText(" ");
        if (this.arbol.Vacio() == false) {
            RESULTADOS.setText("Hoja(s) encontrada(s) en el árbol: ");
            this.arbol.Hojas(this.arbol.raizArbol);
        } else {
            jTextField_AVISOS.setText("No existen hojas, el árbol esta vacio.");
        }
    }//GEN-LAST:event_jButton_MostrarNodosHojasActionPerformed

    private void jButton_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_limpiarActionPerformed
        // Limpiar la tabla
        RESULTADOS.setText(" ");
        jTextField_AVISOS.setText(" ");
        jText_NumeroAinsertar.setText("");
    }//GEN-LAST:event_jButton_limpiarActionPerformed

    private void jText_NumeroAinsertarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_NumeroAinsertarKeyTyped
        // Limitar solo numeros 
        char caracter = evt.getKeyChar();
        if ((caracter < '0' || caracter > '9')) {
            evt.consume();
            jTextField_AVISOS.setText("Por favor, solo digite números.");
        }
    }//GEN-LAST:event_jText_NumeroAinsertarKeyTyped

  
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
            java.util.logging.Logger.getLogger(Interfaz_P3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_P3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_P3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_P3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               Interfaz_P3 Interfaz = new Interfaz_P3();
               Interfaz.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea RESULTADOS;
    private javax.swing.JButton jButton_EliminarNumero;
    private javax.swing.JButton jButton_InOrden;
    private javax.swing.JButton jButton_Insertar;
    private javax.swing.JButton jButton_MAltura;
    private javax.swing.JButton jButton_MostrarNodosHojas;
    private javax.swing.JButton jButton_RPostOrden;
    private javax.swing.JButton jButton_RPreOrden;
    private javax.swing.JButton jButton_limpiar;
    private javax.swing.JLabel jLa_Tittle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_ClicRecorrido;
    private javax.swing.JLabel jLabel_TextMostrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTextField jTextField_AVISOS;
    private javax.swing.JTextField jText_NumeroAinsertar;
    // End of variables declaration//GEN-END:variables
}


