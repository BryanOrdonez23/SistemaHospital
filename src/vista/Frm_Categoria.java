
package vista;

import controlador.DAO.CategoriaDAO;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import modelo.Categoria;
import modelo.tabla.CategoriaTabla;

public class Frm_Categoria extends javax.swing.JFrame {

    CategoriaDAO CatDAO = new CategoriaDAO();
    CategoriaTabla mtc = new CategoriaTabla();

    public Frm_Categoria() {
        initComponents();
        setTitle("CATEGORIAS");
        bloquear();
        setLocationRelativeTo(this);
        cargarTabla();

    }

    public void cargarTabla() {
        mtc.setCatDAO(CatDAO);
        tbl_cat.setModel(mtc);
        tbl_cat.updateUI();
    }

    public void limpiar() {
        txt_nombre.setText("");
        txt_descripcion.setText("");
    }

    public void bloquear() {
        txt_nombre.setEnabled(false);
        txt_descripcion.setEnabled(false);
        btn_guardar.setEnabled(false);
        btn_cancelar.setEnabled(false);
        lbl_desc.setEnabled(false);
        lbl_nombre.setEnabled(false);
    }

    public void desbloquear() {
        txt_nombre.setEnabled(true);
        txt_descripcion.setEnabled(true);
        btn_guardar.setEnabled(true);
        btn_cancelar.setEnabled(true);
        lbl_desc.setEnabled(true);
        lbl_nombre.setEnabled(true);
    }

    public boolean validarNombreCategoriaGuardar() {
        CatDAO.setCat(null);
        boolean aux = true;
        for (int i = 0; i < CatDAO.contadorCat(); i++) {
            if (txt_nombre.getText().equalsIgnoreCase(String.valueOf(CatDAO.encontrarCat((Categoria) CatDAO.TodasCat().get(i)).getNombre_cat()))) {
                aux = false;
                JOptionPane.showMessageDialog(this, "El nombre del examen no se puede repetir", "", ERROR_MESSAGE);
            }
        }
        return aux;
    }

