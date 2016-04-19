/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Collection;

/**
 *
 * @author cmelo
 */
public class Restaurante {
    private Integer id;
    private String nome;
    private String CNPJ;    
    private Collection funcionarios;
    private Collection mesas;
    
    
    public Integer getId(){
        return id;
    }    
    
    public void setId(Integer id){
        this.id = id;
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
     * @return the CNPJ
     */
    public String getCNPJ() {
        return CNPJ;
    }

    /**
     * @param CNPJ the CNPJ to set
     */
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }    

    /**
     * @return the funcionario
     */
    public Collection getFuncionarios() {
        return funcionarios;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionarios(Collection funcionarios) {
        this.funcionarios = funcionarios;
    }

    /**
     * @return the mesa
     */
    public Collection getMesa() {
        return mesas;
    }

    /**
     * @param mesa the mesa to set
     */
    public void setMesa(Collection mesas) {
        this.mesas = mesas;
    }
        
}
