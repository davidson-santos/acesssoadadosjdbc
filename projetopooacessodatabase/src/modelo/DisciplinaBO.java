/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import dao.DisciplinaDAO;

/**
 *
 * @author cleberlira
 */
public class DisciplinaBO {
    
    
    public DisciplinaBO(){
        
        
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
