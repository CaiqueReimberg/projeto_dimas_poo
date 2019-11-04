/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import fatec.poo.model.APrazo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

/**
 *
 * @author 0030481713006
 */
public class DaoAPrazo {
    private static Connection conn;
    
    public DaoAPrazo (Connection conn) {
        this.conn = conn;
    }
    
    public APrazo inserir(APrazo aprazo) {
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("INSERT INTO tbAPrazo (id, " +
                                        "valor, taxa_juros, qtdeMensalidade," +
                                        "dtVencimento) values (seq_aprazo.nextVal, ?, ?, ?, ?)");
            ps.setDouble(1, aprazo.getValor());
            ps.setDouble(2, aprazo.getTaxaJuros());
            ps.setInt(3, aprazo.getQtdeMensalidade());
            ps.setString(4, aprazo.getDtVencimento());
            ps.execute();
            
            PreparedStatement psq = conn.prepareStatement("SELECT seq_aprazo.currval FROM dual");
            ResultSet rs = psq.executeQuery();
            if(rs.next()){
                aprazo.setId(rs.getInt(1));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
        return aprazo;
    }
    
    public void alterar (APrazo aprazo) {
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("UPDATE tbAPrazo SET " +
                                        "valor = ?, taxa_juros = ?, qtdeMensalidade = ?," +
                                        "dtVencimento = ? WHERE id = ?");
            ps.setDouble(1, aprazo.getValor());
            ps.setDouble(2, aprazo.getTaxaJuros());
            ps.setInt(3, aprazo.getQtdeMensalidade());
            ps.setString(4, aprazo.getDtVencimento());
            ps.setInt(5, aprazo.getId());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    
    public void excluir (APrazo aprazo) {
        
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("DELETE from tbAPrazo WHERE " +
                                        "id=?");
            ps.setInt(1,aprazo.getId());
            
            ps.execute();
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public APrazo consultar (int id) {
        APrazo aprazo = null;
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("SELECT * from tbAPrazo WHERE " +
                                        "id = ?");
            ps.setInt(1, id);
            ResultSet rs =  ps.executeQuery();
            
            if (rs.next()) {
                aprazo = new APrazo ();
                aprazo.setId(rs.getInt("id"));
                aprazo.setValor(rs.getDouble("valor"));
                aprazo.setTaxaJuros(rs.getDouble("taxa_juros"));
                aprazo.setQtdeMensalidade(rs.getInt("qtdeMensalidade"));
                aprazo.setDtVencimento((rs.getString("dtVencimento")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return aprazo;
    }
}
