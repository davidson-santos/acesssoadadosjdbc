/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import dao.DisciplinaDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cleberlira
 */
public class DisciplinaBO {
    
    
    public DisciplinaBO(){
        
        
    }
        
    public List<Disciplina> consulta(){

       DisciplinaDAO dao = new DisciplinaDAO();
       
       List<Disciplina> disciplinas = new ArrayList<Disciplina>();
       
       try{
        
           disciplinas =  dao.consulta();
        
        }catch(Exception e){
            throw new RuntimeException("Erro ao inserir recuperar no banco de dados");
        }

       return disciplinas;
        
    }
    
    public void incluir(Disciplina disciplina){
        
        DisciplinaDAO dao = new DisciplinaDAO();
        
        try{
        
            dao.incluir(disciplina);
        
        }catch(Exception e){
            throw new RuntimeException("Erro ao inserir informação no banco de dados");
        }
        
    }
    
    
    
    
}
