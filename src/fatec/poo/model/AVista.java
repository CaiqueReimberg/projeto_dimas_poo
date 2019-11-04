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
public class AVista {
    private int id;
    private double valor;
    private int agencia, nCheque;
    private String preData;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setnCheque(int nCheque) {
        this.nCheque = nCheque;
    }

    public void setPreData(String preData) {
        this.preData = preData;
    }    

    public double getValor() {
        return valor;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getnCheque() {
        return nCheque;
    }

    public String getPreData() {
        return preData;
    }
    
    
}
