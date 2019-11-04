package fatec.poo.view;


import java.util.ArrayList;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoCurso;
import fatec.poo.control.DaoInstrutor;
import fatec.poo.control.DaoTurma;
import fatec.poo.model.Curso;
import fatec.poo.model.Instrutor;
import fatec.poo.model.Turma;
import java.util.Arrays;

/**
 *
 * @author 0030481623010
 */
public class GuiAlocarInstrutor extends javax.swing.JFrame {

	/**
	 * Creates new form GuiAlocarInstrutor
	 */
	public GuiAlocarInstrutor() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxTurma = new javax.swing.JComboBox<String>();
        cbxCurso = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbxInstrutor = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSituacao = new javax.swing.JTextField();
        btnAlocar = new javax.swing.JButton();
        btnLiberar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        cbxTurma.setEnabled(false);
        cbxTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTurmaActionPerformed(evt);
            }
        });

        cbxCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCursoActionPerformed(evt);
            }
        });

        jLabel1.setText("Curso");

        jLabel2.setText("Turma");

        cbxInstrutor.setEnabled(false);
        cbxInstrutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxInstrutorActionPerformed(evt);
            }
        });

        jLabel3.setText("Instrutor");

        jLabel4.setText("Situação");

        btnAlocar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnAlocar.setText("Alocar");
        btnAlocar.setEnabled(false);
        btnAlocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlocarActionPerformed(evt);
            }
        });

        btnLiberar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnLiberar.setText("Liberar");
        btnLiberar.setEnabled(false);
        btnLiberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiberarActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAlocar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLiberar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxInstrutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlocar)
                    .addComponent(btnLiberar)
                    .addComponent(btnSair))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    
    
    private void btnAlocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlocarActionPerformed
        turma.setInstrutor(instrutor);
        instrutorAlocado();
        daoTurma.alterar(turma);

    }//GEN-LAST:event_btnAlocarActionPerformed

    private void btnLiberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiberarActionPerformed
        turma.setInstrutor(null);
        instrutorLiberado();
        daoTurma.alterar(turma);
    }//GEN-LAST:event_btnLiberarActionPerformed

    private void cbxTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTurmaActionPerformed
       if(cbxTurma.getSelectedItem() == null)
                return;
            //remove all items
            cbxInstrutor.removeAllItems();
            turma = daoTurma.consultar(cbxTurma.getSelectedItem().toString());
            
            //enabled
            cbxInstrutor.setEnabled(true);
            daoInstrutor = new DaoInstrutor(conexao.conectar());
                
            instrutores = daoInstrutor.listarInstrutor();
            
            //add instrutor
            for (Instrutor instrutor : instrutores) {        
                    cbxInstrutor.addItem(instrutor.getNome());
            }
            //tira instrutor do combox
            cbxInstrutor.setSelectedItem(null);
            //bloqueia botoes
            btnAlocar.setEnabled(false);
            btnLiberar.setEnabled(false);
           
            //seleciona instrutor caso ja exista
            if(turma.getInstrutor() != null){
                cbxInstrutor.setSelectedItem(turma.getInstrutor().getNome());
                instrutorAlocado();
            }
    }//GEN-LAST:event_cbxTurmaActionPerformed

	private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened
//		conexao = new Conexao("SYSTEM", "root");
                conexao = new Conexao("BD1713006","BD1713006");
		conexao.setDriver("oracle.jdbc.driver.OracleDriver");
		conexao.setConnectionString("jdbc:oracle:thin:@apolo:1521:xe");
		daoCurso = new DaoCurso(conexao.conectar());

		ArrayList<String> cursos = daoCurso.listarSiglas();
		for (String curso : cursos) {
			cbxCurso.addItem(curso);
		}
	}// GEN-LAST:event_formWindowOpened

	private void cbxCursoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbxCursoActionPerformed
            curso = daoCurso.consultar(cbxCurso.getSelectedItem().toString());
            daoTurma = new DaoTurma(conexao.conectar());
            ArrayList<Turma> turmas = daoTurma.listarTurma(curso);
            
            //remove
            cbxTurma.removeAllItems();
            
            //add on itens
            for (Turma turma : turmas) {
                cbxTurma.addItem(turma.getSiglaTurma());
                curso.addTurma(turma);
            }
            cbxInstrutor.removeAllItems();
            cbxInstrutor.setEnabled(false);
            cbxTurma.setEnabled(true);
            cbxTurma.setSelectedItem(null);
            
            btnAlocar.setEnabled(false);
            btnLiberar.setEnabled(false);
	}
	
	private void cbxInstrutorActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbxInstrutorActionPerformed
            if(instrutores.isEmpty())
                return;
            try{
                instrutor = instrutores.get(cbxInstrutor.getSelectedIndex());
            }catch(Exception e){
                return;
            }
            
            if (turma.getInstrutor() != null &&
                    instrutor.getNome().equals(turma.getInstrutor().getNome())) {
                instrutorAlocado();
            } else {
                instrutorLiberado();
            } 
		
	}// GEN-LAST:event_cbxInstrutorActionPerformed
        
    private void instrutorAlocado() {
        
        btnAlocar.setEnabled(false);
        btnLiberar.setEnabled(true);
        txtSituacao.setText("Alocado");
    }
    
    private void instrutorLiberado() {
        btnAlocar.setEnabled(true);
        btnLiberar.setEnabled(false);
        txtSituacao.setText("Liberado");		
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlocar;
    private javax.swing.JButton btnLiberar;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxCurso;
    private javax.swing.JComboBox<String> cbxInstrutor;
    private javax.swing.JComboBox<String> cbxTurma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtSituacao;
    // End of variables declaration//GEN-END:variables
	private Curso curso = null;
	private DaoCurso daoCurso = null;
	private Turma turma = null;
	private DaoTurma daoTurma = null;
	private Instrutor instrutor = null;
	private DaoInstrutor daoInstrutor = null;
	private Conexao conexao = null;
        private String CPF = null;
        private ArrayList<Instrutor> instrutores = null;

}