/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoCurso;
import fatec.poo.model.Curso;
import javax.swing.JOptionPane;

/**
 *
 * @author 0030481623010
 */
public class GuiCurso extends javax.swing.JFrame {

    /**
     * Creates new form GuiCurso
     */
    public GuiCurso() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSiglaCurso = new javax.swing.JLabel();
        lblNomeCurso = new javax.swing.JLabel();
        lblCargaHoraria = new javax.swing.JLabel();
        lblValorCurso = new javax.swing.JLabel();
        lblProgramaCurso = new javax.swing.JLabel();
        lblDtVigencia = new javax.swing.JLabel();
        lblValHora = new javax.swing.JLabel();
        txtSiglaCurso = new javax.swing.JTextField();
        txtNomeCurso = new javax.swing.JTextField();
        txtCargaHoraria = new javax.swing.JTextField();
        txtValorCurso = new javax.swing.JTextField();
        txtProgramaCurso = new javax.swing.JTextField();
        txtValorHoraInstrutor = new javax.swing.JTextField();
        txtDtVigencia = new javax.swing.JFormattedTextField();
        btnConsultar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Curso");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblSiglaCurso.setText("Sigla curso");
        lblSiglaCurso.setName("lblSiglaCurso"); // NOI18N

        lblNomeCurso.setText("Nome curso");
        lblNomeCurso.setName("lblNomeCurso"); // NOI18N

        lblCargaHoraria.setText("Carga horária");
        lblCargaHoraria.setName("lblCargaHoraria"); // NOI18N

        lblValorCurso.setText("Valor curso");
        lblValorCurso.setName("lblValorCurso"); // NOI18N

        lblProgramaCurso.setText("Programa do curso");
        lblProgramaCurso.setName("lblProgramaCurso"); // NOI18N

        lblDtVigencia.setText("Data de vigência");
        lblDtVigencia.setName("lblDtVigencia"); // NOI18N

        lblValHora.setText("Valor hora instrutor");
        lblValHora.setName("lblValorHoraInstru"); // NOI18N

        txtSiglaCurso.setName("txtfSiglaCurso"); // NOI18N

        txtNomeCurso.setEnabled(false);
        txtNomeCurso.setName("txtNomeCurso"); // NOI18N

