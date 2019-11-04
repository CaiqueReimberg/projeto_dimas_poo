
package fatec.poo.control;

import fatec.poo.model.APrazo;
import fatec.poo.model.AVista;
import fatec.poo.model.Aluno;
import fatec.poo.model.Matricula;
import fatec.poo.model.Turma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class DaoMatricula {
    private Connection conn;
    
    public DaoMatricula(Connection conn){
        this.conn = conn;
    }
    public void inserir(Matricula matricula){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("insert into tbMatricula(data,"
                                    + " sigla_turma,cpf_aluno, qtdeFaltas, nota, avista_id, aprazo_id) "
                                    + "values(?,?,?,?,?,?,?)");
            
            ps.setString(1, matricula.getData());
            ps.setString(2, matricula.getTurma().getSiglaTurma());
            ps.setString(3, matricula.getAluno().getCpf());
            ps.setInt(4, matricula.getQtdeFaltas());
            ps.setDouble(5, matricula.getNota());
            if(matricula.getAvista() != null){
                ps.setInt(6, matricula.getAvista().getId());
            }else{
               ps.setNull(6, java.sql.Types.INTEGER); 
            }
            
            if(matricula.getAprazo() != null){
                ps.setInt(7, matricula.getAprazo().getId());
            }else{
               ps.setNull(7, java.sql.Types.INTEGER); 
            }
            
            ps.execute();
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
    }
    public void alterar(Matricula matricula){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("UPDATE tbMatricula SET data=?,"
                                    + " qtdeFaltas =?, nota = ?, avista_id = ?, aprazo_id = ? WHERE cpf_aluno = ? AND sigla_turma = ?");;
            ps.setString(1, matricula.getData());
            ps.setInt(2, matricula.getQtdeFaltas());
            ps.setDouble(3, matricula.getNota());
            ps.setString(6, matricula.getAluno().getCpf());
            ps.setString(7, matricula.getTurma().getSiglaTurma());
            
            if(matricula.getAprazo() != null)
            {
                ps.setInt(5, matricula.getAprazo().getId());
            } else{
                ps.setNull(5, java.sql.Types.INTEGER);
            }
            
            if(matricula.getAvista() != null){
                ps.setInt(4, matricula.getAvista().getId());
            }else{
                ps.setNull(4, java.sql.Types.INTEGER);
            }

            ps.execute();
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
    }
    
    public Matricula consultar(Aluno aluno, Turma turma){
        PreparedStatement ps = null;
        Matricula matricula = null;
        try{
            ps = conn.prepareStatement("Select * from tbMatricula where cpf_aluno = ? and sigla_turma = ?");
            ps.setString(1, aluno.getCpf());
            ps.setString(2, turma.getSiglaTurma());
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                matricula = new Matricula(rs.getString("data"));
                matricula.setQtdeFaltas(rs.getInt("qtdeFaltas"));
                matricula.setNota(rs.getDouble("nota"));
                matricula.setAluno(aluno);
                matricula.setTurma(turma);
                
                
                DaoAVista daoAVista = new DaoAVista(conn);
                AVista avista = daoAVista.consultar(rs.getInt("avista_id"));
                matricula.setAvista(avista);

                DaoAPrazo daoAprazo = new DaoAPrazo(conn);
                APrazo aprazo = daoAprazo.consultar(rs.getInt("aprazo_id"));
                matricula.setAprazo(aprazo);
            }
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
        return matricula;
    }
    
    public void excluir(Matricula matricula){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("delete from tbMatricula where sigla_turma = ? and cpf_aluno = ?");
            ps.setString(1, matricula.getTurma().getSiglaTurma());
            ps.setString(2, matricula.getAluno().getCpf());
            
            ps.execute();            
        }catch(SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public ArrayList<String> listarMatricula (String sigla) {
    PreparedStatement ps = null;
        ArrayList<String> list = new ArrayList();
        try {
            ps = conn.prepareStatement("SELECT nome_t from tbTurma"
                                        + "WHERE sigla_curso=?");
            ps.setString(1, sigla);

            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                list.add(rs.getString("nome_t"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
        return list;
    }
}
