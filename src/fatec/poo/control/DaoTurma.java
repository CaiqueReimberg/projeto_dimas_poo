package fatec.poo.control;

import fatec.poo.control.DaoCurso;
import fatec.poo.model.Curso;
import fatec.poo.model.Turma;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLType;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


/*@author Sabrina */
public class DaoTurma {
    private Connection conn;
    
    public DaoTurma(Connection conn){
        this.conn = conn;
    }
    public void inserir(Turma turma){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("insert into tbTurma(sigla_turma,"
                                    + " sigla_curso, nome_t, qnt_vagas, "
                                    + "dt_inicio, periodo, dt_term) "
                                    + "values(?,?,?,?,?,?,?)");
            
            ps.setString(1, turma.getSiglaTurma());
            ps.setString(2, turma.getCurso().getSigla());
            ps.setString(3,turma.getDescricao());
            ps.setInt(4,turma.getQtdVagas());
            ps.setString(5, turma.getDataInicio());
            ps.setString(6, turma.getPeriodo());
            ps.setString(7, turma.getDataTermino());
            
            ps.execute();
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
    }
    public void alterar(Turma turma){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("UPDATE tbTurma set sigla_curso = ?,"
                                    + " nome_t = ?, qnt_vagas = ?, dt_inicio = ?,"
                                    + " periodo = ?, dt_term= ? , cpf_inst = ?"
                                    + "WHERE sigla_turma = ?");
            ps.setString(1, turma.getCurso().getSigla());
            ps.setString(2,turma.getDescricao());
            ps.setInt(3,turma.getQtdVagas());
            ps.setString(4, turma.getDataInicio());
            ps.setString(5, turma.getPeriodo());
            ps.setString(6, turma.getDataTermino());
            if(turma.getInstrutor() != null){
                ps.setString(7, turma.getInstrutor().getCpf());
            } else{
                ps.setNull(7,java.sql.Types.NVARCHAR);
            }
            
            ps.setString(8, turma.getSiglaTurma());
            

            ps.execute();
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
    }
    
    public Turma consultar(String sigla){
        Turma tur = null;
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("Select * from tbTurma where sigla_turma = ?");
            ps.setString(1, sigla);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                tur = new Turma(sigla, rs.getString("nome_t"));
                DaoCurso daoCurso = new DaoCurso(conn);
                tur.setCurso(daoCurso.consultar(rs.getString("sigla_curso")));
                tur.setQtdVagas(rs.getInt("qnt_vagas"));
                tur.setPeriodo(rs.getString("periodo"));
                
                DaoInstrutor daoInstrutor  = new DaoInstrutor(conn);
                tur.setInstrutor(daoInstrutor.consultar(rs.getString("cpf_inst")));
                
                try {
                    SimpleDateFormat dbFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                    SimpleDateFormat targetFt = new SimpleDateFormat("dd/MM/yyyy");
                    Date dateEnd = dbFormat.parse(rs.getString("dt_term"));
                    Date dateStart = dbFormat.parse(rs.getString("dt_inicio"));
                    
                    //seta as datas
                    tur.setDataTermino(targetFt.format(dateEnd));
                    tur.setDataInicio(targetFt.format(dateStart));
                } catch (Exception e) {
                    System.out.println(e.toString());
                }
                
            }
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
        return (tur);
    }
    
    public void excluir(Turma turma){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("delete from tbTurma where sigla_turma = ?");
            ps.setString(1, turma.getSiglaTurma());
            
            ps.execute();            
        }catch(SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public ArrayList<Turma> listarTurma (Curso curso) {
    PreparedStatement ps = null;
        ArrayList<Turma> list = new ArrayList();
        try {
            ps = conn.prepareStatement("SELECT * from tbTurma "
                                        + "WHERE sigla_curso=?");
            ps.setString(1, curso.getSigla());

            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Turma turma = new Turma(rs.getString("sigla_turma"), rs.getString("nome_t"));
                turma.setDataInicio(rs.getString("dt_inicio"));
                turma.setPeriodo(rs.getString("periodo"));
                turma.setQtdVagas(rs.getInt("qnt_vagas"));
                turma.setDataTermino(rs.getString("dt_term"));
                list.add(turma);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
        return list;
    }
    
    public String ListarCPFInstrutor(String sigla) {
        PreparedStatement ps = null;
        String cpf = null;
        try {
        	ps = conn.prepareStatement("SELECT cpf_inst from tbTurma  "
        			+ "WHERE sigla_curso=?");
        	ps.setString(1, sigla);

        	ResultSet rs = ps.executeQuery();

        	if(rs.next())
                {
                    cpf = rs.getString("cpf_inst");
                }

        } catch (SQLException ex) {
        	System.out.println(ex.toString());
        }

        return cpf;
    }
}