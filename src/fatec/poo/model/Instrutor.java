package fatec.poo.model;

import java.util.ArrayList;

/*@author 0030481613035*/
public class Instrutor extends Pessoa{
    private String formacao;
    private String areaFormacao;
    private ArrayList<Turma> turmas;
            
    public Instrutor(String cpf, String nome) {
        super(cpf, nome);
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public void setAreaFormacao(String areaFormacao) {
        this.areaFormacao = areaFormacao;
    }
    
    void addTurma(Turma t ){
        this.turmas.add(t);
        t.setInstrutor(this);
    }

    public String getFormacao() {
        return formacao;
    }

    public String getAreaFormacao() {
        return areaFormacao;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }
    
    
    
    
}
