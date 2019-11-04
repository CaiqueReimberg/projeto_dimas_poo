
package fatec.poo.view;

import fatec.poo.model.Curso;
import fatec.poo.model.Matricula;
import fatec.poo.model.Turma;
import fatec.poo.model.APrazo;
import fatec.poo.model.AVista;
import fatec.poo.model.Aluno;
import fatec.poo.control.DaoCurso;
import fatec.poo.control.DaoMatricula;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoAPrazo;
import fatec.poo.control.DaoAVista;
import fatec.poo.control.DaoAluno;
import fatec.poo.control.DaoTurma;

/*@author 0030481613035*/
public class GuiMatricula extends javax.swing.JFrame {

    /**
     * Creates new form GuiMatricula
     */
    public GuiMatricula() {
        initComponents();
    }
    
    private Curso curso;
    private Aluno aluno;
    private Turma turma;
    private DaoCurso daoCurso;
    private DaoTurma daoTurma;
    private DaoAluno daoAluno;
    private Conexao conexao;
    private Matricula matricula;
    private DaoAVista daoAVista;
    private DaoAPrazo daoAPrazo;
    private AVista aVista;
    private APrazo aPrazo;
    private DaoMatricula daoMatricula;
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtDtMatricula = new javax.swing.JFormattedTextField();
        lblDtMatricula = new javax.swing.JLabel();
        lblCurso = new javax.swing.JLabel();
        cbxCurso = new javax.swing.JComboBox<String>();
        txtValor = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        lblTurma = new javax.swing.JLabel();
        cbxTurma = new javax.swing.JComboBox<String>();
        lblCpfAluno = new javax.swing.JLabel();
        txtCpfAluno = new javax.swing.JFormattedTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        pnPagamento = new javax.swing.JPanel();
        jRbtnAVista = new javax.swing.JRadioButton();
        jRbtnParcelado = new javax.swing.JRadioButton();
        lblAgencia = new javax.swing.JLabel();
        txtAgencia = new javax.swing.JTextField();
        lblQtdeMensalidade = new javax.swing.JLabel();
        txtQtdeMensalidade = new javax.swing.JTextField();
        lblNoCheque = new javax.swing.JLabel();
        txtCheque = new javax.swing.JTextField();
        lblTxJuros = new javax.swing.JLabel();
        txtTxJuros = new javax.swing.JTextField();
        txtDtPagamento = new javax.swing.JFormattedTextField();
        lblDtPagamento = new javax.swing.JLabel();
        txtDt1Vencto = new javax.swing.JFormattedTextField();
        lblDt1Pagamento = new javax.swing.JLabel();
        btnInserir = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Efetuar Matrícula");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        try {
            txtDtMatricula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDtMatricula.setEnabled(false);

        lblDtMatricula.setText("Data da Matrícula");

        lblCurso.setText("Curso");

        cbxCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCursoActionPerformed(evt);
            }
        });

        txtValor.setEnabled(false);
        txtValor.setName("txtValor"); // NOI18N

        lblValor.setText("Valor");
        lblValor.setName("lblValor"); // NOI18N

        lblTurma.setText("Turma");

        cbxTurma.setEnabled(false);
        cbxTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTurmaActionPerformed(evt);
            }
        });

        lblCpfAluno.setText("CPF Aluno");

        try {
            txtCpfAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpfAluno.setEnabled(false);
        txtCpfAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfAlunoActionPerformed(evt);
            }
        });

        lblNome.setText("Nome");

        txtNome.setEnabled(false);

        pnPagamento.setBorder(javax.swing.BorderFactory.createTitledBorder("Pagamento"));
        pnPagamento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnPagamento.setEnabled(false);
        pnPagamento.setName(""); // NOI18N

        jRbtnAVista.setText("À Vista");
        jRbtnAVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbtnAVistaActionPerformed(evt);
            }
        });

        jRbtnParcelado.setText("Parcelado");
        jRbtnParcelado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbtnParceladoActionPerformed(evt);
            }
        });

        lblAgencia.setText("Agência");
        lblAgencia.setName("lblValor"); // NOI18N

        txtAgencia.setEnabled(false);
        txtAgencia.setName("txtValor"); // NOI18N

        lblQtdeMensalidade.setText("Qtde. Mensalidades");
        lblQtdeMensalidade.setName("lblValor"); // NOI18N

        txtQtdeMensalidade.setEnabled(false);
        txtQtdeMensalidade.setName("txtValor"); // NOI18N

        lblNoCheque.setText("No. Cheque");
        lblNoCheque.setName("lblValor"); // NOI18N

        txtCheque.setEnabled(false);
        txtCheque.setName("txtValor"); // NOI18N

        lblTxJuros.setText("Tx. de Juros");
        lblTxJuros.setName("lblValor"); // NOI18N

        txtTxJuros.setEnabled(false);
        txtTxJuros.setName("txtValor"); // NOI18N

        try {
            txtDtPagamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDtPagamento.setEnabled(false);

        lblDtPagamento.setText("Data Pagam.");

        try {
            txtDt1Vencto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDt1Vencto.setEnabled(false);

        lblDt1Pagamento.setText("Data 1o. Vencto.");

        javax.swing.GroupLayout pnPagamentoLayout = new javax.swing.GroupLayout(pnPagamento);
        pnPagamento.setLayout(pnPagamentoLayout);
        pnPagamentoLayout.setHorizontalGroup(
            pnPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRbtnParcelado)
                    .addComponent(jRbtnAVista))
                .addGap(37, 37, 37)
                .addGroup(pnPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnPagamentoLayout.createSequentialGroup()
                        .addComponent(lblQtdeMensalidade)
                        .addGap(18, 18, 18)
                        .addComponent(txtQtdeMensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnPagamentoLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(lblAgencia)
                        .addGap(18, 18, 18)
                        .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNoCheque)
                    .addComponent(lblTxJuros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTxJuros, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPagamentoLayout.createSequentialGroup()
                        .addComponent(lblDtPagamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDtPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnPagamentoLayout.createSequentialGroup()
                        .addComponent(lblDt1Pagamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDt1Vencto, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnPagamentoLayout.setVerticalGroup(
            pnPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPagamentoLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(pnPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRbtnAVista)
                    .addComponent(lblAgencia)
                    .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDtPagamento)
                    .addComponent(txtDtPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNoCheque))
                .addGap(28, 28, 28)
                .addGroup(pnPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRbtnParcelado)
                    .addComponent(lblQtdeMensalidade)
                    .addComponent(txtQtdeMensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTxJuros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDt1Pagamento)
                    .addComponent(txtDt1Vencto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTxJuros))
                .addContainerGap())
        );

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setEnabled(false);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setEnabled(false);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
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

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCurso)
                            .addComponent(lblTurma)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDtMatricula)
                                    .addComponent(lblCpfAluno))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCpfAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(txtDtMatricula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxTurma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblValor))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(146, 146, 146))))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnConsultar, btnExcluir, btnInserir, btnSair});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDtMatricula)
                    .addComponent(txtDtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCurso)
                            .addComponent(cbxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTurma)
                            .addComponent(cbxTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(lblCpfAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValor)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCpfAluno))
                        .addGap(47, 47, 47)))
                .addComponent(pnPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnSair)
                    .addComponent(btnConsultar)
                    .addComponent(btnAlterar)
                    .addComponent(btnInserir)
                    .addComponent(btnExcluir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jRbtnParceladoActionPerformed(java.awt.event.ActionEvent evt) {
    	cleanFields();
    	setarPagamentoParceladoEnable();
    	setarPagamentoAVistaDisable();
        jRbtnAVista.setSelected(false);
    }
    
    private void jRbtnAVistaActionPerformed(java.awt.event.ActionEvent evt) {
    	cleanFields();
    	setarPagamentoAVistaEnable();
    	setarPagamentoParceladoDisable();
        jRbtnParcelado.setSelected(false);
    }

    private void cbxCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCursoActionPerformed
        cbxTurma.setEnabled(true);
        daoTurma = new DaoTurma(conexao.conectar());
        //get curso
        curso = daoCurso.consultar(cbxCurso.getSelectedItem().toString());
        txtValor.setText(Double.toString(curso.getValor()));
        
        ArrayList<Turma> turmas = daoTurma.listarTurma(curso);
        
        if (turmas.isEmpty()) {
        	JOptionPane.showMessageDialog(null, "Não há nenhuma turma cadastrada no banco de dados para esse curso");
        } else {
            cbxTurma.removeAllItems();
            for (Turma turma : turmas) {
            	cbxTurma.addItem(turma.getSiglaTurma());
                curso.addTurma(turma);
            }
            cbxTurma.setSelectedItem(null);
        }
    }//GEN-LAST:event_cbxCursoActionPerformed

    private void cbxTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTurmaActionPerformed
        if(cbxTurma.getSelectedItem() != null){
            txtCpfAluno.setEnabled(true);
            btnConsultar.setEnabled(true);
            turma = daoTurma.consultar(cbxTurma.getSelectedItem().toString());
            turma.setCurso(curso);
        } else{
            txtCpfAluno.setEnabled(false);
            btnConsultar.setEnabled(false);
        }
    }//GEN-LAST:event_cbxTurmaActionPerformed

  
    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
    	if(txtDtMatricula.getText().replaceAll("\\W", "").isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Data Inválida");
            return;
        }
        daoAVista = new DaoAVista(conexao.conectar());
    	daoAPrazo = new DaoAPrazo(conexao.conectar());
    	daoMatricula = new DaoMatricula(conexao.conectar());
    	daoAluno = new DaoAluno(conexao.conectar());
        
        //instanciar
    	matricula = new Matricula(txtDtMatricula.getText());
        matricula.setTurma(turma);
    	if (jRbtnAVista.isSelected()) {
            if(txtAgencia.getText().isEmpty() || 
                txtCheque.getText().isEmpty() || 
                txtDtPagamento.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Há dados para preencher!");
                    return;
                }
            aVista = new AVista();
            aVista.setAgencia(Integer.parseInt(txtAgencia.getText()));
            aVista.setnCheque(Integer.parseInt(txtCheque.getText()));
            aVista.setPreData(txtDtPagamento.getText());
            aVista.setValor(curso.getValor());
            aVista = daoAVista.inserir(aVista);
            
            matricula.setAvista(aVista);
            matricula.setAluno(aluno);
            daoMatricula.inserir(matricula);
    	} else if (jRbtnParcelado.isSelected()) {
            
            if(txtQtdeMensalidade.getText().isEmpty() ||
                txtTxJuros.getText().isEmpty() || 
                txtDt1Vencto.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Há dados para preencher!");
                return;
            }
            
            aPrazo = new APrazo();
            aPrazo.setQtdeMensalidade(Integer.parseInt(txtQtdeMensalidade.getText()));
            aPrazo.setTaxaJuros(Double.parseDouble(txtTxJuros.getText()));
            aPrazo.setDtVencimento(txtDt1Vencto.getText());
            aPrazo.setValor(curso.getValor());
            aPrazo = daoAPrazo.inserir(aPrazo);

            matricula.setAprazo(aPrazo);
            matricula.setAluno(aluno);
            daoMatricula.inserir(matricula);
    	}
        
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
		
                daoMatricula.excluir(matricula);
		cleanFields();
		
		setarPagamentoParceladoDisable();
		setarPagamentoAVistaDisable();
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);
		jRbtnAVista.setEnabled(true);
		jRbtnParcelado.setEnabled(true);
                cbxTurma.removeAll();
                txtCpfAluno.setText("");
                txtCpfAluno.setEnabled(false);
                cbxTurma.setSelectedItem(null);
                txtNome.setText("");
                txtDtMatricula.setText("");
                txtDtMatricula.setEnabled(false);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

        String cpf = txtCpfAluno.getText().replaceAll("\\W", "");
        if(!aluno.validarCPF(cpf)){
            JOptionPane.showMessageDialog(null,"CPF Inválido");
            return;
        }
        
        daoAluno = new DaoAluno(conexao.conectar());
        aluno = daoAluno.consultar(cpf);

        if (aluno == null) {
                JOptionPane.showMessageDialog(null,"Não existe esse aluno na base de dados!");
                return;
        } 
        daoAVista = new DaoAVista(conexao.conectar());
        
        matricula = daoMatricula.consultar(aluno, turma);
        txtNome.setText(aluno.getNome());
        if (matricula != null) {
            txtDtMatricula.setEnabled(false);
            aPrazo = matricula.getAprazo();
            aVista = matricula.getAvista();
            cleanFields();

            if (aPrazo != null ) {
                setarPagamentoAVistaDisable();
                setarPagamentoParceladoEnable();
                txtQtdeMensalidade.setText(Integer.toString(aPrazo.getQtdeMensalidade()));
                txtTxJuros.setText(Double.toString(aPrazo.getTaxaJuros()));
                txtDt1Vencto.setText(aPrazo.getDtVencimento());
                jRbtnParcelado.setSelected(true);
                jRbtnAVista.setSelected(false);
            } else if (aVista != null) {	
                setarPagamentoAVistaEnable();
                setarPagamentoParceladoDisable();
                txtAgencia.setText(Integer.toString(aVista.getAgencia()));
                txtCheque.setText(Integer.toString(aVista.getnCheque()));
                txtDtPagamento.setText(aVista.getPreData());
                jRbtnAVista.setSelected(true);
                jRbtnParcelado.setSelected(false);
            }
            btnAlterar.setEnabled(true);
            txtDtMatricula.setText(matricula.getData());
            btnExcluir.setEnabled(true);
            btnInserir.setEnabled(false);
        } else {
            btnInserir.setEnabled(true);
        }
        txtDtMatricula.setEnabled(true);
        pnPagamento.setEnabled(true);
        jRbtnAVista.setEnabled(true);
        jRbtnParcelado.setEnabled(true);
        btnConsultar.setEnabled(false);
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if(txtDtMatricula.getText().replaceAll("\\W", "").isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Data de matrícula Inválida");
            return;
        }
        daoAVista = new DaoAVista(conexao.conectar());
    	daoAPrazo = new DaoAPrazo(conexao.conectar());
    	daoMatricula = new DaoMatricula(conexao.conectar());
    	daoAluno = new DaoAluno(conexao.conectar());
        
        if (jRbtnAVista.isSelected()) {
            if(txtAgencia.getText().isEmpty() || 
                txtCheque.getText().isEmpty() || 
                txtDtPagamento.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Há dados para preencher!");
                    return;
                }
            if(matricula.getAvista() == null){
                aVista = new AVista();
                aVista.setAgencia(Integer.parseInt(txtAgencia.getText()));
                aVista.setnCheque(Integer.parseInt(txtCheque.getText()));
                aVista.setPreData(txtDtPagamento.getText());
                aVista.setValor(curso.getValor());
                aVista = daoAVista.inserir(aVista);
            } else{
                aVista.setAgencia(Integer.parseInt(txtAgencia.getText()));
                aVista.setnCheque(Integer.parseInt(txtCheque.getText()));
                aVista.setPreData(txtDtPagamento.getText());
                aVista.setValor(curso.getValor());
                daoAVista.alterar(aVista);
            }
            
            matricula.setAvista(aVista);
            matricula.setAprazo(null);
    	} else if (jRbtnParcelado.isSelected()) {
            
            if(txtQtdeMensalidade.getText().isEmpty() ||
                txtTxJuros.getText().isEmpty() || 
                txtDt1Vencto.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Há dados para preencher!");
                return;
            }
            
            if(matricula.getAprazo() == null){
                aPrazo = new APrazo();
                aPrazo.setQtdeMensalidade(Integer.parseInt(txtQtdeMensalidade.getText()));
                aPrazo.setTaxaJuros(Double.parseDouble(txtTxJuros.getText()));
                aPrazo.setDtVencimento(txtDt1Vencto.getText());
                aPrazo.setValor(curso.getValor());
                aPrazo = daoAPrazo.inserir(aPrazo);
            } else{
                aPrazo.setQtdeMensalidade(Integer.parseInt(txtQtdeMensalidade.getText()));
                aPrazo.setTaxaJuros(Double.parseDouble(txtTxJuros.getText()));
                aPrazo.setDtVencimento(txtDt1Vencto.getText());
                aPrazo.setValor(curso.getValor());
                daoAPrazo.alterar(aPrazo);
            }
            

            matricula.setAprazo(aPrazo);
            matricula.setAvista(null);
    	}
        
        matricula.setAluno(aluno);
        daoMatricula.alterar(matricula);
        
        //limpar campos
        cleanFields();
        cbxTurma.setSelectedItem(null);
        txtCpfAluno.setText("");
        txtDtMatricula.setEnabled(false);
        txtDtMatricula.setText("");
        txtNome.setText("");
        
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        
        //disable buttons
        setarPagamentoAVistaDisable();
        setarPagamentoParceladoDisable();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//    	conexao = new Conexao("SYSTEM", "root");
        conexao = new Conexao("BD1713006","BD1713006");
    	conexao.setDriver("oracle.jdbc.driver.OracleDriver");
    	conexao.setConnectionString("jdbc:oracle:thin:@apolo:1521:xe");
    	daoCurso = new DaoCurso(conexao.conectar());
    	daoMatricula = new DaoMatricula(conexao.conectar());
    	ArrayList<String> cursos = daoCurso.listarSiglas();
    	if (cursos.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Não há cursos cadastrados");
    	} else {
            for (String curso : cursos) {
                cbxCurso.addItem(curso);
            }
    	}
    }//GEN-LAST:event_formWindowOpened

    private void txtCpfAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfAlunoActionPerformed
        
    }//GEN-LAST:event_txtCpfAlunoActionPerformed

    private void setarPagamentoAVistaEnable() {
    	txtAgencia.setEnabled(true);
    	txtCheque.setEnabled(true);
    	txtDtPagamento.setEnabled(true);
    }
    
    private void setarPagamentoAVistaDisable() {
    	txtAgencia.setEnabled(false);
    	txtCheque.setEnabled(false);
    	txtDtPagamento.setEnabled(false);
    }
    
    private void setarPagamentoParceladoEnable() {
    	txtQtdeMensalidade.setEnabled(true);
    	txtTxJuros.setEnabled(true);
    	txtDt1Vencto.setEnabled(true);
    }
    
    private void setarPagamentoParceladoDisable() {
    	txtQtdeMensalidade.setEnabled(false);
    	txtTxJuros.setEnabled(false);
    	txtDt1Vencto.setEnabled(false);
    }
    
    private void cleanFields () {
    	txtAgencia.setText("");;
    	txtCheque.setText("");
    	txtDtPagamento.setText("");
    	txtQtdeMensalidade.setText("");
    	txtTxJuros.setText("");
    	txtDt1Vencto.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxCurso;
    private javax.swing.JComboBox<String> cbxTurma;
    private javax.swing.JRadioButton jRbtnAVista;
    private javax.swing.JRadioButton jRbtnParcelado;
    private javax.swing.JLabel lblAgencia;
    private javax.swing.JLabel lblCpfAluno;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblDt1Pagamento;
    private javax.swing.JLabel lblDtMatricula;
    private javax.swing.JLabel lblDtPagamento;
    private javax.swing.JLabel lblNoCheque;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQtdeMensalidade;
    private javax.swing.JLabel lblTurma;
    private javax.swing.JLabel lblTxJuros;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel pnPagamento;
    private javax.swing.JTextField txtAgencia;
    private javax.swing.JTextField txtCheque;
    private javax.swing.JFormattedTextField txtCpfAluno;
    private javax.swing.JFormattedTextField txtDt1Vencto;
    private javax.swing.JFormattedTextField txtDtMatricula;
    private javax.swing.JFormattedTextField txtDtPagamento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQtdeMensalidade;
    private javax.swing.JTextField txtTxJuros;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

}
