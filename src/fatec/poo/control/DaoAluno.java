/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import fatec.poo.model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 0030481713006
 */
public class DaoAluno {

    private Connection conn;
    
    public DaoAluno(Connection conn){
        this.conn = conn;
    }
    
    public Aluno consultar(String cpf){
        Aluno aluno = null;
        try{
            PreparedStatement ps =  conn.prepareStatement("SELECT * FROM tbAluno WHERE cpf = ?");
            ps.setString(1, cpf);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                aluno = new Aluno(cpf, rs.getString("nome_inst"));
                aluno.setEscolaridade(rs.getString("escolaridade"));
                aluno.setBairro(rs.getString("bairro"));
                aluno.setCelular(rs.getString("tel_cel"));
                aluno.setCep(rs.getString("cep"));
                aluno.setCidade(rs.getString("cidade"));
                aluno.setEmail(rs.getString("email"));
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setEstado(rs.getString("uf"));
                aluno.setEstadoCivil(rs.getString("civil"));
                aluno.setNumero(rs.getInt("num"));
                aluno.setRg(rs.getString("rg"));
                aluno.setSexo(rs.getString("sexo"));
                aluno.setTelefone(rs.getString("tel_res"));
                
                try
                {
                    SimpleDateFormat dbFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                    SimpleDateFormat targetFt = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = dbFormat.parse(rs.getString("dt_nasc"));
                    aluno.setDataNasc(targetFt.format(date));
                }catch(Exception e)
                {
                    System.out.println(e.toString());
                }
                
            }
        }catch(SQLException e)
        {
            System.out.println(e.toString());
        }
        return aluno;
    }
    
    public void inserir(Aluno aluno)
    {
        try
        {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO tbAluno "
                    + "(cpf, nome_inst, escolaridade, bairro, tel_cel, cep, cidade, dt_nasc,"
                    + " email, endereco, uf, civil, num, rg, sexo, tel_res) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            this.setPrepareStatement(ps, aluno);
            
            ps.execute();
        } 
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
    }
    
    public void alterar(Aluno aluno)
    {
        try
        {
            PreparedStatement ps = conn.prepareStatement("UPDATE tbAluno SET "
                    + "cpf = ?, nome_inst = ? , escolaridade = ?, bairro = ?, tel_cel = ?, cep = ?, cidade = ?, dt_nasc = ?,"
                    + " email = ?, endereco = ?, uf = ?, civil = ?, num = ?, rg = ?, sexo = ?, tel_res = ? WHERE cpf = ?");
            this.setPrepareStatement(ps, aluno);
            ps.setString(17, aluno.getCpf());
            ps.execute();
        } 
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
    }
    
    public void excluir(Aluno aluno)
    {
        try
        {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM tbaluno WHERE cpf = ?");
            ps.setString(1, aluno.getCpf());
            ps.execute();
        } 
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
    }
    
    
    private void setPrepareStatement(PreparedStatement ps, Aluno aluno)
    {
        
        try{
            ps.setString(1, aluno.getCpf());
            ps.setString(2, aluno.getNome());
            ps.setString(3, aluno.getEscolaridade());
            ps.setString(4, aluno.getBairro());
            ps.setString(5, aluno.getCelular());
            ps.setString(6, aluno.getCep());
            ps.setString(7, aluno.getCidade());
            ps.setString(8, aluno.getDataNasc());
            ps.setString(9, aluno.getEmail());
            ps.setString(10, aluno.getEndereco());
            ps.setString(11, aluno.getEstado());
            ps.setString(12, aluno.getEstadoCivil());
            ps.setInt(13, aluno.getNumero());
            ps.setString(14, aluno.getRg());
            ps.setString(15, aluno.getSexo());
            ps.setString(16, aluno.getTelefone());
        }catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        
    }

}
