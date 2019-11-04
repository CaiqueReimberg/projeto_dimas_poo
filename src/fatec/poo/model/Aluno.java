
package fatec.poo.model;

/* @author 0030481613035 */
public class Aluno extends Pessoa{
    private String escolaridade;
    private Matricula matricula;
    
    public Aluno(String cpf, String nome){
        super(cpf, nome);
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }
    
    public void setMatricula(Matricula matricula)
    {
        this.matricula = matricula;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public Matricula getMatricula() {
        return matricula;
    }
    
    
}
