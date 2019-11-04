package fatec.poo.control;

import fatec.poo.model.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author 0030481623010
 */
public class DaoCurso {
    private static Connection conn;
    
    public DaoCurso (Connection conn) {
        this.conn = conn;
    }
    
    public void inserir(Curso curso) {
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("INSERT INTO tbCurso (sigla_curso, " +
                                        "nome_curso, carga_horaria, valor_curso," +
                                        "prog_curso, data_vig_curso, " +
                                        "valor_hora_inst) values (?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, curso.getSigla());
            ps.setString(2, curso.getNome());
            ps.setInt(3, curso.getCargaHoraria());
            ps.setDouble(4, curso.getValor());
            ps.setString(5, curso.getPrograma());
            ps.setString(6, curso.getDataVigencia());
            ps.setDouble(7, curso.getValorHoraInstrutor());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void alterar (Curso curso) {
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("UPDATE tbCurso SET " +
                                        "nome_curso= ?, carga_horaria= ?, valor_curso= ?," +
                                        "prog_curso= ?, data_vig_curso= ?, " +
                                        "valor_hora_inst= ? where sigla_curso= ?");
            ps.setString(1, curso.getNome());
            ps.setInt(2, curso.getCargaHoraria());
            ps.setDouble(3, curso.getValor());
            ps.setString(4, curso.getPrograma());
            ps.setString(5, curso.getDataVigencia());
            ps.setDouble(6, curso.getValorHoraInstrutor());
            ps.setString(7, curso.getSigla());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    
    public boolean excluir (String sigla) {
        Curso curso = null;
        
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("DELETE from tbCurso WHERE " +
                                        "sigla_curso=?");
            ps.setString(1,sigla);
            
            ps.execute();
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }
        
        return true;
    }
    
    public Curso consultar (String sigla) {
        Curso curso = null;
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("SELECT * from tbCurso WHERE " +
                                        "sigla_curso = ?");
            ps.setString(1, sigla);
            ResultSet rs =  ps.executeQuery();
            
            if (rs.next()) {
                curso = new Curso (sigla, rs.getString("nome_curso"));
                curso.setValor(rs.getDouble("valor_curso"));
                curso.setCargaHoraria(rs.getInt("carga_horaria"));
                curso.setPrograma(rs.getString("prog_curso"));
                curso.setValorHoraInstrutor((rs.getDouble("valor_hora_inst")));
                
                try {
                    SimpleDateFormat dbFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                    SimpleDateFormat targetFt = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = dbFormat.parse(rs.getString("data_vig_curso"));
                    curso.setDataVigencia(targetFt.format(date));
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return curso;
    }
    
    public ArrayList<String> listarSiglas () {
        PreparedStatement ps = null;
        ArrayList<String> list = new ArrayList();
        try {
            ps = conn.prepareStatement("SELECT sigla_curso from tbCurso");

            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                list.add(rs.getString("sigla_curso"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
        return list;
    }
}
