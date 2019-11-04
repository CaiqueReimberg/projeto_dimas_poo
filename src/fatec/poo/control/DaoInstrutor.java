/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import fatec.poo.model.Instrutor;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 0030481713006
 */
public class DaoInstrutor{
    
    
    private Connection conn;
    
    public DaoInstrutor(Connection conn){
        this.conn = conn;
    }
    
    public Instrutor consultar(String cpf){
        Instrutor instrutor = null;
        try{
            PreparedStatement ps =  conn.prepareStatement("SELECT * FROM tbInstrutor WHERE cpf = ?");
            ps.setString(1, cpf);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                instrutor = new Instrutor(cpf, rs.getString("nome_inst"));
                instrutor.setAreaFormacao(rs.getString("area_atuacao"));
                instrutor.setBairro(rs.getString("bairro"));
                instrutor.setCelular(rs.getString("tel_cel"));
                instrutor.setCep(rs.getString("cep"));
                instrutor.setCidade(rs.getString("cidade"));
                instrutor.setEmail(rs.getString("email"));
                instrutor.setEndereco(rs.getString("endereco"));
                instrutor.setEstado(rs.getString("uf"));
                instrutor.setEstadoCivil(rs.getString("civil"));
                instrutor.setFormacao(rs.getString("formacao"));
                instrutor.setNumero(rs.getInt("num"));
                instrutor.setRg(rs.getString("rg"));
                instrutor.setSexo(rs.getString("sexo"));
                instrutor.setTelefone(rs.getString("tel_res"));
                
                try
                {
                    SimpleDateFormat dbFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                    SimpleDateFormat targetFt = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = dbFormat.parse(rs.getString("dt_nasc"));
                    instrutor.setDataNasc(targetFt.format(date));
                }catch(Exception e)
                {
                    System.out.println(e.toString());
                }
                
            }
        }catch(SQLException e)
        {
            System.out.println(e.toString());
        }
        return instrutor;
    }
    
    public void inserir(Instrutor instrutor)
    {
        try
        {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO tbInstrutor "
                    + "(cpf, nome_inst, area_atuacao, bairro, tel_cel, cep, cidade, dt_nasc,"
                    + " email, endereco, uf, civil, formacao, num, rg, sexo, tel_res) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            this.setPrepareStatement(ps, instrutor);
            
            ps.execute();
        } 
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
    }
    
    public void alterar(Instrutor instrutor)
    {
        try
        {
            PreparedStatement ps = conn.prepareStatement("UPDATE tbInstrutor SET "
                    + "cpf = ?, nome_inst = ? , area_atuacao = ?, bairro = ?, tel_cel = ?, cep = ?, cidade = ?, dt_nasc = ?,"
                    + " email = ?, endereco = ?, uf = ?, civil = ?, formacao = ?, num = ?, rg = ?, sexo = ?, tel_res = ? WHERE cpf = ?");
            this.setPrepareStatement(ps, instrutor);
            ps.setString(18, instrutor.getCpf());
            
            ps.execute();
        } 
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
    }
    
    public boolean excluir(Instrutor instrutor)
    {
        try
        {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM tbinstrutor WHERE cpf = ?");
            ps.setString(1, instrutor.getCpf());
            ps.execute();
        } 
        catch(SQLException ex){
            System.out.println(ex.toString());
            return false;
        }
        
        return true;
    }
    
    public ArrayList <Instrutor> listarInstrutor () {
        PreparedStatement ps = null;
        ArrayList<Instrutor> list = new ArrayList();
        try {
            ps = conn.prepareStatement("SELECT nome_inst,CPF from tbInstrutor");

            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                list.add(new Instrutor (rs.getString("CPF"), rs.getString("nome_inst")));
            }            
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
        return list;
    }
    
    
    private void setPrepareStatement(PreparedStatement ps, Instrutor instrutor)
    {
        
        try{
            ps.setString(1, instrutor.getCpf());
            ps.setString(2, instrutor.getNome());
            ps.setString(3, instrutor.getAreaFormacao());
            ps.setString(4, instrutor.getBairro());
            ps.setString(5, instrutor.getCelular());
            ps.setString(6, instrutor.getCep());
            ps.setString(7, instrutor.getCidade());
            ps.setString(8, instrutor.getDataNasc());
            ps.setString(9, instrutor.getEmail());
            ps.setString(10, instrutor.getEndereco());
            ps.setString(11, instrutor.getEstado());
            ps.setString(12, instrutor.getEstadoCivil());
            ps.setString(13, instrutor.getFormacao());
            ps.setInt(14, instrutor.getNumero());
            ps.setString(15, instrutor.getRg());
            ps.setString(16, instrutor.getSexo());
            ps.setString(17, instrutor.getTelefone());
        }catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        
    }
}
