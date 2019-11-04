/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author 0030481623010
 */
public class APrazo {
    private double valor, taxaJuros;
    private String dtVencimento;
    private int qtdeMensalidade;
    private int id;

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTaxaJuros(double porcentagem) {
        this.taxaJuros = porcentagem;
    }

    public void setDtVencimento(String dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public void setQtdeMensalidade(int qtdeMensalidade) {
        this.qtdeMensalidade = qtdeMensalidade;
    }

    public double getValor() {
        return valor;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public String getDtVencimento() {
        return dtVencimento;
    }

    public int getQtdeMensalidade() {
        return qtdeMensalidade;
    }
    
}