        txtCargaHoraria.setEnabled(false);
        txtCargaHoraria.setName("txtCargaHoraria"); // NOI18N
        txtCargaHoraria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargaHorariaActionPerformed(evt);
            }
        });

        txtValorCurso.setEnabled(false);
        txtValorCurso.setName("txtValorCurso"); // NOI18N

        txtProgramaCurso.setEnabled(false);
        txtProgramaCurso.setName("txtProgramaCurso"); // NOI18N

        txtValorHoraInstrutor.setEnabled(false);
        txtValorHoraInstrutor.setName("txtValorHoraInstrutor"); // NOI18N

        try {
            txtDtVigencia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDtVigencia.setEnabled(false);
        txtDtVigencia.setName("txtDtVigencia"); // NOI18N
        txtDtVigencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDtVigenciaActionPerformed(evt);
            }
        });

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setEnabled(false);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSiglaCurso)
                            .addComponent(lblNomeCurso)
                            .addComponent(lblCargaHoraria)
                            .addComponent(lblValorCurso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSiglaCurso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValorCurso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblProgramaCurso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtProgramaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDtVigencia, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblValHora, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtValorHoraInstrutor)
                    .addComponent(txtDtVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSiglaCurso)
                    .addComponent(txtSiglaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeCurso)
                    .addComponent(txtNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCargaHoraria)
                            .addComponent(txtCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValorCurso)
                            .addComponent(txtValorCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProgramaCurso)
                            .addComponent(txtProgramaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDtVigencia)
                            .addComponent(txtDtVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValorHoraInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValHora))))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair)
                    .addComponent(btnAlterar)
                    .addComponent(btnInserir))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        txtNomeCurso.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDtVigenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDtVigenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDtVigenciaActionPerformed

    private void txtCargaHorariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargaHorariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargaHorariaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
            if(!this.setCursoObject())
                return;
            daoCurso.inserir(curso);
            
            this.enableFields(false);
            txtSiglaCurso.setEnabled(true);
            
            this.cleanFields();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
       String sigla_curso = txtSiglaCurso.getText();
        if(sigla_curso.length() > 2){
            JOptionPane.showMessageDialog(rootPane,
                "Sigla aceita no maximo 2 caracteres");
            return;
        }
        curso = daoCurso.consultar(sigla_curso);
        
        if(curso == null){
            btnConsultar.setEnabled(false);
            btnInserir.setEnabled(true);
            
            //habilitando outros campos
            this.enableFields(true);
            txtSiglaCurso.setEnabled(false);
            
            txtNomeCurso.requestFocusInWindow();
            return;
        }
        
        btnConsultar.setEnabled(false);
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);
        this.setFieldsByCurso();
        this.enableFields(true);
        txtSiglaCurso.setEnabled(false);
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if(!this.setCursoObject())
            return;
        daoCurso.alterar(curso);
        this.cleanFields();
        
        this.enableFields(false);
        txtSiglaCurso.setEnabled(true);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(!daoCurso.excluir(txtSiglaCurso.getText())){
            JOptionPane.showMessageDialog(rootPane,
                "Exclua as turmas que possuem esse curso primeiro!");
            return;
        }
        this.cleanFields();
        this.enableFields(false);
        
        txtSiglaCurso.setEnabled(true);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//        conexao = new Conexao("SYSTEM","root");
        conexao = new Conexao("BD1713006","BD1713006");
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@apolo:1521:xe");
        daoCurso = new DaoCurso(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void setFieldsByCurso () {
        txtNomeCurso.setText(curso.getNome());
        txtValorCurso.setText(Double.toString(curso.getValor()));
        txtCargaHoraria.setText(Integer.toString(curso.getCargaHoraria()));
        txtValorHoraInstrutor.setText(Double.toString(curso.getValorHoraInstrutor()));
        txtProgramaCurso.setText(curso.getPrograma());
        txtDtVigencia.setText(curso.getDataVigencia());
    }
    
    private boolean setCursoObject () {
        if (txtNomeCurso.getText().isEmpty() ||
            txtDtVigencia.getText().isEmpty() ||
            txtValorCurso.getText().isEmpty() ||
            txtCargaHoraria.getText().isEmpty() ||
            txtValorHoraInstrutor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane,
                "Há dados para serem preenchidos!");
            return false;
        }
        
        String sigla = txtSiglaCurso.getText();
        
        curso = new Curso(sigla, txtNomeCurso.getText());
        curso.setValor(Double.parseDouble(txtValorCurso.getText()));
        curso.setCargaHoraria(Integer.parseInt(txtCargaHoraria.getText()));
        curso.setValorHoraInstrutor(Double.parseDouble(txtValorHoraInstrutor.getText()));
        curso.setPrograma(txtProgramaCurso.getText());
        curso.setDataVigencia(txtDtVigencia.getText());
        
        return true;
    }

    private void enableFields (boolean status) {
        txtNomeCurso.setEnabled(status);
        txtValorCurso.setEnabled(status);
        txtCargaHoraria.setEnabled(status);
        txtValorHoraInstrutor.setEnabled(status);
        txtProgramaCurso.setEnabled(status);
        txtDtVigencia.setEnabled(status);
    }
    
    private void cleanFields () {
        txtNomeCurso.setText("");
        txtValorCurso.setText("");
        txtCargaHoraria.setText("");
        txtValorHoraInstrutor.setText("");
        txtProgramaCurso.setText("");
        txtDtVigencia.setText("");
        
        txtSiglaCurso.requestFocusInWindow();
        
        btnInserir.setEnabled(false);
        btnConsultar.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblCargaHoraria;
    private javax.swing.JLabel lblDtVigencia;
    private javax.swing.JLabel lblNomeCurso;
    private javax.swing.JLabel lblProgramaCurso;
    private javax.swing.JLabel lblSiglaCurso;
    private javax.swing.JLabel lblValHora;
    private javax.swing.JLabel lblValorCurso;
    private javax.swing.JTextField txtCargaHoraria;
    private javax.swing.JFormattedTextField txtDtVigencia;
    private javax.swing.JTextField txtNomeCurso;
    private javax.swing.JTextField txtProgramaCurso;
    private javax.swing.JTextField txtSiglaCurso;
    private javax.swing.JTextField txtValorCurso;
    private javax.swing.JTextField txtValorHoraInstrutor;
    // End of variables declaration//GEN-END:variables
    private Curso curso = null;
    private DaoCurso daoCurso = null;
    private Conexao conexao = null;
}