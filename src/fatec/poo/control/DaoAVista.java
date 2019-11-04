/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import fatec.poo.model.AVista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

/**
 *
 * @author 0030481713006
 */
public class DaoAVista {
    private static Connection conn;
    
    public DaoAVista (Connection conn) {
        this.conn = conn;
    }
    
    public AVista inserir(AVista avista) {
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("INSERT INTO tbAVista (id, " +
                                        "valor, agencia, nCheque," +
                                        "preData) values (seq_avista.nextVal, ?, ?, ?, ?)");
            ps.setDouble(1, avista.getValor());
            ps.setInt(2, avista.getAgencia());
            ps.setInt(3, avista.getnCheque());
            ps.setString(4, avista.getPreData());
            
            ps.execute();
            
            PreparedStatement psq = conn.prepareStatement("SELECT seq_avista.currval FROM dual");
            ResultSet rs = psq.executeQuery();
            if(rs.next()){
                avista.setId(rs.getInt(1));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
        return avista;
    }
    
    public void alterar (AVista avista) {
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("UPDATE tbAVista SET " +
                                        "valor = ?, agencia = ?, nCheque = ?," +
                                        "preData = ? WHERE id = ?");
            ps.setDouble(1, avista.getValor());
            ps.setInt(2, avista.getAgencia());
            ps.setInt(3, avista.getnCheque());
            ps.setString(4, avista.getPreData());
            ps.setInt(5, avista.getId());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    
    public void excluir (AVista avista) {
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("DELETE from tbAVista WHERE " +
                                        "id=?");
            ps.setInt(1,avista.getId());
            
            ps.execute();
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public AVista consultar (Integer id) {
        AVista avista = null;
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("SELECT * from tbAVista WHERE " +
                                        "id = ?");
            ps.setInt(1, id);
            ResultSet rs =  ps.executeQuery();
            
            if (rs.next()) {
                avista = new AVista ();
                avista.setValor(rs.getDouble("valor"));
                avista.setPreData(rs.getString("preData"));
                avista.setnCheque(rs.getInt("nCheque"));
                avista.setAgencia((rs.getInt("agencia")));
                avista.setId(id);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return avista;
    }
}