    public boolean validarNombreCategoriaEditar() {
        CatDAO.setCat(null);
        boolean aux = true;
        for (int i = 0; i < CatDAO.contadorCat(); i++) {
            if (i == tbl_cat.getSelectedRow()) {

            } else if (txt_nombre.getText().equalsIgnoreCase(String.valueOf(CatDAO.encontrarCat((Categoria) CatDAO.TodasCat().get(i)).getNombre_cat()))) {
                aux = false;
                JOptionPane.showMessageDialog(this, "El nombre del examen no se puede repetir", "", ERROR_MESSAGE);
            }
        }
        return aux;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCategoria = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_desc = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_cat = new javax.swing.JTable();
        btn_nuevo = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelCategoria.setBackground(new java.awt.Color(153, 204, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        lbl_nombre.setText("Nombre:");

        lbl_desc.setText("Descripción:");

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });

        txt_descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_descripcionKeyTyped(evt);
            }
        });

        btn_guardar.setText("GUARDAR");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_desc)
                    .addComponent(lbl_nombre))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nombre)
                    .addComponent(txt_descripcion))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_desc)
                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tbl_cat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Nombre", "Descripción"
            }
        ));
        tbl_cat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_catMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_cat);

        btn_nuevo.setText("NUEVO");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_editar.setText("EDITAR");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_nuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_eliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelCategoriaLayout = new javax.swing.GroupLayout(PanelCategoria);
        PanelCategoria.setLayout(PanelCategoriaLayout);
        PanelCategoriaLayout.setHorizontalGroup(
            PanelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCategoriaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(PanelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelCategoriaLayout.setVerticalGroup(
            PanelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(PanelCategoria, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        if (!txt_descripcion.getText().equals("") && !txt_nombre.getText().equals("")) {
            if (validarNombreCategoriaGuardar()) {
                CatDAO.setCat(null);
                // CatDAO.getCat().setId_categoria(Long.valueOf("1"));
                CatDAO.getCat().setNombre_cat(txt_nombre.getText());
                CatDAO.getCat().setDescripcion_cat(txt_descripcion.getText());
                // CatDAO.getCat().setListaExamen(null);

                CatDAO.setCat(CatDAO.getCat());
                CatDAO.agregarCat(CatDAO.getCat());
                JOptionPane.showMessageDialog(null, "Categoria guardada con exito!", "Guardar", INFORMATION_MESSAGE);
                cargarTabla();
            }
            limpiar();
            bloquear();
        } else {
            JOptionPane.showMessageDialog(null, "Por Favor, llene todos los campos", "Guardar", WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        desbloquear();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        limpiar();
        bloquear();
        JOptionPane.showMessageDialog(null, "Acción cancelada con exito!", "Cancelar", ERROR_MESSAGE);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        int fila = tbl_cat.getSelectedRow();
        if (fila != -1) {
            if (!txt_descripcion.getText().equals("") && !txt_nombre.getText().equals("")) {
                if (validarNombreCategoriaEditar()) {
                    CatDAO.setCat(null);
                    CatDAO.setCat((Categoria) CatDAO.TodasCat().get(fila));

                    Long id = CatDAO.getCat().getId_categoria();
                    CatDAO.setCat(null);
                    CatDAO.getCat().setId_categoria(id);
                    CatDAO.getCat().setNombre_cat(txt_nombre.getText());
                    CatDAO.getCat().setDescripcion_cat(txt_descripcion.getText());
                    // CatDAO.getCat().setListaExamen(null);
                    CatDAO.setCat(CatDAO.getCat());
                    CatDAO.editarCat(CatDAO.getCat());
                    JOptionPane.showMessageDialog(null, "Categoria editada con exito!", "Editar", INFORMATION_MESSAGE);
                    cargarTabla();
                }
                limpiar();
                bloquear();
                tbl_cat.removeRowSelectionInterval(0, tbl_cat.getRowCount() - 1);
            } else {
                JOptionPane.showMessageDialog(null, "Por Favor, llene todos los campos", "Editar", WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "debe seleccionar una fila de la tabla");
        }

    }//GEN-LAST:event_btn_editarActionPerformed

    private void tbl_catMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_catMouseClicked
        int fila = tbl_cat.getSelectedRow();
        System.out.println("fila " + fila);
        txt_nombre.setEnabled(true);
        txt_descripcion.setEnabled(true);
        String nombre = String.valueOf(tbl_cat.getValueAt(fila, 0));
        String descp = String.valueOf(tbl_cat.getValueAt(fila, 1));
        txt_nombre.setText(nombre);
        txt_descripcion.setText(descp);

    }//GEN-LAST:event_tbl_catMouseClicked

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int fila = tbl_cat.getSelectedRow();
        if (fila != -1) {

            CatDAO.setCat(null);
            CatDAO.setCat((Categoria) CatDAO.TodasCat().get(fila));

            CatDAO.setCat(CatDAO.encontrarCat(CatDAO.getCat()));
            CatDAO.eliminarCat(CatDAO.getCat());
            JOptionPane.showMessageDialog(rootPane, "Se elimino con exito!", "Eliminar", INFORMATION_MESSAGE);
            cargarTabla();
            limpiar();

            bloquear();
            tbl_cat.removeRowSelectionInterval(0, tbl_cat.getRowCount() - 1);

        } else {
            JOptionPane.showMessageDialog(rootPane, "debe seleccionar una fila de la tabla", "Eliminar", WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isAlphabetic(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "No se permite el ingreso de numeros");
        }
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_descripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_descripcionKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isAlphabetic(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "No se permite el ingreso de numeros");
        }
    }//GEN-LAST:event_txt_descripcionKeyTyped

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
            java.util.logging.Logger.getLogger(Frm_Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Categoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Categoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel PanelCategoria;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_desc;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JTable tbl_cat;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}