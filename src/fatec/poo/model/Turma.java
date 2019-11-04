package fatec.poo.model;
import java.util.ArrayList;

/*@author 0030481713006 */
public class Turma {
    private String siglaTurma;
    private String descricao;
    private String dataInicio;
    private String dataTermino;
    private String periodo;
    private int qtdVagas;
    private String observacoes;
    private Instrutor instrutor;
    private Curso curso;
    private ArrayList<Matricula> matriculas;
    
    public Turma(String sigla, String descricao){
        this.siglaTurma = sigla;
        this.descricao = descricao;
        
        this.matriculas = new ArrayList<Matricula>();
    }

    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public void setQtdVagas(int qtdVagas) {
        this.qtdVagas = qtdVagas;
    }

    public void setObservacoes(String observacoes) {// não há campo de observações na GUi
        this.observacoes = observacoes;
    }
    
    public void setInstrutor(Instrutor instrutor){// não há campo de instrutor na GUi
        this.instrutor = instrutor;
    }
    
    public void emitirListaFrequencia(){}// não há campo de frequencia na GUi - esta incompleto
    
    public void setCurso(Curso curso)
    {
        this.curso = curso;
    }

    public String getSiglaTurma() {
        return siglaTurma;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public String getPeriodo() {
        return periodo;
    }

    public int getQtdVagas() {
        return qtdVagas;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public Curso getCurso() {
        return curso;
    }

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }
    
    public void addMatricula(Matricula matricula){
        this.matriculas.add(matricula);
        matricula.setTurma(this);
    }

    
}
