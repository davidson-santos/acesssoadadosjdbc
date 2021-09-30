/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import modelo.Disciplina;

/**
 *
 * @author cleberlira
 */
public class DisciplinaDAO {

    public void incluir(Disciplina disciplina) {
        
        Connection con = Conexao.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO disciplina (nome,datainclusao ) VALUES (?,?)");
           
            stmt.setString(1, disciplina.getNome());

            stmt.setString(2, disciplina.getDataInclusao());

            stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();

            //  throw new RuntimeException("Erro ao inserir informação no banco de dados");
        } finally {
            Conexao.fecharConexao(con, stmt);

        }

    }

    
   public List<Disciplina> consulta(){
       Connection con = Conexao.getConexao();
       PreparedStatement stmt = null;
       
       ResultSet rs = null;
       
       
       List<Disciplina> disciplinas = new ArrayList<Disciplina>();
       
       
       try{
           
           stmt = con.prepareStatement("select id, nome, datainclusao from disciplina");
           rs = stmt.executeQuery();
           
           while (rs.next()){
               Disciplina disciplina =  new Disciplina();
              
               disciplina.setId(rs.getInt("id"));
               disciplina.setNome(rs.getString("nome"));
               disciplina.setDataInclusao(rs.getString("datainclusao"));
              
               
               disciplinas.add(disciplina);
               
           }
           
           
       }catch (SQLException s){
           s.printStackTrace();
           
       }
       
        finally {
            Conexao.fecharConexao(con, stmt);

        }
       
      return disciplinas;

       
   }
    
    
}
