/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author cleberlira
 */
public class Disciplina {
    private int Id;
    private String nome;
    private String DataInclusao;

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the DataInclusao
     */
    public String getDataInclusao() {
        return DataInclusao;
    }

    /**
     * @param DataInclusao the DataInclusao to set
     */
    public void setDataInclusao(String DataInclusao) {
        this.DataInclusao = DataInclusao;
    }
    
    
}
