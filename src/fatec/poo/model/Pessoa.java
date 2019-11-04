/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author 0030481713006
 */
public class Pessoa {
    private String nome;
    private String dataNasc;
    private String endereco;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String telefone;
    private String celular;
    private String sexo;
    private String estadoCivil;
    private String rg;
    private String cpf;
    private String email;
    
    public Pessoa(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCelular() {
        return celular;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }
    
    
    
    public static boolean validarCPF(String cpf){
        if(!validaPrimeiroDigito(cpf))
            return false;
        if(!validaSegundoDigito(cpf))
            return false;

        return true;
    }
    
    /**
     * Metodo para validar primeiro digito
     * @param cpf 
     * @return 
     */
    private static boolean validaPrimeiroDigito(String cpf){
        int somaNumeros = 0;
        int countCol;
        
        if(cpf.length() < 11)
            return false;
        
        for(countCol = 1; countCol < 10; countCol++){
            int number = Integer.parseInt(cpf.substring( countCol - 1, countCol));
            somaNumeros += number * countCol;
        }
        int numValidador = Integer.parseInt(cpf.substring(9,10));
        int divisao = somaNumeros % 11;
        if(divisao == numValidador || (divisao == 10 && numValidador == 0)){
            return true;
        }
        
        return false;
    }
    
    
    /**
     * Metodo para validar segudo digito
     * @param cpf 
     * @return 
     */
    private static boolean validaSegundoDigito(String cpf){
        
        int somaNumeros = 0;
        int countCol = 0;
        
        for(int i = 11; i > 1; i--){
            int number = Integer.parseInt(cpf.substring( countCol, countCol + 1));
            somaNumeros += number * i;
            countCol++;
        }
        int numValidador = Integer.parseInt(cpf.substring(10,11));
        int validador = (somaNumeros * 10) % 11;

        if(validador == numValidador || (validador == 10 && numValidador == 0)){
            return true;
        }
        
        return false;
    }
    
}
