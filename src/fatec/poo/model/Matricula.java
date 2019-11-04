
package fatec.poo.model;

/**
 *
 * @author 0030481623010
 */
public class Matricula {
    
    private String data;
    private int QtdeFaltas;
    private double Nota;
    private AVista avista;
    private APrazo aprazo;
    private Aluno aluno;
    private Turma turma;

    public Matricula(String data) {
        this.data = data;
    }
    
    public void setAluno(Aluno aluno)
    {
        this.aluno = aluno;
        aluno.setMatricula(this);
    }
    
    public void setQtdeFaltas(int QtdeFaltas) {
        this.QtdeFaltas = QtdeFaltas;
    }

    public void setNota(double Nota) {
        this.Nota = Nota;
    }
    
    public void setAvista (AVista obj) {
        this.avista = obj;
    }
    
    public void setAprazo (APrazo obj) {
        this.aprazo = obj;
    }
    
    public void EmitirCarne() {
        
    }
    
    public void setTurma(Turma turma){
        this.turma = turma;
    }

    public String getData() {
        return data;
    }

    public int getQtdeFaltas() {
        return QtdeFaltas;
    }

    public double getNota() {
        return Nota;
    }

    public AVista getAvista() {
        return avista;
    }

    public APrazo getAprazo() {
        return aprazo;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Turma getTurma() {
        return turma;
    }
    
}
